package com.bvrith.Serialization;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.util.Scanner;
	
public class Cost {

	public static void CalcCost() {
		Scanner sc= new Scanner(System.in);
		PrintStream ps=new PrintStream(new FileOutputStream(FileDescriptor.out));
		ps.println("Enter the estimated cost of construction");
		ps.println("Materials Available");
		ps.println("1. construction with standard material\nconstruction with above standard materials" + "\n" +
		"3. construction with high standard materials\n4. construction with high standard materials and fully automated");
		ps.println("Enter your choice");
		try {
			int choice=sc.nextInt();
			ps.println("Enter area to be covered: ");
			switch(choice){
			case 1:
				ps.println("cost ="+sc.nextDouble()*1200 +" INR");
			   break;
			case 2:
				ps.println("cost ="+sc.nextDouble()*1500 +" INR");
				break;
			case 3:
				ps.println("cost ="+sc.nextDouble()*1800 +" INR");
			   break;
			case 4:
				ps.println("cost ="+sc.nextDouble()*2500 +" INR");
			   break;
			default:
				ps.println("Invalid input");
				}
			}
		catch (Exception e) {
			ps.println("Enter a valid input");
		}
	}
}