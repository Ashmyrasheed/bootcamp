package nest.net;
import java.util.Scanner;

public class Emplyoees {
    public static void main(String[] args) {
        System.out.println("Emplyoees");
        int choice;
        while(true)
        {
            System.out.println("select options");
            System.out.println("1.add Emplyoees");
            System.out.println("2.view all Emplyoees");
            System.out.println("3.exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("add Emplyoees selected");
                    break;
                case 2:
                    System.out.println("view all Emplyoees selected");
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }
}
