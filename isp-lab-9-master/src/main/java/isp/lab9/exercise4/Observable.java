/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ionic
 */
public class Observable {

    private List<Observer> observers = new ArrayList<Observer>();
    private List<String> type = new ArrayList<String>();
    private int[] values= new int[100];
    int i=0;
    
    public void setValue(int n) {
        values[i]=n;i++;
    }
    
    public void setType(String n) {
        type.add(n);
    }
    
     public String getType() {
        return type.get(type.size()-1) ;
    }
    
    public int getValue() {
        return values[i-1];
    }

    public void changeState(Object event) {
        notifyAllObservers(event);
    }
    
    public void register(Observer observer) {
        observers.add(observer);
    }
    
    private void notifyAllObservers(Object event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
