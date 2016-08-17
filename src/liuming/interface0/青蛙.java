package liuming.interface0;

public class 青蛙 extends 动物 implements 陆生动物,水生动物{
	
	public 青蛙(){
		this.set是否哺乳("否");
		this.set是否肉食("否");
	}

	@Override
	public void 呼吸() {
		System.out.println("用皮肤呼吸");
	}
	
	@Override
	public void 打招呼() {
		if(this.get情绪() == 1){
			System.out.println("在岸上跳跃");
		}
		else if(this.get情绪() == 2){
			System.out.println("呱呱呱");
		}
		else if(this.get情绪() == 3){
			System.out.println("扑通一声跳入水中");
		}
	}

	@Override
	public void 是否卵生() {
		System.out.println("是");
	}

	@Override
	public void 是否有腮() {
		System.out.println("否");
	}
}
