import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PersonRepository personListRepository = new PersonListRepository();
        PersonRepository personMapRepository = new PersonMapRepository();

        personListRepository.addPerson(new Person(1, "Alice", DaysOfWeek.MONDAY));
        personListRepository.addPerson(new Person(2, "Bob", DaysOfWeek.SATURDAY));

        personMapRepository.addPerson(new Person(1, "Alice", DaysOfWeek.MONDAY));
        personMapRepository.addPerson(new Person(2, "Bob", DaysOfWeek.SATURDAY));

        int searchId = 2;

        Optional<Person> personListOptional = personListRepository.findById(searchId);
        Optional<Person> personMapOptional = personMapRepository.findById(searchId);

        if (personListOptional.isPresent()) {
            Person person = personListOptional.get();
            System.out.println("Name : " + person.name());
            System.out.println("Favorite Day : " + DayChecker.checkDay(person.favoriteDay()));
        } else {
            System.out.println("Person not found");
        }

        if (personMapOptional.isPresent()) {
            Person person = personMapOptional.get();
            System.out.println("Name : " + person.name());
            System.out.println("Favorite Day : " + DayChecker.checkDay(person.favoriteDay()));
        } else {
            System.out.println("Person not found");
        }
    }
}
