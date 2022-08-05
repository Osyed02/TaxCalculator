import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        System.out.println("(============ Tax Calculator ============)\n");

        Scanner scan = new Scanner(System.in);
        int monthlyIncome, yearlyIncome;
        int minIncome = 600000;
        int slab1 = 1200000;
        int slab2 = 2400000;
        int slab3 = 3600000;
        int slab4 = 6000000;
        int slab5 = 12000000;

        System.out.println("Please Enter Your Monthly Income");
        monthlyIncome = scan.nextInt();

        yearlyIncome = monthlyIncome * 12;

        System.out.println("\nYearly Income: " + yearlyIncome + "\n");

        if (yearlyIncome > minIncome) {
            if (yearlyIncome < slab1) {

                int additionalTax = 0;
                double taxPercent = 2.5;
                int exceededAmount = yearlyIncome - minIncome;

                double yearlyTax = (exceededAmount * taxPercent) / 100;
                yearlyTax = yearlyTax + additionalTax;
                double monthlyTax = yearlyTax / 12;

                System.out.println("Yearly Tax: " + yearlyTax);
                System.out.println("\nMonthly Tax: " + monthlyTax);

            } else if (yearlyIncome < slab2) {

                int additionalTax = 15000;
                double taxPercent = 12.5;
                int exceededAmount = yearlyIncome - slab1;

                double yearlyTax = (exceededAmount * taxPercent) / 100;
                yearlyTax = yearlyTax + additionalTax;
                double monthlyTax = yearlyTax / 12;

                System.out.println("Yearly Tax: " + yearlyTax);
                System.out.println("\nMonthly Tax: " + monthlyTax);

            } else if (yearlyIncome < slab3) {

                int additionalTax = 165000;
                int taxPercent = 20;
                int exceededAmount = yearlyIncome - slab2;

                int yearlyTax = (exceededAmount * taxPercent) / 100;
                yearlyTax = yearlyTax + additionalTax;
                int monthlyTax = yearlyTax / 12;

                System.out.println("Yearly Tax: " + yearlyTax);
                System.out.println("\nMonthly Tax: " + monthlyTax);

            } else if (yearlyIncome < slab4) {

                int additionalTax = 405000;
                int taxPercent = 25;
                int exceededAmount = yearlyIncome - slab3;

                int yearlyTax = (exceededAmount * taxPercent) / 100;
                yearlyTax = yearlyTax + additionalTax;
                int monthlyTax = yearlyTax / 12;

                System.out.println("Yearly Tax: " + yearlyTax);
                System.out.println("\nMonthly Tax: " + monthlyTax);

            } else if (yearlyIncome < slab5) {

                int additionalTax = 1005000;
                double taxPercent = 32.5;
                int exceededAmount = yearlyIncome - slab4;

                double yearlyTax = (exceededAmount * taxPercent) / 100;
                yearlyTax = yearlyTax + additionalTax;
                double monthlyTax = yearlyTax / 12;

                System.out.println("Yearly Tax: " + yearlyTax);
                System.out.println("\nMonthly Tax: " + monthlyTax);

            } else {

                int additionalTax = 2955000;
                int taxPercent = 35;
                int exceededAmount = yearlyIncome - slab5;

                int yearlyTax = (exceededAmount * taxPercent) / 100;
                yearlyTax = yearlyTax + additionalTax;
                int monthlyTax = yearlyTax / 12;

                System.out.println("Yearly Tax: " + yearlyTax);
                System.out.println("\nMonthly Tax: " + monthlyTax);

            }
        } else {
            System.out.println("To pay Tax, Minimum yearly Income must be more than 60,0000");
        }

    }
}
