package com.mikanGames.battleGame;

import com.mikanGames.battleGame.characters.Character;

import java.util.Map;
import java.util.Random;

/**
 * 計算クラス
 */
public class BattleGameCalc {

    public int playerAttackDamage(Character player, Character enemy) {
        int damage = (int) (player.getAttackPower() * randomNumber()) - (int) (enemy.getPhyDefense() * randomNumber());

        damage += new Random().nextInt(5) + 1;

        if (damage < 0) {
            int randomHit = new Random().nextInt(3);
            if (randomHit == 0) {
                damage = 1;
            }  else {
                damage = 0;
            }
        }

        int critical = new Random().nextInt(16);
        if (player.getLack() > new Random().nextInt(4000)) {
            critical = 0;
        }

        if (critical == 0) {
            damage = Math.round(damage * 1.5f);
        }

        return damage;
    }

    public int enemyAttackDamage(Character enemy, Character player) {
        int damage = (int) (enemy.getAttackPower() * (randomNumber()) - (int) (player.getPhyDefense() * randomNumber()));

        damage += new Random().nextInt(2) + 1;

        if (damage < 0) {
            int randomHit = new Random().nextInt(2);
            if (randomHit == 0) {
                damage = 1;
            } else {
                damage = 0;
            }
        }

        int critical = new Random().nextInt(16);
        if (critical == 0) {
            damage = Math.round(damage * 1.5f);
        }

        return damage;
    }

    public int enemyMagicAttack(Character enemy, Character player, String type) {
        int damage = (int) ((enemy.getMagicPower() * randomNumber() - player.getMagDefense() * randomNumber() - (double) player.getPhyDefense() / 8));

        damage = (int) (damage * typeCompatibility(type, player));

        damage += new Random().nextInt(10);

        return damage;
    }

    public static double randomNumber() {
        double randomNumber = new Random().nextInt(7);
        switch ( (int) randomNumber) {
            case 0:
                randomNumber  = 0.7;
                break;
            case 1:
                randomNumber  = 0.8;
                break;
            case 2:
                randomNumber  = 0.9;
                break;
            case 3:
                randomNumber  = 1.0;
                break;
            case 4:
                randomNumber  = 1.1;
                break;
            case 5:
                randomNumber  = 1.2;
                break;
            case 6:
                randomNumber  = 1.3;
                break;
        }
        return randomNumber;
    }

    public static double typeCompatibility(String type, Character c) {
        double typeCompatibilityDamage = 1;
        switch (c.getType()) {
            case "無":
                if (type.equals("神") || type.equals("魔")) {
                    typeCompatibilityDamage = 1.3;
                }
                break;
            case "火":
                if (type.equals("水")) {
                    typeCompatibilityDamage = 2;
                } else if (type.equals("木")) {
                    typeCompatibilityDamage = 0.5;
                }
                break;
            case "水":
                if (type.equals("木")) {
                    typeCompatibilityDamage = 2;
                } else if (type.equals("火")) {
                    typeCompatibilityDamage = 0.5;
                }
                break;
            case "木":
                if (type.equals("火")) {
                    typeCompatibilityDamage = 2;
                } else if (type.equals("水")) {
                    typeCompatibilityDamage = 0.5;
                }
                break;
            case "光":
                if (type.equals("闇")) {
                    typeCompatibilityDamage = 2;
                } else if (type.equals("光")) {
                    typeCompatibilityDamage = 0.75;
                }
                break;
            case "闇":
                if (type.equals("光")) {
                    typeCompatibilityDamage = 2;
                } else if (type.equals("闇")) {
                    typeCompatibilityDamage = 0.75;
                }
                break;
            case "神":
                if (type.equals("魔")) {
                    typeCompatibilityDamage = 2;
                } else if (type.equals("無")) {
                    typeCompatibilityDamage = 1.3;
                } else if (type.equals("水") || type.equals("木") || type.equals("光")) {
                    typeCompatibilityDamage = 0.75;
                }
                break;
            case "魔":
                if (type.equals("神")) {
                    typeCompatibilityDamage = 2;
                } else if (type.equals("無")) {
                    typeCompatibilityDamage = 1.3;
                } else if (type.equals("火") || type.equals("闇")) {
                    typeCompatibilityDamage = 0.5;
                }
                break;
        }
        return typeCompatibilityDamage;
    }

    public static int randomEnemyBorn(Map<Integer, Character> enemies) {
        return new Random().nextInt(enemies.size());
    }

    public static int randomWeakEnemyStatus(int randomStatus) {
        boolean plusOrMinus = Math.random() < 0.5;
        randomStatus = new Random().nextInt(3);

        if (plusOrMinus) {
            randomStatus += randomStatus;
        } else {
            randomStatus -= randomStatus * 2;
        }

        return randomStatus;
    }

}
