package UserApp;

public class DataService {
    private User user;

    public DataService(User user) {
        this.user = user;
    }

    public void showUserData() {
        System.out.println("Los datos del usuario son: ");
        System.out.println("Nombre: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Contraseña: " + user.getPassword());
    }
}
