package com.game.utils;

import com.badlogic.gdx.physics.box2d.*;
import com.game.Entities.Egg;
import com.game.Entities.Enemies.Zombie;

public class CollisionListener implements ContactListener {

    @Override
    public void beginContact(Contact contact) {
        Body bodyA = contact.getFixtureA().getBody();
        Body bodyB = contact.getFixtureB().getBody();

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
