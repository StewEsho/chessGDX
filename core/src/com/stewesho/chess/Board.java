package com.stewesho.chess;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Board{

    private Piece[][] gameBoard;

    public Board(){
        //init fields
        gameBoard = new Piece[8][8];

        for (int r = 0; r < 8; r++){ //rows
            for (int c = 0; c < 8; c++){ //columns
                //spawns pawns on first 3 rows
                setupPiece(r, c);

                try{
                    Gdx.app.log("Board Init", gameBoard[r][c].getName());
                } catch (NullPointerException e){
                    Gdx.app.log("Warning", "No piece initialized at " + r + ", " + c);
                }
            }
        }
    }

    public void draw(SpriteBatch _batch){
        for (int r = 0; r < 8; r++){
            for (int c = 0; c < 8; c++){
                if(gameBoard[r][c] != null) //checks that the array element exists
                    _batch.draw(gameBoard[r][c].getSprite(), 20 + (85 * c), 20 + (85 * r), 64, 64);
            }
        }
    }

    private void setupPiece(int row, int col){
        /**
         * White Pieces (bottom)
         */
        if (row == 1){
            this.gameBoard[row][col] = new Pawn("white");
        } else if (row == 0){
            switch(col){
                case 0:
                case 7: //rooks
                    this.gameBoard[row][col] = new Rook("white");
                    break;

                case 1:
                case 6: //knights
                    this.gameBoard[row][col] = new Knight("white");
                    break;

                case 2:
                case 5: //bishops
                    this.gameBoard[row][col] = new Bishop("white");
                    break;

                case 3: //Queen
                    this.gameBoard[row][col] = new Queen("white");
                    break;

                case 4: //king
                    this.gameBoard[row][col] = new King("white");
                    break;
            }
        }
        /**
         * Black Pieces
         */
        else if (row == 6){
            this.gameBoard[row][col] = new Pawn("black");
        } else if (row == 7){
            switch(col){
                case 0:
                case 7: //rooks
                    this.gameBoard[row][col] = new Rook("black");
                    break;

                case 1:
                case 6: //knights
                    this.gameBoard[row][col] = new Knight("black");
                    break;

                case 2:
                case 5: //bishops
                    this.gameBoard[row][col] = new Bishop("black");
                    break;

                case 3: //Queen
                    this.gameBoard[row][col] = new Queen("black");
                    break;

                case 4: //king
                    this.gameBoard[row][col] = new King("black");
                    break;
            }
        } else {
            this.gameBoard[row][col] = null;
        }
    }
}
