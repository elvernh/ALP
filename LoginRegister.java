import java.util.*;

public class LoginRegister {
    String username, password;
    boolean accountFound = false;
    Scanner sc = new Scanner(System.in);
    private LinkedList<User> listUser = new LinkedList<>();

    public void userScreen() {
        String opsi;
        do {
            for (User user : listUser) {
                System.out.print(user.getName());
                System.out.println(user.getPassword());
            }
            System.out.println("Mau cari makan / minum? Yophee aja!");
            System.out.print("""
                    [1] Buat akun
                    [2] Masuk ke akun
                    [3] Keluar
                    Opsi:
                    """);
            opsi = sc.next() + sc.nextLine();

            switch (opsi) {
                case "1":
                    register();
                    break;

                case "2":
                    login();
                    break;

                case "3":
                    System.out.println("Sampai jumpa kembali!");
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public void register() {
        String nama, password;
        int temp = 0;
        System.out.print("Masukan username: ");
        nama = sc.next() + sc.nextLine();
        nama.toCharArray();
        for (int i = 0; i < nama.length(); i++) {
            if (nama.charAt(i) >= 97 && nama.charAt(i) <= 122 || nama.charAt(i) >= 48 && nama.charAt(i) <= 57) {
                temp++;
                if (temp == nama.length()) {
                    System.out.print("Masukan password: ");
                    password = sc.next() + sc.nextLine();
                    listUser.add(new User(nama, password));
                    System.out.println("Akun berhasil dibuat!");
                    break;
                }
            } else if (nama.charAt(i) <= 97 && nama.charAt(i) >= 122 || nama.charAt(i) <= 48 && nama.charAt(i) >= 57 || nama.charAt(i) == 0) {
                System.out.println("Username tidak boleh memiliki simbol / huruf kapital / spasi!");
                break;
            } else {
                System.out.println("Username tidak boleh memiliki simbol / huruf kapital! / spasi");
                break;
            }
        }
    }

    public void login() {

    }
}
