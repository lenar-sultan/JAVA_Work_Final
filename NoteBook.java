public class NoteBook {
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public NoteBook(String model, int ram, int storage, String os, String color) {
      this.model = model;
      this.ram = ram;
      this.storage = storage;
      this.os = os;
      this.color = color;
    }

    public String getModel() {
        return model;
    }
  
    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    } 




    public void info() {
        System.out.println(this.model + " " + this.ram + " " + this.storage + " " + this.os + " " + this.color);
    }

    @Override 
    public String toString() {
        return this.model + " <- Модель Цвет -> " + this.color;
    }
}