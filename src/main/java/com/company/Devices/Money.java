package com.company.Devices;

public class Money {
    private int money;

    public Money(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void addMoney(int amount) {
        money += amount;
    }

    public void substractMoney(int amount) {
        money -= amount;
    }

    public boolean isBrokeOut() {
        return money < 0;
    }
}
