import acm.graphics.GImage;

import acm.program.*;

public class imageProcessor extends GraphicsProgram {
	public void run() {
		GImage image = new GImage("C:\\MeritAmerica\\Java\\Section_Assignment6\\download.jpg");
		add(image);
		GImage newImage = flipHorizontal(image);
		add(newImage);
	}

	public GImage flipHorizontal(GImage i) {
		int[][] array = i.getPixelArray();
		int width = array[0].length;
		int height = array.length;
		for (int x = 0; x < height; x++) {
			for (int p1 = 0; p1 < width / 2; p1++) {
				int p2 = width - p1 - 1;
				int temp = array[x][p1];
				array[x][p1] = array[x][p2];
				array[x][p2] = temp;
			}
		}
		return new GImage(array);
	}
}
