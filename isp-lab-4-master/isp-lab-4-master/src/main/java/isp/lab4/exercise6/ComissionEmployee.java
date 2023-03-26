/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

/**
 *
 * @author ionic
 */
public class ComissionEmployee extends Employee {
    
    private double grossSales;
    private double comissionSales;
    
    public ComissionEmployee(String nume, String prenume, double grossSales, double comissionSales) {
        super(nume,prenume);
        this.grossSales=grossSales;
        this.comissionSales=comissionSales;
    }
    
    @Override
    public double getPaymentAmount() {
        return this.grossSales+this.comissionSales;
    }
}
