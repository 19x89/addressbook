package addressbook;

import java.awt.*;

public class AddressBookMainFrame extends Frame {
    public AddressBookMainFrame( PersonPanel personPanel, Button newButton ) {
        super( "Adressbuch" );
        setBackground( Color.LIGHT_GRAY );
        add( personPanel, BorderLayout.NORTH );
        
        Panel southPanel = new Panel();
        southPanel.add( newButton );
        add( southPanel, BorderLayout.SOUTH );
        setSize( 500, 500 );
        setLocationRelativeTo( null );
        setVisible( true );
    }
}
