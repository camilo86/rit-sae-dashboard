package rit.sae.dashboard.dataListeners;

import com.digi.xbee.api.listeners.IDataReceiveListener;
import com.digi.xbee.api.models.XBeeMessage;
import java.util.Timer;
import rit.sae.utils.StopWatch;

/**
 *
 * @author Camilo Gonzalez
 */
public class LaserRecieverListener implements IDataReceiveListener{
    
    private StopWatch stopWatch = new StopWatch();
    
    @Override
    public void dataReceived(XBeeMessage xbeeMessage) {
        if(stopWatch.isStarted()) {
            stopWatch.stop();
            System.out.print("\n New Lap: \n" + stopWatch.toString());
            stopWatch.reset();
            stopWatch.start();
        }else {
            stopWatch.start();
        }
    }
}