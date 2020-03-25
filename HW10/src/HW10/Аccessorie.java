package HW10;

public class Аccessorie {

    int priceАccessorie;
    String nameАccessorie;

    public Аccessorie(int priceАccessorie, String nameАccessorie) {
        this.priceАccessorie = priceАccessorie;
        this.nameАccessorie = nameАccessorie;
    }

    public Аccessorie() {
    }

    public double getPriceАccessorie()
    {
        return priceАccessorie;
    }

    public void setPriceАccessorie(int priceАccessorie)
    {
        this.priceАccessorie = priceАccessorie;
    }

    public String getNameАccessorie()
    {
        return nameАccessorie;
    }

    public void setNameАccessorie(String nameАccessorie)
    {
        this.nameАccessorie = nameАccessorie;
    }

    @Override
    public String toString() {
        return "Аccessorie{" +
                "priceАccessorie=" + priceАccessorie +
                ", nameАccessorie='" + nameАccessorie + '\'' +
                '}';
    }
}
