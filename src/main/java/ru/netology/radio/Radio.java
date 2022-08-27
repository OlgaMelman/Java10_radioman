package ru.netology.radio;

public class Radio {

    private int currentNumberRadio;
    private int currentVolume;

    public int getCurrentNumberRadio() { //запросить данные
        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int newCurrentNumberRadio) { //изменить данные
        if (newCurrentNumberRadio < 0) {
            return;
        }
        if (newCurrentNumberRadio > 9) {
            return;
        }
        currentNumberRadio = newCurrentNumberRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentNumberRadio < 9) {
            currentNumberRadio = currentNumberRadio + 1;
        } else {
            currentNumberRadio = 0;
        }
    }

    public void prev() {
        if (currentNumberRadio > 0) {
            currentNumberRadio = currentNumberRadio - 1;
        } else {
            currentNumberRadio = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }

    }
}








