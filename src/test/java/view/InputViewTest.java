package view;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class InputViewTest {
    @Test
    public void checkValidationPass() {
        String validName = "ABCDE"; // length:5
        assertTrue(InputViewUtils.isValid(validName));
    }

    @Test
    public void checkValidationFail() {
        String invalidName = "ABCDEF"; // length:6
        assertFalse(InputViewUtils.isValid(invalidName));
    }
}
