package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "hitPoints - " + this.hitPoints);
        values.add(2, "strength - " + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues != null && savedValues.size() > 0)
        {
            this.name = savedValues.get(0);
            String hitPoints = savedValues.get(1);
            String intHitPoints = hitPoints.replace("hitPoints - ", "");
            this.hitPoints = Integer.parseInt(intHitPoints);
            String strength = savedValues.get(2);
            String intStrength = strength.replace("strength - ", "");
            this.strength = Integer.parseInt(intStrength);
            this.weapon = savedValues.get(3);
        }
    }
}

