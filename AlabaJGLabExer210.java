import java.lang.Math;
import java.util.*;
import java.io.*;

public class AlabaJGLabExer210{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// get size of the array
		int size = sc.nextInt();
		double[] ph = new double[size];
		double sum = 0;
		
		for (int i = 0; i < size; i++) {
			ph[i] = sc.nextDouble();
			sum += ph[i];
			System.out.println("data[ "+i+" ]"+" = "+ph[i]);
		}

		double ave = sum / size;
		System.out.println("average: "+ ave);
		// obtain the farthest from the average
		double farthest = 0;
		int index = 0; 
		for (int i = 0; i < size; i++) {
			double dist = Math.abs(ph[i] - ave);
			if (dist > farthest)
			{
				farthest = dist;
				index = i;
			}
		}

		System.out.println("most distant value: "+ ph[index]);
		// get the new average
		sum -= ph[index];
		ave = sum / (size);
		ph[index] = -1;
		System.out.println("new average: "+ ave);
	}
}