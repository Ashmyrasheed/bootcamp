package nest.group;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        int a=5,b=8;
        int choice;
        while(true) {
            System.out.println("Select an option");
            System.out.println("1. select addition");
            System.out.println("2. select Subtraction");
            System.out.println("3. select Multiplication");
            System.out.println("4. select Division");
            System.out.println("5. Exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println(a/b);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }



}
