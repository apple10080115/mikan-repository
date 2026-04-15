package com.mikanGames.battleGame;

import com.mikanGames.battleGame.characters.Character;
import com.mikanGames.battleGame.skills.Magic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * ツールクラス
 */
public class BattleGameTools {

    public int enemyRandomAction(Character enemy) {
        int action = 1;
        if (enemy.getAttackPower() > enemy.getMagicPower()) {
            if (enemy.getMagics() != null) {
                for (Magic magic : enemy.getMagics()) {
                    if (enemy.getMp() > magic.getMpConsumption()) {
                        if (Math.random() < 0.25) {
                            action = 2;
                            return action;
                        }
                    }
                }
            }
        } else {
            if (enemy.getMp() > enemy.getMaxMp() / 4) {
                if (Math.random() < 0.75) {
                    action = 2;
                }
            }
        }
        return action;
    }

    public Map<Integer, Character> enemiesMaper(Character... enemies) {
        Integer no = 0;
        Map<Integer, Character> enemyMap = new TreeMap<>();
        for (Character enemy : enemies) {
            no++;
            enemyMap.put(no, enemy);
        }
        return enemyMap;
    }

    public List<Character> appearedEnemies(Map<Integer, Character> enemies) {
        List<Character> appearedEnemies = new ArrayList<>();
        double severalRandom = Math.random();
        if (severalRandom < 0.4) {
            Character enemy = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
            enemy.setName(enemy.getName() + "A");
            appearedEnemies.add(enemy);
        } else if (severalRandom < 0.8) {
            Character enemy = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
            Character enemy2 = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));

            if (enemy.getName().equals(enemy2.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "B");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
            } else {
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
            }

        } else if (severalRandom < 0.9) {
            Character enemy = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
            Character enemy2 = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
            Character enemy3 = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));

            if (enemy.getName().equals(enemy2.getName()) && enemy.getName().equals(enemy3.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "B");
                enemy3.setName(enemy.getName() + "C");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
            } else if (enemy.getName().equals(enemy2.getName()) && !enemy.getName().equals(enemy3.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "B");
                enemy3.setName(enemy.getName() + "A");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
            } else if (enemy.getName().equals(enemy3.getName()) && !enemy.getName().equals(enemy2.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "A");
                enemy3.setName(enemy.getName() + "B");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
            } else {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "A");
                enemy3.setName(enemy.getName() + "A");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
            }
        } else {
            Character enemy = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
            Character enemy2 = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
            Character enemy3 = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));
            Character enemy4 = enemies.get(BattleGameCalc.randomEnemyBorn(enemies));

            if (enemy.getName().equals(enemy2.getName()) && enemy.getName().equals(enemy3.getName()) && enemy.getName().equals(enemy4.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "B");
                enemy3.setName(enemy.getName() + "C");
                enemy4.setName(enemy.getName() + "D");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            } else if (enemy.getName().equals(enemy2.getName()) && enemy.getName().equals(enemy3.getName()) && !enemy.getName().equals(enemy4.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "B");
                enemy3.setName(enemy.getName() + "C");
                enemy4.setName(enemy.getName() + "A");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            } else if (enemy.getName().equals(enemy2.getName()) && enemy.getName().equals(enemy4.getName()) && !enemy.getName().equals(enemy3.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "B");
                enemy3.setName(enemy.getName() + "A");
                enemy4.setName(enemy.getName() + "C");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            } else if (enemy.getName().equals(enemy3.getName()) && enemy.getName().equals(enemy4.getName()) && !enemy.getName().equals(enemy2.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "A");
                enemy3.setName(enemy.getName() + "B");
                enemy4.setName(enemy.getName() + "C");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            } else if (enemy.getName().equals(enemy4.getName()) && !enemy.getName().equals(enemy2.getName()) && !enemy.getName().equals(enemy3.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "A");
                enemy3.setName(enemy.getName() + "A");
                enemy4.setName(enemy.getName() + "B");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            } else if (enemy.getName().equals(enemy2.getName()) && enemy3.getName().equals(enemy4.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "B");
                enemy3.setName(enemy.getName() + "A");
                enemy4.setName(enemy.getName() + "B");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            } else if (enemy.getName().equals(enemy3.getName()) && enemy2.getName().equals(enemy4.getName())) {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "A");
                enemy3.setName(enemy.getName() + "B");
                enemy4.setName(enemy.getName() + "B");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            } else {
                enemy.setName(enemy.getName() + "A");
                enemy2.setName(enemy.getName() + "A");
                enemy3.setName(enemy.getName() + "A");
                enemy4.setName(enemy.getName() + "A");
                appearedEnemies.add(enemy);
                appearedEnemies.add(enemy2);
                appearedEnemies.add(enemy3);
                appearedEnemies.add(enemy4);
            }

        }
        return appearedEnemies;
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

    public static boolean enoughMpJugement(Character c, Magic magic) {
        boolean result = false;
        if (c.getMp() - magic.getMpConsumption() > c.getMp()) {
            c.setMp(c.getMp() - magic.getMpConsumption());
            result = true;
        }
        return result;
    }

    public static Magic normalEnemyMagicChoice(Character player, List<Magic> magics) {
        Magic castMagic = magics.get(new Random().nextInt(magics.size()));
        switch (player.getType()) {
            case "無":
                break;
            case "火":
                for (Magic magic : magics) {
                    if (magic.getType().equals("水")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                        }
                    }
                }
                break;
            case "水":
                for (Magic magic : magics) {
                    if (magic.getType().equals("木")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                        }
                    }
                }
                break;
            case "木":
                for (Magic magic : magics) {
                    if (magic.getType().equals("火")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                        }
                    }
                }
                break;
            case "光":
                for (Magic magic : magics) {
                    if (magic.getType().equals("闇")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                        }
                    }
                }
                break;
            case "闇":
                for (Magic magic : magics) {
                    if (magic.getType().equals("光")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                        }
                    }
                }
                break;
            case "神":
                for (Magic magic : magics) {
                    if (magic.getType().equals("魔")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                            return castMagic;
                        }
                    }
                }

                for (Magic magic : magics) {
                    if (magic.getType().equals("無")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                        }
                    }
                }
                break;
            case "魔":
                for (Magic magic : magics) {
                    if (magic.getType().equals("神")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                            return castMagic;
                        }
                    }
                }

                for (Magic magic : magics) {
                    if (magic.getType().equals("無")) {
                        if (Math.random() < 0.75) {
                            castMagic = magic;
                        }
                    }
                }
                break;
        }
        return castMagic;
    }

    public static Magic EnemyMagicChoice(Character player, List<Magic> magics) {
        Magic castMagic = magics.get(new Random().nextInt(magics.size()));
        switch (player.getType()) {
            case "無":
                break;
            case "火":
                for (Magic magic : magics) {
                    if (magic.getType().equals("水")) {
                        castMagic = magic;
                    }
                }
                break;
            case "水":
                for (Magic magic : magics) {
                    if (magic.getType().equals("木")) {
                        castMagic = magic;
                    }
                }
                break;
            case "木":
                for (Magic magic : magics) {
                    if (magic.getType().equals("火")) {
                        castMagic = magic;
                    }
                }
                break;
            case "光":
                for (Magic magic : magics) {
                    if (magic.getType().equals("闇")) {
                        castMagic = magic;
                    }
                }
                break;
            case "闇":
                for (Magic magic : magics) {
                    if (magic.getType().equals("光")) {
                        castMagic = magic;
                    }
                }
                break;
            case "神":
                for (Magic magic : magics) {
                    if (magic.getType().equals("魔")) {
                        castMagic = magic;
                        return castMagic;
                    }
                }

                for (Magic magic : magics) {
                    if (magic.getType().equals("無")) {
                        castMagic = magic;
                    }
                }
                break;
            case "魔":
                for (Magic magic : magics) {
                    if (magic.getType().equals("神")) {
                        castMagic = magic;
                        return castMagic;
                    }
                }

                for (Magic magic : magics) {
                    if (magic.getType().equals("無")) {
                        castMagic = magic;
                    }
                }
                break;
        }
        return castMagic;
    }

}
