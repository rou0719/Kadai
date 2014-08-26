package edu;

public class Kadai3 {
	public static void main(String args[]){
		int arr[][] = new int[][] {{ 1, 2, 3}, { 4, 5, 6 }}; 
				
		printArray("変換前:", arr);	

		printArray1("3行2列に変換:", arr);	

		printArray2("6行1列に変換:", arr);	
	
	}

	public static void printArray(String title, int arr[][]){
	    System.out.println(title);
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}					
	}
	
	public static void printArray1(String title, int arr[][]){
	    System.out.println(title);
		for (int i = 0; i < arr.length + 1; i++){
			for (int j = 0; j < arr.length; j++){
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}					
	}
	public static void printArray2(String title, int arr[][]){
	    System.out.println(title);
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j] + " ");

			}
		}					
	}
}