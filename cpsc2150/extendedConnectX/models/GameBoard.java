package cpsc2150.extendedConnectX.models;

/*
  Janani Salai (jsalai), Janki Patel (janki7143), Dev Shah (devrshah)
  CPSC 2150 001 Project 1 (Part 2)
  September 20, 2023
*/

public class GameBoard
{

    private int numToWin = 5;
    private int numCol = 7;
    private int numRow = 9;
    private char[][] gameboard;


    /**
     * Constructor for the GameBoard class that instantiates a 2-D array of blank cells
     * @invariant game board is of dimension 8x6 with 42 positions
     * @post GameBoard sets all spaces to empty char- [' ']
     * @post GameBoard instance is in usable state
     */
    public GameBoard()
    {
        gameboard= new char[numRow][numCol];
        for (int i=0; i< numRow; i++){
            for( int j =0; j<numCol; j++){
                gameboard[i][j] = ' ';
            }
        }
    }

    public int getNumRow() {
        return numRow;
    }

    public int getNumColumn() {
        return numCol;
    }

    public int getNumToWin() {
        return numToWin;
    }

    /**
     * @param pos is a BoardPosition object that gives the coordinates of a cell
     * @post self = #self
     * @return the char at the position or [" "] if the location is empty
     */
    public char whatsAtPos(BoardPosition pos)
    {
        return gameboard[pos.getNumRow()][pos.getNumColumn()];
    }