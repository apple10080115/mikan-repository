package remakeBattle;

import lib.Input;
import remakeBattle.remakeBattleCharacter.Character;
import remakeBattle.remakeBattleCharacter.Player;
import remakeBattle.remakeBattlePrinter.RemakeBattlePrinter;
import remakeBattle.remakeBattleTools.RemakeBattleTools;

public class RemakeBattle {

	public static void main(String[] args) {
		RemakeBattleTools rbt = new RemakeBattleTools();
		RemakeBattlePrinter rbp = new RemakeBattlePrinter();
		Player player = rbt.bearPlayer();
		Character enemy = rbt.bearRandomEnemy();
		rbp.appearedEnemy(enemy);
		boolean gameover = true;
		while (gameover) {
			rbp.battleGui(player, enemy);
			gameover = rbt.playerAction(player, enemy, Input.getInt(""));
			if (!gameover) {
				gameover = rbp.gameoverResultPrint(player, enemy);
				if (!gameover) {
					break;
				}
				gameover = rbt.gameoverChoice();
				if (gameover) {
					enemy = rbt.bearRandomEnemy();
					rbp.appearedEnemy(enemy);
				}
			}
		}
		rbp.gameoverMessage();
	}

}
