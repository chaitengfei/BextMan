package ZongHe;

import java.util.*;

public class ChiHuoLianMeng {

	public static void main(String[] args) {
		String[] names = new String[4];// ���涩��������
		String[] dishMegs = new String[4];// ���涩����Ϣ����
		int[] times = new int[4];// �����Ͳ�ʱ��
		String[] addresses = new String[4];// �����Ͳ͵�ַ
		int[] states = new int[4];// ���涩��״̬��0Ϊ��Ԥ����1Ϊ�����
		double[] sumprices = new double[4];// ���涩���ܽ��
		String[] dishnames = { "���˼��ײ�+����", "�ٽ�������+����", "����������+��" };// ��Ʒ����
		double[] prices = new double[] { 42.0, 38.0, 48.0 };// ��Ʒ��λ
		int[] priaiseNums = new int[3];// ��Ʒ��
		int num = -1;// �û�����0���أ������˳�ϵͳ
		Scanner input = new Scanner(System.in);
		boolean isExit = false;// ��־�û��Ƿ��Ƴ�ϵͳ��trueΪ�˳�ϵͳ
		System.out.println("\n��ӭʹ�á��Ի����˶���ϵͳ��");
		// ѭ������ʾ�˵��������û�ѡ�������ִ�й���
		do {
			// ��ʾ�˵�
			System.out.println("************************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ղʹ�");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("************************************");
			System.out.println("��ѡ����Ҫ�ķ���");
			int choose = input.nextInt();// ��¼�û���ѡ��
			// �����û�����ı��ִ����Ӧ�Ĳ���
			// ʹ��switch�ṹ���1-6�������д
			switch (choose) {
			case 1:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");
				boolean isAdd = false;// ��¼�Ƿ���Զ���
				for (int j = 0; j < names.length; j++) {
					if (names[j] == null) {// �ҵ���һ����λ�ã����Զ���
						isAdd = true;// ���Զ���
						System.out.println("�����붩����������");
						String name = input.next();
						// ��ʾ�ɹ�ѡ��Ĳ�Ʒ��Ϣ
						System.out.println("���" + "\t" + "����" + "\t\t" + "����"
								+ "\t" + "������");
						for (int i = 0; i < dishnames.length; i++) {
							String price = (String) (prices[i] + "Ԫ");
							String priaiseNum = (priaiseNums[i]) > 0 ? priaiseNums[i]
									+ "��"
									: "0";
							System.out.println((i + 1) + "\t" + dishnames[i]
									+ "\t" + price + "\t" + priaiseNum);
						}
						// �û����
						System.out.println("����ѡ��Ҫѡ��Ĳ�Ʒ��ţ�");
						int chooseDish = input.nextInt();
						System.out.println("��ѡ������Ҫ�ķ�����");
						int number = input.nextInt();
						String dishMeg = dishnames[chooseDish - 1] + ""
								+ number + "��";
						double sumprice = prices[chooseDish - 1] * number;
						// �ͷ���50�����Ͳͷ�8Ԫ
						double deliCharge = (sumprice >= 50) ? 0 : 8;
						// �Ͳ�ʱ��
						System.out.println("�������Ͳ�ʱ��(����ֻ��10�㵽20��֮�������Ͳ�)��");
						int time = input.nextInt();
						while (time<10||time>20 ) {
							System.out.println("������˼����Ϣ��...");
							System.out.println("�������Ͳ�ʱ��(����ֻ��10�㵽20��֮�������Ͳ�)��");
							time = input.nextInt();
						}
						System.out.println("�������Ͳ͵�ַ��");
						String address = input.next();
						// �������״̬��Ĭ����0,����Ԥ��״̬
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�" + dishMeg);
						System.out.println("����ʱ�䣺" + time + "��");
						System.out.println("�ͷѣ�" + sumprice + "Ԫ���Ͳͷ�"
								+ deliCharge + "Ԫ���ܼƣ�"
								+ (sumprice + deliCharge) + "Ԫ��");
						// �������
						names[j] = name;
						dishMegs[j] = dishMeg;
						times[j] = time;
						addresses[j] = address;
						sumprices[j] = sumprice + deliCharge;
						break;
					}
					if (isAdd) {
						System.out.println("�Բ������Ĳʹ�������");
					}
				}
				break;
			case 2:
				// �鿴�ʹ�
				System.out.println("***�鿴�ʹ�***");
				System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "��Ԥ��" : "�����";
						String date = times[i] + "��";
						String sumprice = sumprices[i] + "Ԫ";
						System.out
								.println((i + 1) + "\t" + names[i] + "\t"
										+ dishMegs[i] + "\t" + date + "\t"
										+ addresses[i] + "\t\t" + sumprice + "\t"
										+ state);
					}
				}
				break;
			case 3:
				// ǩ�ղʹ�
				System.out.println("3.ǩ�ղʹ�");
				boolean isSignFind = false;// �ҵ�Ҫǩ�յĶ���
				System.out.println("��ѡ��Ҫǩ�յĶ�����ţ�");
				int signOrderId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					// ״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ż�һ����ǩ��
					// ״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ż�һ������ǩ��
					if (names[i] != null && states[i] == 0
							&& signOrderId == i + 1) {
						states[i] = 1;// ��״̬��Ϊ�����
						System.out.println("����ǩ����ɣ�");
						isSignFind = true;// ���ҵ��������������
					} else if (names[i] != null && states[i] == 1
							&& signOrderId == i + 1) {
						System.out.println("�ö����ѱ�ǩ�գ������ٴ�ǩ�գ�����");
						isSignFind = true;// ���ҵ��������������
					}
				}
				// δ�ҵ��Ķ�������ǩ��
				if (!isSignFind) {
					System.out.println("�ö��������ڣ���������");
				}
				break;
			case 4:
				// ɾ������
				System.out.println("***ɾ������***");
				boolean isDelFind = false;// ����Ƿ��ҵ�Ҫɾ���Ķ���
				System.out.println("������Ҫɾ���Ķ�����ţ�");
				int delId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					// ״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ż�һ������ɾ��
					// ״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ż�һ����ɾ��
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						isDelFind = true;// ������ҵ��˶���
						// ִ�в���������ǰ�Ƹ���
						for (int j = 0; j < names.length - 1; j++) {
							names[j] = names[j + 1];
							dishMegs[j] = dishMegs[j + 1];
							times[j] = times[j + 1];
							addresses[j] = addresses[j + 1];
							states[j] = states[j + 1];
							sumprices[j] = sumprices[j + 1];
						}
						// ���һλ���
						int endIndex = names.length - 1;
						names[endIndex] = null;
						dishMegs[endIndex] = null;
						times[endIndex] = 0;
						addresses[endIndex] = null;
						states[endIndex] = 0;
						sumprices[endIndex] = 0;
						System.out.println("ɾ�������ɹ���");
						break;
					} else if (names[i] != null && states[i] == 0
							&& delId == i + 1) {
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
						isDelFind = true;// ������ҵ��˶���
						break;
					}
				}
				// δ�ҵ�����ŵĶ���;����ɾ��
				if (!isDelFind) {
					System.out.println("��Ҫɾ���Ķ��������ڣ�");
				}
				break;
			case 5:
				// ��Ҫ����
				System.out.println("***��Ҫ����***");
				// ��ʾ��Ʒ��Ϣ
				System.out.println("���" + "\t" + "����" + "\t" + "����");
				for (int i = 0; i < dishnames.length; i++) {
					String price = prices[i] + "Ԫ";
					String praiseNum = (priaiseNums[i]) > 0 ? priaiseNums[i]
							+ "��" : "";
					System.out.println((i + 1) + "\t" + dishnames[i] + "\t"
							+ price + "\t" + praiseNum);
				}
				System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int priaiseNum = input.nextInt();
				priaiseNums[priaiseNum - 1]++;// ������+1
				System.out.println("���޳ɹ���");
				break;
			case 6:
				// �˳�ϵͳ
				isExit = true;
				break;
			default:
				// �˳�ϵͳ
				isExit = true;
				break;
			}
			if (!isExit) {
				System.out.println("����0���أ�");
				num = input.nextInt();
			} else {
				break;
			}

		} while (num == 0);
		System.out.println("ллʹ�ã���ӭ�´ι��٣�����");
		input.close();
	}
	
}
