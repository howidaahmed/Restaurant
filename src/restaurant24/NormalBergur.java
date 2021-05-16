/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant24;

import java.util.Scanner;
public class NormalBergur {
    Scanner sc=new Scanner(System.in);
     private String name;
    private String meat;
    private String bread;
    private double price;
    private String add;
    public NormalBergur(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }
    public NormalBergur(String name, String meat, String bread, double price, String add) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
        this.add = add;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMeat() {
        return meat;
    }
    public void setMeat(String meat) {
        if(meat =="Beef" || meat == "Chicken")
        this.meat = meat;
        else
            System.out.println("error");
    }
    public String getBread() {
        return bread;
    }    
    public void setBread(String bread) {
         if(bread =="white" || bread == "brown")
        this.bread = bread;
        else
            System.out.println("error");
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void calc (){
        System.out.println(" inter 1 - if you want meat beef and white bread \n inter 2 - if you want meat checken and white bread \n inter 3 - if you want meat beef and brown bread\n inter 4 - if you want meat checken and brown bread \n ");

        int n=sc.nextInt();
        if(n==1)
            price+=60;
        else if(n==2)
            price+=70;
        else if(n==3)
            price+=40;
        else 
            price+=50;
    }
    public void add (){
        System.out.println("if you want addition inter 1 \n if you dont want inter 2");
     int a=sc.nextInt();
     if(a==2){price=price;}
     if(a==1){
         System.out.println("if you want  one addition enter 1 \n if you want  two addition enter 2 \n if you want three addition enter 3 \n if you want  4 addition enter 4 ");
int b=sc.nextInt();
if (b==1){
    System.out.println("if you want botato inter 1 \n if you want tomato inter 2 \n if you want pypsi inter 3 \n if you want cheese inter 4");
    int c=sc.nextInt();
    if(c==1){
    price +=5;
    }
    if(c==2){
    price +=8;
    }  
     if(c==3){
    price +=7;
    } 
      if(c==4){
    price +=10;
    } 
}
if (b==2){
    for(int i =0;i<2;i++){
                 System.out.println("if you want botato inter 1 \n if you want tomato inter 2 \n if you want pypsi inter 3 \n if you want cheese inter 4");
    int c=sc.nextInt();
    if(c==1){
    price +=5;
    }
    if(c==2){
    price +=8;
    }  
     if(c==3){
    price +=7;
    } 
      if(c==4){
    price +=10;
    } 
}

    }
     if(b==3){
     
        for(int i =0;i<3;i++){
                 System.out.println("if you want botato inter 1 \n if you want tomato inter 2 \n if you want pypsi inter 3 \n if you want cheese inter 4");
    int c=sc.nextInt();
    if(c==1){
    price +=5;
    }
    if(c==2){
    price +=8;
    }  
     if(c==3){
    price +=7;
    } 
      if(c==4){
    price +=10;
    } 
}
     }
     if (b==4){
        for(int i =0;i<4;i++){
                 System.out.println("if you want botato inter 1 \n if you want tomato inter 2 \n if you want pypsi inter 3 \n if you want cheese inter 4");
    int c=sc.nextInt();
    if(c==1){
    price +=5;
    }
    if(c==2){
    price +=8;
    }  
     if(c==3){
    price +=7;
    } 
      if(c==4){
    price +=10;
      }
        }
     }
     }}}
