public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;  // Start counting from 1

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
