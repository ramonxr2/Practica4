/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;


import org.junit.Test;
import static org.junit.Assert.*;

public class JugadorTest {

  @Test
  public void testGetPuntos() {
    Jugador jugador = new Jugador();
    assertEquals(0, jugador.getPuntos());
  }

  @Test
  public void testSetPuntos() {
    Jugador jugador = new Jugador();
    jugador.setPuntos(10);
    assertEquals(10, jugador.getPuntos());
    jugador.setPuntos(5);
    assertEquals(5, jugador.getPuntos());
  }

  @Test
  public void testGetPuntosAcum() {
    Jugador jugador = new Jugador();
    assertEquals(0, jugador.getPuntosAcum());
  }

  @Test
  public void testSetPuntosAcum() {
    Jugador jugador = new Jugador();
    jugador.setPuntos(10);
    assertEquals(10, jugador.getPuntosAcum());
    jugador.setPuntos(5);
    assertEquals(15, jugador.getPuntosAcum());
  }
}

