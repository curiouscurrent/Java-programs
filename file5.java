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
import java.io.InputStreamReader;

public class file5 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
				System.out.print("Enter the source file name: ");
				String sourceFileName = br.readLine();

				System.out.print("Enter the destination file name: ");
				String destinationFileName = br.readLine();

				try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
						FileWriter writer = new FileWriter(destinationFileName)) {
						String line;
						while ((line = reader.readLine()) != null) {
						writer.write(line + System.lineSeparator());
						}	
						System.out.println("Writing into file successful");
				} 
				catch (IOException e) {
						System.out.println("An error occurred while reading or writing the file.");
						e.printStackTrace();
				}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file names.");
			e.printStackTrace();
		}
	}
}

