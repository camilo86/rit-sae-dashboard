package rit.sae.dashboard.dataListeners;

import com.digi.xbee.api.listeners.IDataReceiveListener;
import com.digi.xbee.api.models.XBeeMessage;
import java.util.Timer;

/**
 *
 * @author Camilo Gonzalez
 */
public class LaserRecieverListener implements IDataReceiveListener{
    
    @Override
    public void dataReceived(XBeeMessage xbeeMessage) {
        System.out.println("Recieved: " + new String(xbeeMessage.getData()));
    }
    
}
