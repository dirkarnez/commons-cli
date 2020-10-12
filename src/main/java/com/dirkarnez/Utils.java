package com.dirkarnez;

import java.util.Scanner;

public class Utils {
    public static float getUserFloatInput(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextFloat();
            } catch (Exception ex) {
                scanner.nextLine();
            }
        }
    }
}