package com.game.CharacterProperties;

import com.game.Weapon;

public interface IMelee {
    Weapon getSelectedWeapon();
    void attack(int side);

}
