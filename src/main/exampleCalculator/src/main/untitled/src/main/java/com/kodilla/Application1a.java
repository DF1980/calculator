package com.kodilla;

public class Application1a {


        public static void main(String[] args) {

            User1a ktos = new User1a("Andrew", "male");

            String name = ktos.getName();
            String sex = ktos.getSex();

            System.out.println(name + " " + sex);
        }
    }


