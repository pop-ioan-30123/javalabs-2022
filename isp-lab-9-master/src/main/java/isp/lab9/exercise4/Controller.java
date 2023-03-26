/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

/**
 *
 * @author ionic
 */
import javax.swing.JOptionPane;

public class Controller implements Observer{

    private Model model;
    private View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }

    public void initView() {
        view.getvalueTextfield().setText(String.valueOf(model.getValue()));
    }

    public void initController() {
        view.getGenerate().addActionListener(e -> EnterCode());
    }

    private void EnterCode() {
        ;// se schimba cu getValue....
    }
    
    @Override
    public void update(Object event) {
        System.out.println("The sensor was setted.");
        System.out.println("Received event: Event class:" + event.getClass() + ":" + event.toString());
    }
}
