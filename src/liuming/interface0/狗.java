package liuming.interface0;

public class �� extends ���� implements ½������{
	
	public ��(){
		this.set�Ƿ���("��");
		this.set�Ƿ���ʳ("��");
	}

	@Override
	public void ����() {
		System.out.println("�÷κ���");
	}

	@Override
	public void ���к�() {
		if(this.get����() == 1){
			System.out.println("ҡҡβ��");
		}
		else if(this.get����() == 2){
			System.out.println("������");
		}
		else if(this.get����() == 3){
			System.out.println("����");
		}
	}
}
