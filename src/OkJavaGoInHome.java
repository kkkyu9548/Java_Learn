import com.kkkyu9548.iot.Eleavtor;
import com.kkkyu9548.iot.Lighting;
import com.kkkyu9548.iot.Security;

public class OkJavaGoInHome {

    public static void main(String[] args) {

        String id = "JAVA APT 901";

//        Elevator call
        Eleavtor myElevator = new Eleavtor("JAVA APT 901");
        myElevator.callForUp(1);

//        Security off
        Security mySecurity = new Security("JAVA APT 901");
        mySecurity.off();

//        Light on
        Lighting hallLamp = new Lighting("JAVA APT 901 / Hall Lamp");
        hallLamp.on();
        Lighting floorLamp = new Lighting("JAVA APT 901 / Hall Lamp");
        hallLamp.off();

    }
}
