/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ionic
 */
public class SensorReadingList implements IReadingRepository {

    ArrayList<SensorReading> list = new ArrayList<>();

    /**
     * Add a new sensor reading.
     *
     * @param reading
     */
    @Override
    public void addReading(SensorReading reading) {
        list.add(reading);
    }

    /**
     * Return avarage of all readings for a specific sensor type and location.
     *
     * @param type
     * @param location
     * @return
     */
    @Override
    public double getAvarageValueByType(Type type, String location) {
        int contor;
        double average;
        contor = 0;
        average = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getType().equals(type) && list.get(i).getLocation().equals(location)) {
                average = list.get(i).getValue() + average;
                contor++;
            }
        }
        return average / contor;
    }

    /**
     * Return all readings for a specific type.
     *
     * @param type
     * @return
     */
    @Override
    public List<SensorReading> getReadingsByType(Type type) {

        ArrayList<SensorReading> typelist = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getType().equals(type)) {
                typelist.add(list.get(i));
            }
        }
        return typelist;
    }

    /**
     * List all readings sorted by location (alphabetical).
     */
    @Override
    public void listSortedByLocation() {
        LocationComparator c = new LocationComparator();
        Collections.sort(list, c);
    }

    /**
     * List all readings sorted by value;
     */
    @Override
    public void listSortedByValue() {
        ValueComparator c = new ValueComparator();
        Collections.sort(list, c);
    }

    /**
     * Return all readings filtered by type and location.
     *
     * @param location
     * @param type
     * @return
     */
    @Override
    public List<SensorReading> findAllByLocationAndType(String location, Type type){
    ArrayList<SensorReading> typelist = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getType().equals(type) && list.get(i).getLocation().equals(location)) {
                typelist.add(list.get(i));
            }
        }
        return typelist;
    }
}
