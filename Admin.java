public class Admin extends User {
    public Admin(String username, String role, String pwd, String email) {
        super(username, role, pwd, email);
        role = "Admin";
    }
}