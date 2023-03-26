/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author ionic
 */
public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    public SalariedEmployee(String nume, String prenume, double weeklySalary) {
        super(nume, prenume);
        this.weeklySalary=weeklySalary;
    }
    
    public double getPaymentAmount() {
        return this.weeklySalary;
    }
}
