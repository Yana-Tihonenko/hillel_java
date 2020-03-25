package HW10;

public class Flower {
    int priceFlower;
    int levelFreshFlower;
    int lengthFlower;
    String nameFlower;

    public Flower(int priceFlower, int levelFreshFlower, int lengthFlower, String nameFlower) {
        this.priceFlower = priceFlower;
        this.levelFreshFlower = levelFreshFlower;
        this.lengthFlower = lengthFlower;
        this.nameFlower = nameFlower;
    }

    public Flower() {
    }

    public int getPriceFlower() {
        return priceFlower;
    }

    public void setPriceFlower(int priceFlower) {
        this.priceFlower =  priceFlower;
    }

    public int getLevelFreshFlower() {
        return levelFreshFlower;
    }

    public void setLevelFreshFlower(int levelFreshFlower) {
        this.levelFreshFlower = levelFreshFlower;
    }

    public int getLengthFlower() {
        return lengthFlower;
    }

    public void setLengthFlower(int lengthFlower) {
        this.lengthFlower = lengthFlower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "priceFlower=" + priceFlower +
                ", levelFreshFlower=" + levelFreshFlower +
                ", lengthFlower=" + lengthFlower +
                ", nameFlower='" + nameFlower + '\'' +
                '}';
    }
}
