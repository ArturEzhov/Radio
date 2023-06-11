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

    @Test
    public void stationDecrement() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBorderDecrement() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.more();

        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDecrement() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.less();

        int actual = radio.getCurrentVolume();
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBorderDecrement() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.less();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBorderIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.more();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBorderIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.more();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUnderNorm() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeOverNorm() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationConstr() {

        int stationsCount =20;
        Radio radio = new Radio (stationsCount);
        radio.setCurrentStation(16);

        int actual = radio.getCurrentStation();
        int expected = 16;
        Assertions.assertEquals(expected, actual);
    }


}
