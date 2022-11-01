package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Elevator elevator1 = new Elevator((short) 24, 480);
    Elevator elevator2 = new Elevator((short) 28, 650);

    Person person;

    boolean flag1 = true, flag2 = true;

    String name;
    int weight;
    short floor;

    do {
      if (flag1) {
        System.out.println("Введите данные человека: ");
        System.out.println("Имя");
        name = scanner.next();
        System.out.println("Вес в кг");
        weight = scanner.nextInt();
        System.out.println("Какой этаж нужен?");
        floor = scanner.nextShort();
        person = new Person(name, weight, floor);
        flag1 = elevator1.addPerson(person);
      }

      if (flag2) {
        System.out.println("Введите данные человека: ");
        System.out.println("Имя");
        name = scanner.next();
        System.out.println("Вес в кг");
        weight = scanner.nextInt();
        System.out.println("Какой этаж нужен?");
        floor = scanner.nextShort();
        person = new Person(name, weight, floor);
        flag2 = elevator2.addPerson(person);
      }

    } while (flag1 || flag2);
  }

}