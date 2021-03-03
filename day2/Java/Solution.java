import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mscost = scan.nextDouble(); // original meal price
        int tpercent = scan.nextInt(); // tip percentage
        int tax = scan.nextInt(); // tax percentage
        scan.close();

        double tipDouble = (double) tpercent / 100;
        double taxDouble = (double) tax / 100;
        tipDouble = mscost * tipDouble;
        taxDouble = mscost * taxDouble;

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round((mscost + tipDouble + taxDouble));

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}