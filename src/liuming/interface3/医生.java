package liuming.interface3;

public class 医生 extends 人 implements 治疗{
	
	public void 治疗(){
		System.out.println("医生治疗！");
	}

	@Override
	public void 介绍自己() {
		System.out.println("我是医生！");
	}
}
