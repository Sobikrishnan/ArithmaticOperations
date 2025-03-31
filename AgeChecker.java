import java.util.Scanner;

public class AgeChecker{
    public static void main(String[] ags){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("You are a minor.");
        } else if (age >= 18  && age < 60) {
                System.out.println("You are an adult.");
            } else if (age <= 120) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are immortal.");
        }
        scanner.close();
    }
}