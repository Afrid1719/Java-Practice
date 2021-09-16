package com.practice;

import java.util.Arrays;
import java.util.Scanner;

class VectorClass {
    private int[] data;

    VectorClass() {
        data = new int[0];
    }

    public boolean push(int val) {
    	int newLength = this.len() + 1;
    	try {    		
    		data = Arrays.copyOf(data, newLength);
    		data[newLength - 1] = val;
    		return true;
    	} catch(Exception e) {
    		return false;
    	}
    }
    
    public boolean pop() {
    	int length = this.len();
    	try {
    		if (length == 0) {
    			System.out.println("Vector is already empty.");
    			return true;
    		}
    		int deletedItem = data[0];
    		data = Arrays.copyOfRange(data, 1, length - 1);
    		System.out.println("Pop Item: " + Integer.toString(deletedItem));
    		return true;
    	} catch(Exception e) {
    		return false;
    	}
    }
    
//    public boolean update() {}
    
    public void printReadable() {
    	if (this.len() == 0) {
    		System.out.println("You don't have any item. I think you should add some items.");
    		return;
    	}
    	for (int i = 0; i < data.length; i++) {
			System.out.println(String.format("At index %d --> %d", i, data[i]));
		}
    }
    
    public int[] getData() {
        return data;
    }

    public int len() {
    	return data.length;
    }
}

public class ResizableVector {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        VectorClass arr = new VectorClass();
        
        System.out.println("Welcome to the Resizable Vector Program :) \n\n");
        printOptions();
        System.out.print("\nEnter the operation number you want to perform:\n");
        
        int option = sc.nextInt();
        
        while (option >= 0) {
        	switch(option) {
        	case 0: System.out.println("Okay. Bye :D");
        		System.exit(0);
        	case 1: System.out.print("Enter the number you want to add at the back of the vector: ");
        		int item = sc.nextInt();
        		if (! arr.push(item)) {
        			System.out.println("Oops! Something went wrong. Please try again!");
        		}
        		break;
        	
        	case 2: if (! arr.pop()) {
        		System.out.println("Oops! Something went wrong. Please try again!");
        	}
        	break;
        	
        	case 3: System.out.println("Vector Data:");
        		arr.printReadable();
        		break;
        	default: System.out.println("Invalid option. Please try again!");	
        	}
        	
        	System.out.println("\n");
        	printOptions();
            System.out.print("\nEnter the operation number you want to perform:\n");
            option = sc.nextInt();
        }
        
        sc.close();
    }
    
    public static void printOptions() {
    	System.out.println("-*-*-*-*- Following are the operations -*-*-*-*- \n");
    	System.out.println("Add an element at the back of the vector ==> Press 1");
    	System.out.println("Delete an element from the front of the vector ==> Press 2");
    	System.out.println("View all the data of the vector ==> Press 3");
    	System.out.println("To exit the program ==> Press 0");
    }
}