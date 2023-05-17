// Создаем класс Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

// Создаем класс HotDrink, наследник класса Product
class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", temperature=" + temperature +
                '}';
    }
}

// Класс с методом main, в котором добавляем горячие напитки в автомат и воспроизводим логику
public class Main {
    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("Coffee", 2.0, 90);
        HotDrink tea = new HotDrink("Tea", 1.5, 85);

        System.out.println(coffee);
        System.out.println(tea);
    }
}
