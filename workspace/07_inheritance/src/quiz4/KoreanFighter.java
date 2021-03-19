package quiz4;

public class KoreanFighter extends Fighter{

	//field
	
	//constructor
	public KoreanFighter(String name) {
		super(name, (int)(Math.random() *100) +1, (int)(Math.random()*10) +1);
		
		// TODO Auto-generated constructor stub
	}		
	
	//attack() : 20% 확률로 한방에 Ko시킬 수 있습니다. 
	@Override
	public void attack(Fighter fighter) {	//Fighter: 코리아, 글로벌 모두 올 수 있음
											//figher: 그중 한 파이터(상대편)
		//나: this
		//상대편: fighter
		
		if(Math.random() < 0.2) {
			fighter.setEnergy(0);
			System.out.println(fighter.getName() + "KO!");
		}else {
			//내 power만큼 상대편 energy가 줄어듭니다.
			fighter.setEnergy(fighter.getEnergy() - this.getPower());
			System.out.println("공격: [" + this.getName() + "], 상대편: [" + fighter.getName() + "] 남은에너지: " + fighter.getEnergy());
		}
		
		
	}
}
