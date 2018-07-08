import java.lang.Math;
import java.util.*;
import java.io.*;

public class AlabaJGLabExer219{
	
	public static void main(String[] args) {
		if (args.length < 3)
		{
			System.out.println("Usage: java AlabaJGLabExer219 length width inputfile (command line arguments)");
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

		// print the modified image
		int ctr = 0;
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				System.out.print((ctr % 128 == 0 ? "\n" : ""));
				switch(image[i][j] / 8) {
					case 0:
						System.out.print("a");
						break;
					case 1:
						System.out.print(".");
						break;
					case 2:
						System.out.print(",");
						break;
					case 3:
						System.out.print("-");
						break;
					case 4:
						System.out.print("+");
						break;
					case 5:
						System.out.print("o");
						break;
					case 6:
						System.out.print("O");
						break;
					default:
						System.out.print("X");
						break;
				}
				ctr++;
			}
		}
		System.out.println();

		// close file stream
		try{
			fn.close();
		}
		catch(IOException e){
			System.exit(1);
		}
	}
}