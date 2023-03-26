/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

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
    private JLabel valueLabel;
    private JLabel resultLabel;
    private JTextField valueTextfield;
    private JTextField resultTextfield;
    private JButton Generate;
    private String type;

    public View() {
        frame = new JFrame("Design Preview");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);  // Create UI elements
        valueLabel = new JLabel(type + ": ");
        valueTextfield = new JTextField();
        Generate = new JButton("Enter Code");
        resultLabel=new JLabel("Value");
        resultTextfield= new JTextField();    // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(valueLabel).addComponent(resultLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(Generate))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(valueTextfield).addComponent(resultTextfield)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(valueLabel)
                        .addComponent(valueTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(Generate))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(resultLabel).addComponent(resultTextfield)));
        layout.linkSize(SwingConstants.HORIZONTAL, valueLabel, resultTextfield);
        layout.linkSize(SwingConstants.HORIZONTAL, valueTextfield,resultLabel );
        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getvalueLabel() {
        return valueLabel;
    }

    public void setvalueLabel(JLabel valueLabel) {
        this.valueLabel = valueLabel;
    }

    public JLabel getresultLabel() {
        return resultLabel;
    }

    public void setresultLabel(JLabel resultLabel) {
        this.resultLabel = resultLabel;
    }

    public JTextField getvalueTextfield() {
        return valueTextfield;
    }

    public void setvalueTextfield(JTextField valueTextfield) {
        this.valueTextfield = valueTextfield;
    }

    public JTextField resultTextfield() {
        return resultTextfield;
    }

    public void setresultTextfield(JTextField resultTextfield) {
        this.resultTextfield = resultTextfield;
    }

    public JButton getGenerate() {
        return Generate;
    }

    public void setGenerate(JButton generate) {
        this.Generate = generate;
    }
}
