/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author ionic
 */
public class AccesKey {
    String pin;
    
    public AccesKey(String pin) {
        this.pin=pin;
    }
    
    public String getPing() {
        return this.pin;
    }
    
    @Override
    public boolean equals(Object obj) {
        AccesKey objkey=(AccesKey) obj;
        if(this.pin==objkey.pin)
            return true;
        else 
            return false;
    }
}
