public class makanan extends Produk {
    private String kategori;

    public makanan(String name, int price, String kategori) {
       super(name, price);
       this.kategori = kategori;
    }
}
