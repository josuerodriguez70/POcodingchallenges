import java.util.*;

public class JuneTwenty{

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.println();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();
       System.out.println();
       
       System.out.println(countSqs(a, b));
       sc.close();
    }

    public static int countSqs(int a , int b){
        int upper = (int) Math.floor(Math.sqrt(b));
        int lower = (int) Math.ceil(Math.sqrt(a));
        int result = upper - lower + 1;
        return result;
    }
}
