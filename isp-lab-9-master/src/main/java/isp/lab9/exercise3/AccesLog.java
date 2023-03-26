/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

import java.time.LocalDateTime;

/**
 *
 * @author ionic
 */
public class AccesLog {
    String tenantName;
    LocalDateTime dateTime;
    String operation;
    DoorStatus doorStatus;
    String errorMessage;
    
    public AccesLog() {
        this.tenantName="None";
        this.dateTime=LocalDateTime.now();
        this.operation="?";
        this.doorStatus=DoorStatus.CLOSE;
        this.errorMessage="None";
    }
    
    public AccesLog(String tenantName, String operation) {
        this.tenantName="None";
        this.dateTime=LocalDateTime.now();
        this.operation=operation;
    }
    
    public AccesLog(String tenantName, String operation, DoorStatus doorStatus) {
        this.tenantName="None";
        this.dateTime=LocalDateTime.now();
        this.operation=operation;
        this.doorStatus=doorStatus;
    }
    
    public AccesLog(String tenantName, String operation, String errorMessage) {
        this.tenantName="None";
        this.dateTime=LocalDateTime.now();
        this.operation=operation;
        this.errorMessage=errorMessage;
    }
    
    public AccesLog(String tenantName, String operation, DoorStatus doorStatus, String errorMessage) {
        this.tenantName="None";
        this.dateTime=LocalDateTime.now();
        this.operation=operation;
        this.doorStatus=doorStatus;
        this.errorMessage=errorMessage;
    }
    
    public String accesLog() {
        return tenantName+""+dateTime+""+operation+""+doorStatus+""+errorMessage;
    }
}
