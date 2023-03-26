/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ionic
 */
public class DoorLockController implements ControllerInterface {

    private Map<Tenant, AccesKey> validAcces = new HashMap();
    private ArrayList<AccesLog> list = new ArrayList<>();
    private Door door;

    public DoorLockController() {
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccesKey y = new AccesKey(pin);
        AccesLog acc = new AccesLog();

        if (door.getTries() == 3) {
            acc = new AccesLog(validAcces.get(pin).toString(), "Enter Pin!!", door.getStatus(), "Too many attempts.");
            list.add(acc);
            throw new TooManyAttemptsException("Too many attemps.");
        }

        if (pin.equals(ControllerInterface.MASTER_KEY)) {
            door.xreset();
            if (door.getStatus().equals(DoorStatus.CLOSE)) {
                door.unlockDoor();
                return door.getStatus();
            } else {
                door.lockDoor();
                return door.getStatus();
            }
        }

        if (validAcces.containsValue(y) == true) {
            if (door.getStatus().equals(DoorStatus.CLOSE)) {
                door.unlockDoor();
                acc = new AccesLog(validAcces.get(pin).toString(), "Door opened!", door.getStatus(), "None");
                list.add(acc);
                door.xreset();
                return door.getStatus();
            } else {
                door.lockDoor();
                acc = new AccesLog(validAcces.get(pin).toString(), "Door Closed!", door.getStatus(), "None");
                list.add(acc);
                door.xreset();
                return door.getStatus();
            }
        } else {
            door.incx();
            acc = new AccesLog(validAcces.get(pin).toString(), "Enter Pin!!", door.getStatus(), "The pin is Incorrect! You have " + (3 - door.getTries()) + " more tries!");
            list.add(acc);
            Scanner scanner = new Scanner(System.in);
            throw new InvalidPinException("The pin is Incorrect! You have " + (3 - door.getTries()) + " more tries!");
        }
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        Tenant t = new Tenant(name);
        AccesKey a = new AccesKey(pin);
        AccesLog acc = new AccesLog();
        if (validAcces.containsKey(t) == true) {
            acc = new AccesLog(name, "Adding Tenant!", door.getStatus(), "The tenant already exists!");
            list.add(acc);
            throw new TenantAlreadyExistsException("The tenant already exists!");
        } else {
            acc = new AccesLog(name, "Added Tenant succesfully!", door.getStatus(), "None");
            list.add(acc);
            validAcces.put(t, a);
        }
    }

    @Override
    public void removeTenant(String name) throws Exception {
        Tenant t = new Tenant(name);
        AccesLog acc = new AccesLog();
        if (validAcces.containsKey(t) == true) {
            acc = new AccesLog(name, "Removed Tenant!", door.getStatus(), "None");
            list.add(acc);
            validAcces.remove(t);
        } else {
            acc = new AccesLog(name, "Remove Tenant!!", door.getStatus(), "The tenant was not found!");
            list.add(acc);
            throw new TenantNotFoundException("The tenant was not found!");
        }
    }

    public ArrayList<AccesLog> getAccesLogs() {
        return list;
    }

}
