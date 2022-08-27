package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "8,9",
            "9,0",
            "0,1",
            "1,2"
    })
    public void setNumberNext(int newCurrentNumberRadio, int expected) {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(newCurrentNumberRadio);

        radio.next();

        //int expected = 0;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "10,0"
    })
    public void setUnrealNumberRadio(int newCurrentNumberRadio, int expected) {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(newCurrentNumberRadio);

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,8",
            "8,7",
            "1,0",
            "0,9"
    })
    public void setNumberPrev(int newCurrentNumberRadio, int expected) {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(newCurrentNumberRadio);

        radio.prev();

        //int expected = 9;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void chooseNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumberRadio(3);

        int expected = 3;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "8,9",
            "9,10",
            "10,10"
    })
    public void upVolume(int newCurrentVolume, int expected) { // можно параметризированным сделать
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        radio.increaseVolume();

        //int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,0",
            "10,9",
            "9,8"
    })
    public void downVolume(int newCurrentVolume, int expected) { // можно параметризированным сделать
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        radio.decreaseVolume();

        //int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "11,0"
    })
    public void setUnrealVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(newCurrentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
