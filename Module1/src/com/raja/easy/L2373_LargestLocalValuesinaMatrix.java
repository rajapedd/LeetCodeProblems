package com.raja.easy;

import java.util.Arrays;

public class L2373_LargestLocalValuesinaMatrix {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
       // largestLocal(grid);

        int N=grid.length;
        int[][] maxLocal=new int[N-2][N-2];
        for(int i=0;i<N-2;i++){
            for(int j=0;j<N-2;j++){
                maxLocal[i][j]=findMax(grid,i,j);
            }
        }


       // System.out.println(Arrays.deepToString(largestLocal(grid)));
        System.out.println(Arrays.deepToString(maxLocal));
    }

//    private static int findMax(int[][] grid, int x, int y) {
//        int maxElement=0;
//        for(int i=x;i< x+3;i++){
//            for(int j=y;j< y+3;j++){
//                maxElement=Math.max(maxElement,grid[i][j]);
//            }
//        }
//        return maxElement;
//    }



    private static int findMax(int[][] grid, int x, int y) {
        int maxElement = 0;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                maxElement = Math.max(maxElement, grid[i][j]);
            }
        }
        return maxElement;
    }

    public static int[][] largestLocal(int[][] grid) {
        int N = grid.length;
        int[][] maxLocal = new int[N - 2][N - 2];
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 2; j++) {
                maxLocal[i][j] = findMax(grid, i, j);
            }
        }
        return maxLocal;
    }

}
