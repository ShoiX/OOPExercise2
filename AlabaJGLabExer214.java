import java.lang.Math;
public class AlabaJGLabExer214{
	public static void main(String[] args) {
		int[][] data = 
			{ {3, 2, 5},
			{1, 4, 4, 8, 13},
			{9, 1, 0, 2},
			{0, 2, 6, 3, -1, -8}};

		int big = 0, small = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				big = Math.max(data[i][j], big);
				small = Math.min(data[i][j], small);
			}
		}
		System.out.println("Big: "+big);
		System.out.println("Small: "+ small);
	}
}