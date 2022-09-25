package addressbook;

/*
MVC-Teil: Modell
Für das Weiterreichen von Ausnahmen (mit Hilfe von Exception-Chainings),
die beim Laden oder Speichern von Adressbüchern auftreten können,
ist diese Exception-Klasse erstellt.
*/

public class AddressBookException extends Exception {
    public AddressBookException( String message ) {
        super( message );
    }
    
    public AddressBookException( Throwable cause ) {
        super( cause );
    }
}
