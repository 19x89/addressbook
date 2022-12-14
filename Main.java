package addressbook;

import java.awt.*;
import java.io.File;

/*
Die Hauptklasse ist zum Starten des Programms 
sowie das Erzeugen und Verbinden alle drei Teilsysteme.
*/

public class Main {
    private static final String ADDRESSBOOK_DEFAULT_NAME = "test.ab";
    private SerializationToFilePersistence persistence;
    private AddressBookDataModel model;
    private Frame mainFrame;
    private Controller controller;
    
    public Main() throws AddressBookException {
        initModelAndPersistence();
        PersonPanel personPanel = new PersonPanel( model );
        Button newPersonButton = new Button( "Neuer Eintrag" );
        mainFrame = new AddressBookMainFrame( personPanel, newPersonButton );
        controller = new Controller( model, personPanel, persistence, mainFrame );
        newPersonButton.addActionListener( controller );
        mainFrame.addWindowListener( controller );
        mainFrame.setVisible( true );
    }
    
    private void initModelAndPersistence() throws AddressBookException {
        String addressBookDirPath = System.getProperty( "user.home" ) + "/addressbooks";
        File addressBookDir = new File( addressBookDirPath );
        addressBookDir.mkdir();
        String addressBookPath = addressBookDirPath + "/" + ADDRESSBOOK_DEFAULT_NAME;
        persistence = new SerializationToFilePersistence( addressBookPath );
        File addressBookFile = new File( addressBookPath );
        if( addressBookFile.exists() ) {
            System.out.println( "Adressbuchdatei gefunden, lade Adressbuch." );
            model = persistence.loadBook();
        } else {
            System.out.println( "Adressbuchdatei nicht gefunden, erstelle neues Adressbuch." );
            model = new ArrayListAddressBookDataModel();
        }
    }
    
    public static void main( String[] args ) throws AddressBookException {
        new Main();
    }
}
