package fibonacci;

class Fibonacci94 {
 public static void main(String args[])
    {
//
int max = 94; 
        long fibonacci = 0;   // Lucas number long fibonacci = 2;
        long fibonacci2= 1;
        // BigInteger fibonacci = BigInteger.ZERO;
        // BigInteger fibonacci2 = BigInteger.ONE; 
        for (int i = 1; i <= max; i++) {     
        System.out.println(i + ": " + fibonacci);
            fibonacci = fibonacci + fibonacci2;
            fibonacci2= fibonacci - fibonacci2;
            // fibonacci = fibonacci.add(fibonacci2);
            // fibonacci2 = fibonacci.subtract(fibonacci2);
// 
    }
}
}