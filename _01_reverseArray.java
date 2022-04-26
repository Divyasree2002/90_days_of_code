public class _01_reverseArray {
  
  static void reverse(int a[], int n)
  {
      int[] arr = new int[n];
      int j = n;
      for (int i = 0; i < n; i++) {
          arr[j - 1] = a[i];
          j = j - 1;
      }

      //Reversing the array
      System.out.println("Reversed_Array is: \n");
      for (int i = 0; i < n; i++) {
          System.out.println(arr[i]);
      }
  }

  public static void main(String[] args)
  {
      int [] arr = {10, 20, 30, 40, 50};
      reverse(arr, arr.length);
  }
}