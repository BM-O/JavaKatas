package edu.pdx.cs410J.bmo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void arabicReturnsSingleRomanNumeralEquivalent() {
    String result = Kata.arabicToRoman(1);
    String[] numerals = {"I", "II", "III", "V", "X", "L", "C", "D", "M"};
    int[] digits = {1, 2, 3, 5, 10, 50, 100, 500, 1000};
    for (int i = 0; i < 9; ++i) {
      assertThat(numerals[i], equalTo(Kata.arabicToRoman(digits[i])));
    }
  }
}
