// Write a java program to create packages
// Package 1 calculates gcd, package 2 calculates lcm of 2 numbers. write a class which imports these two classes.
import GcdPackage.Gcd;
import LcmPackage.Lcm;
import java.util.Scanner;

public class _4a_gcd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Gcd gcd = new Gcd(a,b);
        System.out.println(" Gcd of " + a + "," + b + "="+ gcd.calcGcd(a,b));

        Lcm lcm = new Lcm(a,b);
        System.out.println(" Lcm of " + a + "," + b + "="+ lcm.calcLcm(a,b));

        sc.close();

    }
}