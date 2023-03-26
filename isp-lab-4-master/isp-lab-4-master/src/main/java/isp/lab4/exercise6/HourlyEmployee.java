/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author ionic
 */
public class HourlyEmployee extends Employee{
    
    private double wage;
    private double hours;
    
    public HourlyEmployee(String nume, String prenume, double wage, double hours) {
        super(nume, prenume);
        this.wage=wage;
        this.hours=hours;
    }
    
    @Override
    public double getPaymentAmount() {
        return this.wage+this.hours;
    }
}
