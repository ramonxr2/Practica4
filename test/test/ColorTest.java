/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;
import org.junit.Test;
import static org.junit.Assert.*;


public class ColorTest {
   
    @Test
    public void testValueOf() {
        Color[] colors = Color.values();
        assertEquals(2, colors.length);
        assertEquals(Color.ROJO, colors[0]);
        assertEquals(Color.NEGRO, colors[1]);

    }
    
}
