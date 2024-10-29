/*Notes ----------------------------------
Arrays are a group of variables such as the one we saw in strings their length is immutable (can not be changed).
There are multiple ways to declare them:
    - Static = this defines everything, size and elements
    - Dynamic = this sets the defining for later meaning the user can input the size and the elements
                when they are asked to without changing the code

Arrays can get really massive so they tend to take up a bit of memory space.
Arrays can be multidimensional.
Arrays can hold multiple elements of one type.

 */

//Examples ------------------------------
import java.util.Scanner;

public class Lesson3_Arrays {
    public static void main(String[] args) {

        /*Arrays ----------------------------------
        int [] arr = {12,10,123,13,65,45,17,1,100,32,5,111};//this is a static declaration meaning everything is defined
        int max = arr[0];           //Initializes the max to be the first element
        for(int i = 0; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max -> "+max);

        int min = arr[0];           //Initializes the min to be the first element
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

        int size = input.nextInt();     // allows the user to define the size
        System.out.println("Step 1 complete\n2. Inputting Elements");
        double[] arr = new double[size];
        for(int i = 0 ; i<arr.length;i++){
            System.out.println("Enter value for index "+i);
            arr[i]= input.nextDouble(); //allows the user to enter each element in the array
        }
        System.out.println("Step 2 Complete\nANALYSIS START");

        double max = arr[0];            //Initializes the max to be the first element
        double min = arr[0];            //Initializes the min to be the first element (if set to 0, it doesn't work [i tried])
        System.out.println("---MAX MIN ANALYSIS---");
        for(int i = 0;i< arr.length;i++){
            if(max<arr[i]){             //if the max is smaller than the element
                max = arr[i];           //max is changed and set to be tht specific element
            }
            if (min>arr[i]){            //if the min is bigger then the element
                min = arr[i];           //min is changed and set to be that specific element
            }
        }
        System.out.println("Max Element -> "+max);
        System.out.println("Min Element -> "+min);

        System.out.println("---ODD EVEN ANALYSIS---");
        for (int i = 0;i< arr.length;i++){
            if(arr[i]%2==0){            //if the element can be fully divided by 2 then it is even
                System.out.println("Element "+arr[i]+" with Index "+i+" Is EVEN");
            }else{                      //if the element cannot be fully divided by 2 then it it is odd
                System.out.println("Element "+arr[i]+" with Index "+i+" Is ODD");
            }
        }

        System.out.println("---SUM PRODUCT ANALYSIS---");
        double sum = 0;                 //Initializes the sum to be 0
        double prod = 1;                //Initializes the product to be 1 (if 0 = no work [anything times 0 is 0 dumby])
        for (int i = 0;i< arr.length;i++){
            sum+= arr[i];               //Adds the element to the sum (increments by the element)
            prod*= arr[i];              //multiplies the product by the element -> changing its value
        }
        System.out.println("Sum -> "+sum);
        System.out.println("Product -> "+prod);

        System.out.println("ANALYSIS COMPLETE");
        */

        /*Even Odd Arrays -------------------------------
        int [] arr = {10,20,33,42,56,69,73,82,99,101,110};
        int eCount = 0, oCount = 0;         //counts for each odd and even
        for(int i = 0; i< arr.length;i++){
            if(arr[i]%2==0){
                eCount++;                   //if the element is even the even count increments
            }else {
                oCount++;                   //if the element is odd the odd count increments
            }
        }
        int [] eArray = new int [eCount];   //creates an even array with the size of the even count
        int [] oArray = new int [oCount];   //creates an odd array with the size of the odd count
        int eIndex = 0, oIndex = 0;         //Initializes both indexes to 0

        for(int i = 0;i< arr.length;i++){
            if(arr[i]%2==0){
                eArray[eIndex]=arr[i];      //if the element is even then it assigns it to the even array
                                            //in the specific even index
                eIndex++;                   //Increments the even index to add the next even element correctly
            }else {
                oArray[oIndex]=arr[i];      //if the element is odd then it assigns it to the odd array
                                            //in the specific odd index
                oIndex++;                   //Increments the odd index to add the next odd element correctly
            }
        }
        System.out.println("Printing Even Nums: ");
        System.out.print("{");
        for (int i = 0;i<eArray.length;i++){
            System.out.print(eArray[i]+", ");   //prints each element of the even array in one line
        }
        System.out.print("}\n");
        System.out.println("Printing Odd Nums: ");
        System.out.print("{");
        for (int i = 0;i<oArray.length;i++){
            System.out.print(oArray[i]+", ");   //prints each element of the odd array in one line
        }
        System.out.print("}");
        */

        /*Reversing Arrays ----------------------------
        int [] arr = {10,20,33,42,56,69,73,82,99,101,110};
        int temp;                           //this variable is essential for the reverse process
        for(int i=0; i<arr.length/2;i++){   //i<arr.length/2 because it will only need to reach the middle to be
                                            //fully reversed
            temp = arr[i];                  //assigns the first value to temp
            arr[i]= arr[arr.length -1 -i];  //assigns the last value to the first value (reversing it)
            arr[arr.length -1 -i] = temp;   //assigns the temp value to the last value (reversing it)
        }
        System.out.println("Print in reverse: ");
        System.out.print("{");
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+", ");  //Prints the reversed array in one line
        }
        System.out.print("}\n");
        */

        /*Arrays and Nested loops ----------------------------
        String [] cars = {"Ferrari","Lambo","Audi","Porsche"};  //An array of strings
        for(int i = 0; i< cars.length;i++){                     //Loop to run through the array values
            if (cars[i] == "Audi"){                             //Will only run if the current value equals "Audi"
                for (int j = 0; j < cars[i].length();j++){      //Loop to run through each character of the value
                    System.out.println(cars[i].charAt(j));      //Prints 1 letter of the string then runs loop again
                }
            }
        }
        */

        // 2D Arrays -------------------------------------
        /*
        int [] [] matrix = {                            //This is how to initialize 2D array
                {1,2,3},                                //Row 0
                {4,5,6},                                //Row 1
                {7,8,9}                                 //Row 2
        };
        System.out.println("Matrix: ");
        for (int i = 0; i< matrix.length;i++){          //i is the rows of the matrix
            System.out.println("For row "+(i+1)+" the elements are: ");
            for (int j = 0; j<matrix[i].length;j++){    //this loop runs until the row is finished
                System.out.println(matrix[i][j]);       //prints the elements in the row
            }
        }
        */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows for your matrix: ");
        int row = input.nextInt();                      //Initializes rows to be a user inputted int
        System.out.println("Enter the number of columns for your matrix: ");
        int columns = input.nextInt();                  //Initializes Columns to be a user inputted int

        int [][] matrix2 = new int [row][columns];      //Initializes the matrix to be as big as the user made it to be

        for(int i = 0;i<matrix2.length;i++){            //Loop to run for each row
            for (int j = 0; j<matrix2[i].length;j++){
                System.out.println("Enter value for position "+i+", "+j);
                matrix2[i][j] = input.nextInt();        //User inputs value straight into the matrix position
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i< matrix2.length;i++){          //i is the rows of the matrix
            System.out.println("For row "+(i+1)+" the elements are: ");
            for (int j = 0; j<matrix2[i].length;j++){    //this loop runs until the row is finished
                System.out.println(matrix2[i][j]);       //prints the elements in the row
            }
        }
        */

    }
}
