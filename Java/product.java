public class product {
    private String price;
    private String idProduct;

    public product() {

    }

    public product(String price, String idProduct) {
        this.price = price;
        this.idProduct = idProduct;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }
    
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
    
    public String getIdProduct() {
        return this.idProduct;
    }



}