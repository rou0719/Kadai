package edu;

public class Kadai3_2 {
	public static void main(String[] args) { 
		
		//配列　arr　を定義する
		
		int arr[][] = new int[][] {{ 1, 2, 3}, { 4, 5, 6 }}; 
		
		System.out.println("変更前：");

		
		//（printArrayメソッドを使って）配列　arr　を表示する
		
		printArray(arr);
		
		System.out.println((arr[0].length) + " " + arr.length + 
						"  (" + arr[0].length + "行、" + arr.length + "列で出力するの意味)");
	
		//配列　arr2 を定義する
		
		int arr2[][] = new int[arr.length + 1][arr.length];
		
		for (int i = 0; i < arr.length + 1; i++){
			
			for (int j = 0; j < arr.length; j++) {
				
				arr2[i][j] = arr[j][i];
			}
		}
				System.out.println("変更後：");
				
		//（printArrayメソッドを使って）配列　arr2　を表示する
				
			printArray(arr2);
			
		}
		//printArrayメソッドの作成
		private static void printArray(int arr [][]) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();


			}
		}
	}