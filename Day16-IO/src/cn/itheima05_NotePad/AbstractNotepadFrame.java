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
	// 添加菜单
	MenuBar bar = new MenuBar();
	// 文件菜单
	Menu fileMenu = new Menu("文件");
	// 菜单项
	MenuItem openItem = new MenuItem("打开");
	MenuItem saveItem = new MenuItem("保存");
	MenuItem closeItem = new MenuItem("退出");
	// 文本显示区域
	protected JTextArea txtArea = new JTextArea();

	// 如果"打开"操作，会将打开的文件路径覆盖此路径；如果此路径为空，可以保存为新文件；
	private String filePath = null;
	JFileChooser chooser = new JFileChooser();

	// 构造方法
	public AbstractNotepadFrame() {
		init();
		addComponent();
		addListener();
	}

	// 窗体初始化
	private void init() {
		// 设置窗体初始大小
		this.setSize(500, 500);
		// 设置默认关闭行为
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// 设置标题
		this.setTitle("我的记事本");
	}

	// 添加组件
	public void addComponent() {
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(closeItem);
		bar.add(fileMenu);
		this.setMenuBar(bar);
		// 添加文本域
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(this.txtArea);
		this.add(sp);

	}

	// 添加事件监听
	public void addListener() {
		// "打开"事件
		openItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openMenuItemClick();
			}
		});

		// "保存"事件
		saveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveMenuItemClick();
			}
		});

		// "关闭"事件
		closeItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	// 打开"打开对话框"
	public String openFileDialog() {
		int returnVal = chooser.showOpenDialog(this);
		//点击取消按钮
		if (returnVal != JFileChooser.APPROVE_OPTION) {
			return null;
		}
		filePath = chooser.getSelectedFile().getAbsolutePath();
		return this.filePath;
	}

	// 打开"保存对话框"
	public String saveFileDialog() {

		File file;
		if (filePath == null) {
			file = new File("新建文本文档.txt");
		} else {
			file = new File(filePath);
		}
		chooser.setSelectedFile(file);// 设置默认文件名
		int val = chooser.showSaveDialog(this);// 显示“保存文件”对话框
		if (val == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			// *********验证所选位置是否已包含同名的文件**************//
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
				int op = JOptionPane.showOptionDialog(this, "已存在同名的文件，是否替换？", "是否替换文件", JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE, null, null, null);
				if (op == 1) {// 选择"否"
					return null;
				}
			}
			// **********设置输出流****************************//
			filePath = file.getAbsolutePath();
			return filePath;
		}
		return null;

	}

	// "打开"事件处理函数
	public abstract void openMenuItemClick();

	// "保存"事件处理函数
	public abstract void saveMenuItemClick();

}
