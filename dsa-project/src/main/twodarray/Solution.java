package main.arrays.twodarray;

import java.util.Arrays;

public class Solution {
    public static int[][] solve(int[][] A) {
         
        int row = A.length;
        int col = A[0].length;
       // result[][] = new int[row][col];
        boolean isZero = false;

        for(int i=0; i<row; i++)
        {
            isZero = false;
            for(int j=0;j<col;j++){
                if(A[i][j] == 0){
                   isZero = true;
                   break;
                }
            }

            if(isZero) {
                for(int j=0;j<col;j++){
                    if(A[i][j] != 0){
                    A[i][j] = -1;
                    }
                }
             }
        }

        
        //iterate column wise
          for(int i=0; i<col; i++)
        {
            isZero = false;
            for(int j=0;j<row;j++){
                if(A[j][i] == 0){
                   isZero = true;
                   break;
                }
            }

            if(isZero) {
                for(int j=0;j<row;j++){
                    if(A[j][i] != 0){
                    A[j][i] = -1;
                    }
                }
             }
        }

        //conver all -1 to 0
        for(int i=0; i<row; i++)
        {
            
            for(int j=0;j<col;j++){
                if(A[i][j] == -1){
                   A[i][j] = 0;
                }
            }
        }

        return A;

    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        //int[] colSums = columnSums(A);
        System.out.println(Arrays.deepToString(Solution.solve(A))); // Output: [12, 15, 18]
    }
}

