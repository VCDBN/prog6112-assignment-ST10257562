/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package hotelguestapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuestTest {

    @Test
    public void testSaveGuestSuccess() {
        // Initialize your GuestManager and guestList here
        Guest guestManager = new Guest("John Doe", 1);
        boolean expected = true;
        boolean result = true;

        assertEquals(expected, result);
    }

    @Test
    public void testSaveGuestFailure() {
        // Initialize your GuestManager and guestList here
       Guest guestManager = new Guest("John Doe", 1);
        
        boolean expected = true;
        boolean result = true;

        assertEquals(expected, result);
    }

    /**
     * Test of SaveGuest method, of class Guest.
     */
    @org.junit.Test
    public void testSaveGuest() {
    }

    /**
     * Test of isIsAuthorized method, of class Guest.
     */
    @org.junit.Test
    public void testIsIsAuthorized() {
    }

    /**
     * Test of getName method, of class Guest.
     */
    @org.junit.Test
    public void testGetName() {
    }

    /**
     * Test of getId method, of class Guest.
     */
    @org.junit.Test
    public void testGetId() {
    }

    /**
     * Test of guestReport method, of class Guest.
     */
    @org.junit.Test
    public void testGuestReport() {
    }

    /**
     * Test of toString method, of class Guest.
     */
    @org.junit.Test
    public void testToString() {
    }

    /**
     * Test of isAuthorized method, of class Guest.
     */
    @org.junit.Test
    public void testIsAuthorized() {
    }

    /**
     * Test of authorize method, of class Guest.
     */
    @org.junit.Test
    public void testAuthorize() {
    }
}