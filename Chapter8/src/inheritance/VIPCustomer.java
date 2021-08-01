package inheritance;

public class VIPCustomer extends Customer {
	private int agentID; //VIP �� ���� ���̵�
	double salesRatio; //������
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio); //���ε� ������ ����Ͽ� ��ȯ
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵��" + agentID + "�Դϴ�.";
	}
}
