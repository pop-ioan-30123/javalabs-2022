/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mihai.hulea
 */
public class ParkingAccessControl {

    public static final int MAX_CAPACITY = 5;

    private ArrayList<Car> parkedCars = new ArrayList<>();

    private ArrayList<Car> previousCars = new ArrayList<>();

    public void carEntry(Car car) {
        //1. sa verific capacitatea
        SpaceAvailability v = new SpaceAvailability();
        if (v.check(parkedCars, MAX_CAPACITY) == 0) //2. daca capacitatea este depasita -> return
        {
            System.out.println("The car park is full!");
        } //3. verific daca nu cumva masina este deja in parcare, si daca este -> return
        else {
            if (parkedCars.contains(car)) {
                System.out.println("Car " + car + " is already in the car park!");
            } //4. daca masina nu este in parcare salvez obiectul de tip car in parkedCars 
            else {
                parkedCars.add(car);
                System.out.println("Car " + car + " is entering car park!");
            }
        }
    }

    public ArrayList<Car> parked() {
        return parkedCars;
    }

    public int carExit(String plateNumber) {
        //1. cautam dupa plate number un Car in parkedCars
        //2. daca nu am gasit plateNumber -> return 
        //3. daca am gasit masina, 
        //calculez timpul de asteptare in parcare, -> System.currentTimeMiliseconds()
        //calculez pretul, 
        //sterg masina din parkedCars si o adaug in previousCars
        //returnez pretul
        long pret = 0;
        for (int i = 0; i < parkedCars.size(); i++) {
            if (parkedCars.get(i).getPlateNumber().equals(plateNumber)) {
                UsageCost c = new UsageCost();
                pret = c.getPrice(parkedCars.get(i));
                parkedCars.get(i).setLeftTime(System.currentTimeMillis());
                previousCars.add(parkedCars.get(i));
                parkedCars.remove(parkedCars.get(i));
            }
        }
        if (pret == 0) {
            System.out.println("There is not any car with that plate number in the car park!");
        } else {
            return (int) pret;
        }
        return 1;
    }

    public void viewCurrentCars() {
        UsageCost u = new UsageCost();
        for (int i = 0; i < parkedCars.size(); i++) {
            System.out.println("Car " + (i + 1) + ": \nPlate number: " + parkedCars.get(i).getPlateNumber() + ("\nEntry Time: ") + parkedCars.get(i).getEntryTime()
                    + "\nCurrent Cost:" + u.getPrice(parkedCars.get(i)) + "\n\n");
        }
        if (MAX_CAPACITY - parkedCars.size() == 0) {
            System.out.println("There are not available slots in the car park!");
        } else {
            System.out.println("There are " + (MAX_CAPACITY - parkedCars.size()) + " available slots in the car park!");
        }
    }

    public void viewPastEntriesForCars() {
        Collections.sort(previousCars);
        long carn = 0;
        long stai = 0;
        long T = 0;
        for (int i = 0; i < previousCars.size() - 1; i++) {
            if (!previousCars.get(i).getPlateNumber().equals(previousCars.get(i + 1).getPlateNumber())) {
                stai = stai + (previousCars.get(i).getLeftTime() - previousCars.get(i).getEntryTime());
                T = T + (previousCars.get(i).getLeftTime() - previousCars.get(i).getEntryTime());
                System.out.println("Car " + carn + ": \nPlate number: " + parkedCars.get(i).getPlateNumber() + ("\nEntry Time: ") + parkedCars.get(i).getEntryTime()
                        + "\nTotal Stay: " + stai + "\nTotal Cost: " + stai + "\n\n");
                carn++;
                stai = 0;
            } else {
                stai = stai + (previousCars.get(i).getLeftTime() - previousCars.get(i).getEntryTime());
                T = T + (previousCars.get(i).getLeftTime() - previousCars.get(i).getEntryTime());
            }
        }
        System.out.println("The total cost from all cars is: " + T);
    }

    public void viewPastEntriesForCar(String plateNumber) {
        Collections.sort(previousCars);
        long stai = 0;
        for (int i = 0; i < previousCars.size(); i++) {
            if (previousCars.get(i).getPlateNumber().equals(plateNumber)) {
                if (!previousCars.get(i).getPlateNumber().equals(previousCars.get(i + 1).getPlateNumber())) {
                    stai = stai + (previousCars.get(i).getLeftTime() - previousCars.get(i).getEntryTime());
                    System.out.println("\nCar: " + parkedCars.get(i).getPlateNumber() + ("\nEntry Time: ") + parkedCars.get(i).getEntryTime()
                            + "\nTotal Stay: " + stai + "\nTotal Cost: " + stai + "\n\n");
                    i = previousCars.size();
                } else {
                    stai = stai + (previousCars.get(i).getLeftTime() - previousCars.get(i).getEntryTime());
                }
            }
        }
        System.out.println("The total cost for that car is: " + stai);
    }

    public void viewPastUniqueEntries() {
        Collections.sort(previousCars);
        long carn = 0;
        System.out.println("The unique Cars that entered the car park once are:");
        for (int i = 0; i < previousCars.size() - 1; i++) {
            if (!previousCars.get(i).getPlateNumber().equals(previousCars.get(i + 1).getPlateNumber())) {
                carn++;
                if (carn == 1) {
                    System.out.println("\nCar: " + parkedCars.get(i).getPlateNumber());
                }
                carn = 0;
            } else {
                carn++;
            }
            System.out.println("\n\nAll cars entried:");
        }

        for (int i = 0; i < previousCars.size() - 1; i++) {
            if (!previousCars.get(i).getPlateNumber().equals(previousCars.get(i + 1).getPlateNumber())) {
                carn++;
                if (carn == 1) {
                    System.out.println("\nCar: " + parkedCars.get(i).getPlateNumber() + "  Entries: " + carn);
                }
                carn = 0;
            } else {
                carn++;
            }
            System.out.println("\n");
        }
    }

}
