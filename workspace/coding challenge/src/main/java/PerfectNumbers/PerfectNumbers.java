package PerfectNumbers;

public class PerfectNumbers {
    public static boolean isPerfectNumber(int perfect_number) {
        int temp = 0;
        for (int i = 1; i <= perfect_number / 2; i++) {
            if (perfect_number % i == 0) {temp += i; }}
        if (temp == perfect_number) {return true;}
        else {return false; }}
    public static void main(String[] args) {
        int max = 10_000;
        for (int i = 1; i <= max; i++) {
            if (isPerfectNumber(i)) {System.out.print(i + ", ");}}
    }
}