package liuming.interface0;

public class 猫 extends 动物 implements 陆生动物{

	public 猫(){
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
			System.out.println("喵～");
		}
		else if(this.get情绪() == 2){
			System.out.println("咕噜咕噜");
		}
		else if(this.get情绪() == 3){
			System.out.println("嘶嘶");
		}
	}
}
