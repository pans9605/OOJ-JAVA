import java.util.*;
import java.lang.Math;

class quadEq{
    public static void main(String args[]){
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of 'a':");
        float a=sc.nextInt();
        System.out.println("enter value of 'b':");
        float b=sc.nextInt();
        System.out.println("enter value of 'c':");
        float c=sc.nextInt();
        if(a==0 || b==0 || c==0){
            System.out.println("Invalid Inputs");
        }
        double d=(b*b)-(4*a*c);
        if(d<0){
            System.out.println("there are no real solution");
            r1=-b/(2*a);
            r2=Math.sqrt(Math.abs(d))/(2*a);
            System.out.println("root 1= "+r1+"+"+r2+"i");
            System.out.println("root 2= "+r1+"-"+r2+"i");
        }
        else if(d==0){
            System.out.println("they have equal roots");
            r1=r2=(-b)/(2*a);
            System.out.println("root 1= "+r1+"\n"+"root 2= "+r2);
        }
        else if(d>0){
            System.out.println("they have real roots");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("root 1= "+r1+"\n"+"root 2= "+r2);
        }
    }
}