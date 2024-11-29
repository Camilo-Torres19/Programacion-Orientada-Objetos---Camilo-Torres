public class AuthenticationOAuth implements ServiceAutentication {

    @Override
    public void authenticate(String username) {
        System.out.println("Autenticando al usuario " + username+ " con OAuth");
    }
}