import java.util.ArrayList;
import java.util.Scanner;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class GasStationIS {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<method> customers = new ArrayList<>();
        ArrayList<String> plaka = new ArrayList<>();
        String yes1 = "YES";
        String yes2 = "yes";
        String admin ="SE115";
        String password , licenseplate;
        String no1 = "NO";
        String no2 = "no";

        for(int cc=1; ; cc++) {
            SecureRandom rand = new SecureRandom();
            int x = rand.nextInt(cc);
            method obj = new method();
            Scanner input = new Scanner(System.in);
            System.out.println("*****************************************************");
            System.out.println("Welcome to Gas Station Information System please choose your process ");
            System.out.println("*** 1: REGULAR UNLEADED      ***");
            System.out.println("*** 2: NITRO+ UNLEADED       ***");
            System.out.println("*** 3: NITRO+ DIESEL         ***");
            System.out.println("*** 4: REGULAR DIESEL        ***");
            System.out.println("*** 5: ADMIN MODE            ***");
            System.out.println("*** 6: TERMINATE the Program ***");
            System.out.println("*** 7: TICKET RESULT         ***");
            System.out.println("*******************************************************");
            int fueltypenumber = input.nextInt();
            System.out.println("*******************************************************");
            switch (fueltypenumber) {
                case 1:
                    System.out.println("Please enter license plate with capital letter and without space ");
                    licenseplate=input.next();
                    obj.Setlicenseplate(licenseplate);
                    System.out.print("Enter amount ($): ");
                    double amount = input.nextDouble();
                    obj.Setamount(amount);
                    if(amount == 0){
                        continue ;
                    }
                    customers.add(obj);
                    System.out.println("Regular unleaded is getting in to fuel tank...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println(e + "error occurred");
                    }
                    if (amount >= 50)
                        System.out.println("*** CONGRATS!!!  ***\nYou have just joined the lottery ");
                    plaka.add(licenseplate);
                    System.out.println("Would you like receipt yes/no");
                    String yesCheck = input.next();
                    if (yesCheck.equals(yes1)|| yesCheck.equals(yes2)) {
                        obj.DISPLAY_Receipt();
                    } else if (yesCheck.equals(no1)||yesCheck.equals(no2))
                        System.out.println("THANKS FOR SAVING GREEN!!");
                    break;
                case 2:
                    System.out.println("Please enter license plate with capital letter and without space ");
                    licenseplate=input.next();
                    obj.Setlicenseplate(licenseplate);
                    System.out.print("Enter amount ($): ");
                    amount = input.nextDouble();
                    obj.Setamount(amount);
                    if(amount == 0){
                        continue ;
                    }
                    customers.add(obj);
                    System.out.println("Nitro+ unleaded is getting in to fuel tank...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println(e + "error occurred");
                    }
                    if (amount >= 50)
                        System.out.println("*** CONGRATS!!!  ***\nYou have just joined the lottery :) ");
                    plaka.add(licenseplate);

                    System.out.println("Would you like receipt yes/no");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e + "error occurred");
                    }

                    yesCheck = input.next();
                    if (yesCheck.equals(yes1)|| yesCheck.equals(yes2)) {
                        obj.DISPLAY_Receipt();
                    } else if (yesCheck.equals(no1)||yesCheck.equals(no2))
                        System.out.println("THANKS FOR SAVING GREEN!!");
                    break;
                case 3:
                    System.out.println("Please enter license plate with capital letter and without space ");
                    licenseplate=input.next();
                    plaka.add(licenseplate);
                    obj.Setlicenseplate(licenseplate);
                    System.out.print("Enter amount ($): ");
                    amount = input.nextDouble();
                    obj.Setamount(amount);
                    if(amount == 0){
                        continue ;
                    }
                    customers.add(obj);
                    System.out.println("Nitro+ diesel is getting in to fuel tank... ");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println(e + "error occurred ");
                    }
                    if (amount >= 50)
                        System.out.println("*** CONGRATS!!!  ***\n You have just joined the lottery ");
                    plaka.add(licenseplate);

                    System.out.println("Would you like receipt yes/no");
                    yesCheck = input.next();
                    if (yesCheck.equals(yes1)|| yesCheck.equals(yes2)) {
                        obj.DISPLAY_Receipt();
                    } else if (yesCheck.equals(no1)||yesCheck.equals(no2))
                        System.out.println("THANKS FOR SAVING GREEN!!");
                    break;
                case 4:
                    System.out.println("Please enter license plate with capital letter and without space ");
                    licenseplate=input.next();
                    plaka.add(licenseplate);
                    obj.Setlicenseplate(licenseplate);
                    System.out.print("Enter amount ($): ");
                    amount = input.nextDouble();
                    obj.Setamount(amount);
                    if(amount == 0){
                        continue ;
                    }
                    customers.add(obj);
                    System.out.println("Regular diesel is getting in to fuel tank...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println(e + "error occurred");
                    }
                    if (amount >= 50)
                        System.out.println("*** CONGRATS!!!  ***\n You have just joined the lottery ");
                    plaka.add(licenseplate);
                    System.out.println("Would you like receipt yes/no");
                    yesCheck = input.next();
                    if (yesCheck.equals(yes1)|| yesCheck.equals(yes2)) {
                        obj.DISPLAY_Receipt();
                    } else if (yesCheck.equals(no1)||yesCheck.equals(no2))
                        System.out.println("THANKS FOR SAVING GREEN!!");
                    break;
                case 5:
                    System.out.print("Please enter password to login : ");
                    password = input.next();
                    if(password.equals(admin)){
                        System.out.println("Press enter for all the receipts for today   ");
                        for (method customer : customers)
                            customer.DISPLAY_Receipt();
                    }
                    System.out.printf("%n* %d *",cc);
                    break;
                case 6:
                    System.out.println("Process canceled");
                    System.exit(0);
                    break;
                case 7:
                    System.out.println("winner license plate is   "+plaka.get(x));
                    break;
                default:
                    System.out.println("Entered invalid number please try again...");
                    break;
            }
        }

    }
}
