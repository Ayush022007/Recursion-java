// to fing sum of n number
import java.util.*;
public class third {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
       int sum = n+sum(n-1);
       return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for sum : ");
        int n = sc.nextInt();

        System.out.print(sum(n));
    }
}
