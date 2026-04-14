package com.mikanGames.battleGame;

import android.widget.Switch;

import com.mikanGames.battleGame.characters.Character;

import java.util.Map;
import java.util.TreeMap;

/**
 * ツールクラス
 */
public class BattleGameTools {

    public Map<Integer, Character> enemiesMaper(Character... enemies) {
        Integer no = 0;
        Map<Integer, Character> enemyMap = new TreeMap<>();
        for (Character enemy : enemies) {
            no++;
            enemyMap.put(no, enemy);
        }
        return enemyMap;
    }

    public Character appearedEnemy(Map<Integer, Character> enemies) {
        return enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
    }

    public static int[] enemyStatusInit(int... initStatus) {
        int i = 0;
        for (int status : initStatus) {
            initStatus[i] = BattleGameCalc.randomWeakEnemyStatus(status);
            i++;
        }
        return initStatus;
    }

    public boolean whichTurn(Character player, Character enemy) {
        return player.getSpeed() * BattleGameCalc.randomNumber() > enemy.getSpeed() * BattleGameCalc.randomNumber();
    }

    public boolean gameoverJugement(Character player, Character enemy) {
        boolean gameover = false;
        if (player.getHp() <= 0) {
            player.setHp(0);
            gameover = true;
        } else if (enemy.getHp() <= 0) {
            enemy.setHp(0);
            gameover = true;
        }
        return gameover;
    }

}
