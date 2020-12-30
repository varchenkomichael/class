package com.company;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
int range1, range2 ;
minivan.passengers = 7;
minivan.fuelcap = 16;
minivan.mpg = 21;
sportscar.passengers = 2;
sportscar.mpg = 14;
sportscar.fuelcap = 12;
range2 = sportscar.fuelcap * sportscar.mpg;
range1 = minivan.fuelcap * minivan.mpg;
System.out.println("мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль");
System.out.println("спорткар может перевезти " + sportscar.passengers + " пассажиров на расстояние " + range2 + " миль");
   }
}
