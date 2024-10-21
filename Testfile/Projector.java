package Testfile;

public class Projector {
    private String brand;
    private String model;
    private String resolution;
    private int brightness;
    private boolean powerStatus = true; //Turn on projector

    public Projector(String brand, String model, String resolution, int brightness){
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.brightness = brightness;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getResolution() {
        return resolution;
    }

    public int getBrightness() {
        return brightness;
    }

    public void pullDown(){
        // this.powerStatus = true;
        // System.out.println("Projector is ON");

        if(powerStatus == true){
            System.out.println("Projector is being pulled down");
        }
        else{
            System.out.println("Projector is OFF. Please turn it ON");
        }
    }

    public void pullUp(){
        if(powerStatus == true){
            System.out.println("Projector is being pulled up");
        }
        else{
            System.out.println("Projector is OFF. Please turn it ON");
        }
        powerStatus = false; //Turn off projector
    }

    public void stop(){
        if(powerStatus == true){
            System.out.println("Projector has been stopped");
            powerStatus = false;
        }
        else{
            System.out.println("Projector is OFF. Please turn it ON");
        }
    }
}
