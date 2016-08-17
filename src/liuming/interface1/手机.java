package liuming.interface1;

public class 手机 extends 电话 implements 听歌,照相,摄像{
	
	@Override
	public void 打电话() {
		System.out.println("打电话");
	}

	@Override
	public void 摄像() {
		System.out.println("正在摄像！");
	}

	@Override
	public void 照相() {
		System.out.println("正在照相！");
	}

	@Override
	public void 放歌() {
		System.out.println("正在放歌！");
	}
	
	public static void main(String[] args) {
		手机 sj = new 手机();
		sj.打电话();
		sj.摄像();
	}
}
