public class InstanceCounter {
    private static int numInstances = 0;

    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }
    public static void main(String[] arguments){
        System.out.println("Rozpoczynanie z "+ InstanceCounter.getCount()+" obiektów");
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
        }
        System.out.println("Utworzono "+ InstanceCounter.getCount()+ " obiektów");
    }

}
