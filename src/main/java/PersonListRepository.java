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
    public int getPersonCountsByGender(Gender gender) {
        return (int) persons.stream().filter(person -> person.gender().equals(gender)).count();
    }

    @Override
    public Optional<Person> findById(int id) {
        return persons.stream().filter(person -> person.id() == id).findFirst();
    }
}
