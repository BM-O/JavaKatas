package edu.pdx.cs410J.bmo;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  String findLargestNumeral(int num) {
    String result = "";
    while(num >= 1){
      if(num > 1000){
        num -= 1000;
        result += arabicToRoman(1000);
      }
      }
      if(num > 500){
        num -= 500;
        result += arabicToRoman(500);
      }
      if(num > 100){
        num -= 100;
        result += arabicToRoman(100);
      }
      if(num > 50){
        num -= 50;
        result += arabicToRoman(50);
      }
      if(num > 10){
        num -= 10;
        result += arabicToRoman(10);
      }
      if(num > 5){
        num -= 5;
        result += arabicToRoman(5);
      }
    return result;
    }


  public static String arabicToRoman(int num){
    String result = "I";


    switch(num){
      case 2:
        return "II";
      case 3:
        return "III";
      case 5:
        return "V";
      case 10:
        return "X";
      case 50:
        return "L";
      case 100:
        return "C";
      case 500:
        return "D";
      case 1000:
        return "M";
      default:
        return "I";
    }
  }

}