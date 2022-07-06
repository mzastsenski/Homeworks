package com.telran.berlin.pratice.Lesson4.Game.hero;

import com.telran.berlin.pratice.Lesson4.Game.constant.Constant;

public class Elf {
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

    public int getMagic() {
        return magic;
    }
    public Elf() {

    }
    public Elf(int id) {
        this.id = id;
        this.power = Constant.ELF_POWER;
        this.charisma = Constant.ELF_CHARISMA;
        this.magic = Constant.ELF_MAGIC;
    }

//    public Elf(int id, int power, int charisma, int magic) {
//        this.id = id;
//        this.power = power;
//        this.charisma = charisma;
//        this.magic = magic;
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFortune() {
        return fortune;
    }

    public void setFortune(int fortune) {
        this.fortune = fortune;
    }


}
