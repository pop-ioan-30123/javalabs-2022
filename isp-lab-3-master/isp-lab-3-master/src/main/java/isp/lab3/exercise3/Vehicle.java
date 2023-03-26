/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise3;

/**
 *
 * @author ionic
 */
public class Vehicle {

    private String model;
    private String type;
    private int speed;
    private char fuelType;
    public static int c=0;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        c++;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public String getType() {
        return this.type;
    }

    public int getSpeed() {
        return this.speed;
    }

    public char getFuelType() {
        return this.fuelType;
    }
    
    @Override
    public String toString()
    {
        return this.model+" ("+this.type+") speed "+this.speed+" fuel type "+this.fuelType;
    }
    
    public static int getNumberofVehicles(){
    return c;
    }
    
}
