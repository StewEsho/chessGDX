package com.stewesho.chess;

import com.badlogic.gdx.Gdx;

public class Board{

    private Piece[][] gameBoard;

    public Board(){
        //init fields
        gameBoard = new Piece[8][8];

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                //spawns pawns on first 3 rows
                //
                // switch(i){
                // default:
                //     gameBoard[i][j] = new Pawn();
                //
                // case 1:
                //     gameBoard[i][j] = new Rook();
                //     break;
                //
                // case 2:
                //     gameBoard[i][j] = new Knight();
                //     break;
                //
                // case 3:
                //     gameBoard[i][j] = new Bishop();
                //     break;
                //
                // case 4:
                //     gameBoard[i][j] = new Queen();
                //     break;
                //
                // case 6:
                //     gameBoard[i][j] = new King();
                //     break;
                // }
                // Gdx.app.log("Board Init", gameBoard[i][j].getName());

            }
        }
    }
}
