package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the salespeople:");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        // i will find the max sales and min sales
        int maxSales= sales[0];
        int maxSalesPersonId=0;
        int minSales= sales[0];
        int minSalesPersonId=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            if(maxSales<sales[i]){
                maxSales= sales[i];
                maxSalesPersonId=i;
            }
            if(minSales>sales[i]){
                minSales=sales[i];
                minSalesPersonId=i;
            }
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        // computing the average using sum
        double avg = (double) sum/SALESPEOPLE;
        System.out.println("The average sales is :"+avg);
        // printing the max and min sales and their id
        System.out.println("Salesperson"+(maxSalesPersonId+1)+" had the highest sale with $"+maxSales);
        System.out.println("Salesperson"+(minSalesPersonId+1)+" had the smallest sale with $"+minSales);
        System.out.println("Enter a sales goal: ");
        // the print and scan of people who exceeded the goal
        int goal = scan.nextInt();
        int countSalesPersonExceeding = 0;
        for(int i = 0; i<sales.length;i++){
            if(sales[i]>=goal) {
                System.out.println("Salesperson "+(i+1)+"has amount of sale "+sales[i]);
                countSalesPersonExceeding++;
            }
        }
        System.out.println("the number of Salesperson who exceeded the goal is: "+countSalesPersonExceeding);


    }
}