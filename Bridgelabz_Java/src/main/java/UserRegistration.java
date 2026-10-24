
public class UserRegistration {

    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName != null && firstName.matches(regex);
    }
}
