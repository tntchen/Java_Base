package cn.itheima05_NotePad;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public abstract class AbstractNotepadFrame extends JFrame {
	// ��Ӳ˵�
	MenuBar bar = new MenuBar();
	// �ļ��˵�
	Menu fileMenu = new Menu("�ļ�");
	// �˵���
	MenuItem openItem = new MenuItem("��");
	MenuItem saveItem = new MenuItem("����");
	MenuItem closeItem = new MenuItem("�˳�");
	// �ı���ʾ����
	protected JTextArea txtArea = new JTextArea();

	// ���"��"�������Ὣ�򿪵��ļ�·�����Ǵ�·���������·��Ϊ�գ����Ա���Ϊ���ļ���
	private String filePath = null;
	JFileChooser chooser = new JFileChooser();

	// ���췽��
	public AbstractNotepadFrame() {
		init();
		addComponent();
		addListener();
	}

	// �����ʼ��
	private void init() {
		// ���ô����ʼ��С
		this.setSize(500, 500);
		// ����Ĭ�Ϲر���Ϊ
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// ���ñ���
		this.setTitle("�ҵļ��±�");
	}

	// ������
	public void addComponent() {
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(closeItem);
		bar.add(fileMenu);
		this.setMenuBar(bar);
		// ����ı���
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(this.txtArea);
		this.add(sp);

	}

	// ����¼�����
	public void addListener() {
		// "��"�¼�
		openItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openMenuItemClick();
			}
		});

		// "����"�¼�
		saveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveMenuItemClick();
			}
		});

		// "�ر�"�¼�
		closeItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	// ��"�򿪶Ի���"
	public String openFileDialog() {
		int returnVal = chooser.showOpenDialog(this);
		//���ȡ����ť
		if (returnVal != JFileChooser.APPROVE_OPTION) {
			return null;
		}
		filePath = chooser.getSelectedFile().getAbsolutePath();
		return this.filePath;
	}

	// ��"����Ի���"
	public String saveFileDialog() {

		File file;
		if (filePath == null) {
			file = new File("�½��ı��ĵ�.txt");
		} else {
			file = new File(filePath);
		}
		chooser.setSelectedFile(file);// ����Ĭ���ļ���
		int val = chooser.showSaveDialog(this);// ��ʾ�������ļ����Ի���
		if (val == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			// *********��֤��ѡλ���Ƿ��Ѱ���ͬ�����ļ�**************//
			String saveName = file.getName();
			File parentFile = file.getParentFile();
			String[] fileNameArray = parentFile.list();
			boolean isExist = false;
			for (String fileName : fileNameArray) {
				if (fileName.equalsIgnoreCase(saveName)) {
					isExist = true;
				}
			}
			if (isExist) {
				int op = JOptionPane.showOptionDialog(this, "�Ѵ���ͬ�����ļ����Ƿ��滻��", "�Ƿ��滻�ļ�", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE, null, null, null);
				if (op == 1) {// ѡ��"��"
					return null;
				}
			}
			// **********���������****************************//
			filePath = file.getAbsolutePath();
			return filePath;
		}
		return null;

	}

	// "��"�¼�������
	public abstract void openMenuItemClick();

	// "����"�¼�������
	public abstract void saveMenuItemClick();

}
