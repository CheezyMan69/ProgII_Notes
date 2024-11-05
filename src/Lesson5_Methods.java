/*Notes ----------------------
Method
    A method is similar to a function in other prog languages
    Instead of writing the same piece of code over and over again
    you could just create a method of it and call it in the main code

    A method has some elements but 2 of the most important ones are:
        - Parameters
            These tell the method what data to use in the piece of code to keep it
            adaptive. They are specified after the name of the method in the ().
            You can use multiple parameters with different types, they must be separated
            by a , (comma).

        - Return value
            This tells the method what value type to return when done with the piece
            of code in it. It uses the return statement to make it clear what it will
            give out once executed.

Method Overloading
    This is a technique that allows the use of the same method but to use different data types
    as parameters. So for example, instead of having 2 methods with the same code but one works
    with int and the other with double, if you overload it, you can have the same method
    work with both double and int. This is done by specifying the return type and parameter types
    before the piece of code. This allows us to have the same name for a method but different use
    cases.

Scope and Method Scope
    What is scope? Scope is the area where a variable is accessible. Because java works line by line, you can not
    access a variable declared later, before. For example, X cannot be used before it is initialized,but it can be used
    after. Scope also applies for blocks of code like for loops, if-else, while, and so on. If a variable is declared
    inside a block, it will ONLY be usable inside that block of code, not outside or before.

Recursion
    It is a technique that calls the same method to run again, with different parameters

    I don't want to do this anymore, but I will lol
    I will do the code a bit later
    give me time plz

 */


import java.util.Scanner;

public class Lesson5_Methods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st value: ");
        double num1 = input.nextInt();
        System.out.println("Enter 2nd Value: ");
        double num2 = input.nextInt();
        System.out.println("The sum of the values are:\n"+add(num1,num2));
    }

    //This is an example of a simple method returning an int
    public static int add(int x,int y){
        return x+y;
    }

    //This is an example of method overloading (same name different output)
    public static double add(double x, double y){
        return x+y;
    }
}

