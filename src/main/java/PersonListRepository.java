import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonListRepository implements PersonRepository{
    private List<Person> persons;

    public PersonListRepository() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    @Override
    public Optional<Person> findById(int id) {
        return persons.stream().filter(person -> person.id() == id).findFirst();
    }
}
