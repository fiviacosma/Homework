package tema3.client;

import tema3.hobby.Address.Address;
import tema3.hobby.Address.Country;
import tema3.hobby.Frequency;
import tema3.hobby.Hobby;
import tema3.person.Employee;
import tema3.person.Person;
import tema3.person.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String... args) {

        Hobby cycling = new Hobby("Cycling", Frequency.THREE_TIMES.getFrequencyValue());
        cycling.setHobbyAdressList(new Address("Baii", "27A", new Country("Romania")));

        Hobby swimming = new Hobby("Swimming", Frequency.FIVE_TIMES.getFrequencyValue());
        Country belgium = new Country("Belgium");
        Address swimmingAddress1 = new Address("Titulescu", "5", belgium);

        Hobby fitness = new Hobby("Fitness", Frequency.ONCE.getFrequencyValue());

        Employee fivia = new Employee("Fivia Cosma", 27, "QA", "Arobs");
        fivia.setHobbyList(swimming);

        Student madalina = new Student("Madalina Berar", 25, "UMF");
        madalina.setHobbyList(cycling);
        madalina.setHobbyList(fitness);


        Map<Person, List<Hobby>> persons = new HashMap<>();
        persons.put(fivia, fivia.getHobbyList());
        persons.put(madalina, madalina.getHobbyList());

    }

}
