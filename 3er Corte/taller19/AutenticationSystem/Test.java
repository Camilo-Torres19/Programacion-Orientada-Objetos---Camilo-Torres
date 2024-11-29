public class Test {
    public static void main(String[] args) {

        ServiceAutentication service = new LocalAuthentication();
        ServiceAutentication service2 = new AuthenticationOAuth();

        AuthenticationManager authenticationManager = new AuthenticationManager(service);
        authenticationManager.authenticate("Cleymer");
        authenticationManager = new AuthenticationManager(service2);
        authenticationManager.authenticate("Cleymer");
    }
}
