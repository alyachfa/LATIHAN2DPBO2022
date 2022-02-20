#include <string>
#include <iostream>
#include "Memory.cpp"

using namespace std;

int main(int argc, char const *argv[])
{
    Memory laptop;
    Memory laptop2;

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

    cout << "========================================="<< endl;
    cout << "Product ID : " << laptop.getIdProduct() << endl;
    cout << "Brand : " << laptop.getBrand() << endl;
    cout << "Model : " << laptop.getModel() << endl;
    cout << "Price : " << laptop.getPrice() << endl;
    cout << "Frequency : " << laptop.getFrequency() << endl;
    cout << "Memory Size : " << laptop.getMemorySize() << endl;
    cout << "Cuda Cores : " << laptop.getSupportsCuda() << endl;
    cout << "========================================="<< endl;

    cout << "========================================="<< endl;
    cout << "Product ID : " << laptop2.getIdProduct() << endl;
    cout << "Brand : " << laptop2.getBrand() << endl;
    cout << "Model : " << laptop2.getModel() << endl;
    cout << "Price : " << laptop2.getPrice() << endl;
    cout << "Frequency : " << laptop2.getFrequency() << endl;
    cout << "Memory Size : " << laptop2.getMemorySize() << endl;
    cout << "Cuda Cores : " << laptop2.getSupportsCuda() << endl;
    cout << "========================================="<< endl;
    
    return 0;
}