import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationSelection() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationUnderNorm() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOverNorm() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationZeroSwitch() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationIncrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}
