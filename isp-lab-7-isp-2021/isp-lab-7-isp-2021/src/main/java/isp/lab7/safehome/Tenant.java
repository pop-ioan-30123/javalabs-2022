/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author ionic
 */
public class Tenant {

    String name;

    public Tenant(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Tenant objkey = (Tenant) obj;
        if (this.name == objkey.name) {
            return true;
        } else {
            return false;
        }
    }
}

