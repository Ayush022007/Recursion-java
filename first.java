// program to print number in increase or decrease order using reursion

import  java.util.*;
public class first{

    //decresing method
    public static void printdec(int n){
        if(n==1){
             System.out.println(n);
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }
    //increasing method
    public static void printinc(int n) {
        if(n==1000){
            System.out.println(n);
            return;
        }
        System.out.println(n);
         printinc(n+1);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number according to print : ");
        int n = sc.nextInt();
     
        // printdec(n);
        printinc(n);
        
    }
}