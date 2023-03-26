/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab5.exercise4;

/**
 *
 * @author ionic
 */
public class ShapeFactoryProvider {
    private ShapeFactoryProvider() {
    }

    /**
     * Get an instance of {@link AbstractShapeFactory} based on 
     * @param type - one of the values "normal" / "rounded"
     * @return instance of type {@link AbstractShapeFactory}
     */
    public static AbstractShapeFactory getShapeFactory(String type) {
        if ("normal".equals(type)) {
            return new ShapeFactory();
        }

        if ("rounded".equals(type)) {
            return new RoundedShapeFactory();
        }

        return null;
    }
}