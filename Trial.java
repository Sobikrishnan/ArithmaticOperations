import java.util.Scanner;
public class Trial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text you want to display: ");
        String text = scanner.nextLine();

        System.out.println("How many times do you want to show it? ");
        int num = scanner.nextInt();

        //System.out.println(text);
        //System.out.println(num);

        //System.out.println("While Loop");
        int i = 1;
        while (i<=num){
            System.out.println(text);
            i++;
        }

        /*System.out.println("\nDo-While Loop");
        int j = 1;
        do{
            System.out.println("Iteration(j)" + j);
            j++;
        } while(j<=5);

        System.out.println("\nFor Loop");
        for(int k=1; k<=5; k++){
            System.out.println("Iteratiom(k)" + k);
        }*/

        scanner.close();
    }
}