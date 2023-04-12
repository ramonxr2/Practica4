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
public class CartaTest {

  @Test
  public void testCartaConstructorWithValidValues() {
    try {
      Carta carta = new Carta(1, Figura.CORAZONES);
      assertNotNull("Carta is null", carta);
      assertEquals("Incorrect value for carta", 1, carta.getValor());
      assertEquals("Incorrect figura for carta", Figura.CORAZONES, carta.getFigura());
      assertEquals("Incorrect color for carta", Color.ROJO, carta.getColor());
    } catch (FueraDeRangoException e) {
      fail("Unexpected FueraDeRangoException thrown: " + e.getMessage());
    }
  }

  @Test
  public void testCartaConstructorWithInvalidValue() {
    try {
      Carta carta = new Carta(0, Figura.CORAZONES);
      fail("Expected FueraDeRangoException not thrown");
    } catch (FueraDeRangoException e) {
      assertEquals("Incorrect error message for FueraDeRangoException", "Valor 0 fuera de rango", e.getMessage());
    }
  }

  @Test
  public void testCartaStringConstructorWithValidValues() {
    try {
      Carta carta = new Carta("K", Figura.TREBOLES);
      assertNotNull("Carta is null", carta);
      assertEquals("Incorrect value for carta", 13, carta.getValor());
      assertEquals("Incorrect figura for carta", Figura.TREBOLES, carta.getFigura());
      assertEquals("Incorrect color for carta", Color.NEGRO, carta.getColor());
    } catch (FueraDeRangoException e) {
      fail("Unexpected FueraDeRangoException thrown: " + e.getMessage());
    }
  }

  @Test
  public void testCartaStringConstructorWithInvalidValue() {
    try {
      Carta carta = new Carta("X", Figura.TREBOLES);
      fail("Expected FueraDeRangoException not thrown");
    } catch (FueraDeRangoException e) {
      assertEquals("Incorrect error message for FueraDeRangoException", "Cadena \"X\" fuera de rango", e.getMessage());
    }
  }

  @Test
  public void testCartaToString() {
    Carta carta = null;
    try {
      carta = new Carta(1, Figura.DIAMANTES);
    } catch (FueraDeRangoException e) {
      fail("Unexpected FueraDeRangoException thrown: " + e.getMessage());
    }
    assertEquals("Incorrect string representation for carta", "A DIAMANTES", carta.toString());
  }
}
