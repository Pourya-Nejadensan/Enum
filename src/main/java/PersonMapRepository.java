import java.util.*;

public class PersonMapRepository implements PersonRepository{
    private Map<Integer, Person> persons;

    public PersonMapRepository() {
        this.persons = new HashMap<>();
    }

    public void addPerson(Person person){
        persons.put(person.id(), person);
    }

    @Override
    public int getPersonCountsByGender(Gender gender) {
        return (int) persons.values().stream().filter(person -> person.gender() == gender).count();
    }

    @Override
    public Optional<Person> findById(int id) {
        return Optional.ofNullable(persons.get(id));
    }
}
