//Approach 1 - by functions
public class _01_reverseArray{
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverseArray(int arr[],int start,int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp ;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printArray(arr);
        reverseArray(arr,0,arr.length-1);
        System.out.println("reversed array is : ");
        printArray(arr);
    }
}

//Approach 2 - General approach

// System.out.println("Reversing array:");
// int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8};
// for(int i = arr2.length - 1; i >= 0; i--){
//     System.out.print(arr2[i]+ " ");
// }


//Approach 3 - recursion
// recursing the ReverseArray function and remaining is similar to approach 1 

// static void reverseArray(int arr[],int start,int end){
//     int temp;
//     if(start>=end){
//         return;
//     }
//     temp = arr[start];
//     arr[start]=arr[end];
//     arr[end] = temp ;
//     reverseArray(arr,start++,end--);
// }