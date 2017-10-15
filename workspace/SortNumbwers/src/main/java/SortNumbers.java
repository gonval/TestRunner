import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt(); input.close();
        System.out.print("Sorted numbers: ");

        if ((a < b) && (b < c)) {System.out.println(a + " " + b + " " + c);}   // 123
        if ((a > b) && (b > c)) {System.out.println(c + " " + b + " " + a);}   // 321
        if ((c < b) && (c > a)) {System.out.println(a + " " + c + " " + b);}   // 465
        if ((a > b) && (a < c)) {System.out.println(b + " " + a + " " + c);}   // 213
        if ((a < b) && (a > c)) {System.out.println(c + " " + a + " " + b);}   // 564
        if ((a > c) && (c > b)) {System.out.println(b + " " + c + " " + a);}   // 423
        if ((a == b) && (b == c)) {System.out.println(a + " " + b + " " + c);} // 444
    }
}