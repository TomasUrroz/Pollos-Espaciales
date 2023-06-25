package com.game.tutoriales.learn8;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.game.Entities.Personaje;


public class AssetsLearn8 {

    static Sprite entity;
    static Animation<Sprite> run;
    static Animation<Sprite> idle;
    static Animation<Sprite> walk;
    static Animation<Sprite> attack1;
    static Animation<Sprite> attack2;
    static Animation<Sprite> attack3;
    static Animation<Sprite> death;
    static Animation<Sprite> hurt;
    static TextureAtlas atlas;

    public static void load(Integer choice) {
/*
        atlas = new TextureAtlas(Gdx.files.internal("Entities/Zombie Man/ZM.txt"));
*/
        atlas = new TextureAtlas(Gdx.files.internal("Entities/Zombie Man/ZM.txt"));

        if(choice == 0){/*
            idle = new Animation<>(
                    Personaje.IDDLE_FRAME_DURATION ,
                    atlas.createSprite("Woodcutter_idle1"),
                    atlas.createSprite("Woodcutter_idle2"),
                    atlas.createSprite("Woodcutter_idle3"),
                    atlas.createSprite("Woodcutter_idle4")
            );*/
            entity = atlas.createSprite("Walk_A");

            walk = new Animation<>(
                    Personaje.WALK_FRAME_DURATION,
                    atlas.createSprite("Walk_A"),
                    atlas.createSprite("Walk_B"),
                    atlas.createSprite("Walk_C"),
                    atlas.createSprite("Walk_D"),
                    atlas.createSprite("Walk_E"),
                    atlas.createSprite("Walk_F"),
                    atlas.createSprite("Walk_G"),
                    atlas.createSprite("Walk_H")
            );
            run = new Animation<>(
                    Personaje.RUN_FRAME_DURATION,
                    atlas.createSprite("Run_A"),
                    atlas.createSprite("Run_B"),
                    atlas.createSprite("Run_C"),
                    atlas.createSprite("Run_D"),
                    atlas.createSprite("Run_E"),
                    atlas.createSprite("Run_F")
            );
            attack1 = new Animation<>(
                    Personaje.ATTK1_FRAME_DURATION,
                    atlas.createSprite("Attack_1_A"),
                    atlas.createSprite("Attack_1_B"),
                    atlas.createSprite("Attack_1_C"),
                    atlas.createSprite("Attack_1_D"),
                    atlas.createSprite("Attack_1_E")
            );
            attack2 = new Animation<>(
                    Personaje.ATTK2_FRAME_DURATION,
                    atlas.createSprite("Attack_2_A"),
                    atlas.createSprite("Attack_2_B"),
                    atlas.createSprite("Attack_2_C"),
                    atlas.createSprite("Attack_2_D"),
                    atlas.createSprite("Attack_2_E")
            );
            attack3 = new Animation<>(
                    Personaje.ATTK3_FRAME_DURATION,
                    atlas.createSprite("Attack_3_A"),
                    atlas.createSprite("Attack_3_B"),
                    atlas.createSprite("Attack_3_C"),
                    atlas.createSprite("Attack_3_D"),
                    atlas.createSprite("Attack_3_E")
            );
            death = new Animation<>(
                    Personaje.DEATH_FRAME_DURATION,
                    atlas.createSprite("Dead_A"),
                    atlas.createSprite("Dead_B"),
                    atlas.createSprite("Dead_C"),
                    atlas.createSprite("Dead_D"),
                    atlas.createSprite("Dead_E")
            );
            hurt = new Animation<>(
                    Personaje.HURT_FRAME_DURATION,
                    atlas.createSprite("Hurt_A"),
                    atlas.createSprite("Hurt_B"),
                    atlas.createSprite("Hurt_C")
            );
        } /*else if (choice == 1) {
            entity = atlas.createSprite("GraveRobber");

            idle = new Animation<>(
                    Personaje.IDDLE_FRAME_DURATION ,
                    atlas.createSprite("GraveRobber_idle1"),
                    atlas.createSprite("GraveRobber_idle2"),
                    atlas.createSprite("GraveRobber_idle3"),
                    atlas.createSprite("GraveRobber_idle4")
            );
            walk = new Animation<>(
                    Personaje.RUN_FRAME_DURATION,
                    atlas.createSprite("GraveRobber_walk1"),
                    atlas.createSprite("GraveRobber_walk2"),
                    atlas.createSprite("GraveRobber_walk3"),
                    atlas.createSprite("GraveRobber_walk4"),
                    atlas.createSprite("GraveRobber_walk5"),
                    atlas.createSprite("GraveRobber_walk6"),
                    atlas.createSprite("GraveRobber_walk7")
            );
            run = new Animation<>(
                    Personaje.WALK_FRAME_DURATION,
                    atlas.createSprite("GraveRobber_run1"),
                    atlas.createSprite("GraveRobber_run2"),
                    atlas.createSprite("GraveRobber_run3"),
                    atlas.createSprite("GraveRobber_run4"),
                    atlas.createSprite("GraveRobber_run5"),
                    atlas.createSprite("GraveRobber_run6")
            );
            attack1 = new Animation<>(
                    Personaje.ATTK1_FRAME_DURATION,
                    atlas.createSprite("GraveRobber_attack11"),
                    atlas.createSprite("GraveRobber_attack12"),
                    atlas.createSprite("GraveRobber_attack13"),
                    atlas.createSprite("GraveRobber_attack14"),
                    atlas.createSprite("GraveRobber_attack15"),
                    atlas.createSprite("GraveRobber_attack16")
            );
            attack2 = new Animation<>(
                    Personaje.ATTK2_FRAME_DURATION,
                    atlas.createSprite("GraveRobber_attack21"),
                    atlas.createSprite("GraveRobber_attack22"),
                    atlas.createSprite("GraveRobber_attack23"),
                    atlas.createSprite("GraveRobber_attack24"),
                    atlas.createSprite("GraveRobber_attack25"),
                    atlas.createSprite("GraveRobber_attack26")
            );
            attack3 = new Animation<>(
                    Personaje.ATTK3_FRAME_DURATION,
                    atlas.createSprite("GraveRobber_attack31"),
                    atlas.createSprite("GraveRobber_attack32"),
                    atlas.createSprite("GraveRobber_attack33"),
                    atlas.createSprite("GraveRobber_attack34"),
                    atlas.createSprite("GraveRobber_attack35"),
                    atlas.createSprite("GraveRobber_attack36")
            );
            death = new Animation<>(
                    Personaje.DEATH_FRAME_DURATION,
                    atlas.createSprite("GraveRobber_death1"),
                    atlas.createSprite("GraveRobber_death2"),
                    atlas.createSprite("GraveRobber_death3"),
                    atlas.createSprite("GraveRobber_death4"),
                    atlas.createSprite("GraveRobber_death5"),
                    atlas.createSprite("GraveRobber_death6")
            );
            hurt = new Animation<>(
                    Personaje.HURT_FRAME_DURATION,
                    atlas.createSprite("GraveRobber_hurt1"),
                    atlas.createSprite("GraveRobber_hurt2"),
                    atlas.createSprite("GraveRobber_hurt3")
                    );
        }else if (choice == 2) {
            entity = atlas.createSprite("SteamMan");
            idle = new Animation<>(
                    Personaje.IDDLE_FRAME_DURATION ,
                    atlas.createSprite("SteamMan_idle1"),
                    atlas.createSprite("SteamMan_idle2"),
                    atlas.createSprite("SteamMan_idle3"),
                    atlas.createSprite("SteamMan_idle4")
            );
            walk = new Animation<>(
                    Personaje.RUN_FRAME_DURATION,
                    atlas.createSprite("SteamMan_walk1"),
                    atlas.createSprite("SteamMan_walk2"),
                    atlas.createSprite("SteamMan_walk3"),
                    atlas.createSprite("SteamMan_walk4"),
                    atlas.createSprite("SteamMan_walk5"),
                    atlas.createSprite("SteamMan_walk6"),
                    atlas.createSprite("SteamMan_walk7")
            );
            run = new Animation<>(
                    Personaje.WALK_FRAME_DURATION,
                    atlas.createSprite("SteamMan_run1"),
                    atlas.createSprite("SteamMan_run2"),
                    atlas.createSprite("SteamMan_run3"),
                    atlas.createSprite("SteamMan_run4"),
                    atlas.createSprite("SteamMan_run5"),
                    atlas.createSprite("SteamMan_run6")
            );
            attack1 = new Animation<>(
                    Personaje.ATTK1_FRAME_DURATION,
                    atlas.createSprite("SteamMan_attack11"),
                    atlas.createSprite("SteamMan_attack12"),
                    atlas.createSprite("SteamMan_attack13"),
                    atlas.createSprite("SteamMan_attack14"),
                    atlas.createSprite("SteamMan_attack15"),
                    atlas.createSprite("SteamMan_attack16")
            );
            attack2 = new Animation<>(
                    Personaje.ATTK2_FRAME_DURATION,
                    atlas.createSprite("SteamMan_attack21"),
                    atlas.createSprite("SteamMan_attack22"),
                    atlas.createSprite("SteamMan_attack23"),
                    atlas.createSprite("SteamMan_attack24"),
                    atlas.createSprite("SteamMan_attack25"),
                    atlas.createSprite("SteamMan_attack26")
            );
            attack3 = new Animation<>(
                    Personaje.ATTK3_FRAME_DURATION,
                    atlas.createSprite("SteamMan_attack31"),
                    atlas.createSprite("SteamMan_attack32"),
                    atlas.createSprite("SteamMan_attack33"),
                    atlas.createSprite("SteamMan_attack34"),
                    atlas.createSprite("SteamMan_attack35"),
                    atlas.createSprite("SteamMan_attack36")
            );
            death = new Animation<>(
                    Personaje.DEATH_FRAME_DURATION,
                    atlas.createSprite("SteamMan_death1"),
                    atlas.createSprite("SteamMan_death2"),
                    atlas.createSprite("SteamMan_death3"),
                    atlas.createSprite("SteamMan_death4"),
                    atlas.createSprite("SteamMan_death5"),
                    atlas.createSprite("SteamMan_death6")
            );
            hurt = new Animation<>(
                    Personaje.HURT_FRAME_DURATION,
                    atlas.createSprite("SteamMan_hurt1"),
                    atlas.createSprite("SteamMan_hurt2"),
                    atlas.createSprite("SteamMan_hurt3")
                    );
        }*/
    }


    public static void dispose() {
        atlas.dispose();
    }
}

