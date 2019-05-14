public class Modul2Sapt1Tema1 {

    static int ariaDreptunghiului(int a, int b)
    {
        return a * b;
    }

    static int perimetrulDreptunghiului(int a, int b)
    {
        return 2*(a + b);
    }

    public static double ariaHexagonului(double s)
    {
        return ((3 * Math.sqrt(3) * (s * s)) / 2);
    }

    public static double perimetrulHexagonului(double s)
    {
        return 6 * s;
    }

    public static void main (String[] args) {
        // EXERCITIUL 1.1
        int a = 5;
        int b = 6;
        System.out.println("Ex1.1: Write a Java program to print area and perimeter of a rectangle");
        System.out.println("Aria dreptunghiului este "+ ariaDreptunghiului(a, b));
        System.out.println("Perimetrul dreptunghiului este "+ perimetrulDreptunghiului(a, b));
        System.out.println();

        // EXERCITIUL 1.2
        double s = 4;
        System.out.println("Ex1.2: Write a Java program to print area and perimeter of a hexagon");
        System.out.println("Aria hexagonului este " + ariaHexagonului(s));
        System.out.println("Perimetrul hexagonului este " + perimetrulHexagonului(s));
        System.out.println();

        // EXERCITIUL 3
        System.out.println("Ex3: Write a Java program to reverse a string");
        String input = "Tema1 PentaStagiu Automation";
        char[] reverse = input.toCharArray();
        for (int i = reverse.length-1; i>=0; i--) {
            System.out.print(reverse[i]);
        }

        // EXERCITIUL 4
        System.out.println("\n\nEx4: Write a Java program to print the odd numbers from 1 to 99");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        //  EXERCITIUL 5
        System.out.println("\n\nEx5: Write a Java program to convert a given string into lowercase");
        String Str = "TEMA1 PENTRU StAgiUl dE AUTOMATION TEST lOwER CASE";
        System.out.println(Str.toLowerCase());
        System.out.println();


        // EXERCITIUL 6
        System.out.println("Ex6: Write a Java program which iterates the integers from 1 to 100. For multiples of three print Fizz instead of the number and print Buzz for the multiples of five. When number is divided by both three and five, print fizz buzz");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: fizz buzz",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: buzz",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: fizz",i);
            }
        }


        // EXERCITIUL 7
        System.out.println("\n\nEx7: Write a Java program to check if a positive number is a palindrome or not");
        int num = 75257, reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num/= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");

    }

}
