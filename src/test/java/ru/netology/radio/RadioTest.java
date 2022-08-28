package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void changeCountRadio() {
        Radio radio = new Radio(40);
        radio.setCurrentNumberRadio(36);

        int expected = 36;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8,9",
            "9,0",
            "0,1",
            "1,2"
    })
    public void setNumberNext(int newCurrentNumberRadio, int expected) {
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
        radio.setCurrentNumberRadio(newCurrentNumberRadio);

        radio.prev();

        //int expected = 9;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void chooseNumber() {
        radio.setCurrentNumberRadio(3);

        int expected = 3;
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,2",
            "98,99",
            "99,100",
            "100,100"
    })
    public void upVolume(int newCurrentVolume, int expected) { // можно параметризированным сделать
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
            "100,99",
            "99,98"
    })
    public void downVolume(int newCurrentVolume, int expected) { // можно параметризированным сделать
        radio.setCurrentVolume(newCurrentVolume);

        radio.decreaseVolume();

        //int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "102,0"
    })
    public void setUnrealVolume(int newCurrentVolume, int expected) {
        radio.setCurrentVolume(newCurrentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
