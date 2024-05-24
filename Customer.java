public class Customer extends User {
    int points;
    
    public Customer(String name) {
        super(name);
        role = "customer";
        points = 0;
    }
}
