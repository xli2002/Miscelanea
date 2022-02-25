import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicTest {

    @Test
    void isPalindrome(){
        assertAll(
                ()->assertEquals("ala","ala"),
                ()->assertEquals("adiosoida","dasdad")
        );
    }

}