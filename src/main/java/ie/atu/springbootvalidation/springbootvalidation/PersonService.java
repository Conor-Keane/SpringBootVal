package ie.atu.springbootvalidation.springbootvalidation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmployeeId(String employeeId) {
        Person myPerson = new Person("Conor", "Mr", employeeId, 22, "g00391846@atu.ie", "intern", "Test services");
        return myPerson;

    }
}
