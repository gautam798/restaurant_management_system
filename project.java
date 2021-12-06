import java.util.Scanner;

//https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/

public class project{
  public static void main(String[] args){
//password protection segement
    System.out.println("Welcome to our Food app ");
    System.out.println("Enter your Mobile No:");
    Scanner scan1= new Scanner(System.in);
    String number = scan1.next();
    System.out.println("Please create a password: ");
    Scanner scan = new Scanner(System.in);
    String pass1 = scan.next();

    System.out.println("your pass now is : " + pass1);

    System.out.println("Please Re-enter your password: ");
    String pass = scan.next();


    while(!pass.equals(pass1)){
      System.out.println("Wrong password , Please Try Again :");
      pass= scan.next();
    }
    System.out.println("Welcome! ");
//asking user if he is hungry or not
    System.out.println("Lets proceed with your order(Yes/No) ? ");
    String ans1 = scan.next();
    String[] cusines= {"blank","Pizza","Burger","Sanwich","Momos","French-fries"};
    int[] cusine_price= {0,150,100,80,130,100};

    String[] drinks= {"blank","Coke","Pepsi"};
    int[] drink_price= {0,30,30};

    String cusine1 = "";
    int price = 0;
    int price2=0;

//verifiying user is hungry or Not
    if(ans1.equals("yes")){
      System.out.println("Choose a certain cusine?" +"\n"+
              "Enter option Numberr:" +"\n"+
              "1)pizza RS:150" +"\n"+
              "2)burger Rs:100" +"\n"+
              "3)sandwich RS:80" +"\n"+
              "4)Momos RS130" +"\n"+
              "5)French-fries  RS:100"+"\n"+
              "Enter your option: ");
      String ans2= scan.next();
//checking user has entered correct option
      while(!ans2.equals("1") && !ans2.equals("2") && !ans2.equals("3") && !ans2.equals("4") && !ans2.equals("5")){
        System.out.println("sorry we dont have it, Enter and option from above menu: ?");
        ans2=scan.next();
      }

//offering user something to drink
      if(ans2.equals("1") ||ans2.equals("2") || ans2.equals("3") || ans2.equals("4") ||  ans2.equals("5")){
//        System.out.println()
        switch (ans2){
          case "1":
            System.out.println("you ordered pizza");
            cusine1 = cusines[1];
            price= cusine_price[1];
            break;
          case "2":
            System.out.println("you ordered Burger");
            cusine1 = cusines[2];
            price = cusine_price[2];
            break;
          case "3":
            System.out.println("you ordered sanwich");
            cusine1 = cusines[3];
            price= cusine_price[3];
            break;
          case "4":
            System.out.println("you ordered Momos");
            cusine1 = cusines[4];
            price= cusine_price[4];
            break;
          case "5":
            System.out.println("you ordered French-fries");
            cusine1 = cusines[5];
            price= cusine_price[5];
            break;
        }
        System.out.println("Do you want something to drink ? (Yes or No)");
        String ans3 = scan.next();
//checking user has entered correct option
        while(!ans3.equals("yes")&& !ans3.equals("no")){
          System.out.println("wrong command,please try again:");
          ans3= scan.next();
        }
//giving choices of beverages
        if(ans3.equals("yes")){
          System.out.println("What you like to drink?(coke/pepsi)(Special price of Rs 30/- each)");
          String ans4 =scan.next();
//verfying its correct option or not
          while(!ans4.equals("coke")&& !ans4.equals("pepsi")){
            System.out.println("sorry we dont have that,You can choose between coke and pepsi");
            ans4 =scan.next();
          }
//confirming order of user
          if(ans4.equals("coke") || ans4.equals("pepsi") ){
            System.out.println("Great! you have ordered "+ cusine1 +" and "+ "a soft drink" );
          }

          System.out.println("Please confirm your password : ");
          pass = scan.next();
          while(!pass.equals(pass1)){
            System.out.println("Wrong password , Please Try Again :");
            pass= scan.next();
          }
          int total3 = price+ 30;
          System.out.println("You order is confirmed ");
          System.out.println("Total bill amount is: RS"+total3);
          System.out.println("Thank You! ");
        }
        else if(ans3.equals("no")){
          System.out.println("Would you like to have deserts?(yes/no)(Special Price of Rs 100/- each)");
          String ans5 =scan.next();

          if(ans5.equals("yes")){
            System.out.println("Great! you have ordered "+cusine1+" and "+" desert");
            int total1= price+ 100;
            System.out.println("Total bill amount is: RS"+total1);

          }
          else{
            System.out.println("Great! you have ordered "+cusine1);
          }
          System.out.println("Please confirm your password : ");
          pass = scan.next();
          while(!pass.equals(pass1)){
            System.out.println("Wrong password , Please Try Again :");
            pass= scan.next();
          }
//          int total= price+price2 ;
          System.out.println("You order is confirmed ");
//          System.out.println("Total bill amount is: RS"+total);
          System.out.println("Thank You! ");


        }else {
          System.out.println("Great! you have ordered " + ans2);
        }
      }
    }
//exit node if user is not hungry
    else{
      System.out.println("Have a nice day");
    }
//exit lines
  }
}



