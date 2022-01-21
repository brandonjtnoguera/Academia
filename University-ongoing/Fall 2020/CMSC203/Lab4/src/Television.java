/**
 *The purpose of this class is to model a television
 *Your name, 25/09/20
 */

public class Television {

    private boolean powerOn;
    private int channel;
    private int volume;

    private final int SCREEN_SIZE;
    private final String MANUFACTURER;

    public Television(String brand, int size){
        SCREEN_SIZE = size;
        MANUFACTURER = brand;
        powerOn = false;
        channel = 2;
        volume  = 20;
    }

    public int getChannel(){
        return channel;
    }

    public int getVolume(){
        return volume;
    }

    public String getManufacturer(){
        return MANUFACTURER;
    }

    public int getScreenSize(){
        return SCREEN_SIZE;
    }

    public void setChannel(int station){
        this.channel = station;
    }

    public void power(){
        powerOn = !powerOn;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }









}
