package cn.itheima05_NotePad;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class NotepadFrameController extends AbstractNotepadFrame {

	@Override
	public void openMenuItemClick() {
		// 显示文件对话框，返回要打开的文件名称
		String filePath = this.openFileDialog();
		// 如果用户没有选择文件，并点击取消；
		if (filePath == null) {
			return;
		}
		// 清空TextArea
		txtArea.setText("");

		// 获取文件内容显示
		try {
			FileReader in = new FileReader(filePath);
			//创建临时数组用来存储每次读取的字符
			char[] charArray = new char[1024];
			int len = 0;
			while ((len = in.read(charArray)) != -1) {
				// 设置文本域显示的内容,使用append实现追加显示,这时不用担心数组
				//太小导致文字无法显示
				txtArea.append(new String(charArray, 0, len));
			}
			in.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "读取文件出错！");
			return;
		}
	}

	@Override
	public void saveMenuItemClick() {
		// 打开"保存对话框",返回要保存的文件名称
		String filePath = this.saveFileDialog();
		// 如果用户没有选择文件，并点击取消；
		if (filePath == null) {
			return;// 用户取消
		}
		// 写数据到文件
		String str = txtArea.getText();
		try {
			FileWriter out = new FileWriter(filePath);
			out.write(str);
			out.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "保存文件出错！");
			return;
		}
	}
}
