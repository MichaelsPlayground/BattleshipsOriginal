package edu.utep.cs.cs4330.battleship;

/**
 * Created by xeroj on 021 3 21 2017.
 */

public class Player {
    public Board board;
    public boolean isAllowedMultipleShots;

    public Player(Board board, boolean isAllowedMultipleShots){
        this.board = board;
        this.isAllowedMultipleShots = isAllowedMultipleShots;
    }

    public Vector2 onOwnTurn(){
        return null;
    }
}
