package com.company;

import java.util.Random;

public class TTT {
    private char[][] board;
    private char currentPlayerMark;
    private int rows;
    private int cols;
    private int min;

    public TTT(int rowAmount, int colAmount, int minToWin)
    {
        rows = rowAmount;
        cols = colAmount;
        min = minToWin;
        board = new char[rows][cols];
        Random rand = new Random();
        int randomInt = rand.nextInt(2);
        if(randomInt == 1) {
            currentPlayerMark = 'x';
        } else currentPlayerMark = 'o';
    }

    public void initializeBoard()
    {
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                board[i][j] = '-';
            }
        }
    }

    public char getCurrentPlayerMark()
    {
        return currentPlayerMark;
    }

    public void printBoard()
    {
        for(int i=0; i<cols; i++) {
            System.out.print("----");
        }
        System.out.println("-");

        for(int i=0; i<rows; i++)
        {
            System.out.print("| ");
            for(int j=0; j<cols; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            for(int j=0; j<cols; j++) {
                System.out.print("----");
            }
            System.out.println("-");
        }
    }

    public boolean isBoardFull()
    {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkForWin()
    {
        if(checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin())
        {
            return true;
        }
        return false;
    }

    private boolean checkRowsForWin()
    {
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] != '-') {
                    if(j+min <= cols) {
                        char checkingMark = board[i][j];
                        boolean failed = false;
                        for (int k = 0; k < min; k++) {
                            if (checkingMark != board[i][j + k]) {
                                failed = true;
                            }
                        }
                        if (!failed) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean checkColumnsForWin()
    {
        for(int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] != '-') {
                    if(i+min <= rows) {
                        char checkingMark = board[i][j];
                        boolean failed = false;
                        for (int k = 0; k < min; k++) {
                            if (checkingMark != board[i+k][j]) {
                                failed = true;
                            }
                        }
                        if (!failed) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean checkDiagonalsForWin()
    {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++){
                if(board[i][j] != '-') {
                    char checkingMark = board[i][j];
                    boolean failed = false;
                    if (i + min <= rows && j + min <= cols) {
                        for (int k = 0; k < min; k++) {
                            if (checkingMark != board[i+k][j+k]) {
                                failed = true;
                            }
                        }
                        if (!failed) {
                            return true;
                        }
                    }
                    failed = false;
                    if (i + min <= rows && j - (min-1) >= 0) {
                        for (int k = 1; k < min; k++) {
                            if (checkingMark != board[i+k][j-k]) {
                                failed = true;
                            }
                        }
                        if (!failed) {
                            return true;
                        }
                    }

                }
            }
        }
        return false;
    }

    private boolean checkRowCol(char c1, char c2, char c3)
    {
        if(c1 != '-' && c2 != '-' && c3 != '-'){
            if(c1 == c2 && c2 == c3){
                return true;
            }
            else return false;
        }
        else return false;
    }

    public void changePlayer() {
        if(currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        } else {
            currentPlayerMark = 'x';
        }
    }

    public boolean placeMark(int row, int col) {
        if((row >= 0) && (row < rows)) {
            if((col >= 0) && (col < cols)) {
                if(board[row][col] == '-'){
                    board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }
        return false;
    }
}
