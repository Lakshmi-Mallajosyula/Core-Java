package array;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
				
			int Arr1[] = {10,10,10,10,10}, sum=0;
			System.out.println("The values in the array are: " + Arrays.toString(Arr1));
			
			for(int i : Arr1)
			{
				System.out.println(i);
				sum += i;
			}
		System.out.println("The sum of the values in the array: "+ sum);
	}
}
