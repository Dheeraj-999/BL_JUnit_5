import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    @Test
    void givenValidFirstNameShouldReturnTrue() {
        assertTrue(user.validateFirstName("Dheeraj"));
        assertTrue(user.validateFirstName("Ram"));
    }

    @Test
    void givenInvalidFirstNameShouldReturnFalse() {
        assertFalse(user.validateFirstName("ram"));
        assertFalse(user.validateFirstName("Ab"));
        assertFalse(user.validateFirstName(""));
        assertFalse(user.validateFirstName(null));
    }
}
