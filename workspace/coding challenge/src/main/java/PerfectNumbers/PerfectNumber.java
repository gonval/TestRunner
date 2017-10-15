package PerfectNumbers;

public class PerfectNumber {
    public static boolean isPerfectNumber(int perfect_number) {
        int temp = 0;
        for (int i = 1; i <= perfect_number / 2; i++) {
            if (perfect_number % i == 0) {temp += i; }
        }
        if (temp == perfect_number ) {return true;}
        else {return false;} }
        public static void main (String[] args) {
        int max = 33_550_337;
            final long start = System.nanoTime();
    for (int i = 33_500_336; i <= max; i++) {
        if (isPerfectNumber(i)) {
            final long finish = System.nanoTime();
            System.out.print(i + ", ");
            System.out.println((finish - start) / 1_000_000_000.0 + " s");
        }
    }
    }
}