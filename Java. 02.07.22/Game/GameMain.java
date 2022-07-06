package com.telran.berlin.pratice.Lesson4.Game;

import com.telran.berlin.pratice.Lesson4.Game.hero.Elf;
import com.telran.berlin.pratice.Lesson4.Game.hero.Ork;

public class GameMain {

    public static void main(String[] args) {
        Elf elf1 = new Elf();
        Elf elf2 = new Elf(2);
        Elf elf3 = new Elf(3);
        elf1.setName("Vasja");
        System.out.println("Elf id = " + elf1.getId());
        System.out.println("Elf id = " + elf2.getId());
        System.out.println("Elf id = " + elf3.getId());
        System.out.println("Elf magic = " + elf3.getMagic());

        Ork ork1 = new Ork();
        Ork ork2 = new Ork(1);
        Ork ork3 = new Ork(2);
        ork2.setName("Oleg");
        System.out.println("Ork id = " + ork1.getId());
        System.out.println("Ork id = " + ork2.getId());
        System.out.println("Ork id = " + ork3.getId());
        System.out.println("Ork magic = " + ork3.getMagic());
        System.out.println("Ork Name = " + ork2.getName());
    }
}
