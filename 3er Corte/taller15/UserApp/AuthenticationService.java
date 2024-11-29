package UserApp;

public class AuthenticationService {
    private User user;

    public AuthenticationService(User user) {
        this.user = user;
    }

    public void authenticateUser() {
        System.out.println("Autenticando usuario  "+ user.getName());
    }
}
