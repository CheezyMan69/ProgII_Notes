//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson1_Intro {
    public static void main(String[] args) {
        System.out.println("\nHello World, welcome to ProgII Notes\n");
        // single
        /*
            multi
         */

        byte byteValue = 10; // range -> -178 to 127
        short shortValue = 1000;
        byte byteValue2 = 100;
        int x;
        x = 1000000;

        System.out.println("byteValue -> "+byteValue);
        System.out.println("byteValue2 -> "+byteValue2);
        System.out.println("shortValue -> "+shortValue);
        System.out.println("intValue -> "+x);
        x=69420;
        System.out.println("new intValue -> "+x);

        long longValue = 1000000000000000000L; //L is a suffix that indicates that the number is a long
        float floatValue = 6.9f; //f is also a suffix but this time its for float
        double doubleValue = 4.20d; //d is for double
        boolean booleanValue = true; //true or false
        char charValue = 'A';

        System.out.println("longValue -> "+longValue);
        System.out.println("floatValue -> "+floatValue);
        System.out.println("doubleValue -> "+doubleValue);
        System.out.println("booleanValue -> "+booleanValue);
        System.out.println("Char -> "+charValue);

        //Operators --------------------------
        //Arithmetic + - * / %
        int n1 = 20;
        int n2 = 5;
        int sum = n1 + n2;
        int difference = n1 - n2;
        int multiply = n1*n2;
        int divide = n1/n2;
        int remainder = n1%n2;
        System.out.println("\nSum -> "+sum);
        System.out.println("diff -> "+difference);
        System.out.println("multi -> "+multiply);
        System.out.println("div -> "+divide);
        System.out.println(("remain -> "+remainder));

        //Unary ++(Increment), --(Decrement)
        System.out.println("\nn1 -> "+n1);
        n1++;
        System.out.println("incremented n1 -> "+n1);
        n1--;
        System.out.println("decremented n1 -> "+n1);

        //Ternary +=, -=, *=, /=, %=
        int n3 = 20;
        System.out.println("\nn3 -> "+n3);
        n3 += 5;//this increases n3 by 5 (n3 = n3 +5)
        System.out.println("incremented n3 -> "+n3);
        n3 -= 5;//decreases the new n3 by 6 (n3 = n3-5)
        System.out.println("decremented n3 -> "+n3);
        n3 *= 5;//multiplies n3 by 5 (n3 = n3*5)
        System.out.println("Multiplied n3 -> "+n3);
        n3 /= 5;//divides n3 by 5 (n3 = n3 / 5)
        System.out.println("Divided n3 -> "+n3);
        n3 %= 5;
        System.out.println("Remaindered n3 -> "+n3);

        //Comparison < > <= >= == !=
        double a = 69.420;
        double b = 420.69;
        System.out.println("\na smaller than b? "+(a<b));
        System.out.println("a greater than b? "+(a>b));
        System.out.println("a smaller or equal to b? "+(a<=b));
        System.out.println("a greater or equal to b? "+(a>=b));
        System.out.println("a equal to b? "+(a==b));
        System.out.println("a not equal to b? "+(a!=b));

        int lol = 10;

    }
}