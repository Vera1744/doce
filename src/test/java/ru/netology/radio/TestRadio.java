package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouldSetNumberStation() {
        Radio rad = new Radio();

        rad.setNumberStation(15);

        int expected = 15;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NotshouldSetNumberStation() {
        Radio rad = new Radio();

        rad.setNumberStation(-15);

        int expected = 10;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsMaxMinusOne() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationsMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationsMaxFlexMinusOne() {
        Radio rad = new Radio(21);

        rad.setCurrentStation(19);

        int expected = 19;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationsMaxFlex() {
        Radio rad = new Radio(21);

        rad.setCurrentStation(20);

        int expected = 20;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMaxFlex() {
        Radio rad = new Radio(21);

        rad.setCurrentStation(21);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMinPlusOne() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.nextStation();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationReturnToStart() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationReturnToStartFlex() {
        Radio rad = new Radio(31);
        rad.setCurrentStation(30);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationReturnToEnd() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = rad.getNumberStation() -1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 99;

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio rad = new Radio();
        rad.currentVolume = 100;

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolume() {
        Radio rad = new Radio();
        rad.currentVolume = 1;

        rad.downVolume();

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownVolumeMin() {
        Radio rad = new Radio();
        rad.currentVolume = 0;

        rad.downVolume();

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}

