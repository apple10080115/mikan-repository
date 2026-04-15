package eBattleGame.characters.enemys;

import java.util.Arrays;

import eBattleGame.BattleGameCalc;
import eBattleGame.BattleGameTools;
import eBattleGame.characters.Character;
import eBattleGame.skills.Magic;

public class Bat extends eBattleGame.characters.Character {

    public Bat() {
        int[] status = BattleGameTools.enemyStatusInit(10, 30, 3, 8, 4, 5, 7, 5);
        this.setName("バット");
        this.setHp(status[0]);
        this.setMaxHp(status[0]);
        this.setMp(status[1]);
        this.setMaxMp(status[1]);
        this.setAttackPower(status[2]);
        this.setMagicPower(status[3]);
        this.setPhyDefense(status[4]);
        this.setMagDefense(status[5]);
        this.setSpeed(status[6]);
        this.setLack(status[7]);
        this.setType("闇");
        this.setMagic(Arrays.asList(Magic.daless(), Magic.fiar()));
    }

    @Override
    public int attack(Character player) {
        int damage = new BattleGameCalc().enemyAttackDamage(this, player);
        player.setHp(player.getHp() - damage);
        return damage;
    }

    @Override
    public int magic(Character player) {
    	Magic magic = BattleGameTools.normalEnemyMagicChoice(player, this.getMagics());
    	if (BattleGameTools.enoughMpJugement(this, magic)) {
    		return new BattleGameCalc().enemyMagicAttack(this, player, magic);
    	}
        return 0;
    }
    
}