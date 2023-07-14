package maxmiumMinmum;

import java.util.Scanner;

public class Maxarray {
	public static int Maxarr(int arr[]) {
		int size=arr.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}	
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return max+min;
		
	
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int Max = Maxarr(arr);
		System.out.println(Max);

	}

}
