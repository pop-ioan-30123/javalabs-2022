/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab5.exercise4;

/**
 *
 * @author ionic
 */
public abstract class AbstractShapeFactory {
    /**
     * Get specific shape by type
     * @param type - one of the values ("rectangle", "roundedRectangle", "square", "roundedSquare")
     * @return instance of shape by desired type
     */
    abstract Shape getShape(String type);
}