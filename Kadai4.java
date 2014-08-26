package edu;

public class Kadai4 {
	  public static void main(String[] args) { 
	    int origin[][] = new int[][] {{ 1, 2, 3 }, { 4, 5, 6 }}; 
	    printArray("変換前", origin);
	    
	    int toSize1[] = new int[] {3, 2};
	    int toArray1[][] = convert(origin, toSize1);
	    printArray("3行2列に変換", origin);
	    // 期待結果 
	    // 1 4
	    // 2 5
	    // 3 6
	    
	    int toSize2[] = new int[] {6, 1};
	    int toArray2[][] = convert(origin, toSize2);
	    printArray("6行1列に変換", origin);
	    // 期待結果
	    // 1
	    // 2
	    // 3
	    // 4
	    // 5
	    // 6
	  }

	  private static int[][] convert(int origin [][], int toSize []) {


	  }
	  private static void printArray(String title, int arr [][]) {
	    System.out.println(title);
	    for (int i = 0; i < arr.length; i++) {
	      for (int j = 0; j < arr[i].length; j++) {
	        System.out.print(arr[i][j] + " ");
	    }
	    System.out.println();
	  }  
	}
}