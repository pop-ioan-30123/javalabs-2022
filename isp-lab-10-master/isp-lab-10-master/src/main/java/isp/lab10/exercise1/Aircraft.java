/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab10.exercise1;

/**
 *
 * @author ionic
 */
public class Aircraft extends Thread implements Runnable {

    private String id;
    private int altitude;
    private String state;
    private long time;

    public Aircraft(String id) {
        this.id = id;
        this.state="On Stand";
    }
    
    public Aircraft(String id, int altitude) {
        this.id = id;
        this.altitude=altitude;
        this.state="On Stand";
    }

    public String getID() {
        return this.id;
    }

    public int getAltitude() {
        return this.altitude;
    }
    

    public String getStateA() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state=state;
    }
    
    public void setTime(long time) {
        this.time=time;
    }
    
    public long getTime() {
        return this.time;
    }
    
    public void executeCommand(AtcCommand a) {
        a.execute();
    }

    public void recieveAtcMessage(AtcMessage msg) {
        state = msg.getmsg();
    }

    @Override
    public void run() {
        //run
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Aircraft objkey = (Aircraft) obj;
        if (this.id == objkey.id) {
            return true;
        } else {
            return false;
        }
    }
}
