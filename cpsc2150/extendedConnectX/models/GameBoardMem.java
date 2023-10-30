package cpsc2150.extendedConnectX.models;

import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.ArrayList;

public class GameBoardMem extends AbsGameBoard {
    Map<Character, List<BoardPosition>> mapBoard = new HashMap<Character, List<BoardPosition>>();
    int numRows, numCols, numToWin;

    public GameBoardMem(int row, int col, int win) {
        numRows = row;
        numCols = col;
        numToWin = win;
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numCols;
    }

    public int getNumToWin() {
        return numToWin;
    }

    public void placeToken(char p, int c) {
        if(mapBoard.containsKey(p) == false) {
            mapBoard.put(p, new ArrayList<>());
        }else {
            for(int i = 0; i < getNumRows(); i++) {
                BoardPosition board = new BoardPosition(i, c);
                if(whatsAtPos(board) == ' ') {
                    mapBoard.get(p).add(board);
                    break;
                }
            }
        }
    }

    public char whatsAtPos(BoardPosition pos) {
        for(HashMap.Entry<Character, List<BoardPosition>> map : mapBoard.entrySet()) {
            if(isPlayerAtPos(pos, map.getKey())) {
                return map.getKey();
            }
        }
        return ' ';
    }

    @Override
    public boolean isPlayerAtPos(BoardPosition pos, char p) {
        if(mapBoard.containsKey(p)) {
            return false;
        }else {
            for(BoardPosition boardpos : mapBoard.get(p)) {
                if(boardpos.equals(pos)) {
                    return true;
                }
            }
        }
        return false;
    }
}