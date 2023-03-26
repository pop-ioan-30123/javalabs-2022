/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

/**
 *
 * @author ionic
 */
public class Model {

    private String accescode;
    private String door;

    public Model(String accescode) {
        this.accescode = accescode;
    }

    public String getAccescode() {
        return accescode;
    }

    public void setAccescode(String accescode) {
        this.accescode = accescode;
    }
    
    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }
}
