package liuming.interface0;

public class 狗 extends 动物 implements 陆生动物{
	
	public 狗(){
		this.set是否哺乳("是");
		this.set是否肉食("是");
	}

	@Override
	public void 呼吸() {
		System.out.println("用肺呼吸");
	}

	@Override
	public void 打招呼() {
		if(this.get情绪() == 1){
			System.out.println("摇摇尾巴");
		}
		else if(this.get情绪() == 2){
			System.out.println("旺旺叫");
		}
		else if(this.get情绪() == 3){
			System.out.println("呜呜");
		}
	}
}
