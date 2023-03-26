package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.ParkingAccessFileControl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

public class CarParkingAccessApp {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
        System.out.println("It works!");

        ParkingAccessControl pac = new ParkingAccessControl();

        Car c1 = new Car("CJ-01-AAA", System.currentTimeMillis());

        pac.carEntry(c1);

        FileOutputStream f = new FileOutputStream(new File("Logs.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);

        try {
            o.writeObject(c1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        pac.viewCurrentCars();

        TimeUnit.SECONDS.sleep(3);

        int price = pac.carExit("CJ-01-AAA");

        System.out.println(price);

        System.out.println("Price for parking is =" + price);

        ////////////////////////////////
        ParkingAccessFileControl fpac = new ParkingAccessFileControl();
//        Car c2 = new Car("CJ-02-AAA", System.currentTimeMillis());
//        Car c3 = new Car("CJ-02-BBB", System.currentTimeMillis());
          Car c4 = new Car("CJ-02-CCC", System.currentTimeMillis());
//        fpac.carEntry(c2);
//        fpac.carEntry(c3);
          fpac.carEntry(c4);

        price = fpac.carExit("CJ-02-CCC");

        try {
            o.writeObject(c1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("Price to be payed = " + price);
    }
}
