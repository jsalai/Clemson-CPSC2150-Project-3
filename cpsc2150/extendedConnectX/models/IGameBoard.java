package cpsc2150.extendedConnectX.models;

/*
  Janani Salai (jsalai), Janki Patel (janki7143), Dev Shah (devrshah)
  CPSC 2150 001 Project 1 (Part 2)
  September 20, 2023
*/

public interface IGameBoard {
  
  public static final int numRow = 9, numCol = 7, numToWin = 5;

  /**
   * Function that gets the number of rows on the board
   * @post returns the number of rows
   * @return number of rows on the gameboard
   */
  public int getNumRows(); //primary

  /**
   * Function that gets the number of columns on the board
   * @post returns the number of columns
   * @return number of columns on the gameboard
   */
  public int getNumColumns(); //primary

  /**
   * Function that returns the number of tokens that need to be placed in a row to win the game
   * @post returns the number of tokens placed in a row to win
   * @return number of tokens placed in a row for the game to result in a win
   */
  public int getNumToWin(); //primary

  /**
   * Function that checks if the cell chosen is free and returns true if the column can accept another token; false otherwise
   * @pre c >= 0 and c <= 6
   * @param c is the column to be checked
   * @return true if col can accept another token and false if full
   * @post true if col = c has any tokens, else false
   */
  default public boolean checkIfFree(int c) {
      for(int i = 0; i < getNumColumns(); i++) {
        if(this.whatsAtPos(new BoardPosition(i, c)) == ' ') {
          return true;
        }else {
          return false;
        }
      }
      return false;
  }

  /**
   * Drops the token p in column c
   * @pre c >= 0 and c <= 6 and p is a valid token and checkIfFree(int c) = true
   * @param p is the token to be placed on the game board
   * @param c is the column in which the token will be placed
   * @post the lowest empty slot in column c = char p
   */
  public void dropToken(char p, int c); //primary

  /**
   * Check to see if the token placed in column c resulted in the player winning the game
   * @pre c >= 0 and c <= 6
   * @post only checks if last token placed resulted in a win
   * @param c is where the last token was placed
   * @post game ends in a win if 5 tokens are placed in a row vertically, horizontally, or diagonally
   * @return true if game has been won, false if not
   */
  default public boolean checkForWin(int c){
        /*this function will check to see if the last token placed in column c resulted in the player winning the game.
        If so it will return true, otherwise false. Note: this is not checking the entire board for a win, it is just
        checking if the last token placed results in a win. You may call other methods to complete this method */
  }

  /**
   * Checks to see if the game has resulted in a tie
   * @return true if game is tied and false if otherwise
   * @post game ties if all conditions are false and all slots are full
   *        self = #self
   */
  default public boolean checkTie(){

    for(int col = 0; col < getNumColumns(); col++){
      BoardPosition pos = new BoardPosition(getNumRows() - 1, i);
      if(whatsAtPos(pos) == ' '){
        return false;
      }
    }
    return true;
  }

  /**
   * Checks to see if token placed last resulted in 5 in a row horizontally
   * @pre p should not be [' '] and
   * @post Only checks last token placed
   * @param pos is the position in which the last token was placed
   * @param p is the player who is placing the token
   * @return true if horizontal win, false if not
   * @post if 5 tokens are placed consecutively in the same row, return true, else false
   *        self = #self
   */
  default public boolean checkHorizWin(BoardPosition pos, char p){

    int count = 0;

    w
  }

  /**
   * @pre checkForWin was called
   * @pre pos is a valid BoardPosition and [p is a valid token]
   * @param BoardPosition obj is the last placed token position
   * @param p is the token for either player
   * @return true if 5 tokens are matched vertially, else false
   * @post  if 5 tokens are placed consecutively in the same column, return true, else false
   *        self = #self
   */
  default public boolean checkVertWin(BoardPosition pos, char p)
  {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        vertically. Returns true if it does, otherwise false*/
  }

  /**
   * @pre p is not [' ']
   * @param pos is a valid BoardPosition and [p is a valid token]
   * @param p is the token for either player
   * @return true if 5 tokens are matched vertially, else false
   * @post if 5 tokens are placed consecutively horizontaly, return true, else false
   *        self = #self
   */
  default public boolean checkDiagWin(BoardPosition pos, char p)
  {
        /*checks to see if the last token placed (which was placed in position pos by player p) resulted in 5 in a row
        diagonally. Returns true if it does, otherwise false Note: there are two diagonals to check*/
  }

  /**
   * @param pos is a BoardPosition object that gives the coordinates of a cell
   * @post self = #self
   * @return the char at the position or [" "] if the location is empty
   */
  public char whatsAtPos(BoardPosition pos); //primary

  /**
   * @pre player == 'X' or player == 'O'
   * @param pos is a position in grid
   * @param player is either player 'X' or 'O'
   * @post self= #self
   * @return true if the player char is the token at position
   *          false if the position is empty or a different char than player
   */
  default public boolean isPlayerAtPos(BoardPosition pos, char player){

    if(whatsAtPos(pos) == player){
      return true;
    }
    return false;
  }

  @Override
  /**
   * @post returns the string with the current grid
   *       and rows = #rows and columns = #columns
   */
  public String toString(){

  }
}

