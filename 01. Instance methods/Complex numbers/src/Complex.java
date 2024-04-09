class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex num) {
        this.real += num.real;// this.real = 10 + 6 = 16
        this.image += num.image;// this.image = 4 + 6 = 10
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}