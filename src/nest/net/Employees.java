package nest.net;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        System.out.println("Employees");
        int choice;
        while(true)
        {
            System.out.println("select options");
            System.out.println("1.add Employees");
            System.out.println("2.view all Employees");
            System.out.println("3.exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("add Employees selected");
                    break;
                case 2:
                    System.out.println("view all Employees selected");
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }
}
