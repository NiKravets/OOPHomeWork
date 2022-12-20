package lecture;

import java.util.List;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private Integer age;
    private Personal subordinates;

    public Personal getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<User> subordinates) {
        this.subordinates = new Personal(subordinates);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", getFirstName(), getLastName(), getAge());
    }


    @Override
    public int compareTo(User o) {
        return (this.firstName + this.lastName).compareTo(o.firstName + o.lastName);
        /*return this.age.compareTo(o.age);*/
    }
}
