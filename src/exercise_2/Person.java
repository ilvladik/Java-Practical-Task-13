package exercise_2;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getInitials() {
        if (!firstName.isEmpty() && !patronymic.isEmpty()) {
            return lastName + " " + firstName.charAt(0) + "." + patronymic.charAt(0);
        } else {
            return lastName;
        }
    }
}
