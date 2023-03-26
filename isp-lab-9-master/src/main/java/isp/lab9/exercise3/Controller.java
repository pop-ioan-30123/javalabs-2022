/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

/**
 *
 * @author ionic
 */
import javax.swing.JOptionPane;

public class Controller extends DoorLockController {

    private Model model;
    private View view;
    private Door door;

    public Controller(Model m, View v, DoorLockController d) {
        model = m;
        view = v;
        door = d.getDoor();
        initView();
    }

    public void initView() {
        view.getAccescodeTextfield().setText(model.getAccescode());
        view.getdoorTextfield().setText(model.getDoor());
    }

    public void initController() {
        view.getEntercode().addActionListener(e -> EnterCode());
    }

    private void EnterCode() {
        view.getdoorTextfield().setText(door.getStatus().name());// se schimba cu return in doorTextField....
    }
}
