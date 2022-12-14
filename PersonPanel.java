package addressbook;

import java.awt.*;
import java.util.Iterator;

/*
MVC-Teil: View
Die Klasse füllt das Hauptfenster mit den Daten aus dem Datenmodell (mit den Personen-Objekten).
*/

public class PersonPanel extends Panel {
    private AddressBookDataModel model;
    
    private static final Color EVEN_ROW_COLOR = new Color( 240, 240, 255 );
    private static final Color ODD_ROW_COLOR = new Color( 255, 255, 240 );
    
    public PersonPanel( AddressBookDataModel model ) {
        this.model = model;
        setBackground( Color.BLACK );
        setLayout( new GridLayout( 0, 3, 0, 1 ) );
        refresh();
    }
    
    // Wenn ein neues Personen-Objekt hinzufügt ist -> 
    // alle Daten von dem PersonenPanel werden gelöscht und erneut (mit den neuen Daten) erzeugt.
    public void refresh() {
        removeAll();
        boolean isEvenRowNumber = true;
        Iterator<Person> iterator = model.iterator();
        while( iterator.hasNext() ) {
            Person person = iterator.next();
            Color rowColor = isEvenRowNumber ? EVEN_ROW_COLOR : ODD_ROW_COLOR;
            Label firstNameLabel = new Label( person.getFirstName() );
            firstNameLabel.setBackground( rowColor );
            add( firstNameLabel );
            Label lastNameLabel = new Label( person.getLastName() );
            lastNameLabel.setBackground( rowColor );
            add( lastNameLabel );
            Label phoneLabel = new Label( person.getPhone() );
            phoneLabel.setBackground( rowColor );
            add( phoneLabel );
            isEvenRowNumber = !isEvenRowNumber;
        }
        revalidate();
    }
}
