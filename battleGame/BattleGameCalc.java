package com.mikanGames.battleGame;

import com.mikanGames.battleGame.characters.Character;

import java.util.Map;
import java.util.Random;

/**
 * 計算クラス
 */
public class BattleGameCalc {

    public int playerAttackDamage(Character player, Character enemy) {
        int damage = (int) (player.getAttackPower() / randomNumber()) - (int) (enemy.getPhyDefense() / randomNumber());

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
        int damage = (int) (enemy.getAttackPower() / (randomNumber()) - (int) (player.getPhyDefense() / randomNumber()));

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
