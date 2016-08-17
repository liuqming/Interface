package liuming.interface3;

public class 玩家 extends 人 {
	
	public void 控制(人 r){
		r.介绍自己();
	}
	
	@Override
	public void 介绍自己() {
		System.out.println("我是玩家！");
	}
}
