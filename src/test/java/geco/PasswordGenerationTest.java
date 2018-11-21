package geco;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    private static PasswordGeneration p;


    @BeforeClass
    public static void setUp(){
        p = new PasswordGeneration();
    }


    @Test
    public void getRandomPassword() {
        String password = p.getRandomPassword();
        assertEquals(8, password.length());
    }
}