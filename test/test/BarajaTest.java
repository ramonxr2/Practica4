/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BarajaTest {
  
  private Baraja baraja;
  private ArrayList<Carta> mazo;
  
  @Before
  public void setUp() {
    baraja = new Baraja();
    baraja.setNumBarajas(1);
    mazo = baraja.inicializa();
  }
  
  @Test
  public void testInicializa() {
    assertEquals(52, mazo.size());
  }
  
  @Test
  public void testBarajar() {
    ArrayList<Carta> mazoOriginal = new ArrayList<Carta>(mazo);
    baraja.barajar();
    assertNotEquals(mazoOriginal, mazo);
  }
  
  @Test
  public void testRepartir() {
    int n = 5;
    ArrayList<Carta> barajaInicial = new ArrayList<Carta>(mazo);
    ArrayList<Carta> mano = baraja.repartir(n, barajaInicial, baraja.getNumBarajas()*52);
    assertEquals(n, mano.size());
    assertEquals(baraja.getNumBarajas()*52-n, baraja.getBaraja().size());
  }
  
}

