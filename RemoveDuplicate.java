package week1.day2.weeklyassignment;

import java.util.Arrays;

public class RemoveDuplicate {

	
	public static void main(String[] args) {

		int[] arr= {4,6,4,2,9,2,8,10,10,11};
		
		Arrays.sort(arr);
		
			for (int i = 0; i < arr.length - 1; i++) 

				{
				if (arr[i] != arr[i + 1])
		
					{
					int arr1[]= new int[arr.length];
					arr1[i] = arr[i];
					System.out.println(arr1[i]);
					
					}
	
				}if (arr[arr.length-1] != arr[arr.length -2])
				{System.out.println(arr[arr.length-1]);} 
		
											}
								}        

