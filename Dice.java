import java.util.Random;
import java.util.Scanner;

class Dice {
    public static void main(String args[]) {
	Random rand = new Random();
	Scanner scanner = new Scanner(System.in);
	int a = rand.nextInt(10) + 1;
	int b = rand.nextInt(10) + 1;
	int sum = a + b;
	System.out.println("What is your name?");
	System.out.print("> ");
	String name = scanner.next();
	System.out.println("Hello," + name + "!"); 
	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + a);
	System.out.println("Die 2: " + b);
	System.out.println("Total value: " + sum);
    }
}
