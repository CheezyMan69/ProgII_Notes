/*Notes ---------------------------------------
Sorting
    As we saw in Data Structures and Algorithms, there are many types of sorting.
    - Selection Sort
        [Explain fucker]



 */

import java.util.Scanner;

public class Lesson4_Sorting {
    public static void main(String[] args) {

        //Selection Sort --------------------------------------
        int[] arr = {64,34,87,14,10,98,17,11,22,90,5};

        for (int i = 0; i<arr.length;i++){
            int minIndex = i;

            for (int j = (i+1);j<arr.length;j++){

                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array: ");
        System.out.print("[ ");

        for (int i = 0; i< arr.length;i++){

            System.out.print(arr[i]+ ", ");
        }
        System.out.print("]");
    }
}
