package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Алтынбек";
        System.out.println(name);
        int vozrast = 33;
        System.out.println("У Вас возраст " + vozrast);
        int temperatura = 20;
        System.out.println("Температура за окном " + temperatura + " градусов");


        if (vozrast > 20 && vozrast < 45 && temperatura < 30 && temperatura > -20)
            System.out.println("Можно идти гулять");
        else if (vozrast < 20 && temperatura > 0 && temperatura < 28)
            System.out.println("Можно идти гулять");
        else if (vozrast > 45 && temperatura > -10 && temperatura < 25)
            System.out.println("Можно идти гулять");
        else {
            System.out.println("Рекомедую остатся дома");

        }
        System.out.println("С уважением Ваш помощник И.И.");

    }
}
