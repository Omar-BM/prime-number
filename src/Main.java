import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        while (number != 0){
            Scanner lecture = new Scanner(System.in);
            System.out.println("type a number to identify if it is prime or not");
            number = lecture.nextInt();
            if (number <= 1) {
                System.out.println("Not Prime number");
            } else if (number % 2 == 0) {
                System.out.println("Not prime number");
            } else {
                System.out.println("Prime number");
            }
        }
    }
}