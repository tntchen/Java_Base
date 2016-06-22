/*
		 * 1.获取要搜索的目录txtPath
		 * 2.获取要搜索的关键字txtKey
		 * 3.封装File对象(要搜索的目录)
		 * 4.获取File对象中包含的文件与文件夹,返回File[]
		 * 5.遍历File[],得到每一个File对象(文件或者文件夹)
		 * 		5.1判断当前的File对象是否是文件夹
		 * 		5.2是文件:获取文件名称,判断是否包含关键字,如果包含打印
		 * 			5.2.1 先获取界面中原有的数据
		 * 			5.2.2 在原有的基础上增加新数据
		 * 			5.2.3 把最后的数据结果显示在界面上
		 * 		5.3否,是文件夹,获取文件夹的名称,判断是否包含关键字key,是:在界面上打印出文件夹路径
		 * 			5.3.1 先获取界面中原有的数据
		 * 			5.3.2 在原有的基础上增加新数据
		 * 			5.3.3 把最后的数据结果显示在界面上
		 * 6.实现个数统计功能
		 * 		6.1创建两个变量,用来记录满足条件的文件和文件夹的个数
		 * 		6.2在文件名满足关键字判断时,文件个数加1
		 * 		6.3在文件夹名满足关键字判断时,文件夹个数加1
		 * 		6.4显示个数统计结果在label上
		 * 7.每次点击搜索时清空原先数据
		 * 8.添加对文本框的判断,为空弹框报错,重新输入
		 */
package cn.iteheima04_FileSearch;

import java.io.File;

import javax.swing.JOptionPane;

/*
 * 继承界面的抽象类,完成搜索按钮功能的实现
 */
public class FileSearchFrameController extends FileSearchFrame {
	//创建两个变量,用来记录满足条件的文件和文件夹的个数
	private int fileCount = 0;
	private int dirCount = 0;
	
	@Override
	public void search() {
		//每次点击搜索时清空原先数据
		fileCount = 0;
		dirCount = 0;
		txtResult.setText("");	
		//获取搜索目录 
		String dir = txtPath.getText();
		//获取关键字
		String key = txtKey.getText();
		//添加对文本框的判断,为空弹框报错,重新输入
		if (dir.equals("")) {
			JOptionPane.showMessageDialog(this, "文件夹不能为空");
		}
		if (key.equals("")) {
			JOptionPane.showMessageDialog(this, "关键字不能为空");
		}
		
		//封装File对象
		File dirPath = new File(dir);
		//定义一个方法获取指定目录下所有的文件与文件夹
		searchDirOrFile(dirPath,key);
		//显示个数统计结果在label上
		labResult.setText("文件:"+fileCount+"个        目录:"+dirCount+"个");
	}
	
	public void searchDirOrFile(File dirPath , String key) {
		//获取File对象中包含的文件与文件夹,返回File[]
		File[] dirOrFiles = dirPath.listFiles();
		//遍历File[],得到每一个File对象
		for (File thisDirOrFile : dirOrFiles) {
			if (thisDirOrFile.isFile()) {
				//获取文件名称
				String fileName = thisDirOrFile.getName();
				if (fileName.contains(key)) {
					//打印
					//先获取界面中原有的数据,在原有的基础上增加新数据,吧最后的数据结果显示在界面上
					String oldStr = txtResult.getText();
					String newStr = thisDirOrFile.getAbsolutePath() + "\r\n";
					txtResult.setText(oldStr + newStr);
					fileCount++;//文件个数加1
				}
			}
			if (thisDirOrFile.isDirectory()) {
				String dirName = thisDirOrFile.getName();
				if (dirName.contains(key)) {
					String oldStr = txtResult.getText();
					String newStr = thisDirOrFile.getAbsolutePath() + "\r\n";
					txtResult.setText(oldStr + newStr);
					dirCount++;//文件夹个数加1
				}
				//递归
				searchDirOrFile(thisDirOrFile, key);
			}
		}
		
	}
}
