package liuming.interface0;

public class ���� extends ���� implements ½������,ˮ������{
	
	public ����(){
		this.set�Ƿ���("��");
		this.set�Ƿ���ʳ("��");
	}

	@Override
	public void ����() {
		System.out.println("��Ƥ������");
	}
	
	@Override
	public void ���к�() {
		if(this.get����() == 1){
			System.out.println("�ڰ�����Ծ");
		}
		else if(this.get����() == 2){
			System.out.println("������");
		}
		else if(this.get����() == 3){
			System.out.println("��ͨһ������ˮ��");
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
