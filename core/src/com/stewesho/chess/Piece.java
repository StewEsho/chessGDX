package com.stewesho.chess;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class Piece{
	protected Texture icon;
	protected boolean isWhite; //white = true, black = false
	protected String name; //"pawn", "king", etc.
	protected Vector2 coords; //(0,0) --> (7,7)

	public Piece(String name, String texturePath){
		this.name = name;
		this.icon = new Texture(texturePath);
	}

	public String getName(){
		return name;
	}
}
