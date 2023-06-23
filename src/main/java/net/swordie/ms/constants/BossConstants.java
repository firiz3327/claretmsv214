package net.swordie.ms.constants;

import net.swordie.ms.life.mob.skill.MobSkillID;
import net.swordie.ms.util.Rect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BossConstants {

    // GENERAL BOSS CONSTANTS
    public final static int DR_GRACE_PERIOD = 2000;
    public static final int MOB_CONSUME_DELAY = 2500;

    // Magnus
    public static final Rect[] MAGNUS_MOB_ZONE_RECTS = new Rect[]{
            new Rect(-406, -728, 398, 116), // 1
            new Rect(-348, -728, 350, 116), // 2
            new Rect(-296, -728, 300, 116), // 3
            new Rect(-196, -728, 198, 116) // 4
    };
    public static final int MAGNUS_TIME = 1200; // 20min
    public static final int MAGNUS_DEATHCOUNT = 20; // 20 death count
    public static final int MAGNUS_OBSTACLE_ATOM_VELOCITY_MIN = 4;
    public static final int MAGNUS_OBSTACLE_ATOM_VELOCITY_MAX = 8;
    public static final int MAGNUS_GREEN_ATOM_EXECUTION_DELAY = 1000;
    public static final int MAGNUS_GREEN_ATOM_AMOUNT = 4;
    public static final int MAGNUS_GREEN_ATOM_PROP = 35;
    public static final int MAGNUS_GREEN_ATOM_DAMAGE = 25;
    public static final int MAGNUS_BLUE_ATOM_EXECUTION_DELAY = 750;
    public static final int MAGNUS_BLUE_ATOM_AMOUNT = 4;
    public static final int MAGNUS_BLUE_ATOM_PROP = 30;
    public static final int MAGNUS_BLUE_ATOM_DAMAGE = 50;
    public static final int MAGNUS_PURPLE_ATOM_EXECUTION_DELAY = 2000;
    public static final int MAGNUS_PURPLE_ATOM_AMOUNT = 3;
    public static final int MAGNUS_PURPLE_ATOM_PROP = 25;
    public static final int MAGNUS_PURPLE_ATOM_DAMAGE = 100;

    // Lotus
    public static final int LOTUS_TIME = 1800; // 30min
    public final static int LOTUS_MOBID = 8950000;
    public static final long[][] LOTUS_HP_PHASE_DIFFICULTY = {{400000000000L, 1600000000000L}, {400000000000L, 7000000000000L}, {700000000000L, 24000000000000L}};
    public static final int LOTUS_BOUNCING_BALL_DURATION = 20000;
    //      Obstacle Atoms
    public static final int LOTUS_OBSTACLE_ATOM_VELOCITY = 15; // Velocity at which the Obstacle Atoms fall down.

    public static final int LOTUS_BLUE_ATOM_EXECUTION_DELAY = 1500; // in ms. Delay between method executions
    public static final int LOTUS_BLUE_ATOM_AMOUNT = 3; // max amount of Atoms spawning attempts in 1 call
    public static final int LOTUS_BLUE_ATOM_PROP = 30; // % chance of actually spawning in
    public static final int LOTUS_BLUE_ATOM_DAMAGE = 25; // % of Max HP

    public static final int LOTUS_YELLOW_ATOM_EXECUTION_DELAY = 1750; // in ms. Delay between method executions
    public static final int LOTUS_YELLOW_ATOM_AMOUNT = 3; // max amount of Atoms spawning attempts in 1 call
    public static final int LOTUS_YELLOW_ATOM_PROP = 25; // % chance of actually spawning in
    public static final int LOTUS_YELLOW_ATOM_DAMAGE = 50; // % of Max HP

    public static final int LOTUS_PURPLE_ATOM_EXECUTION_DELAY = 2000; // in ms. Delay between method executions
    public static final int LOTUS_PURPLE_ATOM_AMOUNT = 3; // max amount of Atoms spawning attempts in 1 call
    public static final int LOTUS_PURPLE_ATOM_PROP = 20; // % chance of actually spawning in
    public static final int LOTUS_PURPLE_ATOM_DAMAGE = 100; // % of Max HP
    //      Stage 3
    public static final int LOTUS_ROBOT_ATOM_EXECUTION_DELAY = 2000; // in ms. Delay between method executions
    public static final int LOTUS_ROBOT_ATOM_AMOUNT = 2; // max amount of Atoms spawning attempts in 1 call
    public static final int LOTUS_ROBOT_ATOM_PROP = 15; // % chance of actually spawning in
    public static final int LOTUS_ROBOT_ATOM_DAMAGE = 100; // % of Max HP

    public static final int LOTUS_CRUSHER_ATOM_EXECUTION_DELAY = 4000; // in ms. Delay between method executions
    public static final int LOTUS_CRUSHER_ATOM_AMOUNT = 1; // max amount of Atoms spawning attempts in 1 call
    public static final int LOTUS_CRUSHER_ATOM_PROP = 40; // % chance of actually spawning in
    public static final int LOTUS_CRUSHER_ATOM_DAMAGE = 100; // % of Max HP

    //  Horntail -------------------------------------------------------------------------------------------------------

    //      General
    public static final int EASY_HORNTAIL_TIME = 75 * 60; // 1 hr, 15 min timer
    public static final int CHAOS_HORNTAIL_TIME = 150 * 60; // 2 hrs, 30 min timer

    //  Hilla --------------------------------------------------------------------------------------------------------------

    //      General
    public static final int EASY_HILLA_TIME = 30 * 60; // 1 hr, 15 min timer
    public static final int NORMAL_HILLA_TIME = 150 * 60; // 2 hrs, 30 min timer

    //  Von Leon -----------------------------------------------------------------------------------------------------------
    public static final int VON_LEON_TIME = 30 * 60; // 30 min timer

    //  Cygnus -------------------------------------------------------------------------------------------------------------
    public static final int CYGNUS_TIME = 30 * 60; // 30 min timer

    //  Cygnus -------------------------------------------------------------------------------------------------------------
    public static final int ARKARIUM_TIME = 30 * 60; // 30 min timer


    //  Demian -------------------------------------------------------------------------------------------------------------
    public static final int BRAND_OF_SACRIFICE = 80001974; // Skill ID
    public static final long DEMIAN_HP = 840000000000L;
    public static final int DEMIAN_NORMAL_TEMPLATE_ID = 8880110;

    // Sword
    public static final int DEMIAN_SWORD_VELOCITY = 30; // default velocity
    public static final int DEMIAN_SWORD_TARGETING_VELOCITY = 60; // default velocity when targeting

    // Stigma
    public static final int DEMIAN_MAX_STIGMA = 7; // max stigma
    public static final int DEMIAN_PASSIVE_STIGMA_TIME = 30 * 1000; // Every 30 seconds, users are hit with +1 stigma
    public static final int DEMIAN_STIGMA_INCINERATE_OBJECT_RESPAWN_TIME = 20 * 1000; // Stigma Pillar spawns every 20seconds
    public static final int DEMIAN_STIGMA_INCINERATE_OBJECT_DURATION_TIME = 10 * 1000; // Stigma Pillar lasts 10 seconds
    //  Gollux ---------------------------------------------------------------------------------------------------------
    public static final int[][] GOLLUX_HP_MULTIPLIERS = {{1, 60, 300, 500}, {1, 10, 150, 3000}, {1, 10, 300, 6000}};
    public static final int GOLLUX_FIRST_MAP = 863010100;
    public static final int GOLLUX_RIGHT_SHOULDER = 863010330;
    public static final int GOLLUX_LEFT_SHOULDER = 863010430;
    public static final int GOLLUX_ABDOMEN = 863010240;
    public static final int[] GOLLUX_RIGHT_HAND_SKILLS = new int[]{3, 5, 6, 8, 10};
    public static final int[] GOLLUX_LEFT_HAND_SKILLS = new int[]{2, 4, 7, 9, 11};
    public static final int GOLLUX_BREATH_ATTACK = 1;
    public static final int GOLLUX_DROP_STONE_CHANCE = 25;
    public static final int[] GOLLUX_MAPS = new int[]{863010100, 863010200, 863010210, 863010220, 863010230, 863010240, 863010300, 863010310, 863010320, 863010330, 863010400, 863010410, 863010420, 863010430, 863010500, 863010600};

    //Von Bon
    public static final String[] VON_BON_PORTAL_NAMES = {"Pt01", "Pt02", "Pt04gate", "Pt05gate", "Pt06gate", "Pt08gate", "Pt09gate", "Pt03gate", "Pt07gate"};

    public static final Map<Integer, Map<Integer, ArrayList<Integer>>> BLOCKED_SKILLS = new HashMap<Integer, Map<Integer, ArrayList<Integer>>>() {{
        /*put(CHAOS_PIERRE, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.Summon2.getVal(), new ArrayList<Integer>() {{
                add(40);
            }});
        }});

        put(NORMAL_VON_BON, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.AreaTimezone.getVal(), new ArrayList<Integer>() {{
                add(1);
                add(2);
            }});
        }});
        put(CHAOS_VON_BON, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.AreaTimezone.getVal(), new ArrayList<Integer>() {{
                add(1);
                add(2);
            }});
        }});

        put(CRIMSON_QUEEN_REFLECT_FACE, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.Undead.getVal(), new ArrayList<Integer>() {{
                add(18);
            }});
        }});
        put(CHAOS_CRIMSON_QUEEN_REFLECT_FACE, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.Undead.getVal(), new ArrayList<Integer>() {{
                add(17);
            }});
        }});

        put(EASY_CYGNUS, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.HealM.getVal(), new ArrayList<Integer>() {{
                add(43);
            }});
        }});
        put(NORMAL_CYGNUS, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.HealM.getVal(), new ArrayList<Integer>() {{
                add(43);
            }});
        }});*/

        put(9450020, new HashMap<Integer, ArrayList<Integer>>() {{ // Mob before P.No
            put(MobSkillID.Teleport.getVal(), new ArrayList<Integer>() {{
                add(27);
            }});

            put(MobSkillID.VampDeath.getVal(), new ArrayList<Integer>() {{
                add(2);
            }});

            put(MobSkillID.CastingBar.getVal(), new ArrayList<Integer>() {{
                add(9);
            }});
        }});

        put(9450022, new HashMap<Integer, ArrayList<Integer>>() {{
            put(MobSkillID.Teleport.getVal(), new ArrayList<Integer>() {{
                add(25);
                add(27);
            }});
        }});

        put(8190003, new HashMap<Integer, ArrayList<Integer>>() {{ // Leafre Skelegons
            put(MobSkillID.PGuardUpM.getVal(), new ArrayList<Integer>() {{
                add(4);
            }});
        }});

        put(9390016, new HashMap<Integer, ArrayList<Integer>>() {{ // DDS3 Horrendous Skelegon
            put(MobSkillID.PGuardUpM.getVal(), new ArrayList<Integer>() {{
                add(4);
            }});
        }});


    }};

    public static boolean isBlockedSkill(int mTemplateID, int sID, int sLV) {
        return BLOCKED_SKILLS.containsKey(mTemplateID) && BLOCKED_SKILLS.get(mTemplateID).containsKey(sID) && BLOCKED_SKILLS.get(mTemplateID).get(sID).contains(sLV);
    }

    public static final Map<Integer, Integer> SUMMON_SPAWN_CAST_DELAY = new HashMap<Integer, Integer>() {{
        put(ALLURING_MIRROR, 2500);
        put(CHAOS_ALLURING_MIRROR, 1500);
    }};

    public static int getSummonSkillDelay(int mTemplateID) {
        return SUMMON_SPAWN_CAST_DELAY.getOrDefault(mTemplateID, 0);
    }


//  BALROG -------------------------------------------------------------------------------------------------------------
//  Find all Balrog related scripts by searching = # BALROG BOSS SCRIPT

    // OBSTACLE ATOMS
    public static final int BALROG_OBSTACLE_ATOM_VELOCITY = 15;             // Obstacle Atom Velocity
    public static final int BALROG_PURPLE_ATOM_EXECUTION_DELAY = 1000;      // Obstacle Atom Execution Delay
    public static final int BALROG_PURPLE_ATOM_AMOUNT = 4;                  // Max Obstacle Atoms Spawned Per Call
    public static final int BALROG_PURPLE_ATOM_PROP = 35;                   // Obstacle Atom Percent Spawn Chance
    public static final int BALROG_PURPLE_ATOM_DAMAGE = 25;                 // Obstacle Atom Percent HP Damage

    // GENERAL BALROG CONSTANTS
    public static final int BALROG_ENTRY_MAP = 105100100;                   // Balrog Entry Map
    public static final short BALROG_TIME_LIMIT = 1800;                     // Balrog Instance Time Limit
    public static final short BALROG_SPAWN_X = 412;                         // Balrog X Spawn Position
    public static final short BALROG_SPAWN_Y = 258;                         // Balrog Y Spawn Position
    public static final int BALROG_LEFT_ARM = 8830001;                      // Balrog Universal Left Arm Template ID
    public static final int BALROG_RIGHT_ARM = 8830002;                     // Balrog Universal Right Arm Template ID
    public static final int BALROG_FAKE_LEFT_ARM = 8830004;                 // Balrog Universal Fake Left Arm Template ID
    public static final int BALROG_FAKE_RIGHT_ARM = 8830005;                // Balrog Universal Fake Right Arm Template ID
    public static final long BALROG_COOLDOWN = 21600000;                    // Balrog Universal Cooldown Time in Mils


    // NORMAL BALROG CONSTANTS
    public static final Integer[] NORMAL_BALROG_IDS = {                     // All Normal Balrog Boss Template ID's
            8830010, 8830000, 8830001, 8830002, 8830004, 8830005,
    };

    public static final int BALROG_NORMAL_TREASURE_THIEF = 9402045;         // Normal Balrog Loot Mob
    public static final int BALROG_NORMAL_TREASURE_THIEF_HP = 1000000;      // Normal Balrog Loot Mob HP

    public static final int BALROG_NORMAL_BATTLE_MAP = 105100400;           // Normal Balrog Battle Map
    public static final int BALROG_NORMAL_WIN_MAP = 105100401;              // Normal Balrog Victory Map

    public static final int BALROG_NORMAL_BODY_HP = 3600000;                // Normal Balrog Body HP
    public static final int BALROG_NORMAL_ARM_HP = 1800000;                 // Normal Balrog Arm HP

    public static final int BALROG_NORMAL_DAMAGE_SINK = 8830010;            // Normal Balrog Damage Sink Template ID
    public static final int BALROG_NORMAL_BODY = 8830007;                   // Normal Balrog Body Template ID

    // MYSTIC BALROG CONSTANTS
    public static final Integer[] MYSTIC_BALROG_IDS = {                     // All Mystic Balrog Boss Template ID's
            8830010, 8830000, 8830001, 8830002, 8830004, 8830005,
    };

    public static final int BALROG_MYSTIC_TREASURE_THIEF = 9402046;         // Mystic Balrog Loot Mob
    public static final int BALROG_MYSTIC_TREASURE_THIEF_HP = 100000000;    // Mystic Balrog Loot Mob HP

    public static final int BALROG_MYSTIC_BATTLE_MAP = 105100300;           // Mystic Balrog Battle Map
    public static final int BALROG_MYSTIC_WIN_MAP = 105100301;              // Mystic Balrog Victory Map

    public static final long BALROG_MYSTIC_BODY_HP = 180000000000L;         // Mystic Balrog Body HP
    public static final long BALROG_MYSTIC_ARM_HP = 90000000000L;           // Mystic Balrog Arm HP

    public static final int BALROG_MYSTIC_DAMAGE_SINK = 8830010;            // Mystic Balrog Damage Sink Template ID
    public static final int BALROG_MYSTIC_BODY = 8830000;                   // Mystic Balrog Body Template ID

    //  ZAKUM ----------------------------------------------------------------------------------------------------------
    //  Find all Zakum related scripts by searching = # ZAKUM BOSS SCRIPT

    // GENERAL ZAKUM CONSTANTS
    public static final int ZAKUM_ENTRY_MAP = 221042400;                    // Zakum Entry Map
    public static final short ZAKUM_TIME_LIMIT = 1800;                      // Zakum Instance Time Limit
    public static final long ZAKUM_COOLDOWN = 21600000;                     // Zakum Easy/Normal Cooldown Time in Mils
    public static final int ZAKUM_JQ_MAP_1 = 280020000;                     // Zakum First Jump Quest Map
    public static final int ZAKUM_JQ_MAP_2 = 280020001;                     // Zakum Second Jump Quest Map
    public static final int ZAKUM_DOOR_TO_ENTRANCE = 211042300;             // Zakum Door Entrance Map

    // EASY ZAKUM CONSTANTS
    public static final int EASY_ZAKUM_MAP = 280030200;                     // Easy Zakum Battle Map

    // NORMAL ZAKUM CONSTANTS
    public static final int NORMAL_ZAKUM_MAP = 280030100;                   // Normal Zakum Battle Map

    // CHAOS ZAKUM CONSTANTS
    public static final int CHAOS_ZAKUM_MAP = 280030000;                    // Chaos Zakum Battle Map
    public static final int CHAOS_ZAKUM_COOLDOWN = 43200000;                // Chaos Zakum Cooldown Time in Mils
    public static final long ZAKUM_CHAOS_BODY_HP = 360000000000L;           // Chaos Zakum Body HP
    public static final long ZAKUM_CHAOS_ARM_HP = 15000000000L;             // Chaos Zakum Arm HP

    // ZAKUM ARM CONSTANTS
    public static final int[] ZAKUM_ARMS = {                                // Array of All Zakum Arm Template ID's
            // Normal
            8800003, 8800004, 8800005, 8800006, 8800007, 8800008, 8800009, 8800010,
            // Easy
            8800023, 8800024, 8800025, 8800026, 8800027, 8800028, 8800029, 8800030,
            // Chaos
            8800103, 8800104, 8800105, 8800106, 8800107, 8800108, 8800109, 8800110,
    };

    public static final Integer[] EASY_ZAKUM_ARMS = {                       // Array of All Easy Zakum Arm Template ID's
            8800023, 8800024, 8800025, 8800026, 8800027, 8800028, 8800029, 8800030,
    };

    public static final Integer[] NORMAL_ZAKUM_ARMS = {                     // Array of All Norm Zakum Arm Template ID's
            8800003, 8800004, 8800005, 8800006, 8800007, 8800008, 8800009, 8800010,
    };

    public static final Integer[] CHAOS_ZAKUM_ARMS = {                     // Array of All Chaos Zakum Arm Template ID's
            8800103, 8800104, 8800105, 8800106, 8800107, 8800108, 8800109, 8800110,
    };

    public static final int EASY_ZAKUM_ARM_SLAM_CHANCE = 30;               // The Chance of Zakum using OHK Platform AOE
    public static final int EASY_ZAKUM_ARM_SLAM_INTERVAL = 4000;           // The Time in Between Slam Attacks

    public static final int NORMAL_ZAKUM_ARM_SLAM_CHANCE = 45;             // The Chance of Zakum using OHK Platform AOE
    public static final int NORMAL_ZAKUM_ARM_SLAM_INTERVAL = 3500;         // The Time in Between Slam Attacks

    public static final int CHAOS_ZAKUM_ARM_SLAM_CHANCE = 60;              // The Chance of Zakum using OHK Platform AOE
    public static final int CHAOS_ZAKUM_ARM_SLAM_INTERVAL = 3000;          // The Time in Between Slam Attacks

    // ROOT ABYSS -- GENERAL
    public static final int ROOTABYSS_TIME = 1800;

    // CRIMSON QUEEN ---------------------------------------------------------------------------------------------------

    // GENERAL CRIMSON QUEEN CONSTANTS
    public static final int ALLURING_MIRROR = 8920105;
    public static final int CHAOS_ALLURING_MIRROR = 8920005;

}
