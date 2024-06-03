public class Flower {
    String name;
    int petals;
    float price;

    Flower() {
        name = "";
        petals = 0;
        price = 0;
    }

    Flower(String n, int p, float pr) {
        name = n;
        petals = p;
        price = pr;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPetals(int p) {
        petals = p;
    }

    public void setPrice(float p) {
        price = p;
    }

    public String getName() {
        return name;
    }

    public int getPetals() {
        return petals;
    }

    public float getPrice() {
        return price;
    }

    public String toString() {
        return name + ":" + petals + ":" + price;
    }

}
