/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

/**
 *
 * @author ionic
 */
public class Door {

    private DoorStatus status;
    private int x;

    public Door(DoorStatus status) {
        this.status = status;
        this.x = 0;
    }

    public DoorStatus getStatus() {
        return this.status;
    }

    public void incx() {
        this.x = this.x + 1;
    }

    public void xreset() {
        this.x = 0;
    }

    public int getTries() {
        return this.x;
    }

    public void lockDoor() {
        this.status = DoorStatus.CLOSE;
    }

    public void unlockDoor() {
        this.status = DoorStatus.OPEN;
    }

    @Override
    public boolean equals(Object obj) {
        Door objkey = (Door) obj;
        if (this.status == objkey.status) {
            return true;
        } else {
            return false;
        }
    }
}
