public class Minuman extends Produk {
    private String kategori;

    public Minuman(String name, int price, String kategori) {
        super(name, price);
        this.kategori = kategori;
    }
}
