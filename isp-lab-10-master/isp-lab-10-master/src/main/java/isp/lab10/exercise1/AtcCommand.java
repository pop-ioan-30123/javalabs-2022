/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;

/**
 *
 * @author ionic
 */
public abstract class AtcCommand {
    
    protected Aircraft aircraft;
    
    public AtcCommand(Aircraft aircraft) {
        this.aircraft=aircraft;
    }
    
    abstract public void execute();
}
