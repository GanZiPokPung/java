package Chapter3;

import java.util.regex.Pattern;

//class Supply {
//	/**
//	 * �Ʒ� �ڵ�� ��𼭵� ��� �ĺ��Ѵ�.
//	 * 
//	 * S�� ������ ���� �ټ��ڸ� ��� ��ȣ�� ������
//	 * ���̾� ���� ��� ��ȣ�� �����ϱ� ���� �� �����ð� ������
//	 * ���� �ڵ尡 ������ ������ ������ ������.
//	 * ���� �ڵ�� �ݵ�� ���� ������ (US, EU, RU, CN) ��
//	 * �ϳ��� ���ϴ� �빮�� �� ������ �Ѵ�.
//	 * �̾ ��ħǥ�� ���� ������ �ҹ��ڷ� ���´�.
//	 */
//	static final Pattern CODE =
//			Pattern.compile("^S\\d{5}\\\\(US|EU|RU|CN)\\.[a-z]+$");
//}

class Supply {
	/**
	 * �Ʒ� ǥ������ ��𼭵� ��� �ڵ带 �ĺ��Ѵ�.
	 * 
	 * ����: "S<inventory-number>\<COUNTRY_CODE>.<name>"
	 * 
	 * ��ȿ�� ��: "S12345\US.pasta", "S08342\CN.wrench"
	 * "S88888\EU.laptop", "S12233\RU.brush"
	 * 
	 * ��ȿ���� ���� ��:
	 * "R12345\RU.fuel"		(��� �ƴ� �ڿ�)
	 * "S1234\US.light"		(���ڰ� �ټ� ������ ��)
	 * "S01234\AI.coconut"	(�߸��� ���� �ڵ�, US EU RU CN �� �ϳ��� ����Ѵ�)
	 * "S88888\EU.laptop " 	(�������� ������ ����)
	 */
	static final Pattern SUPPLY_CODE =
			Pattern.compile("^S\\d{5}\\\\(US|EU|RU|CN)\\.[a-z]+$");
}
