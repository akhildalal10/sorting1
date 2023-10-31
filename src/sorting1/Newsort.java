package sorting1;
class Newsort {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Custom input array
        int arr[] = { 4, 3, 2, 1 };
 
        // Outer loop
        for (int i = 0; i < arr.length; i++) {
 
            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < arr.length; j++) {
 
                // Checking elements
                int temp = 0;
                if (arr[j] < arr[i]) {
 
                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
 
            // Printing sorted array elements
            System.out.print(arr[i] + " ");
        }
    }
}


// public class InsertionSort {

//     public static void insertionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 1; i < n; ++i) {
//             int key = arr[i];
//             int j = i - 1;

//             // Move elements of arr[0..i-1] that are greater than key
//             // to one position ahead of their current position
//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//             }
//             arr[j + 1] = key;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {12, 11, 13, 5, 6};
//         System.out.println("Original array: ");
//         for (int value : arr) System.out.print(value + " ");
//         System.out.println();

//         insertionSort(arr);
//         System.out.println("Sorted array: ");
//         for (int value : arr) System.out.print(value + " ");
//     }
// }


