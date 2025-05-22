package com.kodilla;

interface Telephone {
        void callTo(String name);

        default void callToMom() {
            System.out.println("I am calling to my mom!");
        }
}

class Mobile implements Telephone {
        public void callTo(String name) {
            System.out.println("Calling to " + name);
        }
}
class Application {
        public static void main (String[] args){
            Mobile mobile = new Mobile();
            mobile.callTo("Adam");
            mobile.callToMom();
        }

}
