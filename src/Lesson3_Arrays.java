/*Notes ----------------------------------
Arrays are a group of variables such as the one we saw in strings their length is immutable (can not be changed).
There are multiple ways to declare them:
    - Static = this defines everything, size and elements
    - Dynamic = this sets the defining for later meaning the user can input the size and the elements
                when they are asked to without changing the code

Arrays can get really massive so they tend to take up a bit of memory space

 */

//Examples ------------------------------
import java.util.Scanner;

public class Lesson3_Arrays {
    public static void main(String[] args) {

        /*Arrays ----------------------------------
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
        */

        /*ARRAY ANALYSIS ------Do not upload this please---------------
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the array analyzer\nPlease Enter a Size: ");
        int size = input.nextInt();
        System.out.println("Step 1 complete\n2. Inputting Elements");
        double[] arr = new double[size];
        for(int i = 0 ; i<arr.length;i++){
            System.out.println("Enter value for index "+i);
            arr[i]= input.nextDouble();
        }
        System.out.println("Step 2 Complete\nANALYSIS START");

        double max = arr[0];
        double min = arr[0];
        System.out.println("---MAX MIN ANALYSIS---");
        for(int i = 0;i< arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max Element -> "+max);
        System.out.println("Min Element -> "+min);

        System.out.println("---ODD EVEN ANALYSIS---");
        for (int i = 0;i< arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Element "+arr[i]+" with Index "+i+" Is EVEN");
            }else{
                System.out.println("Element "+arr[i]+" with Index "+i+" Is ODD");
            }
        }

        System.out.println("---SUM PRODUCT ANALYSIS---");
        double sum = 0;
        double prod = 1;
        for (int i = 0;i< arr.length;i++){
            sum+= arr[i];
            prod*= arr[i];
        }
        System.out.println("Sum -> "+sum);
        System.out.println("Product -> "+prod);

        System.out.println("ANALYSIS COMPLETE");
        */
    }
}
