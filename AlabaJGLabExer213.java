import java.lang.Math;
import java.util.*;
import java.io.*;

public class AlabaJGLabExer213{
	public static void main(String[] args) {
		int[][] data = { 
			{3, 2, 5},
			{1, 4, 4, 8, 13},
			{9, 1, 0, 2},
			{0, 2, 6, 3, -1, -8} };

			for (int i = 0; true; i++) {
				
				// check if there exist a column
				boolean flag = false;
				int sum = 0;

				// sum all elements in the column
				for (int j = 0; j < data.length; j++) {

					// not out of bounds yet
					if (i < data[j].length) {
						sum += data[j][i];
						flag = true;
					}
				}
				if(!flag)
					break;
				System.out.println("column "+(i+1)+": "+sum);
			}
		
	}
}