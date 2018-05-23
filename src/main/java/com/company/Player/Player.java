package com.company.Player;

public class Player {
    private int position = 1;
    private int id;
    private String name;
    private int howManyDebit = 0;

    private int money = 20000;
    private boolean house = false;
    private boolean insure = false;
    private boolean armchair = false;
    private boolean couch = false;
    private boolean kitchenFurniture = false;
    private boolean hoover = false;
    private boolean tv = false;
    private boolean bed = false;
    private boolean washingMachine = false;
    private boolean radio = false;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean hasHouse(){
        return isHouse();
    }

    public void alreadyHaveFurniture() {
        System.out.println("You already have: ");
        if (isBed()) {
            System.out.println("-Bed");
        }
        if (isKitchenFurniture()) {
            System.out.println("-Kitchen furniture");
        }
        if (isCouch()) {
            System.out.println("-Couch");
        }
        if (isArmchair()) {
            System.out.println("-Armchair");
        }
    }
    public void alreadyHaveElectro(){
        System.out.println("You already have: ");
        if(isRadio()){
            System.out.println("-Radio");
        }
        if (isTv()){
            System.out.println("-TV");
        }
        if (isWashingMachine()){
            System.out.println("-Washing Machine");
        }
        if (isHoover()){
            System.out.println("-Hoover");
        }
    }

    public boolean isWin(Player player){
        return howManyDebit == 0 && house && armchair && couch && kitchenFurniture && hoover && tv && bed && washingMachine && radio;
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

    public int getCurrentPosition() {
        return position;
    }

    public int setPosition(int position) {
        this.position = position;
        return position;
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

    public int getHowManyDebit() {
        return howManyDebit;
    }

    public void setHowManyDebit(int howManyDebit) {
        this.howManyDebit = howManyDebit;
    }

    @Override
    public String toString() {
        return " " + name;
    }
}
