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
                                                                                    

  public static void main(String[] args) {
//    System.err.println("Missing command line arguments");
//    System.exit(1);

    String expression = "20 5 /";
    Stack<String> temp = getStack(expression);

  }

  public static Stack<String> getStack(String expression) {
    Stack<String> stackToReturn = new Stack<>();
    stackToReturn.addAll(Arrays.asList(expression.split(" ")));
    return stackToReturn;
  }



}