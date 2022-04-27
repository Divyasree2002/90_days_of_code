import java.util.Scanner;

public class _02_UserInput_ReverseArray {

  static void reverseArray(int arr[],int start,int end){
    int temp;
    if(start>=end)
      return;
    temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    reverseArray(arr,start+1,end-1);
  }

  static void printArray(int arr[]){ 
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of elements");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.print("Reversed Array is : ");
    reverseArray(arr,0,n-1);
    printArray(arr);
    sc.close();
  }
}	

//GFG - By testCases checking --All Test cases passed

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class GFG {
//     static void reverseArray(int arr[],int start,int end){
//         int temp;
//         while(start<end){
//         temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//         start++;
//         end--;
//         //reverseArray(arr,start+1,end-1);
//     }
// }
//     static void printArray(int arr[]){
//         for(int i=0;i<arr.length ; i++)
//             System.out.print(arr[i] + " ");
//     }
    
// 	public static void main (String[] args) {
// 		//code
// 		Scanner sc = new Scanner(System.in);
// 		int t = sc.nextInt();
// 		while(t>0){
// 		    int n = sc.nextInt();
// 		    int arr[] = new int[n];
// 		    for(int k = 0;k < arr.length;k++){
// 		        arr[k] = sc.nextInt();
// 		    }
		   
// 		reverseArray(arr,0,n-1);
		
// 		printArray(arr);
// 		System.out.println();
// 		t--;   
// 		}
// 	}
// }