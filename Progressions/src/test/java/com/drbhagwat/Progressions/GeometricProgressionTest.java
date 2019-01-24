package com.drbhagwat.Progressions;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeometricProgressionTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private Progression progression;

  @Before
  public void init() {
    progression = new GeometricProgression(3);
  }

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void testfirstValue() {
    assertEquals(progression.firstValue(), 1);
  }

  @Test
  public void testNextValue() {
    assertEquals(progression.nextValue(), 3);
  }

  @Test
  public void testSeries() {
    progression.print(3);
    assertEquals("1, 3, 9", outContent.toString());
  }

}
