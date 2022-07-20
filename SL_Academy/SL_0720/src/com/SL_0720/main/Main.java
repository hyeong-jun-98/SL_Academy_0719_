package com.SL_0720.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Computer computer = new Computer("길동",16,500);

        System.out.println(computer.getHdd());


    }
}
