package task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDatabase {

    private TreeMap<String, Person> persons;

    // constructor
    public PersonDatabase(){
        this.persons = new TreeMap<>();
    }

    // behaviours

    // add person to TreeMap list with age filter in method
    public void addPerson(Person person) {
        AgeFilter plusEighteen = checkPerson -> {
            if (checkPerson.getAge() < 18) {
                System.out.println("Under 18");
                return false;
            }
            return true;
        };
        persons.put(person.getFullName(), person);
    }

    // get person by name
    public Person getPerson(String name){
        return persons.get(name);
    }

    // remove person from TreeMap list
    public void removePerson(String name){
        persons.remove(name);
    }

    // filter by gender
    public List<Person> filterByGender(Gender gender){
        List<Person> result  = new ArrayList<>();
        for (Person person : persons.values()){
            if (person.getGender().equals(gender)) {
                result.add(person);
            }
        }
        return result;
    }

    // Average age with Stream
    public double getAverageAge(){
        return persons
                .values()
                .stream()
                .mapToInt(person -> person.getAge()) // (Person::getAge)
                .average()
                .orElse(0.0);
    }

    // get oldest person with Stream
    public Person getOldestPerson() {
        return persons
                .values()
                .stream()
                .max(Comparator.comparingInt(person -> person.getAge()))
                .orElse(null);
    }

}
