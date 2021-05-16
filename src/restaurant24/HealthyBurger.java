/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant24;

import java.util.Scanner;
public class HealthyBurger extends NormalBergur  {

    private double price;
    Scanner sc = new Scanner(System.in);
     
 
    public HealthyBurger( String name, String meat, String bread, double price) {
     
       super(name, meat, bread, price);
       name ="healthyBurger";
        bread ="brown";
    }
      public void no (){
             System.out.println("you get   beef say 1 or chicken say 2" );
        int n = sc.nextInt();
        if(n == 1 )
           price+=60;
        
        if(n== 2)
           price+=40;
      }          
   
  @Override
  
  public void add (){
      System.out.println("We have 4 additions for you but You can choose only 2 additions");
      System.out.println("you get 1 additions or 2 additions or not want additions \n if you not want addition enter 3");
      int d = sc.nextInt();
      if(d==1){
          System.out.println("if you want cheese say 1, you want tomato say 2 , you want potato say 3 , you want pipsy say 4 ");
          int c = sc.nextInt();
            if(c == 1)
            
              price+=20;

           
          if(c == 2)
               price+=5;
            
           
          if(c == 3)
             
              price+=15;
              
           
         if(c == 4)
           price+=10;
            
           
      }
      if(d==2)
          for(int i =0;i<2;i++){
               System.out.println("if you want cheese say 1, you want tomato say 2 , you want potato say 3 , you want pipsy say 4 ");
          int c = sc.nextInt();
            if(c == 1)
           
            
  price+=20;
          
          if(c == 2)
              
             price+=5;
          if(c == 3)
              price+=15;
             
           
         if(c == 4)
             price+=10;
         
      }
      if (d==3){price = price;}
          }
  
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}