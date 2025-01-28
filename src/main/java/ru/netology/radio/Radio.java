package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int numberStation = 10;

    public Radio() {}

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getNumberStation() {
        return numberStation;
    }
    public void setNumberStation(int newNumberStation) {
        if (newNumberStation <0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > numberStation -1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < numberStation -1) {
            setCurrentStation(currentStation + 1);
        } else {
            setCurrentStation(currentStation = 0);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setCurrentStation(currentStation = numberStation-1);

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

