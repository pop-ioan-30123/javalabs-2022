/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise4;

/**
 *
 * @author ionic
 */
public class FireAlarm {

        private boolean active;

        public FireAlarm(boolean active) {
            this.active = active;
        }

        public boolean isActive() {
            return this.active;
        }

        public void setActive() {
            this.active = true;
        }

        @Override
        public String toString() {
            return "Stare alarma: " + this.active;
        }
    }

