package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class IMYDodgeballGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Stage stage;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		stage = new Stage(new ScreenViewport());

		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();

		stage.act();
		stage.draw();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();

		stage.dispose();
	}
}
