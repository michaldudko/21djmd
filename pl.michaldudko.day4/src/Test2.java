public class Test2 {
    public static void main (String [] arguments){
        float x = 9;
        float y= 5;
        int z = (int)(x/y);
        switch (z) {
            case 1:
                x = x+2;
                System.out.println("Wartość x1 = "+ x);
            case 2: x=x +3;
                System.out.println("Wartość x2 = "+ x);
            default:
                x=x+1;
                System.out.println("Wartość x3 = "+ x);
        }
        System.out.println("Wartość x4 = "+ x);
    }
}
