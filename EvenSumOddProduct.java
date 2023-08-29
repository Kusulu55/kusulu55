public class EvenSumOddProduct
 {
    public static void main(String[] args) 
{
        int x = 1;
        int n = 50;
        int evenSum = 0;
        int oddProduct = 1;

        while (x <= n)
 {
            switch (x % 2)
 {
                case 0:
                    evenSum += x;
                    break;
                case 1:
                    oddProduct *= x;
                    break;
            }
            x++;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Product of odd numbers: " + oddProduct);
    }
}