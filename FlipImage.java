import acm.graphics.*;
import acm.program.*;
import java.util.*;

public class FlipImage extends GraphicsProgram {
	private GImage image;
	private Scanner input;
	private String fileName;
	
	public void run() {
		
	input = new Scanner(System.in);
	System.out.print("Enter image file name to flip: ");
	fileName = input.nextLine();
	image = new GImage(fileName);
	
	add(flipImage(image));	
	}
	
	private static GImage flipImage(GImage image) {
	
		int[][] pixelArray = image.getPixelArray();
		int width = pixelArray[0].length;
		
		for (int i = 0; i < pixelArray.length; i++) {
			for (int j = width-1; j >= width/2; j--) {
				int temp = pixelArray[i][(width - j) - 1];
				pixelArray[i][(width-j)-1] = pixelArray[i][j];
				pixelArray[i][j] = temp;
			}	
		}
		
		return new GImage(pixelArray);	
	}
}




//test if image works
		//add(image);





















