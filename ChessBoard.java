package com.stackroute;

public class ChessBoard {
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String[][] makeBoard(){

        String [][] str= new String[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if((i+j)%2==0)
                {str[i][j]="WW|";
                    System.out.print(str[i][j]);}
                else
                {str[i][j]="BB|";
                    System.out.print(str[i][j]);}

            }
            System.out.println("");
        }


        if(row==0 || col ==0)
            return null;

        return str;
    }
}