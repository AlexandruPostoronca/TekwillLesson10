class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        ++speed;
    }

    public void brake() {
        if (speed > 0) {
            --speed;
        }
    }
}