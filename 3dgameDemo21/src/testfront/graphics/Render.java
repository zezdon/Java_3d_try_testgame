package testfront.graphics;

public class Render {

	public final int width;
	public final int height;
	public final int[] pixels;
		
	public Render(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		
	}
	// draw point in method draw
	public void draw(Render render, int xOffset, int yOffset){
		for (int y = 0; y < render.height; y++) {
			int yPix = y + yOffset;
			if (yPix < 0 || yPix >= height) {
				continue;
			}
			
			for (int x = 0; x < render.width; x++) {
				int xPix = x + xOffset;
				if (xPix < 0 || xPix >= width) {
					continue;
				}
				
				int alpha = render.pixels[x + y * render.width];
				//if alpha is greater than 0 render something avoid pixel which hasn't data
				if (alpha > 0) {
					pixels[xPix + yPix * width] = alpha;
				}
				
			}
		}
	}		
}
