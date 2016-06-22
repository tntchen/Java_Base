package cn.homework2;
/*
 * 编写代码，把缓存区中的数据写出
 * 感觉题有歧义,因此把两种都写了
 * 一个是将文件读入缓存并在控制台打印
 * 另一个是将文件读入缓存并输出到另一个文件
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {
	public static void main(String[] args) throws IOException {
		//将文件读入缓存并打印
		demo();
		//将文件读入缓存再输出到文件
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			//写出回车换行符
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
	//将文件读入内存并打印
	public static void demo() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}
}
