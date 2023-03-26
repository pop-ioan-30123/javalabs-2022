/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ionic
 */
public class Observable {

    private List<Observer> observers = new ArrayList<Observer>();

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
