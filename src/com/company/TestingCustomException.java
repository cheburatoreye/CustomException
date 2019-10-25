package com.company;
import java.util.Scanner;

public class TestingCustomException {
    
    private  static void checkpass(String password) {
    try {
        if (!password.equals("pass")) throw new WrongUserData("Wrong data entered: ");
        System.out.println("pass checked,correct");

    }catch (NullPointerException e){
    System.err.println("data must be set");
    }
    }

    public static void main(String[] args) {

     Scanner sc =new Scanner(System.in);
        String enteredpass="0";
        while (!enteredpass.equals("-1")){
            System.out.println("enter password or -1 to exit");
          enteredpass=sc.next();
          if (!enteredpass.equals("-1")){
              try {
                  checkpass(enteredpass);
              }
              catch (WrongUserData e){
                  System.err.println(e.getMessage());
              }
          }
       }
    }
}
