package com.game.Entities.CharacterProperties;

import com.game.Weapon;

public interface IMelee {
    Weapon getSelectedWeapon();
    void attack(int side);

}
