package com.practice;


public class ArrayMultiplication {
    public static void main(String[] args) {
        int[][] a1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] a2 = {{-9,-8},{-6,-5},{-3,-2}};

        arrayMultiplication(a1, a2);
    }

    public static void print2DArray(int[][] a) {
        for(int n[]:a) {
            for(int m:n) {
                System.out.print(String.valueOf(m) + " ");
            }
            System.out.println('\n');
        }
    }

    public static void arrayMultiplication(int[][] a, int[][] b) {
        // Assuming it is not a Jagged Array but a Square Matrix
        if (a[0].length != b.length) {
            System.out.println("Multiplication not possible");
            return;
        }

        int res[][] = new int[a.length][b[0].length];

        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int temp = 0;
                for (int k = 0; k < b.length; k++) {
                    temp += a[i][k] * b[k][j];
                }
                res[i][j] = temp;
            }
        }

        print2DArray(res);
    }
}
