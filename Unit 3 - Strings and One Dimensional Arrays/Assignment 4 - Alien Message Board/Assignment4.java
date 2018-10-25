import java.lang.Math;
import java.util.Scanner;
  class Main{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter message board post:");
      String original = scan.nextLine();
      //***********
      int user = (original.indexOf( "-" ));
      String username = original.substring(0,user);
      user+=2;
      String message = original.substring(user);
        
      int qey = 0;
      int points = 0;
      int money = 0;
      int x = 0;
      
      message = message.toLowerCase() + " ";
      
      while(x < 10){
        x++;
        String word = " " + (message.substring(0,(message.indexOf(" ")+1)))+" ";
        message = message.substring(message.indexOf(" ")+1); 
        
        if((word.indexOf(" ^^ ")== 0) && (word.indexOf(" qey ")==0) && (word.indexOf(" $ ")==0))
        {
        }
        else if(word.indexOf(" ^^ ")>=0){
          points++;
        }
        else if(word.indexOf(" qey ")>=0){
          qey++;
        }
        else if(word.indexOf(" $ ")>=0){
          money++;
        }
      }
      
      if(money == 0 && qey == 0 && points == 0){
        System.out.println("CLEAN");
        System.out.println("Results: ");
      }
      if(money > 0 || qey > 0 || points > 0){
        System.out.println("Results: ");
        System.out.println("BAD");
      }
      System.out.println(username);
      System.out.println("^^: " + points);
      System.out.println("qey: " + qey);
      System.out.println("$: " + money);
    }
  }
