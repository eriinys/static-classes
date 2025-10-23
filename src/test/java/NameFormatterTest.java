import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void format_ShouldPrintLastAndFirstName(){
        String expected = "Dykes, Dave";

        String actual = NameFormatter.format("Dave", "Dykes");

        assertEquals(expected, actual);
    }

    @Test
    public void format_ShouldPrintStandardFormat(){
        String expected = "Dykes, Dr. Dave Ian, PhD";

        //String prefix, String firstName, String middleName, String lastName, String suffix

        String actual = NameFormatter.format("Dr", "Dave", "Ian", "Dykes", "PhD");

        assertEquals(expected, actual);
    }

}