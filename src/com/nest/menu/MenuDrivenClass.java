package com.nest.menu;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuDrivenClass {
    public static void main(String[] args) {
        System.out.println("Menu Driven");
        int choice;
        while (true)
        {
            System.out.println("Select an option");
            System.out.println("1. Add Students");
            System.out.println("2. Search Students");
            System.out.println("3. Delete Students");
            System.out.println("4. View all Students");
            System.out.println("5. Exit");
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Add Students Selected");
                    break;
                case 2:
                    System.out.println("Search Students Selected");
                    break;
                case 3:
                    System.out.println("Delete Students Selected");
                    break;
                case 4:
                    System.out.println("View all Students Selected");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
