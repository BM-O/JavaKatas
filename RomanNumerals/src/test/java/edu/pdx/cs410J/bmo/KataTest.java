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
  public void arabicToRomanReturnsIWhenGiven1() {
    String result = Kata.arabicToRoman(1);
    assertThat(result, equalTo("I"));
  }


}
