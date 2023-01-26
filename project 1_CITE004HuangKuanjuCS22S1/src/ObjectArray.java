import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;

public class ObjectArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements you want in array:");
		int arraySize = sc.nextInt();
		
		String[] arr = new String[arraySize + 1];
		
		System.out.println("Enter: " + arraySize + " elements:" );
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		System.out.println("Ascending Order: ");
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ", ");
		}
		
		System.out.println("Descending Order: ");
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ", ");
		}
		
		
	}
}
