package ru.netology.radio;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            setCurrentStation(currentStation + 1);
        } else {
            setCurrentStation(currentStation = 0);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setCurrentStation(currentStation = 9);

        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }
}

