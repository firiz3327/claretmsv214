package net.swordie.ms.enums;

import java.util.Arrays;

public enum EventType {
    NormalBalrog(0, "Normal Balrog"),
    MysticBalrog(1, "Mystic Balrog"),
    EasyZakum(2, "Easy Zakum"),
    NormalZakum(3, "Normal Zakum"),
    ChaosZakum(4, "Chaos Zakum"),
    Queen(5, "Normal Crimson Queen"),
    CQueen(6, "Chaos Crimson Queen"),
    Clown(7, "Normal Pierre"),
    CClown(8, "Chaos Pierre"),
    VonBon(9, "Normal VonBon"),
    CVonBon(10, "Chaos VonBon"),
    Vellum(11, "Normal Vellum"),
    CVellum(12, "Chaos Vellum"),
    NMagnus(13, "Normal Magnus"),
    HMagnus(14, "Hard Magnus"),
    Lotus(15, "Normal Lotus"),
    CLotus(16, "Chaos Lotus"),
    Gollux(17, "Gollux"),
    EasyArkarium(18, "Easy Arkarium"),
    Arkarium(19, "Arkarium"),
    Dorothy(20, "Dorothy"),
    PrincessNO(21, "PrincessNo"),
    Hilla(22, "Hilla"),
    HHilla(23, "Hard Hilla"),
    EHorntail(24, "Easy Horntail"),
    Horntail(25, "Normal Horntail"),
    CHorntail(26, "Chaos Horntail"),
    EVonLeon(27, "Easy VonLeon"),
    VonLeon(28, "VonLeon"),
    Pinkbean(29, "Pinkbean"),
    CPinkbean(30, "Chaos Pinkbean"),
    Damien(31, "Damien"),
    Ranmaru(32, "Ranmaru"),
    CRanmaru(33, "Chaos Ranmaru"),
    Cygnus(34, "Cygnus"),
    CCygnus(35, "Chaos Cygnus"),
    ;

    private int val;
    private String name;

    EventType(int val) {
        this.val = val;
    }

    EventType(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public static EventType getByVal(int val) {
        return Arrays.stream(values()).filter(gdt -> gdt.getVal() == val).findAny().orElse(null);
    }

    public String getName() {
        return name;
    }

    public int getVal() {
        return val;
    }

}