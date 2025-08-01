
interface Shape {

        void draw();

    }

    class Application {

        public static void main(String args[]) {

            Shape circle = new Circle();
            Shape triangle = new Triangle();
            Shape square = new Square();

            ShapeDrawer shapeDrawer = new ShapeDrawer(circle);

            shapeDrawer.process();

        }

    }

    class Circle implements Shape {

        public void draw() {
            System.out.println("I am drawing a Circle!");
        }

    }

    class Square implements Shape {

        public void draw() {
            System.out.println("I am drawing a Square!");
        }

    }

    class Triangle implements Shape {

        public void draw() {
            System.out.println("I am drawing a Triangle!");
        }

    }


    class ShapeDrawer {

        private Shape cos;

        public ShapeDrawer(Shape inne) {
            this.cos = inne;
        }

        public void process() {
            System.out.println("Starting drawing choosen shape...");
            this.cos.draw();
            System.out.println("Shape has been drawn");
        }

    }

