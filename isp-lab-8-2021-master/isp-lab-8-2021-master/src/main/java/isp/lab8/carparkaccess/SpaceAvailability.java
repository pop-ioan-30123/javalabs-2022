/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab8.carparkaccess;

import java.util.ArrayList;

/**
 *
 * @author ionic
 */
public class SpaceAvailability {

    public int check(ArrayList<Car> parkedC, int capacity) {
        if (parkedC.size() >= capacity)
        {
            return 0;
        } else {
            return 1;
        }
    }
}
