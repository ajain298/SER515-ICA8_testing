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

    }

    @Test
    void fileWrite()
    {
        assertEquals();
    }
}
