/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab7.safehome;

/**
 *
 * @author ionic
 */
public class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException (String msg) {
        super(msg);
    }
}