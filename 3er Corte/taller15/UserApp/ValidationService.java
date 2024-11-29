package UserApp;

public class ValidationService {
    private User user;

    public ValidationService(User user) {
        this.user = user;
    }

    public void validateUser() {
        System.out.println("Validando usuario  "+ user.getName());
    }
}
