package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator aLoginGenerator;

    @Before
    public  void setUp() throws Exception {
        String[] start = new String[] {"JROL", "BPER", "CGUR", "JRAL", "JARL1"};
        aLoginGenerator = new LoginGenerator(new LoginService(start));
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand",
                "Paul");
        Assert.assertEquals("PDUR", login);
    }
}