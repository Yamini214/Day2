
 import java.util.Scanner;
    public class Maximum {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("First Number:");
            int num1=scanner.nextInt();
            System.out.print("Second  Number:");
            int num2=scanner.nextInt();
            int max=(num1>num2) ? num1:num2;
            System.out.println("Maximum Number:"+max);
        }
    }


