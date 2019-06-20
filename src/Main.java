import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number to check if it is Prime: ");
        number = keyboard.nextInt();

        boolean isPrime = true;

        for(int i = 2; i < number ;i++)
        {
            if(number % i == 0)
            {
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println(number+" is Prime");
        }
        else
        {
            System.out.println(number+" is not Prime");
        }
    }
}
