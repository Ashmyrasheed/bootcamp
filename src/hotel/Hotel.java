package hotel;


import com.nest.newhotel.Fooditems;

// import java.util.ArrayList;
import java.util.Scanner;

    public class Hotel {
        static int total=0;
        public static void main(String[] args) {

            int y;
            int z;


            Scanner s = new Scanner(System.in);
            Fooditems fooditems = new Fooditems(10, 15, 20, 25);
            Fooditems takeaway = new Fooditems(15, 20, 25, 30);

            while (true) {
                System.out.println("enter the choice");
                System.out.println("1. Add Tea " + " price=>" + fooditems.getTea());
                System.out.println("2.coffe " + " price=>" + fooditems.getCoffee());
                System.out.println("3.idli "+ "price=>" + fooditems.getIdli());
                System.out.println("4.dosa "+" price=>" + fooditems.getDosa());
//                System.out.println("5.ice cream 35$");
//                System.out.println("6.BILL");
//                System.out.println("7.exit");
                System.out.println("1.Dining");
                System.out.println("2.Takeaway");
                y = s.nextInt();
                z = s.nextInt();

                switch (y) {

                    case 1:
                        System.out.println("Select Dining");
                        // z = s.nextInt();
                        switch (z) {
                            case 1:
                                //System.out.println("Dining");

                                System.out.println("how many quantity");
                                int m = fooditems.getTea();//s.nextInt();
                                total = (10 * m) + total;
                                System.out.println(total);
                                break;
                            case 2:
                                System.out.println("how many quantity");
                                int n =fooditems.getCoffee();//s.nextInt();
                                total = (30 * n) + total;
                                System.out.println(total);
                                break;
                            case 3:
                                System.out.println("how many quantity");
                                int o = fooditems.getIdli();//s.nextInt();
                                total = (10 * o) + total;
                                System.out.println(total);
                                break;
                            case 4:
                                System.out.println("how many quantity");
                                int l = fooditems.getDosa();//s.nextInt();
                                total = (15 * l) + total;
                                System.out.println(total);
                                break;
//                            case 5:
//                                System.out.println("how many quantity");
//                                int p = s.nextInt();
//                                total = (35 * p) + total;
//                                System.out.println(total);
//                                break;
//                            case 6:
//                                System.out.println("total bill=" + total);
//                                break;
//                            case 7:
//                                System.exit(0);
//                                break;
                            default:
                                System.out.println("invalid input");
                        }
                    case 2:
                        System.out.println("select takeaway");
                        switch (z) {
                            case 1:
//                                System.out.println("Dining");


                                System.out.println("how many quantity");
                                int m = takeaway.getTea();//s.nextInt();
                                total = (10 * m) + total;
                                System.out.println(total);
                                break;
                            case 2:
                                System.out.println("how many quantity");
                                int n = takeaway.getCoffee();//s.nextInt();
                                total = (30 * n) + total;
                                System.out.println(total);
                                break;
                            case 3:
                                System.out.println("how many quantity");
                                int o = takeaway.getIdli();//s.nextInt();
                                total = (10 * o) + total;
                                System.out.println(total);
                                break;
                            case 4:
                                System.out.println("how many quantity");
                                int l = takeaway.getDosa();//s.nextInt();
                                total = (15 * l) + total;
                                System.out.println(total);
                                break;
//                            case 5:
//                                System.out.println("how many quantity");
//                                int p = s.nextInt();
//                                total = (35 * p) + total;
//                                System.out.println(total);
//                                break;
//                            case 6:
//                                System.out.println("total bill=" + total);
//                                break;
//                            case 7:
//                                System.exit(0);
//                                break;
                            default:
                                System.out.println("invalid input");

                        }
                }

            }
        }

}
