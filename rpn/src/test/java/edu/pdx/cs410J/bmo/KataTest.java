package edu.pdx.cs410J.bmo;

import org.junit.Test;

import java.util.Stack;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  public void getStackTurnsAStringIntoAStack(){
    String testString = "20 5 /";
    Stack<String> testStack = Kata.getStack(testString);
    assertThat(testStack.size(), equalTo(3));
  }

}
