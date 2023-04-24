import java.text.CollationKey;

class Product {
    private String name;
    private double price;
    
    // конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // гет и сет
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // переопределение метода toString()
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

// наследник класса Product
class HotDrink extends Product {
    private int temperature;
    
    // конструктор с вызовом конструктора родителя
    public HotDrink(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }
    
    // гет и сет для дополнительного поля
    public int getTemperature() {
        return temperature;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    // переопределение метода toString()
    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", temperature=" + temperature +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // создание объектов класса HotDrink
        HotDrink coffee = new HotDrink("Coffee", 2.5, 70);
        HotDrink tea = new HotDrink("Tea", 2.0, 80);
        HotDrink cola = new HotDrink("Cola", 3.0, 65);
        
        // вывод информации о созданных напитках
        System.out.println(coffee);
        System.out.println(tea);
        System.out.println(cola);
    }
}
