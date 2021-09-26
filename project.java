import java.util.Scanner;

public class project{
  public static void main(String[] args){
//password protection segement
    System.out.println("Welcome to our Food app ");
    System.out.println("Please create a password: ");
    Scanner scan = new Scanner(System.in);
    String pass1 = scan.next();

    System.out.println("your pass now is : " + pass1);

    System.out.println("Please enter your password: ");
    String pass = scan.next();


    while(!pass.equals(pass1)){
      System.out.println("Wrong password , Please Try Again :");
      pass= scan.next();
    }
    System.out.println("Access granted! ");
//asking user if he is hungry or not
    System.out.println("Are you Hungry or Not ? ");
    String ans1 = scan.next();
//verifiying user is hungry or Not
    if(ans1.equals("yes")){
      System.out.println("Choose a certain cusine?(pizza/burger/fish): ");
      String ans2 = scan.next();
//checking user has entered correct option
      while(!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")){
        System.out.println("sorry we dont have it, would you like to have pizza,burger or fish ?");
        ans2=scan.next();
      }
//offering user something to drink
      if(ans2.equals("pizza") ||ans2.equals("burger") || ans2.equals("fish")){
        System.out.println("Do you want something to drink ? (Yes or No)");
        String ans3 = scan.next();
//checking user has entered correct option
        while(!ans3.equals("yes")&& !ans3.equals("no")){
          System.out.println("wrong command,please try again:");
          ans3= scan.next();
        }
//giving choices of beverages
        if(ans3.equals("yes")){
          System.out.println("What you like to drink?(coke/pepsi)");
          String ans4 =scan.next();
//verfying its correct option or not
          while(!ans4.equals("coke")&& !ans4.equals("pepsi")){
            System.out.println("sorry we dont have that,You can choose between coke and pepsi");
            ans4 =scan.next();
          }
//confirming order of user
          if(ans4.equals("coke") || ans4.equals("pepsi")){
            System.out.println("Great! you have ordered "+ ans2 +" and "+ ans4 );
          }
          System.out.println("Please confirm your password : ");
          pass = scan.next();
          while(!pass.equals(pass1)){
            System.out.println("Wrong password , Please Try Again :");
            pass= scan.next();
          }
          System.out.println("You order is confirmed ");
          System.out.println("Thank You! ");
        }

      }else{
        System.out.println("Great! you have ordered "+ ans2 );
      }
      }
//exit node if user is not hungry
    else{
      System.out.println("Have a nice day");
    }
//exit lines
  }
}
