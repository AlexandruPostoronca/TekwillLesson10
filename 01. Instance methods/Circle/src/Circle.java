class Circle {

    double radius;

    // write methods here
    double pi = Math.PI;

    public double getLength() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * Math.pow(radius,2);
    }
}