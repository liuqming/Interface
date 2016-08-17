package liuming.interface0;

public abstract class 动物 {
	private int 情绪;
	private String 是否哺乳;
	private String 是否肉食;
	
	public abstract void 呼吸();
	public abstract void 打招呼();
	
	
	public int get情绪() {
		return 情绪;
	}
	public void set情绪(int 情绪) {
		this.情绪 = 情绪;
	}
	
	
	public String get是否哺乳() {
		return 是否哺乳;
	}
	public void set是否哺乳(String 是否哺乳) {
		this.是否哺乳 = 是否哺乳;
	}
	public String get是否肉食() {
		return 是否肉食;
	}
	public void set是否肉食(String 是否肉食) {
		this.是否肉食 = 是否肉食;
	}
	
}
