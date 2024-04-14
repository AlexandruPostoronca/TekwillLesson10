class Cat {

    // write static and instance variables
     static String nume;
     static int age;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.nume = name;
        if (this.age < 5) {
            this.age = this.age+age;
        } else {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return age;
    }
}