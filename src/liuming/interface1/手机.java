package liuming.interface1;

public class �ֻ� extends �绰 implements ����,����,����{
	
	@Override
	public void ��绰() {
		System.out.println("��绰");
	}

	@Override
	public void ����() {
		System.out.println("��������");
	}

	@Override
	public void ����() {
		System.out.println("�������࣡");
	}

	@Override
	public void �Ÿ�() {
		System.out.println("���ڷŸ裡");
	}
	
	public static void main(String[] args) {
		�ֻ� sj = new �ֻ�();
		sj.��绰();
		sj.����();
	}
}
