/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.input_output_file_reader_application;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Input_Output_file_reader_application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (FileInputStream fis = new FileInputStream("C:\\Users\\RC_Student_lab\\Documents\\NetBeansProjects\\Input_Output_file_reader_application\\src\\main\\java\\com\\mycompany\\input_output_file_reader_application\\Test.txt"); 
                InputStreamReader reader = new InputStreamReader(fis)) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\RC_Student_lab\\Documents\\NetBeansProjects\\Input_Output_file_reader_application\\src\\main\\java\\com\\mycompany\\input_output_file_reader_application\\Output.txt"); 
                OutputStreamWriter Writer = new OutputStreamWriter(fos)) {
        String data = JOptionPane.showInputDialog("Enter message");
        
        Writer.write(data);
    } catch(IOException e){
        e.printStackTrace();
    }
    }
}