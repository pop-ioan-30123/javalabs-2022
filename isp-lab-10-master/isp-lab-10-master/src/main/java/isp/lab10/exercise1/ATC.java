/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;

import java.util.ArrayList;

/**
 *
 * @author ionic
 */
public class ATC extends Thread {

    ArrayList<Aircraft> list = new ArrayList<>();

    public void addAircrafr(String id) {
        list.add(new Aircraft(id));
    }

    public void sendCommand(String aircraftid, AtcCommand cmd) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(aircraftid)) {
                cmd.execute();
                notify();
            }
        }
    }

    public void showAircrafts() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Aircraft " + i + ": " + list.get(i).getId() + "    " + list.get(i).getAltitude() + "\n");
        }
    }
    
    public void takeoff(Aircraft air) {
            TakeOffCommand tw = new TakeOffCommand(air.getAltitude(),air);
            air.executeCommand(tw);
    }
    
    public void land(Aircraft air) {
            LandCommand tw = new LandCommand(air);
            air.executeCommand(tw);
    }

}
