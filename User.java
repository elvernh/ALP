public class User {
    protected String username;
    
    protected String role;
    protected String pwd;
    protected String email;
    public User(String username, String role, String email, String pwd) {
        this.username = username;
        this.role = role;
        this.pwd = pwd;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
