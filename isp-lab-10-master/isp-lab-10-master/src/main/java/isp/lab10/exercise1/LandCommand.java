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
public class LandCommand extends AtcCommand{

    public LandCommand(Aircraft aircraft) {
        super(aircraft);
    }
    
    
    
    @Override
    public void execute() {
        
        System.out.println("Waiting for a command");
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(LandCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(aircraft.getID()+": Descending");
        aircraft.setState("Descending");
        try {
            Aircraft.sleep(aircraft.getAltitude()*10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(LandCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(aircraft.getID()+": Landed");
        
        aircraft.setState("Landed after "+ (aircraft.getTime()- System.currentTimeMillis())/1000+ " seconds!");
    }
    
}
