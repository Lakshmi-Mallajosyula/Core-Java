package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		int a1[]= {12,34,56,78};
		int a2[]= {43,56,23,65};
		
		System.out.println("Original numeric array : "+Arrays.toString(a1)); //Display the array
		System.out.println("The length of the array is :" +Array.getLength(a1)); //Get the length of the array
		
		Arrays.sort(a1); //sort and display the array
		System.out.println("Sorted numeric array : "+Arrays.toString(a1)); 
		
		System.out.println("The second array :" + Arrays.toString(a2)); //Display the second array

		//Fill the second array with 10
		Arrays.fill(a2, 10);
		System.out.println("The updated second array :" + Arrays.toString(a2));
		
		//Replace values in a1 with a2 values
		System.arraycopy(a2, 0, a1, 0, a1.length);
		System.out.println("Array Copy of a2 into a1" +Arrays.toString(a1));
		
		//new array created with values copied from a1
		int a3[] = Arrays.copyOf(a1, 3);
		System.out.println("The newly copied array a3 with increased/decreased length: "+Arrays.toString(a3));
		
		//Print the array values
		System.out.print("The values in the array are : ");
		for(int i : a1) {
			System.out.print(i + "-");
		}
	}
}
