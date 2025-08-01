
interface NazwaInterfejsu {

    void nazwaMetodyInterfejsu();

}

class Application1  {

    public static void main(String args[]) {

        NazwaInterfejsu kolo = new Circle();
        NazwaInterfejsu trojkat = new Triangle();
        NazwaInterfejsu kwadrat = new Square();

        ShapeDrawer objektShapeDrawer = new ShapeDrawer(kolo);

        objektShapeDrawer.process();

    }

}

class Circle implements NazwaInterfejsu {

    public void nazwaMetodyInterfejsu() {
        System.out.println("I am drawing a Circle!");
    }

}

class Square implements NazwaInterfejsu {

    public void nazwaMetodyInterfejsu() {
        System.out.println("I am drawing a Square!");
    }

}

class Triangle implements NazwaInterfejsu {

    public void nazwaMetodyInterfejsu() {
        System.out.println("I am drawing a Triangle!");
    }

}


class ShapeDrawer {

    private NazwaInterfejsu cos;

    public ShapeDrawer(NazwaInterfejsu inne) {
        this.cos = inne;
    }

    public void process() {
        System.out.println("Starting drawing choosen shape...");
        this.cos.nazwaMetodyInterfejsu();
        System.out.println("Shape has been drawn");
    }

}

