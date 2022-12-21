package com.epam.training.student_Konstantin_Belin.classes.MultiplyMatrix;
import java.util.Arrays;

public class MultiplyMatrix {
    static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyCell(a, b, row, col);
            }
        }

        return result;
    }
    static int multiplyCell(int[][] a, int[][] b, int row, int col) {
        int cell = 0;
        for (int i = 0; i < b.length; i++) {
            cell += a[row][i] * b[i][col];
        }
        return cell;
    }
    public static void main(String[] args) {


        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };


        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
