package rit.sae.dashboard;

import com.digi.xbee.api.XBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;
import rit.sae.dashboard.dataListeners.LaserRecieverListener;
import rit.sae.ui.Mainframe;

/**
 *
 * @author Camilo Gonzalez and Jon Turinese
 */
public class RitSaeDashboard {

    private static final String PORT = "COM3";
    private static final int BAUD_RATE = 9600;
    
    public Mainframe mainFrame = new Mainframe();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mainframe.main(args);
        XBeeDevice myDevice = new XBeeDevice(PORT, BAUD_RATE);
		
        try {
            myDevice.open();
            myDevice.addDataListener(new LaserRecieverListener());		
            System.out.println("\n>> Waiting for data...");
            
	} catch (XBeeException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
