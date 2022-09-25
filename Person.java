package addressbook;

import java.io.Serializable;

/* 
MVC-Teil: Model 
Personen-Objekte besitzen Instanzvariablen für Vorname, Nachname und Telefonnummer,
die in einer ArrayList mit Elementtyp Person aufbewahrt werden.
*/

public class Person implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String phone;
    
    public Person( String firstName, String lastName, String phone ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getPhone() {
        return phone;
    }
}
