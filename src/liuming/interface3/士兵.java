package liuming.interface3;

public class 士兵 extends 人 {
	
	public void 抵抗(攻击 x){
		x.攻击();
		System.out.println("抵御攻击！");
	}

	@Override
	public void 介绍自己() {
		System.out.println("我是士兵！");
	}
}
