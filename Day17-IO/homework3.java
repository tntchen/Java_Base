//package cn.itheima_Buffer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * ��д���򣬶�ȡ��������ݣ����ж����ݣ������exit���˳�
 */
public class homework3 {
	public static void main(String[] args) throws IOException {
		//���� �ַ� �����
		FileWriter in=new FileWriter("a.txt");
		
		//д������
		while(true){
			System.out.println("�������ַ���:");
			//���� ����¼��
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
			in.write(str+"\r\n");
			
		}
		
		//�ر���
		in.close();
	}

}