// Design and implement a class called Bulb that represents a light bulb that can be turned on and off.
// -   Create a driver class called Lights, whose main method instantiates and turns on some Bulb objects
package Week6;

public class Lights {
    public static void main(String[] args) {
        Bulb ledbulb = new Bulb("on");
        Bulb lcdbulb = new Bulb("off");

        System.out.println(ledbulb.toString());
        System.out.println(lcdbulb.toString());

    }
}

class Bulb {
    private String bulbState;

public Bulb(String bulbState){
     this.bulbState=bulbState;
}
public void setBulbState(String bulbState){
    this.bulbState=bulbState;
}
public String getBulbState(){
    return bulbState;
}
public String toString(){
    return "The bulb string is: "+bulbState;
}
}

