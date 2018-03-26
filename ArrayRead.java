package array;
import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;

class Mtds
{
	void Array()
	{	
		Scanner s=new Scanner(System.in);
		int Count;

		System.out.print("Enter the total number count: ");
		Count=s.nextInt();

		int a[]=new int[Count];
		System.out.print("Enter the number for the array: ");

		try {
			for(int i=0;i<Count;i++) //Takes input for the array
			{
				a[i]=s.nextInt();

			}
			for(int i: a) //Displays the array
			{ 
				System.out.print(i + " - "); //for printing array
			}
		}
		catch(InputMismatchException ex) //Handles when input other than number is given
		{
			System.out.println("Please input integer values only");
		}
		s.close();
	}
}

class ArrayRead
{
	public static void main(String[] args) throws IOException
	{  
		Mtds M=new Mtds();	
		M.Array();
		System.out.println("********Done********");
	}
}
