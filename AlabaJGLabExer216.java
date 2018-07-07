import java.lang.Math;
import java.util.*;
import java.io.*;

public class AlabaJGLabExer216{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		if (args.length != 2){
			System.out.println("Usage: java AlabaJGLabExer216 length width");
			System.exit(1);
		}
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);

		int[][] matrix = new int[length][width];
		
		// get the input from the user
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++){
				matrix[i][j] = sc.nextInt();
			}
		}

		// write the inverted row matrix
		for (int i = 0; i < length; i++) {
			for (int j = width - 1; j >= 0; j--) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}