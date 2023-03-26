/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise4;

/**
 *
 * @author ionic
 */
public class TemperatureSensor {

        //atribute
        private int value;
        private String location;
        //constructori

        public TemperatureSensor() {
            this.value = 0;
            this.location = "Dormitor";
        }

        public TemperatureSensor(int type, String location) {
            this.value = type;
            this.location = location;
        }
        //metode

        public int getValue() {
            return this.value;
        }

        public String getLocation() {
            return this.location;
        }

        @Override
        public String toString() {
            return this.location + ' ' + this.value;
        }
    }
