package ie.atu.springbootvalidation.springbootvalidation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }

    public Person getPersonByEmployeeId(String employeeId) {
        System.out.println("Person ID");
        return null;
    }
}