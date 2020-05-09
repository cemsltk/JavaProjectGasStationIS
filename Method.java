import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Method {

    private String licenseplate;
    private double amount;
    private Date dateobj = new Date();
    DateFormat df = new SimpleDateFormat("*\t\t   dd/MM/yy HH:mm:ss  \t\t*");


    public void Setlicenseplate(String Mylicenseplate) {
        licenseplate = Mylicenseplate;
    }

    public String Getlicenseplate() {
        return licenseplate;
    }

    public void Setamount(double Myamount) {
        amount = Myamount;
    }

    public double Getamount() {
        return amount;
    }

    public void DISPLAY_Receipt() throws InterruptedException {

        try {
            System.out.println("RECEIPT...");
            Thread.sleep(1000);
            System.out.println("*************************************");
            System.out.println("*\t\t\tGas Station IS\t\t\t*");
            System.out.println(df.format(dateobj));
            System.out.println("*\t\t\t\t\t\t\t        *");
            System.out.printf("* \t\t\t  %s \t\t\t    * %n", licenseplate);
            System.out.println("*\t\t\t\t\t\t\t        *");
            System.out.println("*\t\t\t\t\t\t\t        *");
            System.out.printf("*  Fuel amount %.2f        %.2fL *%n", amount, (amount / 5.0));
            System.out.println("*\t\t\t\t\t\t\t        *");
            System.out.println("*\t\t\t\t\t\t\t        *");
            System.out.println("*\t\t\t\t\t\t\t        *");
            System.out.println("*    Thanks for choosing us ...     *");
            System.out.println("*\t\t\t\t\t\t\t        *");
            System.out.println("*************************************");
        } catch (InterruptedException e) {
            System.out.println(e + "error occurred");
        }

    }
}
