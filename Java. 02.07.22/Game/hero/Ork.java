package com.telran.berlin.pratice.Lesson4.Game.hero;

import com.telran.berlin.pratice.Lesson4.Game.constant.Constant;

public class Ork {

    private int id;
    private String name;
    private String color;
    private int age;
    private boolean gender;
    private int level;
    private int fortune;

    private int power;
    private int charisma;
    private int magic;

    public Ork() {

    }

    public Ork(int id) {
        this.id = id;
        this.power = Constant.ORK_POWER;
        this.charisma = Constant.ORK_CHARISMA;
        this.magic = Constant.ORK_MAGIC;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public int getFortune() {
        return fortune;
    }

    public int getPower() {
        return power;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getMagic() {
        return magic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
