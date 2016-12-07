package com.stewesho.chess;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public abstract class Piece{
	protected Texture texture;
	protected Sprite icon;
	protected boolean isWhite; //white = true, black = false
	protected String name; //"pawn", "king", etc.
	protected String color; //"white" or "black"
	protected Vector2 coords; //(0,0) --> (7,7)

	public Piece(String name, String color){
		this.name = name;
		this.color = color;

		String texturePath = "pieces/" + color + "/" + name + ".png";
		this.texture = new Texture(texturePath);
		this.icon = new Sprite(this.texture);
	}

	public String getName(){
		return this.name;
	}

	public Texture getTexture(){
		return this.texture;
	}

	public Sprite getSprite(){
		return this.icon;
	}
}
