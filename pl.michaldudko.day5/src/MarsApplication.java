class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot("eksploracja", 2, -60);


        spirit.showAttributes();
        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zwiększenie temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzanie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("\n\n\n");
        MarsRobot opportunity = new MarsRobot("eksploracja", 2, -50);

        opportunity.showAttributes();
        System.out.println("Zwiększenie prędkości do 4");
        opportunity.speed = 4;
        System.out.println("Zwiększenie temperatury na -80");
        opportunity.temperature = -80;
        opportunity.showAttributes();
        System.out.println("Sprawdzanie temperatury");
        opportunity.checkTemperature();
        opportunity.showAttributes();

    }
}
