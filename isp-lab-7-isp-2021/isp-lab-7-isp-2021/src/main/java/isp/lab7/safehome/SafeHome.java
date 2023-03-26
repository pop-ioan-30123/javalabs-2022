package isp.lab7.safehome;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SafeHome {

    public static void main(String[] args) {
        
        
        ControllerInterface ctr=new DoorLockController();
        try {
            ctr.addTenant("1234","Mircea");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            ctr.addTenant("1452","Mircea");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            ctr.enterPin("4532");
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        
        try {
            ctr.addTenant("12345", "User1");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < 2; i++) {
            try {
                ctr.enterPin("4532");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }//.for

        try {
            ctr.enterPin("4532");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //Nu vrea sa introduca valori in variabila validAcces de forma Map<Tenant, AccesKey> si nu inteleg de ce
        
    }
}
