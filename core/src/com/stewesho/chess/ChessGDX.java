package com.stewesho.chess;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class ChessGDX extends ApplicationAdapter {
	SpriteBatch batch;
	private OrthographicCamera camera;
	private Board board;

	@Override
	public void create () {
		batch = new SpriteBatch();
		board = new Board();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor((float) 0.1, (float) 0.5, (float) 0.75, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		board.draw(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
