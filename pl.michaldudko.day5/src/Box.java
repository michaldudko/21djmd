import java.awt.Point;

class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    Box buildBox(Point topLeft, Point bottomRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;
    }

    Box buildBox(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
        return this;
    }

    void printBox() {
        System.out.print("Box: <" + x1 + "," + y1);
        System.out.println("," + x2 + "," + y2 + ">");
    }

    public static void main(String[] args) {
        Box rect = new Box();

        System.out.println("Wywołanie buildBox ze " + "współrzędnymi (25,25)i(50,50):");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();

        System.out.println("\nWywołanie buildBox ze " + "współrzędnymi (10,10)i(20,20):");
        rect.buildBox(new Point(10, 10), new Point(20, 20));
        rect.printBox();

        System.out.println("\nWywołanie buildBox z " + "punktem (10,10), szerokością 50 i wysokością 50:");

        rect.buildBox(new Point(10, 10), 50, 50);
        rect.printBox();
    }
}
