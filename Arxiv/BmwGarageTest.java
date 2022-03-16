package Arxiv;

import Arxiv.BmwGarage;

public class BmwGarageTest {
    public static void main(String[] args) {
        BmwGarage vehicle1 = new BmwGarage("bmw", "black", 740, 240);
        BmwGarage vehicle2 = new BmwGarage("bmw", "red", 320, 360);
        System.out.println(vehicle1.getColor());
    }
}

