package com.SL_0720.main;

 class Pen {    //
//    String name;
//    int price;
//
//    public Pen(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public void print() {
//        System.out.println(name);
//        System.out.println(price);
//    }
}


class Computer {
     // 항상 변수설정을 (멤버변수)할 때 private으로 설정한다.
    private String name;
    private int ram;
    private int hdd;

    // DTO javaBEAM

    public Computer (){

    }

    public Computer(String name, int ram, int hdd) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}
