public class Produk {
    String name, desc;
    int price;

    public Produk(String name, String desc, int price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
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
}
