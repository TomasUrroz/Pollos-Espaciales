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
        atlas = new TextureAtlas(Gdx.files.internal("Entities/entities.txt"));

        if(choice == 0){
            entity = atlas.createSprite("Woodcutter");
            idle = new Animation<>(
                    Personaje.getIddle_frame_duration(),
                    atlas.createSprite("Woodcutter_idle1"),
                    atlas.createSprite("Woodcutter_idle2"),
                    atlas.createSprite("Woodcutter_idle3"),
                    atlas.createSprite("Woodcutter_idle4")
            );
            walk = new Animation<>(
                    Personaje.getWalk_frame_duration(),
                    atlas.createSprite("Woodcutter_walk1"),
                    atlas.createSprite("Woodcutter_walk2"),
                    atlas.createSprite("Woodcutter_walk3"),
                    atlas.createSprite("Woodcutter_walk4"),
                    atlas.createSprite("Woodcutter_walk5"),
                    atlas.createSprite("Woodcutter_walk6"),
                    atlas.createSprite("Woodcutter_walk7")
            );
            run = new Animation<>(
                    Personaje.getRun_frame_duration(),
                    atlas.createSprite("Woodcutter_run1"),
                    atlas.createSprite("Woodcutter_run2"),
                    atlas.createSprite("Woodcutter_run3"),
                    atlas.createSprite("Woodcutter_run4"),
                    atlas.createSprite("Woodcutter_run5"),
                    atlas.createSprite("Woodcutter_run6")
            );
            attack1 = new Animation<>(
                    Personaje.getAttk1_frame_duration(),
                    atlas.createSprite("Woodcutter_attack11"),
                    atlas.createSprite("Woodcutter_attack12"),
                    atlas.createSprite("Woodcutter_attack13"),
                    atlas.createSprite("Woodcutter_attack14"),
                    atlas.createSprite("Woodcutter_attack15"),
                    atlas.createSprite("Woodcutter_attack16")
            );
            attack2 = new Animation<>(
                    Personaje.getAttk2_frame_duration(),
                    atlas.createSprite("Woodcutter_attack21"),
                    atlas.createSprite("Woodcutter_attack22"),
                    atlas.createSprite("Woodcutter_attack23"),
                    atlas.createSprite("Woodcutter_attack24"),
                    atlas.createSprite("Woodcutter_attack25"),
                    atlas.createSprite("Woodcutter_attack26")
            );
            attack3 = new Animation<>(
                    Personaje.getAttk3_frame_duration(),
                    atlas.createSprite("Woodcutter_attack31"),
                    atlas.createSprite("Woodcutter_attack32"),
                    atlas.createSprite("Woodcutter_attack33"),
                    atlas.createSprite("Woodcutter_attack34"),
                    atlas.createSprite("Woodcutter_attack35"),
                    atlas.createSprite("Woodcutter_attack36")
            );
            death = new Animation<>(
                    Personaje.getDeath_frame_duration(),
                    atlas.createSprite("Woodcutter_death1"),
                    atlas.createSprite("Woodcutter_death2"),
                    atlas.createSprite("Woodcutter_death3"),
                    atlas.createSprite("Woodcutter_death4"),
                    atlas.createSprite("Woodcutter_death5"),
                    atlas.createSprite("Woodcutter_death6")
            );
            hurt = new Animation<>(
                    Personaje.getHurt_frame_duration(),
                    atlas.createSprite("Woodcutter_hurt1"),
                    atlas.createSprite("Woodcutter_hurt2"),
                    atlas.createSprite("Woodcutter_hurt3")
            );
        } else if (choice == 1) {
            entity = atlas.createSprite("GraveRobber");

            idle = new Animation<>(
                    Personaje.getIddle_frame_duration(),
                    atlas.createSprite("GraveRobber_idle1"),
                    atlas.createSprite("GraveRobber_idle2"),
                    atlas.createSprite("GraveRobber_idle3"),
                    atlas.createSprite("GraveRobber_idle4")
            );
            walk = new Animation<>(
                    Personaje.getWalk_frame_duration(),
                    atlas.createSprite("GraveRobber_walk1"),
                    atlas.createSprite("GraveRobber_walk2"),
                    atlas.createSprite("GraveRobber_walk3"),
                    atlas.createSprite("GraveRobber_walk4"),
                    atlas.createSprite("GraveRobber_walk5"),
                    atlas.createSprite("GraveRobber_walk6"),
                    atlas.createSprite("GraveRobber_walk7")
            );
            run = new Animation<>(
                    Personaje.getRun_frame_duration(),
                    atlas.createSprite("GraveRobber_run1"),
                    atlas.createSprite("GraveRobber_run2"),
                    atlas.createSprite("GraveRobber_run3"),
                    atlas.createSprite("GraveRobber_run4"),
                    atlas.createSprite("GraveRobber_run5"),
                    atlas.createSprite("GraveRobber_run6")
            );
            attack1 = new Animation<>(
                    Personaje.getAttk1_frame_duration(),
                    atlas.createSprite("GraveRobber_attack11"),
                    atlas.createSprite("GraveRobber_attack12"),
                    atlas.createSprite("GraveRobber_attack13"),
                    atlas.createSprite("GraveRobber_attack14"),
                    atlas.createSprite("GraveRobber_attack15"),
                    atlas.createSprite("GraveRobber_attack16")
            );
            attack2 = new Animation<>(
                    Personaje.getAttk2_frame_duration(),
                    atlas.createSprite("GraveRobber_attack21"),
                    atlas.createSprite("GraveRobber_attack22"),
                    atlas.createSprite("GraveRobber_attack23"),
                    atlas.createSprite("GraveRobber_attack24"),
                    atlas.createSprite("GraveRobber_attack25"),
                    atlas.createSprite("GraveRobber_attack26")
            );
            attack3 = new Animation<>(
                    Personaje.getAttk3_frame_duration(),
                    atlas.createSprite("GraveRobber_attack31"),
                    atlas.createSprite("GraveRobber_attack32"),
                    atlas.createSprite("GraveRobber_attack33"),
                    atlas.createSprite("GraveRobber_attack34"),
                    atlas.createSprite("GraveRobber_attack35"),
                    atlas.createSprite("GraveRobber_attack36")
            );
            death = new Animation<>(
                    Personaje.getDeath_frame_duration(),
                    atlas.createSprite("GraveRobber_death1"),
                    atlas.createSprite("GraveRobber_death2"),
                    atlas.createSprite("GraveRobber_death3"),
                    atlas.createSprite("GraveRobber_death4"),
                    atlas.createSprite("GraveRobber_death5"),
                    atlas.createSprite("GraveRobber_death6")
            );
            hurt = new Animation<>(
                    Personaje.getHurt_frame_duration(),
                    atlas.createSprite("GraveRobber_hurt1"),
                    atlas.createSprite("GraveRobber_hurt2"),
                    atlas.createSprite("GraveRobber_hurt3")
                    );
        }else if (choice == 2) {
            entity = atlas.createSprite("SteamMan");
            idle = new Animation<>(
                    Personaje.getIddle_frame_duration(),
                    atlas.createSprite("SteamMan_idle1"),
                    atlas.createSprite("SteamMan_idle2"),
                    atlas.createSprite("SteamMan_idle3"),
                    atlas.createSprite("SteamMan_idle4")
            );
            walk = new Animation<>(
                    Personaje.getWalk_frame_duration(),
                    atlas.createSprite("SteamMan_walk1"),
                    atlas.createSprite("SteamMan_walk2"),
                    atlas.createSprite("SteamMan_walk3"),
                    atlas.createSprite("SteamMan_walk4"),
                    atlas.createSprite("SteamMan_walk5"),
                    atlas.createSprite("SteamMan_walk6"),
                    atlas.createSprite("SteamMan_walk7")
            );
            run = new Animation<>(
                    Personaje.getRun_frame_duration(),
                    atlas.createSprite("SteamMan_run1"),
                    atlas.createSprite("SteamMan_run2"),
                    atlas.createSprite("SteamMan_run3"),
                    atlas.createSprite("SteamMan_run4"),
                    atlas.createSprite("SteamMan_run5"),
                    atlas.createSprite("SteamMan_run6")
            );
            attack1 = new Animation<>(
                    Personaje.getAttk1_frame_duration(),
                    atlas.createSprite("SteamMan_attack11"),
                    atlas.createSprite("SteamMan_attack12"),
                    atlas.createSprite("SteamMan_attack13"),
                    atlas.createSprite("SteamMan_attack14"),
                    atlas.createSprite("SteamMan_attack15"),
                    atlas.createSprite("SteamMan_attack16")
            );
            attack2 = new Animation<>(
                    Personaje.getAttk2_frame_duration(),
                    atlas.createSprite("SteamMan_attack21"),
                    atlas.createSprite("SteamMan_attack22"),
                    atlas.createSprite("SteamMan_attack23"),
                    atlas.createSprite("SteamMan_attack24"),
                    atlas.createSprite("SteamMan_attack25"),
                    atlas.createSprite("SteamMan_attack26")
            );
            attack3 = new Animation<>(
                    Personaje.getAttk3_frame_duration(),
                    atlas.createSprite("SteamMan_attack31"),
                    atlas.createSprite("SteamMan_attack32"),
                    atlas.createSprite("SteamMan_attack33"),
                    atlas.createSprite("SteamMan_attack34"),
                    atlas.createSprite("SteamMan_attack35"),
                    atlas.createSprite("SteamMan_attack36")
            );
            death = new Animation<>(
                    Personaje.getDeath_frame_duration(),
                    atlas.createSprite("SteamMan_death1"),
                    atlas.createSprite("SteamMan_death2"),
                    atlas.createSprite("SteamMan_death3"),
                    atlas.createSprite("SteamMan_death4"),
                    atlas.createSprite("SteamMan_death5"),
                    atlas.createSprite("SteamMan_death6")
            );
            hurt = new Animation<>(
                    Personaje.getHurt_frame_duration(),
                    atlas.createSprite("SteamMan_hurt1"),
                    atlas.createSprite("SteamMan_hurt2"),
                    atlas.createSprite("SteamMan_hurt3")
                    );
        }
    }


    public static void dispose() {
        atlas.dispose();
    }
}

