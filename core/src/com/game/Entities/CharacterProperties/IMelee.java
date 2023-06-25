package com.game.Entities.CharacterProperties;


public interface IMelee {
    Weapon getSelectedWeapon();

    void attack(int side);

}
