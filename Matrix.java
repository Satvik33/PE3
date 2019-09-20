package com.stackroute;

public class Matrix {
    private int row,col;
    public int getRow(){
        return row;
    }
    public void setRow(int row){
        this.row = row;
    }
    public int getCol(){
        return col;
    }
    public void setCol(int col){
        this.col = col;
    }
    public int[][] addMatrices(int[][] matrix1, int[][] matrix2){
        int[][] sum = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        if(row == 0 || col == 0){
            return null;
        }
        return sum;
    }
}

