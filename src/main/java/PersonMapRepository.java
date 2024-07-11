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
    public Optional<Person> findById(int id) {
        return Optional.ofNullable(persons.get(id));
    }
}
