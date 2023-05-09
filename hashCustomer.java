import java.util.Hashtable;
import java.util.Scanner;

public class hashCustomer {


    public static void testclass(){
        Hashtable<Integer, String> CustId = new Hashtable<Integer, String>();
        Scanner boatIn = new Scanner(System.in);
        Scanner boatHull = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            //Scanner boatIn = new Scanner(System.in);
            System.out.println("Please enter ID#");
            int IDNum = boatHull.nextInt();

            // Scanner boatHull = new Scanner(System.in);
            System.out.println("Please enter Last Name: ");
            String Namer = boatIn.next();

            CustId.put(IDNum, Namer);
        }
            //System.out.println(boatName);
            Scanner deleter = new Scanner(System.in);
            System.out.println(CustId);
            System.out.println("Would you like to delete the list? Y for yes N for no:");
            String choice  = deleter.next();
            if (choice.equals("Y")){
                CustId.clear();
                System.out.println("List after modification: "+ CustId);
        }
            if(choice.equals("N")){
                System.out.println("List after selection: " + CustId);
            }
        }



    public static void main(String args[]) {
        testclass();
    }
}

