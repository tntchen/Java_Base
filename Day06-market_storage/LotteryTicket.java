import java.util.ArrayList;
import java.util.Random;

/*
 * ����:
 * 		˫ɫ��ҡ��:?	���ҡ��1-33֮���7��������������ظ�
 * 
 * ����:
 * 	����һ��ArrayList<Integer> num���洢����˫ɫ������
 * 	�򼯺��ڴ���1-33����
 * 	ѭ���ظ�7��ѡ��7����
	 * ʹ��randomѡ���������--->����
	 * ѡ�����ִ��뼯��ArrayList<Integer> lottery
	 *ÿ�ζ������ѡ�������ֺ�lottery�Ƚ�,�ظ���ѡһ��
 * 	lottery������
 */
public class LotteryTicket {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//����33������
		for (int i = 1; i <= 33; i++) {
			num.add(i);
		}
		//���弯��lottery�洢�н�����
		ArrayList<Integer> lottery = new ArrayList<Integer>();
		//׼��ѭ��֪��ѡ����7����
		do {
			Random r = new Random();
			int m = r.nextInt(num.size());
			for (int i = 0; i < lottery.size(); i++) {
				int index = lottery.get(i);
				if (m != index) {
					lottery.add(m);
				}
			}			
		} while (lottery.size() == 7);
		System.out.println("�н�����Ϊ:");
		System.out.println(lottery);
	}
}