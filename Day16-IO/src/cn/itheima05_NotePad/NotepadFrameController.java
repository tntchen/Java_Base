package cn.itheima05_NotePad;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class NotepadFrameController extends AbstractNotepadFrame {

	@Override
	public void openMenuItemClick() {
		// ��ʾ�ļ��Ի��򣬷���Ҫ�򿪵��ļ�����
		String filePath = this.openFileDialog();
		// ����û�û��ѡ���ļ��������ȡ����
		if (filePath == null) {
			return;
		}
		// ���TextArea
		txtArea.setText("");

		// ��ȡ�ļ�������ʾ
		try {
			FileReader in = new FileReader(filePath);
			//������ʱ���������洢ÿ�ζ�ȡ���ַ�
			char[] charArray = new char[1024];
			int len = 0;
			while ((len = in.read(charArray)) != -1) {
				// �����ı�����ʾ������,ʹ��appendʵ��׷����ʾ,��ʱ���õ�������
				//̫С���������޷���ʾ
				txtArea.append(new String(charArray, 0, len));
			}
			in.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "��ȡ�ļ�����");
			return;
		}
	}

	@Override
	public void saveMenuItemClick() {
		// ��"����Ի���",����Ҫ������ļ�����
		String filePath = this.saveFileDialog();
		// ����û�û��ѡ���ļ��������ȡ����
		if (filePath == null) {
			return;// �û�ȡ��
		}
		// д���ݵ��ļ�
		String str = txtArea.getText();
		try {
			FileWriter out = new FileWriter(filePath);
			out.write(str);
			out.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "�����ļ�����");
			return;
		}
	}
}
