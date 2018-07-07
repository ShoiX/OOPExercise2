import java.lang.Math;
public class AlabaJGLabExer215{
	public static void main(String[] args) {
		int[][] data = 
			{ {3, 2, 5},
			{1, 4, 4, 8, 13},
			{9, 1, 0, 2},
			{0, 2, 6, 3, -1, -8}};

		for (int i = 0; i < data.length; i++) {
			int big = 0;
			for (int j = 0; j < data[i].length; j++) {
				big = Math.max(big, data[i][j]);
			}
			System.out.println("Row "+ i+": "+ big);
		}
		
	}
}