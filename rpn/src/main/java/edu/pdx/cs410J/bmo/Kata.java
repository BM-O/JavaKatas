package edu.pdx.cs410J.bmo;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  private static Stack<Double> list;

  public static void main(String[] args) {
    if(args.length == 0) {
      System.err.println("Missing input arguments");
      System.exit(1);
    }

    for(int i = 0; i < args.length; i++){
      if(args[i].equals('+') || args[i].equals('-') || args[i].equals('*') || args[i].equals('/')){
        twooprand(list, args[i]);
      }
      if(args[i].equals("SQRT") || args[i].equals("MAX")){
        oneoprand(list, args[i]);
      }
      Double num = 0.0;
      try {
        num = Double.parseDouble(args[i]);
      }catch (NumberFormatException e){
        System.err.println("Only operators and numbers should be pass in, not others");
        System.exit(1);
      }
      list.push(num);
    }
    //String[] ops = new String[]{"/","*","+","-"};
    //String expression = "20 5 /";
    //Stack<String> temp = getStack(expression);
  }

  public static Double twooprand(Stack<Double> list, String operator){
    Double integer1 = list.pop();
    Double integer2 = list.pop();
    switch (operator){
      case "+":
        return integer1 + integer2;
      case "-":
        return integer1 + integer2;
      case "*":
        return integer1 + integer2;
      case "/":
        return integer1 + integer2;
      default:
        return 0.0;
    }
  }

  public static Double oneoprand(Stack<Double> list, String operator){

  }

  public static Stack<String> getStack(String expression) {
    Stack<String> stackToReturn = new Stack<>();
    stackToReturn.addAll(Arrays.asList(expression.split(" ")));
    return stackToReturn;
  }

  public static 



}