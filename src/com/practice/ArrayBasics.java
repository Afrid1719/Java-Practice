package com.practice;

public class ArrayBasics {
    static int arr1D[] = new int[5];
    static int arr2D[][] = new int[3][3];
    public static void main(String[] args) {
	    // Filling 1D array
        for (int i = 0; i < 5; i++) {
	        arr1D[i] = i+1;
        }

        // Filling 2D arary
        for (int i = 0; i < 3; i++ )
            for (int j = 0; j < 3; j++)
                arr2D[i][j] = i + j;

	    int b[] = new int[arr1D.length];
	    System.arraycopy(arr1D, 0, b, 0, arr1D.length);
//	    printArray(b);
        System.out.println("Before cloning:");
        print2DArray(arr2D);
        System.out.println("After cloning:");
        cloneAndPrint(arr2D);
    }

    public static void print1DArray(int [] a) {
        for(int n:a) {
            System.out.print(String.valueOf(n) + " ");
        }
    }

    public static void print2DArray(int [][] a) {
        for(int n[]:a) {
            for(int m:n) {
                System.out.print(String.valueOf(m) + " ");
            }
            System.out.println('\n');
        }
    }

    public static void cloneAndPrint(int [] toBeCloned) {
        int[] clonedArr = toBeCloned.clone();
        print1DArray(clonedArr);

        if (clonedArr == toBeCloned)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void cloneAndPrint(int [][] toBeCloned) {
        int[][] clonedArr = toBeCloned.clone();
        print2DArray(clonedArr);

        if (clonedArr == toBeCloned)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

    }
}
