
package restaurant24;

import java.util.Scanner;

public class Restaurant24 {



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 if you want NormalBergur \n Enter 2 if you want HealthyBurger\n Enter 3 if you want DeluxeBurger \n");
        System.out.println();
       System.out.println();
       int n=sc.nextInt();
       if (n==1){
      NormalBergur cus1=new NormalBergur("NormalBergur","beef","white",0,"cheese")  ;
      cus1.calc();
      cus1.add();
//      cus1.cheese(6);
//      cus1.pipsy(2);
        System.out.println(cus1.getPrice());}
       if(n==2){
        HealthyBurger cus2=new HealthyBurger("HealthyBurger","beef","brown",0);
        cus2.no();
       
        cus2.add();
       System.out.println(cus2.getPrice());}
       if(n==3){
       DeluxeBurger cus3=new DeluxeBurger("DeluxeBurger","beef","white","drinks and chips",60);
       cus3.add();
    }
}}