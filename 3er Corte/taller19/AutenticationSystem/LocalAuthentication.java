public class LocalAuthentication implements ServiceAutentication {

    @Override
    public void authenticate(String username) {
        System.out.println("Autenticando al usuario " + username+ " en el sistema local");
    }
}
