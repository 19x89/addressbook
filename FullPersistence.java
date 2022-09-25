package addressbook;

/*
MVC-Teil: Modell
Damit die Möglichkeit bleibt, später zu anderen Formen der Persistenz zu wechseln,
ist diesen Interfacetyp erstellt.
*/

public interface FullPersistence {
    AddressBookDataModel loadBook() throws AddressBookException;
    
    void storeBook( AddressBookDataModel book ) throws AddressBookException;
}
