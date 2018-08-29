
public class Person implements Comparable<Person> {

    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person person) {
       return this.getFirstName().compareTo(person.firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
