
import java.util.Random;
import java.util.Scanner;

/*
class Product {
    String name;
    int price;

    public void print() {
        System.out.println("name : " + name);
        System.out.println("price : " + price);
    }
}

class Pen extends Product {
    String color;

    @Override
    public void print() {
        super.print();
        System.out.println(color);
    }
}

class Computer extends Product {
    String cpu;
    int ram;
    int hdd;

    public void print() {
        super.print();
        System.out.println("cpu : " + cpu);
        System.out.println("ram : " + ram);
        System.out.println("hdd : " + hdd);

    }
}

class Laptop extends Computer {
    double weight;
    int battery;

    public void print() {
        super.print();
        System.out.println("weight : " + weight + "kg");
        System.out.println("battery : " + battery + "시간");
    }
}

class Store {
    String name;
    int price;

    public void print() {
        System.out.println("name : " + name);
        System.out.println("price : " + price);
    }
}

class beverage extends Store {
    String size;
    String temperature;

    public void print() {
        super.print();
        System.out.println("size : " + size);
        System.out.println("temperature : " + temperature);

    }
}

class Gimbap extends Store {
    public void print() {
        super.print();
    }
}

class Alchole extends Store {
    int degree;

    public void print() {
        super.print();
        System.out.println("degree : " + degree + "도");
    }
}

class Person{
    String name;

}

*/
class MyRandom extends Random {
    @Override
    public int nextInt() {

        return 0;
    }
}

public class Play extends MyRandom {
    public static void main(String[] args) {
        /* Computer cp = new Computer();
        Laptop lt = new Laptop();
        lt.name = "매직 스테이션 234";
        lt.cpu = "i7-1234";
        lt.ram = 16;
        lt.hdd = 512;
        lt.weight = 3;
        lt.battery = 2;

        lt.print();
        beverage beverage = new beverage();
        Gimbap gimbap = new Gimbap();
        Alchole alchole = new Alchole();

        beverage.name = "아메리카노";
        beverage.price = 3000;
        beverage.size = "tall";
        beverage.temperature = "hot";

        beverage.print();
        System.out.println("=================================");

        gimbap.name = "우영우 김밥";
        gimbap.price = 5000;
        gimbap.print();
        System.out.println("=================================");

        alchole.name = "원 소주";
        alchole.price = 5000;
        alchole.degree = 35;
        alchole.print();
*/
        Scanner sc = new Scanner(System.in);
        MyRandom rd = new MyRandom();

        System.out.print("num : ");
        int num = sc.nextInt();


    }
}


