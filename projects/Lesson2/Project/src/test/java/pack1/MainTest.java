package pack1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldDisplayEmailID()
    {
       EmailID testEmail = new EmailID("kedrick.hill", "yahoo.com");
       assertEquals("kedrick.hill@yahoo.com", testEmail.displayEmail());
    }
}
