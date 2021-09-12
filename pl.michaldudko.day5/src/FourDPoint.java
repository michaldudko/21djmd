
import java.awt.Point;

class FourDPoint extends Point {
    int z;
    int t;


    FourDPoint(int x, int y, int inZ, int inT) {
        super(x, y);
        this.z = inZ;
        this.t = inT;
    }

    public static void main(String[] args) {
        FourDPoint fdp = new FourDPoint(4, 4, 15, 25);
        System.out.println("x wynosi: " + fdp.x);
        System.out.println("y wynosi: " + fdp.y);
        System.out.println("z wynosi: " + fdp.z);
        System.out.println("t wynosi: " + fdp.t);

    }

}