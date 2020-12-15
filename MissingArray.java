package week1.day2.weeklyassignment;

import java.util.Arrays;

public class MissingArray {

	public static void main(String[] args) {
int arr[] = {1,2,3,4,7,6,8,10};
int j=1; 
Arrays.sort(arr);

for (int i = 0; i < arr.length; i++) {
	
if (arr[i] != j)
{System.out.println("missing number : " + j);
  --i;
	
	}j++;
}
	}
}
