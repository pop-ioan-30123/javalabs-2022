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
public class ValueComparator implements Comparator<SensorReading> {

    @Override
    public int compare(SensorReading o1, SensorReading o2) {
        return (int) o1.getValue()-o2.getValue();
    }

}
