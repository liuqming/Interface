package liuming.interface0;

public class 草鱼 extends 动物 implements 水生动物{
	
	public 草鱼(){
		this.set是否哺乳("是");
		this.set是否肉食("是");
	}

	@Override
	public void 呼吸() {
		System.out.println("用腮呼吸");
	}

	@Override
	public void 打招呼() {
		if(this.get情绪() == 1){
			System.out.println("缓慢游动");
		}
		else if(this.get情绪() == 2){
			System.out.println("在水面打水花");
		}
		else if(this.get情绪() == 3){
			System.out.println("躲进水草中");
		}
	}

	@Override
	public void 是否卵生() {
		System.out.println("是");
	}

	@Override
	public void 是否有腮() {
		System.out.println("是");
	}

}
