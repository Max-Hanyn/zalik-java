package zav2;

public class Material {

    private String type;
    private int price;

    public Material(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
