package basicJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class SortingTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arrayLenght = sc.nextInt();		
		int input,i;
		int arrayToBeSorted[] = new int[100];
		int remainder=0,temp;
		ArrayList<Integer> sortedArray = new ArrayList<Integer>(); 
		for(i=0;i<arrayLenght;i++)
		{
			input = sc.nextInt();
			arrayToBeSorted[i]=input;
		}
		System.out.println("The Array is :");
		for(i=0;i<arrayLenght;i++)
		{
			System.out.println(arrayToBeSorted[i]);			
		}
		System.out.println("the new array will be:");
		for(i=0;i<arrayLenght;i++)
		{
			if(arrayToBeSorted[i]>10)
			{
				temp = arrayToBeSorted[i];
				remainder = temp%10;
				temp = temp/10;					
				sortedArray.add(remainder);
				sortedArray.add(temp);
			}
			else
			{
				sortedArray.add(arrayToBeSorted[i]);
			}
		}
		
		Collections.sort(sortedArray, Collections.reverseOrder());
		System.out.println("List after the use of" +
				" sort :\n" + sortedArray);

	}

}
