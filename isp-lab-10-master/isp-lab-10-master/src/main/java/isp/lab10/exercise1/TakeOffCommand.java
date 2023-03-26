/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ionic
 */
public class  TakeOffCommand extends AtcCommand {
    
    int altitude;
    
    public TakeOffCommand(int altitude, Aircraft aircraft) {
        super(aircraft);
        this.altitude=altitude;
    }
    
    public TakeOffCommand(int altitude) {
        this.altitude=altitude;
    }
    
    @Override
    public void execute() {
        
        System.out.println(aircraft.getID()+": Waiting for a command");
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(TakeOffCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(aircraft.getID()+": Entering Taxing mode for 10 seoonds!");
        aircraft.setState("Taxing");
        try {
            Aircraft.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TakeOffCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(aircraft.getID()+": Taking off in 5 seconds!");
        aircraft.setState("Taking off");
        try {
            Aircraft.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TakeOffCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(aircraft.getID()+": Ascending! Reaching max altitude in 10 seconds!");
        aircraft.setState("Ascending");
        try {
            Aircraft.sleep(altitude*10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TakeOffCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(aircraft.getID()+": Reached the altitude");
        aircraft.setState("Cruising");
        aircraft.setTime(System.currentTimeMillis());
    }
    
}
