package liuming.interface0;

public class ���� extends ���� implements ˮ������{
	
	public ����(){
		this.set�Ƿ���("��");
		this.set�Ƿ���ʳ("��");
	}

	@Override
	public void ����() {
		System.out.println("��������");
	}

	@Override
	public void ���к�() {
		if(this.get����() == 1){
			System.out.println("�����ζ�");
		}
		else if(this.get����() == 2){
			System.out.println("��ˮ���ˮ��");
		}
		else if(this.get����() == 3){
			System.out.println("���ˮ����");
		}
	}

	@Override
	public void �Ƿ�����() {
		System.out.println("��");
	}

	@Override
	public void �Ƿ�����() {
		System.out.println("��");
	}

}
