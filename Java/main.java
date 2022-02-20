import java.io.PrintStream;

public class main {
    public static void main(String[] args) {
        memory laptop = new memory();
        memory laptop2 = new memory();
    
        laptop.setIdProduct("LD 08");
        laptop.setBrand("Dell");
        laptop.setModel("inspirion 8");
        laptop.setPrice("Rp. 12.500.000");
        laptop.setFrequency("18 Gbps");
        laptop.setMemorySize("128GB");
        laptop.setSupportsCuda("Support");
    
        laptop2.setIdProduct("LH 04");
        laptop2.setBrand("hp");
        laptop2.setModel("pavillion gaming");
        laptop2.setPrice("Rp. 14.500.000");
        laptop2.setFrequency("18 Gbps");
        laptop2.setMemorySize("128GB");
        laptop2.setSupportsCuda("Support");

        System.out.println("=========================================");
        System.out.println("Product ID : " + laptop.getIdProduct());
        System.out.println("Brand : " + laptop.getBrand());
        System.out.println("Model : " + laptop.getModel());
        System.out.println("Harga : " + laptop.getPrice());
        System.out.println("Frequency : " + laptop.getFrequency());
        System.out.println("Memory Size : " + laptop.getMemorySize());
        System.out.println("Cuda Cores : " + laptop.getSupportsCuda());
        System.out.println("=========================================");

        System.out.println("=========================================");
        System.out.println("Product ID : " + laptop2.getIdProduct());        
        System.out.println("Brand : " + laptop2.getBrand());
        System.out.println("Model : " + laptop2.getModel());
        System.out.println("Price : " + laptop2.getPrice());
        System.out.println("Frequency : " + laptop2.getFrequency());
        System.out.println("Memory Size : " + laptop2.getMemorySize());
        System.out.println("Cuda Cores : " + laptop2.getSupportsCuda());
        System.out.println("=========================================");
        
    }
}
