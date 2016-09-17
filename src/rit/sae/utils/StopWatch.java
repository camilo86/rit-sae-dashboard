package rit.sae.utils;

/**
 *
 * @author Camilo Gonzalez
 */
public class StopWatch {
    
    private long startTime;
    private long stopTime;
    private boolean isStarted;
    
    /**
     * Creates instance of StopWatch class
     */
    public StopWatch() {
        this.startTime = 0;
        this.stopTime = 0;
        this.isStarted = false;
    }
    
    /**
     * Starts stopwatch
     */
    public void start() {
        this.startTime = System.currentTimeMillis();
        this.isStarted = true;
    }
    
    /**
     * Stops stopwatch
     */
    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.isStarted = false;
    }
    
    /**
     * Resets stopwatch and starts it again
     */
    public void reset() {
        this.startTime = 0;
        this.stopTime = 0;
        this.isStarted = false;
    
    }
    
    /**
     * Gets the time lapse
     * @return Delta time
     */
    public long getDelta() {
        return this.stopTime - this.startTime;
    }
    
    /**
     * Gets current status of stopwatch
     * @return has stopwatch started running
     */
    public boolean isStarted() {
        return this.isStarted;
    }
    
    /**
     * Gets start and stop stopwatch values
     * @return String representation of stopwatch
     */
    public String toString() {
        return "Start: " + this.startTime + ", Stop: " + this.stopTime + ", started?: " + this.isStarted;
    }
}
