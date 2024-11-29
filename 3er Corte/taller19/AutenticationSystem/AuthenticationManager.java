public class AuthenticationManager {
    private ServiceAutentication service;

    public AuthenticationManager(ServiceAutentication service) {
        this.service = service;
    }

    public void authenticate(String username) {
        service.authenticate(username);
    }
}
