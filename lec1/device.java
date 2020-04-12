import java.io.*;
class Device{
    String brand;
    double price;
    Device(String theBrand, double price){
        this.brand = theBrand;
        this.price = price;
    }

    void activate() {
        System.out.println(this.brand);
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
