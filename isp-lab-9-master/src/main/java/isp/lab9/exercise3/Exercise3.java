/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

/**
 *
 * @author mihai.hulea
 */
public class Exercise3 {

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
        
        // Assemble all the pieces of the MVC
        Model m = new Model("123A");
        View v = new View();
        Controller c = new Controller(m, v, (DoorLockController) ctr);
        c.initController();
        System.out.println("It works.");
    }

}
