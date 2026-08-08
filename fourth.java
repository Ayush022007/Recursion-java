//print nth fibbonacci number;
import java.util.*; 

public class fourth {
    public static int fibo(int n){
        if(n==1|| n==0){
            return n;
        }
        int f1 = fibo(n-1);
        int f2 = fibo(n-2);
        int seq = f1+f2;
        return seq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        System.out.println(fibo(n));
    }
}
