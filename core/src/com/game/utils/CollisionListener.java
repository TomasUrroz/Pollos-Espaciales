package com.game.utils;

import com.badlogic.gdx.physics.box2d.*;
import com.game.Entities.Egg;
import com.game.Entities.Enemies.Zombie;
import com.game.Entities.Player;

public class CollisionListener implements ContactListener {

    @Override
    public void beginContact(Contact contact) {
        Body bodyA = contact.getFixtureA().getBody();
        Body bodyB = contact.getFixtureB().getBody();

        //WEBO ZOMBIE
        if (bodyA.getUserData() instanceof Zombie && bodyB.getUserData() instanceof Egg) {
            Zombie ZombieA = (Zombie) bodyA.getUserData();
            Egg egg = (Egg) bodyB.getUserData();
            if (ZombieA.getState() == ZombieA.getSTATE_NORMAL() && egg.getState() == egg.getSTATE_NORMAL()) {
                ZombieA.hit();
                egg.hit();
            }
        } else if (bodyA.getUserData() instanceof Egg && bodyB.getUserData() instanceof Zombie) {
            Egg egg = (Egg) bodyA.getUserData();
            Zombie zombie = (Zombie) bodyB.getUserData();
            if (egg.getState() == egg.getSTATE_NORMAL() && zombie.getState() == zombie.getSTATE_NORMAL()) {
                zombie.hit();
                egg.hit();
            }
        }


        //PLAYER ZOMBIE
        if (bodyA.getUserData() instanceof Player && bodyB.getUserData() instanceof Zombie) {
            Player player = (Player) bodyA.getUserData();
            Zombie zombie = (Zombie) bodyB.getUserData();
            if (player.getState() == player.getSTATE_NORMAL() && zombie.getState() == zombie.getSTATE_NORMAL()) {
                player.hit();
                zombie.hit();
            }
        } else if (bodyA.getUserData() instanceof Zombie && bodyB.getUserData() instanceof Player) {
            Zombie zombie = (Zombie) bodyA.getUserData();
            Player player = (Player) bodyB.getUserData();
            if (zombie.getState() == zombie.getSTATE_NORMAL() && player.getState() == player.getSTATE_NORMAL()) {
                zombie.hit();
                player.hit();
            }
        }
    }

    @Override
    public void endContact(Contact contact) {

    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {
        Body bodyA = contact.getFixtureA().getBody();
        Body bodyB = contact.getFixtureB().getBody();

        if (bodyA.getUserData() instanceof Zombie && bodyB.getUserData() instanceof Egg) {
            Zombie ZombieA = (Zombie) bodyA.getUserData();
            Egg egg = (Egg) bodyB.getUserData();

            if (ZombieA.getState() != ZombieA.getSTATE_NORMAL() || egg.getState() != egg.getSTATE_NORMAL())
                contact.setEnabled(false);
            else
                contact.setEnabled(true);
        } else if (bodyA.getUserData() instanceof Egg && bodyB.getUserData() instanceof Zombie) {
            Egg egg = (Egg) bodyA.getUserData();
            Zombie zombie = (Zombie) bodyB.getUserData();

            if (egg.getState() != egg.getSTATE_NORMAL() || zombie.getState() != zombie.getSTATE_NORMAL())
                contact.setEnabled(false);
            else
                contact.setEnabled(true);
        }

    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {

    }

}
