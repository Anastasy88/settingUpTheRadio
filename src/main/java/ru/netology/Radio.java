package ru.netology;

public class Radio {
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int stationNumber = minStationNumber;
    private int minVolumeLevel = 0;
    private int maxVolumeLevel = 100;
    private int volumeLevel = minVolumeLevel;

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber - 1;
    }

    public Radio() {

    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < minStationNumber) {
            return;
        }
        if (stationNumber > maxStationNumber) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getMinVolumeLevel() {
        return minVolumeLevel;
    }

    public int getMaxVolumeLevel() {
        return maxVolumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel < minVolumeLevel) {
            return;
        }
        if (volumeLevel > maxVolumeLevel) {
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
        if (volumeLevel < maxVolumeLevel) {
            volumeLevel = volumeLevel + 1;
        } else {
            volumeLevel = 100;
        }
    }


    public void ReduceSound() {
        if (volumeLevel > 0) {
            volumeLevel = volumeLevel - 1;
        } else {
            volumeLevel = 0;
        }
    }
}