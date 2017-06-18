package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

import static com.bvan.javastart.lessons7_8.matrix.MatrixUtils.printMatrix;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] res = transpose(matrix);
        printMatrix(res);
    }

    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] res = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = matrix[i][j];
            }
        }

        return res;
    }

    public static int[][] createTestMatrix() {
        return new int[][]{
                {1, 2, 3},
                {4, 5},
                {5, 6, 7}
        };
    }

    private static int elemsNum(int[][] matrix) {
        int elemsNum = 0;
        for (int[] row : matrix) {
            elemsNum += row.length;
        }
        return elemsNum;
    }
}
