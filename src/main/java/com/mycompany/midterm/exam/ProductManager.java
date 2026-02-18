/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.midterm.exam;

/**
 *
 * @author sharipov
 */
public class ProductManager {
    
    public double calculateDiscount(double price, double percent) {
        return price - (price * percent / 100.0);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
