import java.io.*;
class Device{
    String brand;
    double price;
    
    
    Device(String theBrand, double price){
        this.brand = theBrand;
        this.price = price;
        
        int fake_price = 4;
        copy = Copy(fake_price);
        //add();
        fake_price = addFakePrice(fake_price);

    }

    void activate() {
        int x;
        float y;
        String hh;

        System.out.println(this.brand);
    }
   
    void add() {
        price *= 2;
    }
    
    int addFakePrice(int fp) {
        fp = fp * 2;
        return fp;
    
    }

    void hhh() {
    
    }
}

class TestDevice {
    TestDevice() {
        Device d1 = new Device("hehe", 1.2);
        Device d2 = new Device("hh", 1.3);
        d1.activate();
        d2.activate();
    }

    public static void main(String[] args) {
        TestDevice t = new TestDevice();
    }
}
