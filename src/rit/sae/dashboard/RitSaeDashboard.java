package rit.sae.dashboard;

import com.digi.xbee.api.XBeeDevice;
import com.digi.xbee.api.exceptions.XBeeException;
import rit.sae.dashboard.dataListeners.LaserRecieverListener;

/**
 *
 * @author Camilo Gonzalez and Jon Turinese
 */
public class RitSaeDashboard {

    private static final String PORT = "COM1";
    private static final int BAUD_RATE = 9600;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
