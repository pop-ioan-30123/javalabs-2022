/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab8.carparkaccess;

/**
 *
 * @author ionic
 */
public class UsageCost {
    public long getPrice(Car parkedC) {
        long pret;
        pret=System.currentTimeMillis() - parkedC.getEntryTime();
        pret=pret/1000;
        return pret;
    }
}
