import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {

    /* US Dollar (USD)
       Euro (EUR)
       Japanese Yen (JPY)
       Hong Kong Dollar (CAD)
       Chinese Renminbi (RMB)
     */

    public static void currencyCalculator (String[] args) {

        double usd;
        double eur;
        double jpy;
        double cad;
        double cny;

        //decimal object
        DecimalFormat c = new DecimalFormat("#,##");

        //new instance of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Siân's Currency Calculator");
        System.out.println("How much would you like to convert?");
        float amount = sc.nextFloat();

        System.out.println("Which Currency would you like to convert that amount too?");
        System.out.println("1.US Dollar (USD) /2.Euro (EUR) /3.Japanese Yen (JPY) /4.Hong Kong Dollar (CAD) /5.Chinese Yuan (CNY) ");
        int currency = sc.nextInt();

        //GBP to other currencies based on input
        if (currency == 1) {
            usd = amount * 1.3;
            System.out.println("Your"+" has converted into "+ usd + "US Dollars");
        } else if (currency == 2) {
            eur = amount * 1.15;
            System.out.println("Your"+" has converted into "+ eur + "Euros");
        } else if (currency == 3) {
            jpy = amount * 163.73;
            System.out.println("Your"+" has converted into "+ jpy + "Japanese Yen");
        } else if (currency == 4) {
            cad = amount * 8.88;
            System.out.println("Your"+" has converted into "+ cad + "Hong Kong Dollar");
        } else if (currency == 5) {
            cny = amount * 8.06;
            System.out.println("Your"+" has converted into "+ cny + "Chinese Yuan");
        }

        System.out.println("");




    }

}
