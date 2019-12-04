package sk.dneperska;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean ide = true;
        int r = 3;
        int c = 3;
        int w = 3;
        while (ide)
        {
            System.out.println("rows> ");
            r = scan.nextInt();
            if(r>=3 && r <=10)
            {
                ide = false;
            }
        }
        ide = true;
        while (ide)
        {
            System.out.println("cols> ");
            c = scan.nextInt();
            if(c>=3 && c <=10)
            {
                ide = false;
            }
        }
        ide = true;
        while (ide)
        {
            System.out.println("win> ");
            w = scan.nextInt();
            if(w>=3 && w <=10)
            {
                ide = false;
            }
        }

        TicTacToe game = new TicTacToe(r,c,w);//r,c,w
        game.initialize_board();
        System.out.println("Tic-Tac-Toe!");
        int row;
        int col;
        do
        {
            System.out.println("Current board:");
            game.print_board();
            do
            {
                System.out.println("Player " + game.getCurrentPlayerMark() + ", enter an empty row and column to place your mark!");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!game.placeMark(row, col));
            game.changePlayer();
        }
        while(!game.checkForWin2(row,col) && !game.is_boardFull());
        if (game.is_boardFull() && !game.checkForWin2(row,col))
        {
            System.out.println("Tie!");
        }
        else
        {
            System.out.println("Current board :");
            game.print_board();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + " Wins!");
        }
    }
}
