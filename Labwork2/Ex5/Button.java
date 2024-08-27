package Labwork2.Ex5;

public class Button {
    String label, color;

    public Button(){

    }

    public Button(String label, String color){
        this.label = label;
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
        System.out.println("Changed successfully");
    }

    public void setLabel(String label){
        this.label = label;
        System.out.println("Changed successfully");
    }

    public void dePress(){
        System.out.println("The button is depressed!!!");
    }

    public void unDepress(){
        System.out.println("The button is undepressed!!!");
    }
}
