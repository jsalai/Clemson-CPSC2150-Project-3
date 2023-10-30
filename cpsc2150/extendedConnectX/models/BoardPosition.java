package cpsc2150.extendedConnectX.models;

//Janani Salai (jsalai), Janki Patel (janki7143), Dev Shah (devrshah)
//CPSC 2150 001 Project 1 (Part 2)
//September 20, 2023

public class BoardPosition
{
    private int Row;
    private int Column;

    /**
     * Constructor for the BoardPosition class
     * @invariant row >= 0 and row <= 8 and col >= 0 and col <= 6
     * @pre 0 <= row <= 8 and 0 <= col <= 6
     * @param row is row of cell on game board
     * @param col is column of cell on game board
     * @post Row = aRow, Column = aColumn
     */
    public BoardPosition(int aRow, int aColumn)
    {
        //parameterized constructor for BoardPosition
    }

    /**
     * Getter function to return row position of cell on board
     * @post Row = #Row
     * @return the integer row of the position
     */
    public int getRow()
    {
        //returns the row
    }

    /**
     * Getter function to return column position of cell on board
     * @post Column = #Column
     * @return the integer row of the position
     */
    public int getColumn()
    {
        //returns the column
    }
    /**
     * Overriding function to compare two cells on the board
     * @param cell an Object that is a cell on the board position
     * @post if the rows and columns obtained using the Object obj are equal(row = row and column = column), returns true
     *        if not, return false 
     *         Column = #Column and Row = #Row
     * @return true if cells are equal, and false if not
     */
    @Override
    public boolean equals(Object obj)
    {

    }

    /**
     * Overriding function to convert two integer values into a comma-delineated string
     * @post Row = #Row and Column = #Column, returns a string in the format "<row>, <col>"
     * @return a string with position of the space
     */
    @Override
    public String toString()
    {

    }
}
