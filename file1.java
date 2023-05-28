/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Anusha
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
	public class file1 {
	    public static void main(String[] args) throws IOException {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a file name: ");
	        String fileName = scanner.nextLine();
	        File file = new File(fileName);
	        if (file.exists()) {
	            System.out.println("File exists");
	            if (file.canRead()) {
	                System.out.println("File is readable");
	            }
	            if (file.canWrite()) {
	                System.out.println("File is writable");
	            }
	            if (file.isDirectory()) {
//	                System.out.println("Type of file: " + Files.probeContentType(Paths.get(fileName)));
	            	System.out.println("Type of file: is a directory");
	            } else {
	                System.out.println("Type of file: not a directory");
	            }
	            System.out.println("Type of file: " + Files.probeContentType(Paths.get(fileName)));
	            System.out.println("Length of file in bytes: " + file.length());
	        } else {
	            System.out.println("File does not exist");
	        }
	    }
	}
