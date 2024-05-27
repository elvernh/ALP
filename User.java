public class User {
    protected String username;
    
    protected String role;
    protected String pwd;
    protected String email;
    public User(String username, String role, String pwd, String email) {
        this.username = username;
        this.role = role;
        this.pwd = pwd;
        this.email = email;
    }
}
