import java.util.Scanner;

public class IT26101286Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_CUSTOMERS = 5;
        final double DISCOUNT_RATE = 0.05;

        int customerCount;
        double billAmount;
        double discount;
        double amountToPay;
        char paymentMode;

        for (customerCount = 1; customerCount <= NUMBER_OF_CUSTOMERS; customerCount++) {

            System.out.println("Customer " + customerCount);

            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().toUpperCase().charAt(0);

            if (paymentMode == 'C' ||paymentMode=='c') {

                discount = billAmount * DISCOUNT_RATE;
                amountToPay = billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (paymentMode == 'O' || paymentMode=='o') {

                amountToPay = billAmount;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToPay);

            } else {

                System.out.println("Payment Mode is Not Valid");
                System.out.println();

                continue;
            }

            System.out.println();
        }
    }
}