class MarsApplication {
    public static void main(String[] arguments){
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed =2;
        spirit.temperature=-60;

        spirit.showAttributes();
        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed=3;
        spirit.showAttributes();
        System.out.println("Zwiększenie temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzanie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("\n\n\n");
        MarsRobot opportunity = new MarsRobot();
        opportunity.status ="eksploracja";
        opportunity.speed = 2;
        opportunity.temperature=-50;

        opportunity.showAttributes();
        System.out.println("Zwiększenie prędkości do 4");
        opportunity.speed = 4;
        System.out.println("Zwiększenie temperatury na -80");
        opportunity.temperature=-80;
        opportunity.showAttributes();
        System.out.println("Sprawdzanie temperatury");
        opportunity.checkTemperature();
        opportunity.showAttributes();

    }
}
