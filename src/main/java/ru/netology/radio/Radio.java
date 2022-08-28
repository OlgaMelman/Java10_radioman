package ru.netology.radio;

public class Radio {
    private int currentNumberRadio;
    private int maxNumberRadio;
    private int currentVolume;


    public Radio(int newCountRadio) {
        maxNumberRadio = newCountRadio - 1;
    }

    public Radio() {
        maxNumberRadio = 9;
    }

    public int getCurrentNumberRadio() { //запросить данные
        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int newCurrentNumberRadio) { //изменить данные
        if (newCurrentNumberRadio < 0) {
            return;
        }
        if (newCurrentNumberRadio > maxNumberRadio) {
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
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentNumberRadio < maxNumberRadio) {
            currentNumberRadio = currentNumberRadio + 1;
        } else {
            currentNumberRadio = 0;
        }
    }

    public void prev() {
        if (currentNumberRadio > 0) {
            currentNumberRadio = currentNumberRadio - 1;
        } else {
            currentNumberRadio = maxNumberRadio;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
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








