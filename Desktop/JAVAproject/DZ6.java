// Класс Notebook:


// public class Notebook {
//     private String brand;
//     private String model;
//     private int ram;
//     private int storage;
//     private String os;
//     private String color;

//     public Notebook(String brand, String model, int ram, int storage, String os, String color) {
//         this.brand = brand;
//         this.model = model;
//         this.ram = ram;
//         this.storage = storage;
//         this.os = os;
//         this.color = color;
//     }

//     public String getBrand() {
//         return brand;
//     }

//     public void setBrand(String brand) {
//         this.brand = brand;
//     }

//     public String getModel() {
//         return model;
//     }

//     public void setModel(String model) {
//         this.model = model;
//     }

//     public int getRam() {
//         return ram;
//     }

//     public void setRam(int ram) {
//         this.ram = ram;
//     }

//     public int getStorage() {
//         return storage;
//     }

//     public void setStorage(int storage) {
//         this.storage = storage;
//     }

//     public String getOs() {
//         return os;
//     }

//     public void setOs(String os) {
//         this.os = os;
//     }

//     public String getColor() {
//         return color;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public String toString() {
//         return brand + " " + model + " RAM: " + ram + ", Storage: " + storage + ", OS: " + os + ", Color: " + color;
//     }
// }


// Пример создания нескольких ноутбуков:


// List<Notebook> notebooks = new ArrayList<>();
// notebooks.add(new Notebook("Apple", "MacBook Air", 8, 256, "macOS", "Gold"));
// notebooks.add(new Notebook("Dell", "XPS 13", 16, 512, "Windows 10 Pro", "Silver"));
// notebooks.add(new Notebook("HP", "Spectre x360", 16, 1_000, "Windows 10 Home", "Black"));


// Метод для фильтрации ноутбуков:


// public static List<Notebook> filterNotebooks(List<Notebook> notebooks, Map<String, Object> filters) {
//     List<Notebook> filteredNotebooks = new ArrayList<>();

//     for (Notebook notebook : notebooks) {
//         if (filters.containsKey("brand")) {
//             if (!notebook.getBrand().equals(filters.get("brand"))) {
//                 continue;
//             }
//         }
//         if (filters.containsKey("model")) {
//             if (!notebook.getModel().equals(filters.get("model"))) {
//                 continue;
//             }
//         }
//         if (filters.containsKey("ram")) {
//             if (notebook.getRam() < (int) filters.get("ram")) {
//                 continue;
//             }
//         }
//         if (filters.containsKey("storage")) {
//             if (notebook.getStorage() < (int) filters.get("storage")) {
//                 continue;
//             }
//         }
//         if (filters.containsKey("os")) {
//             if (!notebook.getOs().equals(filters.get("os"))) {
//                 continue;
//             }
//         }
//         if (filters.containsKey("color")) {
//             if (!notebook.getColor().equals(filters.get("color"))) {
//                 continue;
//             }
//         }
//         filteredNotebooks.add(notebook);
//     }

//     return filteredNotebooks;
// }


// Пример использования метода:


// Map<String, Object> filters = new HashMap<>();
// filters.put("brand", "Apple");
// filters.put("ram", 8);

// List<Notebook> filteredNotebooks = filterNotebooks(notebooks, filters);
// for (Notebook notebook : filteredNotebooks) {
//     System.out.println(notebook);
// }
