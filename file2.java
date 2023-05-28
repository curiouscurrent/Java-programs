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
import java.io.IOException;
public class file2 {
    public static void main(String[] args) {
        String fileName ="c2.txt";
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                characterCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        System.out.println("Character count: " + characterCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }
}

