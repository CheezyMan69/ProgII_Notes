//Notes ---------------------------
/*Control Statements include:
    - If statements
    - Else
    - If...Else
    - Nested If-else Statements
    - Switch cases
    - Loops - While , do-while, for
   These operate and start functioning when they meet a specific condition
   or criteria. If their condition is not met, then they do not run and moves to the
   next segment of code.

   We could do with user input as well, anything that meets a condition as long as the
   condition is possible in Java
 */

//Examples -------------------------

import java.util.Scanner;

public class Lesson2_ControlStatements {
    public static void main(String[] args) {
        /*
        int x = 15;
        int y = 69;

        if(x>y){
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("Y is greater than X");
        }
        */

        // If else with user input ---------------------------
        /*
        Scanner num =new Scanner(System.in);
        System.out.println("Enter first Number");
        float num1 = num.nextFloat();
        System.out.println("Enter Second Number:");
        float num2 = num.nextFloat();
        if(num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else {
            System.out.println("num2 is greater than num1");
        }
         */

        //Nested IF-Else statement -------------------------
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        try{                                        // tries a piece of code and if
                                                    // there is an error it executes the
                                                    // catch code
            int num = input.nextInt();
            if (num > 0){
                System.out.println("Positive Num");
            } else if (num<0) {
                System.out.println("Negative num");
            }else {
                System.out.println("ZEROOOOOOOOOOO");
            }
        }catch (Exception e){
            System.out.println("You did not enter an int");
        }
        */

        //Logical Operators || (OR), && (AND), !(NOT) -----
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num greater than 7");
        int num = input.nextInt();
        if (num%2 == 0 || num%3 == 0 || num%5 == 0 || num%7 ==0){
            System.out.println(num+" Is not a prime number (sad)");
        }else {
            System.out.println(num+" Is a prime number (CONGRATS)");
        }
        */

        //Switch Cases ---------------------------------
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        int marks = input.nextInt();
        char grade;
        switch (marks/10){
            case 10:                //if marks/10 = 10 it will run case 9 this is because there is no break
            case 9: grade = 'A';
                break;
            case 8: grade = 'B';
                break;
            case 7:                 //if marks/10 = 7 it will run case 6, if there is no break it will execute
                                    // the next until it hits a break
            case 6: grade = 'C';
                    break;
            case 5:
            case 4: grade = 'D';
                    break;
            default: grade = 'F';
        }
        System.out.println("Your grade is "+grade);
        */

        // Age calc ----------------------------------
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = input.nextInt();
        if (age>=18 && age < 58){
            System.out.println("You are an adult, Welcome to life");
        } else if (age >= 58) {
            System.out.println("You've been an adult for a long time, rate life from 1 to 10");
        } else if (age < 0) {
            System.out.println("You haven't been born yet, how are you here?");
        } else {
            System.out.println("You are a kid, your too young to be here, go to the playground");
        }
        */

        //While Loops - i'll add more in a bit -------
        /*
        double i = 10;      //Initialize the variable first
        double n =1;
        while (i<21){       // it will check if the condition is true and if it is it will run the
                            // code in it
            n *= i;         //If you create a new variable inside, you will not be able to use it out
            i++;
        }
        System.out.println("Product = "+n);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter beginning number: ");
        double start = input.nextDouble();
        System.out.println("Enter end number: ");
        double end = input.nextDouble();
        double temp = 0;
        while (start<(end+1)){
            temp+= start;
            start ++;
        }
        System.out.println("Sum of range -> "+temp);
        */

        //Do-While loops --------------------------------

        /*For Loops -------------------------------------
        // they function the same as in C
        //for(initialize; condition to follow, increment or decrement)
        for(int i = 1;i<=10;i++){
            System.out.println("i -> "+i);
        }
        for(int j = 20;j>=10;j--){
            System.out.println("j -> "+j);
        }

        String hi = "Hello World"; //Strings are an array of characters put together
        System.out.println("Length of hi -> "+hi.length()); //this function finds the length of the string
        System.out.println("Char at Index 3 -> "+hi.charAt(3)); //This function finds the specific letter in
                                                                //that array
        for(int i= 0;i<hi.length();i++){ //We can find all the characters using a for loop
            System.out.println("Index "+i+" has the character "+hi.charAt(i));
        }

        for (int i = 0;i<hi.length();i++){  //Initialize i = 0;only works when i is less than the length of hi;increment i
            System.out.print(hi.charAt(i)); //this way we can print Hello World in one line
        }
        */

        /*Nested For loop ---------------------------
        int n = 5;
        for(int i =1; i<=n;i++){        //for every i<=n it will run the other for loop as well

            for (int j=1;j<=i;j++){
                System.out.print("* "); //prints a * until the value of i is reached
            }
            System.out.println(" ");
        }

        for (int i = 1; i<=n;i++){
            for(int k = n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j =1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        */
    }
}
