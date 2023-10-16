import java.util.Scanner;

class Voting1 {
    public static void main(String args[]) {
        int b, a, c = 2023;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Birth Year=");
        b = input.nextInt();
        a = c - b;
        if (a >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}