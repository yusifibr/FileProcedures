/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.IOException;
import java.util.Scanner;

import writeandread.FileUtil;
import yazmaq.Employee;

/**
 *
 * @author Yusif
 */
public class Main {
    public static void main(String[] args) {
        
        FileUtil file = new FileUtil();
        Employee em = new Employee("Yusif", "Ibrahimli", 26, 750.5);
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        try {
            file.instancewriteObjToFile(em);
            System.out.println("fayla yazildi.....");
        } catch (IOException ex) {
            System.out.println("xeta bas verdi");
        }
    }
}
