/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Date;

/**
 *
 * @author hammmi
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Yupp hier bin ich!");
        System.out.println("Um: " + new Date());
        System.out.println("On: " + System.getProperty("java.version"));
    }
    
}
