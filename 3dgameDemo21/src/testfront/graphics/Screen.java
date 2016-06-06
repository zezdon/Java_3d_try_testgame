package testfront.graphics;

import java.util.Random;

import testfront.Game;

public class Screen extends Render {

	private Render test;
	private Render3d render;
	
	public Screen(int width, int height) {
		super(width, height);
		Random random = new Random();
		render = new Render3d(width, height);
		test = new Render(256, 256);
		for(int i = 0; i < 256 * 256; i++) {
			test.pixels[i] = random.nextInt() * (random.nextInt(5) / 4);
		}
	}
	
	public void render(Game game){
		//erase screen every time when something prints out
		for (int i=0; i < width * height; i++) {
			pixels[i] = 0;
		}
		//draw the points
		
		render.floor(game);
		/*render.renderWall(0, 0.5, 1.5,1.5, 0);
		render.renderWall(0, 0, 1, 1.5, 0);
		render.renderWall(0, 0.5, 1, 1, 0);
		render.renderWall(0.5, 0.5, 1, 1.5, 0);*/
		render.renderDistanceLimiter();
		
		draw(render, 0, 0);
	}
}