class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }
    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null &&  !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }

    }

    public String getFullName() {
        if (lastName.isEmpty() && firstName.isEmpty()) return "Unknown";
        if (firstName.equals("")) return lastName;
        if (lastName.equals("")) return firstName;
        return firstName + " " + lastName; // write your code here
    }
}