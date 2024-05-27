public class Minuman extends Produk {
    protected String kategori;
    public Minuman(String name, int price) {
        super(name, price);
        this.kategori = "Minuman";
    }
}
