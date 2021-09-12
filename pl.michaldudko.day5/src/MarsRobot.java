class MarsRobot {
    String status;
    int speed;
    float temperature;

    public MarsRobot(String status, int speed, float temperature) {
        this.status = status;
        this.speed = speed;
        this.temperature = temperature;
    }

    void checkTemperature() {
        if (temperature < -62) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + this.status);
        System.out.println("Prędkość: " + this.speed);
        System.out.println("Temperatura: " + this.temperature);
    }
}
