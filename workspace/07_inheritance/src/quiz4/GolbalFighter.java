package quiz4;

public class GolbalFighter extends Fighter{

	//constructor
		public GolbalFighter(String name) {
			super(name, (int)(Math.random() *100) +1, (int)(Math.random()*10) +1);
			
			// TODO Auto-generated constructor stub
		}		
		
	//method
	//attack() : 10% 확률로 한방에 Ko시킬 수 있습니다.
		
		@Override
		public void attack(Fighter fighter) {
			if(Math.random() < 0.1) {
				fighter.setEnergy(0);
				System.out.println(fighter.getName() + "KO!");
			}else {
				fighter.setEnergy(fighter.getEnergy() - this.getPower());
				System.out.println("공격: [" + this.getName() + "], 상대편: [" + fighter.getName() + "] 남은에너지: " + fighter.getEnergy());
			}
		}
		
}
