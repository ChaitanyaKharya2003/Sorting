import java.util.Arrays;
import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);            	
		System.out.println("Enter size of array:");
		int size = scan.nextInt();   
		
		
		System.out.println("Enter array:");
		int[] arr = new int[size];
		for(int i=0; i < arr.length; i++){  
			arr[i] = scan.nextInt();  
		}
		Arrays.sort(arr);
        System.out.println("Array after bubble sort");  
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}
	}
}
