package com.game.Entities.CharacterProperties;

public class Weapon {
    private Integer dmg;
    private Integer range;

    public Integer getDmg() {
        return dmg;
    }

    public void setDmg(Integer dmg) {
        this.dmg = dmg;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Weapon(Integer dmg, Integer range) {
        this.dmg = dmg;
        this.range = range;
    }
}
