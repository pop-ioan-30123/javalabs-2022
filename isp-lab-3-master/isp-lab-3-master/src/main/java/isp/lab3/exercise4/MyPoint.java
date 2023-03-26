/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise4;

import static java.lang.Math.abs;

/**
 *
 * @author ionic
 */
public class MyPoint {

    private int x, y, z;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setx(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public void setz(int z) {
        this.z = z;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

    public int getz() {
        return this.z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public int distance(int x, int y, int z) {
        int k;
        k = abs(this.x - x) + abs(this.y - y) + abs(this.z - z);
        return k;
    }
    
    public int distance(MyPoint another) {
        int k;
        k = abs(this.x - another.x) + abs(this.y - another.y) + abs(this.z - another.z);
        return k;
    }
    
}
