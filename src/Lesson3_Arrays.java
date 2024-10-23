/*Notes ----------------------------------
Arrays are a group of variables such as the one we saw in strings their length is immutable (can not be changed).
There are multiple ways to declare them:
    - Static = this defines everything, size and elements
    - Dynamic = this sets the defining for later meaning the user can input the size and the elements
                when they are asked to without changing the code


 */

import java.util.Scanner;

public class Lesson3_Arrays {
    public static void main(String[] args) {


        int [] arr = {12,10,123,13,65,45,17,1,100,32,5,111};//this is a static declaration meaning everything is defined
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max -> "+max);

        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min -> "+min);

        String [] cars = {"Audi", "BMW", "Mercedes", "Porsche"};
        System.out.println("pRINTING cARS");
        for (int i = 0 ; i< cars.length;i++){
            System.out.println(cars[i]);
        }

        int [] arr1 = new int [5];  // this is dynamic declaration meaning we have defined a size but the array
                                    // is empty so we can add more later
        Scanner input = new Scanner(System.in);
        System.out.println("Inputting values for arr1");
        for(int i = 0;i< arr1.length;i++){
            System.out.println("Enter value for index "+i);
            arr1[i]= input.nextInt();
        }
        System.out.println("Displaying Values of arr1");
        for(int i = 0 ; i< arr1.length;i++){
            System.out.println("Index: "+i+" Element: "+arr1[i]);
        }

    }
}
