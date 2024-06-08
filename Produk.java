public class Produk {
    private String name, desc;
    private int price, jumlah;
    private String kategori;
    

    public Produk(String name, String desc, int price, String kategori, int jumlah) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.kategori = kategori;
        this.jumlah = jumlah;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
