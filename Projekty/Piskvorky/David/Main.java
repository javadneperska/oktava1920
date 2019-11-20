package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 0;
        while(rows < 3 || rows > 10) {
            System.out.println("Rows:");
            rows = sc.nextInt();
            if(rows < 3 || rows > 10)
            {
                System.out.println("Please select from a range of 3-10.");
            }
        }
        int columns = 0;
        while(columns < 3 || columns > 10) {
            System.out.println("Columns:");
            columns = sc.nextInt();
            if(columns < 3 || columns > 10)
            {
                System.out.println("Please select from a range of 3-10.");
            }
        }
        int minToWin = rows+columns*2;
        while(minToWin > columns && minToWin > rows) {
            System.out.println("Needed to win:");
            minToWin = sc.nextInt();
            if (minToWin > columns && minToWin > rows) {
                System.out.println("The minimum number to win was higher than the amount of rows and columns.");
            }
        }
        TTT game = new TTT(rows, columns, minToWin);
        game.initializeBoard();
        do {
            System.out.println("Current board layout:");
            game.printBoard();
            int row;
            int col;
            do{
                System.out.println("Player " + game.getCurrentPlayerMark() + ", enter an empty row and column to place your mark!");
                row = sc.nextInt()-1;
                col = sc.nextInt()-1;
            }
            while(!game.placeMark(row, col));
            game.changePlayer();
        }
        while(!game.checkForWin() && !game.isBoardFull());
        if(game.isBoardFull() && !game.checkForWin())
        {
            System.out.println("Tie!");
        }
        else {
            System.out.println("Current board layout:");
            game.printBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " won!");
        }
    }
}
