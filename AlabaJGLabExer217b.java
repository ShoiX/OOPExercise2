import java.lang.Math;
import java.util.*;
import java.io.*;

public class AlabaJGLabExer217b{
	public static int[] frame;
	
	// returns an array of sorrounding elements(9 or less) plus the current element
	public static void getElements(int[][] image, int row, int col){

		int size = 9;
		if (row % (image.length - 1) == 0 || col % (image[0].length - 1) == 0){
			
			size = 6;

			// corner
			if (row % (image.length - 1) == 0 && col % (image[0].length - 1) == 0)
				size = 4;
		}

		frame = new int[size];
		int ctr = 0;
		for (int i = row - 1; i < row + 2; i++){
			if (i < 0 || i > image.length -1)
				continue;
			for (int j = col - 1; j < col + 2; j++){
				if (j < 0 || j > image[0].length - 1)
					continue;
				
				frame[ctr] = image[i][j];
				ctr++;
			}
		}
		return;
	}

	public static void main(String[] args) {
		if (args.length < 3)
		{
			System.out.println("Usage: java AlabaJGLabExer218b length width inputfile (command line arguments)");
			System.exit(1);
		}

		FileInputStream fn = null;
		try{
			// openn file input stream
			fn = new FileInputStream(args[2]);
			System.setIn(fn);	
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			System.exit(1);
		}
		
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int[][] image = new int[length][width];

		// get values from input file
		for (int i = 0; i < length; i++){
			for (int j = 0; j < width; j++){
				image[i][j] = sc.nextInt();
			}
		}

		// assume a rectangular image
		int[][] smooth = new int[ image.length ][ image[0].length ];
		for (int i = 0, j = image.length; i < j; i++) {
			for (int k = 0, l = image[0].length; k < l; k++) {

				// get surrounding elements
				getElements(image, i, k);
				
				// get average
				int sum = 0;
				for (int m = 0; m < frame.length; m++){
					sum+= frame[m];
				}
				smooth[i][k] = sum / frame.length;
			}
		}

		// write input
		for (int i = 0; i < image.length; i++){
			for (int j = 0; j  < image[0].length; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println('\n');
		// write output
		for (int i = 0; i < smooth.length; i++){
			for (int j = 0; j  < smooth[0].length; j++) {
				System.out.print(smooth[i][j]+ " ");
			}
			System.out.println();
		}
		try{
			fn.close();
		}
		catch(IOException e){
			System.exit(1);
		}
	}
}