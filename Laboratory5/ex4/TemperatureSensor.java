package pacuraru.fabian.lab5.ex4;

import java.util.Random;

public class TemperatureSensor extends Sensor {
    public int readValue() {
        Random temperature = new Random();
        return temperature.nextInt(100);
    }
}
