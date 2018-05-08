package com.company;

public class Player {
    private int money = 25000;
    private boolean house = false;
    private boolean insure = false;

    private int totalWalk = 0;
    private int position = 0;
    private int id;
    private String name;

    private boolean armchair = false;
    private boolean couch = false;
    private boolean kitchenFurniture = false;
    private boolean hoover = false;
    private boolean tv = true;
    private boolean bed = false;
    private boolean washingMachine = false;
    private boolean radio = false;

    private boolean debit = false;
    private int howManyDebit = 0;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Player() {

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isHouse() {
        return house;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }

    public boolean isInsure() {
        return insure;
    }

    public void setInsure(boolean insure) {
        this.insure = insure;
    }

    public int getTotalWalk() {
        return totalWalk;
    }

    public int nextTurn() {
        return totalWalk++;
    }


    public void setTotalWalk(int totalWalk) {
        this.totalWalk = totalWalk;
    }

    public int getCurrentPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isArmchair() {
        return armchair;
    }

    public void setArmchair(boolean armchair) {
        this.armchair = armchair;
    }

    public boolean isCouch() {
        return couch;
    }

    public void setCouch(boolean couch) {
        this.couch = couch;
    }

    public boolean isKitchenFurniture() {
        return kitchenFurniture;
    }

    public void setKitchenFurniture(boolean kitchenFurniture) {
        this.kitchenFurniture = kitchenFurniture;
    }

    public boolean isHoover() {
        return hoover;
    }

    public void setHoover(boolean hoover) {
        this.hoover = hoover;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public boolean isWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public int getHowManyDebit() {
        return howManyDebit;
    }

    public void setHowManyDebit(int howManyDebit) {
        this.howManyDebit = howManyDebit;
    }

}
