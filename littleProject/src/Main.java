import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(" Hello the following program will allow you to enter numbers until your type a string, it will calculate the sum and the average of all typed numbers...");

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int input;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        boolean isInteger =true;

        do{
            try {


                System.out.print("Enter a number >>");
                input = scanner.nextInt();
                numbers.add(input);
                }

            catch(Exception e){

                isInteger= false;
            }
        }while(isInteger);

        int sum = 0;

        for (int i :numbers ){

            sum+=i;


        }

        System.out.print("The sum is >> "+sum);

        double avg=(double) sum/ numbers.size();

        System.out.println();

        System.out.print("The average is >> "+avg);


    }
}