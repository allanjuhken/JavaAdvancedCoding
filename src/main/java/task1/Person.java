package task1;

public class Person {
    // fields
    private String fullName;
    private int age;
    private Gender gender;

    //constructor
    public Person(String fullName, int age, Gender gender) throws InvalidAgeException{
        if (age < 0 || age > 120) throw new InvalidAgeException("Age must be between 0 and 120");
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Person(Person person){
        this.fullName = person.getFullName();
        this.age = person.getAge();
        this.gender = person.getGender();
    }

    // getters / setters
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) throw new InvalidAgeException("Age must be between 0 and 120");
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // methods/ behaviours


//    @Override
//    public String toString() {
//        return "Person{" +
//                "fullName='" + fullName + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
//    }

}
