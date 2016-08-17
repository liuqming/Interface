package liuming.interface3;

public class 农民 extends 人 implements 治疗{
	
	public void 采矿(){
		System.out.println("采矿");
	}

	@Override
	public void 治疗() {
		System.out.println("农民治疗");
	}

	@Override
	public void 介绍自己() {
		System.out.println("我是农民！");
	}
}
