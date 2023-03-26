/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

/**
 *
 * @author ionic
 */
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View { // View uses Swing framework to display UI to user

    private JFrame frame;
    private JLabel accescodeLabel;
    private JLabel doorLabel;
    private JTextField accescodeTextfield;
    private JTextField doorTextfield;
    private JButton Entercode;

    public View() {
        frame = new JFrame("Design Preview");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  // Create UI elements
        accescodeLabel = new JLabel("Type acces code :");
        accescodeTextfield = new JTextField();
        Entercode = new JButton("Enter Code");
        doorLabel=new JLabel("Door status");
        doorTextfield= new JTextField();    // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(accescodeLabel).addComponent(doorLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Entercode))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(accescodeTextfield).addComponent(doorTextfield)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(accescodeLabel)
                        .addComponent(accescodeTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Entercode))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(doorLabel).addComponent(doorTextfield)));
        layout.linkSize(SwingConstants.HORIZONTAL, accescodeLabel, doorTextfield);
        layout.linkSize(SwingConstants.HORIZONTAL, accescodeTextfield,doorLabel );
        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getaccescodeLabel() {
        return accescodeLabel;
    }

    public void setAccesodeLabel(JLabel accescodeLabel) {
        this.accescodeLabel = accescodeLabel;
    }

    public JLabel getdoorLabel() {
        return doorLabel;
    }

    public void setdoorLabel(JLabel doorLabel) {
        this.doorLabel = doorLabel;
    }

    public JTextField getAccescodeTextfield() {
        return accescodeTextfield;
    }

    public void setAccescodeTextfield(JTextField accescodeTextfield) {
        this.accescodeTextfield = accescodeTextfield;
    }

    public JTextField getdoorTextfield() {
        return doorTextfield;
    }

    public void setdoorTextfield(JTextField doorTextfield) {
        this.doorTextfield = doorTextfield;
    }

    public JButton getEntercode() {
        return Entercode;
    }

    public void setEntercode(JButton entercode) {
        this.Entercode = entercode;
    }
}
