package main;
import java.util.Scanner;

public class count {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        if (num == 0) {
            count = 1; // special case
        } else {
            while (temp != 0) {
                temp /= 10; // remove last digit
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " is: " + count);
        sc.close();
    }
}

    

