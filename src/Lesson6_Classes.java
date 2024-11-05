/* Notes -------------------------------------
Classes and Objects
    Java is an OOP language, an Object-Oriented Programming language
    this allows for a lot of simplicity in the code. This introduces many more
    ways to use and alter the code as opposed to C. The 2 main aspects of an OOP
    language are Classes and Objects.

    What are classes?
        Classes are a set of attributes and rules/template that certain values (Objects)
        need to follow, this allows for less repetition, easy to understand code, and quick
        for the machine to interpret. Classes can contain variables, methods, and more. They
        are often referred to as Object Constructors. 1 class can have multiple objects with
        different names.

    What are Objects?
        Objects are the code that follow this template, or inherit the attributes from the
        class. An Object can not exist without a class to set it up/construct it.


*/


//Code ----------------------------------------

import java.util.Scanner;

public class Lesson6_Classes {
    public static void main(String[] args){

        example myObj1 = new example();     //Constructing an object
        System.out.println(myObj1.x);       //printing the x value in the object
        example myObj2 = new example();     //Constructing another object
        System.out.println(myObj2.y);       //printing the y value in the object

        example2 lol = new example2();      //Constructing lol using the second class
        System.out.println("A value = "+lol.a +"\nU value = " +lol.u);  //when using .value it accesses that value
    }
}

// example of initializing a class
class example{
    int x = 69;
    int y = 420;
}

class example2{     //A class can have multiple variable types
    char a = 'b';
    double u = 69420;
}
