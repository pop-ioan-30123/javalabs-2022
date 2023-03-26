/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 */
public class Car implements Serializable, Comparable<Car> {

    private String plateNumber;
    private long entryTime;
    private long leftTime;

    public Car(String plateNumber, long entryTime) {
        this.plateNumber = plateNumber;
        this.entryTime = entryTime;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setLeftTime(long leftTime) {
        this.leftTime = leftTime;
    }

    public long getLeftTime() {
        return leftTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.plateNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (!Objects.equals(this.plateNumber, other.plateNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Car e) {
        return this.getPlateNumber().compareTo(e.getPlateNumber());
    }

    @Override
    public String toString() {
        return "Car{" + "plateNumber=" + plateNumber + ", entryTime=" + entryTime + '}';
    }

}
