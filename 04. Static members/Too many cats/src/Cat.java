class Cat {

    // write static and instance variables
     static String nume;
     static int age;
    private static int counter=0;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats

        if (counter < 5) {
            ++counter;
            this.nume = name;
            this.age = age;
        } else {
            ++counter;
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}