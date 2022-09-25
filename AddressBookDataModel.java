package addressbook;

import java.util.Iterator;

/*
MVC-Teil: Modell
Diese Schnittstelle erleichtert zukünftigen Äderungen, wenn das Datenmodell geändert wird
(z.B. von ArrayList zur Datenbank)
*/

public interface AddressBookDataModel {
    void addPerson( Person p );
    
    Iterator<Person> iterator();
}
