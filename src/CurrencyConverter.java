import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {

    /* US Dollar (USD)
       Euro (EUR)
       Japanese Yen (JPY)
       Hong Kong Dollar (CAD)
       Chinese Renminbi (RMB)
     */

    public static void main (String[] args) {

        float usd;
        float eur;
        float jpy;
        float hkd;
        float cny;


        //decimal object
        DecimalFormat c = new DecimalFormat("#,##0.00");

        //new instance of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Siân's Currency Calculator");
        System.out.println("How much would you like to convert?");
        float amount = sc.nextFloat();

        System.out.println("Which Currency would you like to convert that amount too?");
        System.out.println("1.US Dollar (USD) 2.Euro (EUR) 3.Japanese Yen (JPY) 4.Hong Kong Dollar (HKD) 5.Chinese Yuan (CNY) ");
        int currency = sc.nextInt();

        //GBP to other currencies based on input
        if (currency == 1) {
            usd = amount * 1.1197f;
            System.out.println("Your"+" has converted into $"+ c.format(usd) + " US Dollars");
        } else if (currency == 2) {
            eur = amount * 1.1431f;
            System.out.println("Your"+" has converted into €"+ c.format(eur) + " Euros");
        } else if (currency == 3) {
            jpy = amount * 162.2319f;
            System.out.println("Your"+" has converted into ¥"+ c.format(jpy) + " Japanese Yen");
        } else if (currency == 4) {
            hkd = amount * 8.7847f;
            System.out.println("Your"+" has converted into $"+ c.format(hkd) + " Hong Kong Dollar");
        } else if (currency == 5) {
            cny = amount * 7.9647f;
            System.out.println("Your"+" has converted into ¥"+ c.format(cny) + " Chinese Yuan");
        }

        System.out.println("");
    }
}
