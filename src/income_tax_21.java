import java.util.Scanner;

public class income_tax_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your income per annum");
        double income = sc.nextFloat();
        double tax = 0;
        if(income<=250000.0){
            tax = tax+0;
        }

        if(income>250000 && income<=500000){
            tax = tax+0.05*(income-250000);
        }

        if(income>500000 && income<=1000000){
            tax = tax+0.05*(500000-250000);
            tax = tax+0.2*(income-500000);
        }

        if(income>1000000){
            tax = tax+0.05*(500000-250000);
            tax = tax+0.2*(1000000-500000);
            tax = tax+0.3*(income-1000000);
        }
        System.out.println("Your income rax is : "+tax);

    }
}
