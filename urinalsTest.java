import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    void main()
    {

    }

    @Test
    void fileRead() throws IOException
    {
        System.out.println("===== AAKANKSHA JAIN ====== TEST ONE EXECUTED ======");
        File fname = new File("C:/Users//AAKANKSHA/urinal.dat");
        try
        {
            assertTrue(fname.exists());
            System.out.println("File exists in system");
        }
        catch(Exception e)
        {

            assertFalse(fname.exists());
        }
    }

    @Test
    void countUrinal()
    {
        urinals u = new urinals();
        System.out.println("===== AAKANKSHA JAIN ====== TEST TWO EXECUTED ======");
        assertEquals(1, u.CountUrinal("10001"));
        System.out.println("===== AAKANKSHA JAIN ====== TEST THREE EXECUTED ======");
        assertEquals(0, u.CountUrinal("1001"));
        System.out.println("===== AAKANKSHA JAIN ====== TEST FOUR EXECUTED ======");
        assertEquals(3, u.CountUrinal("00000"));
        System.out.println("===== AAKANKSHA JAIN ====== TEST FIVE EXECUTED ======");
        assertEquals(2, u.CountUrinal("0000"));

    }

    @Test
    void fileWrite()
    {
      
    }
}
