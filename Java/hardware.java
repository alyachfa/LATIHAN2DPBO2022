public class hardware extends product {
    private String brand;
    private String model;

    public hardware() {

    }

    public hardware(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getModel() {
        return model;
    }
}