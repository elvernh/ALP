import java.util.*;

public class Start {
    Scanner sc = new Scanner(System.in);

    void Start() {
        String opsi, opsi2;
        do {
            System.out.printf("""
                    Halo, User//ini nanti ganti pake nama user yg login
                    Mau ngapain?
                    [1] Lihat barang
                    [2] Top up Yophee Pay
                    [3] Lihat barang favorit
                    [4] Lihat Keranjang
                    [5] Lihat pengiriman
                    [6] Tambah hari
                    [7] Lihat Voucher
                    [8] Sign out
                    Opsi:
                    """);
            opsi2 = sc.next();

            switch (opsi2) {
                case "1":
                    tampilanBarang();
                    break;

                case "2":
                    tampilanTopUp();
                    break;

                case "3":
                    tampilanBarangFavorit();
                    break;

                case "4":
                    tampilanKeranjang();
                    break;

                case "5":
                    tampilanPengiriman();
                    break;

                case "6":
                    tambahHari();
                    break;

                case "7":
                    tampilanVoucher();
                    break;

                case "8":
                    // signout
                    break;

                default:
                System.out.println("Pilihan tidak valid! Masukin ulang dong");
                    break;
            }
            // }

        } while (true);
    }

    void tampilanBarang() {

    }

    void tampilanTopUp() {

    }

    void tampilanBarangFavorit() {

    }

    void tampilanKeranjang() {

    }

    void tampilanPengiriman() {

    }

    void tambahHari() {

    }

    void tampilanVoucher() {

    }
}
