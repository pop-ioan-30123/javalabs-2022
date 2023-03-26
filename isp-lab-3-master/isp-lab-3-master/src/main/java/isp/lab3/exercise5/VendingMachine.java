/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise5;

import java.util.Scanner;

/**
 *
 * @author ionic
 */
public class VendingMachine {

    public String[] products;
    public int credit;
    public int[] id;

    public VendingMachine() {
        String[] v = {"Cola", "Fanta", "Sprite", "7Up", "Nestea", "Oreo", "Milka", "7Days", "Dare", "Gusto"};
        int[] codes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            this.products[i] = v[i];
            this.id[i] = codes[i];
        }
        this.credit = 0;
    }

    public void displayProducts() {
        System.out.println("Lista de produse disponibile este:");
        for (int i = 0; i < 10; i++) {
            System.out.println(this.products[i] + "  " + this.id[i]);
        }
    }

    public void insertCoins(int value) {
        this.credit = this.credit + value;
    }

    public void selectProduct(int id) {

        int pp = -1;
        for (int i = 0; i < 10; i++) {
            if (this.id[i] == id) {
                pp = i;
            }
        }
        if (pp != -1) {
            System.out.println(this.products[pp]);
        } else {
            System.out.println("Nu exista nici un produs cu acest id!");
        }
    }

    public void displayCredit() {
        System.out.println("Creditul aparatului este:" + this.credit);
    }

    public void userMenu() {
        System.out.println("        MENIU" + '\n');
        System.out.println("Pentru a cumpara produse, alege produsul, dupa care introdu sold-ul necesar." + '\n');
        System.out.println("1. Afiseaza produsele");
        System.out.println("2. Afiseaza soldul");

        int p;
        Scanner in = new Scanner(System.in);
        p = in.nextInt();
        switch (p) {
            case 1: {
                this.displayProducts();
            }
            ;
            break;
            case 2: {
                this.displayCredit();
            }
            ;
            break;
        }

    }
}
