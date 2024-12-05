package Day3;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);// Create a Scanner object for input
        System.out.print ("Year :");
        int year=scanner.nextInt();
        // Check if the year is a leap year
        if((year % 4==0 && year % 100!=0)||(year%400==0)){
            System.out.println("A Leap year");
        }else{
            System.out.println("Not a Leap year");
        }
    }
}
