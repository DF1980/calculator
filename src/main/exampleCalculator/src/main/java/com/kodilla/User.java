package com.kodilla;

    class User {
        private String name;
        private String sex;

        public User(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }
        public String getName() {
            return this.name;
        }
        public String getSex() {
            return this.sex;
        }
    }

    class Application1 {

        public static void main(String[] args) {

            User andrew = new User("Andrew", "male");

            String name = andrew.getName();
            String sex = andrew.getSex();

            System.out.println(sex + " " + name);
        }
    }

