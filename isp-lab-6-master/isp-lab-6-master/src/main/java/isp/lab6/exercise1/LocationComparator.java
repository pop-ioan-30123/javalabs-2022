/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab6.exercise1;

import java.util.Comparator;

/**
 *
 * @author ionic
 */
public class LocationComparator implements Comparator<SensorReading> {

    @Override
    public int compare(SensorReading o1, SensorReading o2) {
       return o1.getLocation().compareTo(o2.getLocation());
    }
}