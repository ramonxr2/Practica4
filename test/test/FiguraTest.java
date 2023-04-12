/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FiguraTest {

  @Test
  public void testFiguraValues() {
    Figura[] figuras = Figura.values();
    assertEquals("Incorrect number of values in Figura enum", 4, figuras.length);
    assertEquals("Figura CORAZONES not found", Figura.CORAZONES, figuras[0]);
    assertEquals("Figura PICAS not found", Figura.PICAS, figuras[1]);
    assertEquals("Figura DIAMANTES not found", Figura.DIAMANTES, figuras[2]);
    assertEquals("Figura TREBOLES not found", Figura.TREBOLES, figuras[3]);
  }

  @Test
  public void testFiguraToString() {
    assertEquals("Incorrect string representation for Figura CORAZONES", "CORAZONES", Figura.CORAZONES.toString());
    assertEquals("Incorrect string representation for Figura PICAS", "PICAS", Figura.PICAS.toString());
    assertEquals("Incorrect string representation for Figura DIAMANTES", "DIAMANTES", Figura.DIAMANTES.toString());
    assertEquals("Incorrect string representation for Figura TREBOLES", "TREBOLES", Figura.TREBOLES.toString());
  }

  @Test
  public void testFiguraValueOf() {
    assertEquals("Incorrect Figura for string value CORAZONES", Figura.CORAZONES, Figura.valueOf("CORAZONES"));
    assertEquals("Incorrect Figura for string value PICAS", Figura.PICAS, Figura.valueOf("PICAS"));
    assertEquals("Incorrect Figura for string value DIAMANTES", Figura.DIAMANTES, Figura.valueOf("DIAMANTES"));
    assertEquals("Incorrect Figura for string value TREBOLES", Figura.TREBOLES, Figura.valueOf("TREBOLES"));
  }
}

