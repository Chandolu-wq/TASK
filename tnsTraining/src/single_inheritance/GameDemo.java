package single_inheritance;

public class GameDemo {
		public static void main(String[] args) {
			
			Warrior wa = new Warrior();
			wa.setName("SpiderWeb");
			wa.setHealth(100);
			wa.setAttackPower(85);
			wa.setWeapon("Web");
			
			wa.displayWarriorDetails();
		}

	}

