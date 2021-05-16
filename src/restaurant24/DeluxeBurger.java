
package restaurant24;

import java.util.Scanner;
public class DeluxeBurger extends NormalBergur  {
    Scanner sc=new Scanner (System.in);
   
    public DeluxeBurger( String name, String meat, String bread,String add,double price) {
       super(name,meat,bread,price);
       name="DeluxeBurger";
       meat="beef";
       bread="white";
       add="chips and drink";
       price=60;
    }
    
 
    
      public void add (){ 
      
        
        System.out.println("Your sandwitch is :\n" + "DeluxeBurger" + "\t" +"white" + "\t" + "beef" );
        System.out.println("the additions :\n chips \n pepsi");
       System.out.println("Your total price = " + 60);
}
  }