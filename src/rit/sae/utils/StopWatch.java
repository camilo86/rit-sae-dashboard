package rit.sae.utils;

/**
 *
 * @author Camilo Gonzalez
 */
public class StopWatch {
    
    private long startTime;
    private long stopTime;
    
    /**
     * Creates instance of StopWatch class
     */
    public StopWatch() {
        this.startTime = 0;
        this.stopTime = 0;
    }
    
    /**
     * Starts stopwatch
     */
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    
    /**
     * Stops stopwatch
     */
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }
    
    /**
     * Gets the time lapse
     * @return Delta time
     */
    public long getDelta() {
        return this.stopTime - this.startTime;
    }
    
    /**
     * Gets start and stop stopwatch values
     * @return String represessntation of stopwatch
     */
    public String toString() {
        return "Start: " + this.startTime + ", Stop: " + this.stopTime;
    }
    
    public void reset() {
        this.startTime = System.currentTimeMillis();
        this.stopTime = 0;
    
    }
}
