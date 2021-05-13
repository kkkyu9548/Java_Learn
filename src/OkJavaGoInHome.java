import com.kkkyu9548.iot.Eleavtor;
import com.kkkyu9548.iot.Lighting;
import com.kkkyu9548.iot.Security;

public class OkJavaGoInHome {

    public static void main(String[] args) {

        String id = "JAVA APT 901";

//        Elevator call
        Eleavtor myElevator = new Eleavtor(id);
        myElevator.callForUp(1);

//        Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

//        Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();
        Lighting floorLamp = new Lighting(id+" / floor Lamp");
        hallLamp.on();

    }
}
