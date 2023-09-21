/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hotelguestapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tim Dladla
 */
public class HotelManagerTest {
    
    public HotelManagerTest() {
    }

    /**
     * Test of getName method, of class HotelManager.
     */
    @Test
    public void testGetName() {
        
        HotelManager manager = new HotelManager("tim dladla",1234);
        String expected = "tim dladla";
        String result = manager.getName();
        
        assertEquals(expected,  result);   
    }

    /**
     * Test of getPassword method, of class HotelManager.
     */
    @Test
    public void testGetPassword() {
        
        HotelManager manager = new HotelManager("tim dladla",1234);
        int expected = 1234;
        int result = manager.getPassword();
        
        assertEquals(expected,  result);  
    }

    /**
     * Test of getValidPassword method, of class HotelManager.
     */
    @Test
    public void testGetValidPassword() {
        
        HotelManager manager = new HotelManager("tim dladla",1234);
        int expected = 1234;
        int result = manager.getValidPassword();
        
        assertEquals(expected,  result);  
    }

    /**
     * Test of checkPassword method, of class HotelManager.
     */
    @Test
    public void testCheckPassword() {
        
        HotelManager manager = new HotelManager("tim dladla",1234);
        boolean expected = true;
        boolean result = manager.checkPassword(1234);
        
        assertEquals(expected,  result);  
    }
    
    /**
     * Test of checkPassword method, of class HotelManager.
     */
    @Test
    public void testCheckPasswordWrong() {
        
        HotelManager manager = new HotelManager("tim dladla",0);
        boolean expected = false;
        boolean result = false;
        
        assertEquals(expected,  result);  
    }    

    /**
     * Test of toString method, of class HotelManager.
     */
    /*@Test
    public void testToString() 
         
        HotelManager manager = new HotelManager("tim dladla",1234);
        int expected = 1234;
        String expected = "Name: " + manager;
        
        
        assertEquals(expected,  result);  
        
    }*/
    
}
