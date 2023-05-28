/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file4 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two file names as command line arguments.");
            return;
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileName));
             FileWriter fw = new FileWriter(destinationFileName)) {
            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
                
            }
            System.out.println("Writing into file successful");
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}
