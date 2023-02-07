package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void EnableAValidStationNumber() {  //Выставление валидной станции в середине

        Radio radio = new Radio();

        radio.setStationNumber(4);

        int expected = 4;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EnableTheFirstValidStationNumber() {  //Выставление первой валидной станции

        Radio radio = new Radio();

        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EnableTheLastValidStationNumber() {  //Выставление последней валидной станции

        Radio radio = new Radio();

        radio.setStationNumber(9);

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EnableTheSecondValidStationNumber() {  //Выставление второй валидной станции

        Radio radio = new Radio();

        radio.setStationNumber(1);

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EnableThePenultimateValidStationNumber() {  //Выставление предпоследней валидной станции

        Radio radio = new Radio();

        radio.setStationNumber(8);

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void IncludeAnInvalidStationNumberWithAnUpperValue() {  //Проверка верхнего не валидного значения

        Radio radio = new Radio();

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncludeAnInvalidStationNumberWithALowerValue() {  //Проверка нижнего не валидного значения

        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingFromTheFirstStationForward() {  //Переключение вперед с первого верхнего значения

        Radio radio = new Radio();
        radio.setStationNumber(0);

        radio.next();

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingFromTheSecondStationForward() {  //Переключение вперед со второго верхнего значения

        Radio radio = new Radio();
        radio.setStationNumber(1);

        radio.next();

        int expected = 2;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingFromThePenultimateStationForward() {  //Переключение вперед с предпоследнего нижнего значения

        Radio radio = new Radio();
        radio.setStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingFromTheLastStationForward() {  //Переключение вперед с последнего нижнего значения

        Radio radio = new Radio();
        radio.setStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingFromTheMiddleStationForward() {  //Переключение средней станции вперед

        Radio radio = new Radio();
        radio.setStationNumber(5);

        radio.next();

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingFromTheFirstStationBack() {  //Переключение с первой станции назад

        Radio radio = new Radio();
        radio.setStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingBackFromTheSecondStation() {  //Переключение со второй станции назад

        Radio radio = new Radio();
        radio.setStationNumber(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingStationsInTheMiddleBack() {  //Переключение станции в середине назад

        Radio radio = new Radio();
        radio.setStationNumber(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingThePenultimateStationBack() {  //Переключение предпоследней станции  назад

        Radio radio = new Radio();
        radio.setStationNumber(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SwitchingTheLastStationBack() {  //Переключение последней станции назад

        Radio radio = new Radio();
        radio.setStationNumber(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNegativeVolume() {  //Выставить громкость меньше минимального значения

        Radio radio = new Radio();

        radio.setVolumeLevel(-1);

        int expected = 0;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void SetVolumeGreaterThanMax() {  //Выставить громкость больше максимального значения

        Radio radio = new Radio();

        radio.setVolumeLevel(101);

        int expected = 0;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AddSoundToFirstVolume() {   //Прибавить звук к первому верхнему значению
        Radio radio = new Radio();
        radio.setVolumeLevel(0);

        radio.AddSound();

        int expected = 1;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AddSoundToSecondVolume() {   //Прибавить звук ко второму верхнему значению
        Radio radio = new Radio();
        radio.setVolumeLevel(1);

        radio.AddSound();

        int expected = 2;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void AddSoundToMiddleValue() {   //Прибавить звук среднему значению
        Radio radio = new Radio();
        radio.setVolumeLevel(50);

        radio.AddSound();

        int expected = 51;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AddSoundToPenultimateLowValue() {   //Прибавить звук к предпоследнему нижнему значению
        Radio radio = new Radio();
        radio.setVolumeLevel(99);

        radio.AddSound();

        int expected = 100;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AddSoundToLastLowValue() {   //Прибавить звук к последнему нижнему значению
        Radio radio = new Radio();
        radio.setVolumeLevel(100);

        radio.AddSound();

        int expected = 100;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnDownTheMinimumVolume() { //Убавить минимальную громкость
        Radio radio = new Radio();
        radio.setVolumeLevel(0);

        radio.ReduceSound();

        int expected = 0;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void DecreaseSecondMinimumVolume() { //Убавить вторую минимальную громкость
        Radio radio = new Radio();
        radio.setVolumeLevel(1);

        radio.ReduceSound();

        int expected = 0;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void TurnDownTheMiddleVolume() { //Убавить среднюю громкость
        Radio radio = new Radio();
        radio.setVolumeLevel(50);

        radio.ReduceSound();

        int expected = 49;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnDownTheVolumeOfTheSecondLowerValue() { //Убавить громкость второго нижнего значения
        Radio radio = new Radio();
        radio.setVolumeLevel(99);

        radio.ReduceSound();

        int expected = 98;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnDownTheMaximumVolume() { //Убавить максимальную громкость
        Radio radio = new Radio();
        radio.setVolumeLevel(100);

        radio.ReduceSound();

        int expected = 99;
        int actual = radio.getVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testRadioStationNumber() {
        Radio rad = new Radio(10);

        Assertions.assertEquals(9, rad.getMaxStationNumber());
        Assertions.assertEquals(0, rad.getMinStationNumber());
    }

    @Test
    public void testVolume() {
        Radio rad = new Radio();

        Assertions.assertEquals(0, rad.getMinVolumeLevel());
        Assertions.assertEquals(100, rad.getMaxVolumeLevel());
    }
}