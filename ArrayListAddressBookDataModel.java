package addressbook;

import java.io.Serializable;
import java.util.*;

public class ArrayListAddressBookDataModel implements Serializable, AddressBookDataModel {
    private ArrayList<Person> persons;
    
    public ArrayListAddressBookDataModel() {
        persons = new ArrayList<Person>();
    }
    
    @Override
    public void addPerson( Person p ) {
        persons.add( p );
    }

    @Override
    public Iterator<Person> iterator() {
        return persons.iterator();
    }
}
