package sk.dneperska;

import java.util.Arrays;

public class TicTacToe
{
    private char[][] _board;
    private char currentPlayerMark;
    private int rows =0;
    private int columns = 0;
    private int winCount = 0;

    public TicTacToe(int _rows,int _columns,int _winCount) {
        rows = _rows;
        columns = _columns;
        winCount = _winCount;
        _board = new char[rows][columns];


        currentPlayerMark = 'x';
        initialize_board();
    }

    //Gives us access to currentPlayerMark
    public char getCurrentPlayerMark()
    {
        return currentPlayerMark;
    }


    // Set/Reset the _board back to all empty values.
    public void initialize_board() {

        // Loop through rows
        for (int i = 0; i < rows; i++) {

            // Loop through columns
            for (int j = 0; j < columns; j++) {
                _board[i][j] = '-';
            }
        }

    }


    // Print the current _board (may be replaced by GUI implementation later)
    public void print_board() {


        for (int i = 0; i < rows; i++) {
            System.out.print("| ");
            for (int j = 0; j < columns; j++) {
                System.out.print(_board[i][j] + " | ");
            }
            System.out.println();

        }
    }


    // Loop through all cells of the _board and if one is found to be empty (contains char '-') then return false.
    // Otherwise the _board is full.
    public boolean is_boardFull() {
        boolean isFull = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (_board[i][j] == '-') {
                    isFull = false;
                }
            }
        }

        return isFull;
    }


    // Returns true if there is a win, false otherwise.
    // This calls our other win check functions to check the entire _board.


    public boolean checkForWin2(int r,int c)
    {
        if(r<0 || c < 0 || r > rows || c>columns)return false;

        return (chceckRowsForWin2(r,c) || checkColumnsForWin2(r,c) || checkDiagonalForWin2(r,c) || checkAntiDiagonalForWin(r,c));
    }


    // Loop through rows and see if any are winners.

    private boolean chceckRowsForWin2(int r,int c)
    {
        boolean result = false;
        char[] daco = new char[columns];
        for (int j = 0;j<rows;j++)
        {

            daco = _board[j];
            result = checkSame(daco);
            if (result)
            {
                return true;
            }
        }


        return false;
    }


    // Loop through columns and see if any are winners.

    private boolean checkColumnsForWin2(int r,int c)
    {
        boolean result = false;
        char[] daco = new char[rows];
        for (int j = 0;j<columns;j++)
        {

            for(int i =0;i<rows;i++)
            {
                daco[i] = _board[i][j];
            }


            result = checkSame(daco);
            if (result)
            {
                return true;
            }
        }


        return false;
    }


    // Check the two diagonals to see if either is a win. Return true if either wins.

    private boolean checkDiagonalForWin2(int r,int c)
    {
        char[] b = new char[rows+1];
        char[] board = GetMap();
        int id = ((columns*r))+c;
        int s = (id % (columns + 1));
        int f = (id - s) / (columns + 1);
        int start = id - (f * (columns + 1));

        int i = 0;
        int sur = start;
        while(sur < board.length)
        {

            b[i] = board[sur];
            i++;
            sur += (columns + 1);
        }

        return checkSame(b);
    }
    private boolean checkAntiDiagonalForWin(int r,int c)
    {
        char[] b = new char[rows+10];
        char[] board = GetMap();
        int id = ((columns * (r)) + c);
        int s = (id % (columns - 1));
        int f = (id - s) / (columns - 1);
        int start = id - (f * (columns - 1));

        int i = 0;
        int sur = start;
        while (sur < board.length)
        {

            b[i] = board[sur];
            i++;
            sur += (columns - 1);
        }

        return checkSame(b);
    }


    // Check to see if all three values are the same (and not empty) indicating a win.
    private boolean checkRowCol(char c1, char c2, char c3) {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }
    private boolean checkSame(char[] d)
    {
        int s = 1;
        int i = 1;
        while(i<d.length)
        {
            if ((d[i - 1] != d[i]) || (d[i] == '-') || d[i] == ' ' || d[i] == '\0')
            {
                s = 1;
            }
            else { s++; }
            if (s == winCount) { return true; }

            i++;
        }

        return false;
    }


    // Change player marks back and forth.
    public void changePlayer() {
        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        }
        else {
            currentPlayerMark = 'x';
        }
    }

    // Places a mark at the cell specified by row and col with the mark of the current player.
    public boolean placeMark(int row, int col) {
        //if(row> rows || col > columns)return false;
        // Make sure that row and column are in bounds of the _board.
        if ((row >= 0) && (row < rows)) {
            if ((col >= 0) && (col < columns)) {
                if (_board[row][col] == '-') {
                    _board[row][col] = currentPlayerMark;
                    return true;
                }
            }
        }

        GetMap();
        return false;
    }

    public char[] GetMap()
    {
        char[] result = new char[rows*columns];
        int d;
        for(int i = 0;i<rows;i++)
        {
            for(int j =0;j<columns;j++)
            {

                d = (i * rows) + j;
                result[d] = _board[i][j];
            }
        }
        //System.out.println(result.toString());
        System.out.println(Arrays.toString(result));
        return result;

    }

}
