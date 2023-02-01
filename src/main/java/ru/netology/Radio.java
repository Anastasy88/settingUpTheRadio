package ru.netology;

public class Radio {
    private int stationNumber;
    private int volumeLevel;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > 9) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel < 0) {
            return;
        }
        if (volumeLevel > 10) {
            return;
        }
        this.volumeLevel = volumeLevel;
    }

    public void next() {
        if (stationNumber != 9) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber != 0) {
            stationNumber--;
        } else {
            stationNumber = 9;
        }
    }

    public void AddSound() {
        if (volumeLevel < 10) {
            volumeLevel = volumeLevel + 1;
        } else {
            volumeLevel = 10;
        }
    }


    public void ReduceSound(){
        if (volumeLevel > 0) {
            volumeLevel = volumeLevel -1;
        } else {
            volumeLevel = 0;
        }
    }
}