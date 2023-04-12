/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FueraDeRangoExceptionTest {

  @Test
  public void testConstructorAndGetMessage() {
    String message = "Valor 14 fuera de rango";
    FueraDeRangoException exception = new FueraDeRangoException(message);
    assertEquals(message, exception.getMessage());
  }

}
