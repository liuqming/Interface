package liuming.interface3;

public class 猎人 extends 人 implements 攻击{
	
	public void 打猎(){
		System.out.println("打猎！");
	}

	@Override
	public void 攻击() {
		System.out.println("猎人攻击！");
	}

	@Override
	public void 介绍自己() {
		System.out.println("我是猎人！");
	}
}
