/**功能：编写一个JFrame窗口，要求如下
 * 1：在窗口的最上方放一个JLable标签，标签中默认的文本是“此处显示鼠标右键点击的坐标”
 * 2：位JFrame添加一个鼠标事件，当鼠标右键点击窗口时，鼠标的坐标在JLable标签中显示。
 */
package exercise;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
 public class Chapter9_6_1{
  public static void main(String[] args){
  MyJFrame mj=new MyJFrame();//定义窗口框架类
  mj.lunchframe();//调用框架类的lunchframe方法
  }
 }
class MyJFrame extends JFrame{//通过继承JFrame的方法来实现一个窗口
 JLabel jb=new JLabel("此处显示鼠标右键点击的内容");//定义一个标签并初始化其默认文本
 public void lunchframe(){
  setLocation(300,500);//设置窗体的位置
  setSize(400,400);//设置窗体的大小
  setTitle("郝芳的第九章课后习题1");
  setLayout(new FlowLayout(150));//设置窗体的布局管理器
  addWindowListener(new WindowAdapter() {//为窗体添加一个关闭窗体的事件监听器
  public void windowClosing(WindowEvent e) {//实现窗体适配器中的一个方法
    super.windowClosing(e);//调用父类的关闭方法
   }
  });
  setVisible(true);//使窗体为可见
  add(jb);//窗体上添加标签
  jb.addMouseListener(new MyMouseListener());//标签上注册一个鼠标事件监听
 }
 class MyMouseListener extends MouseAdapter{//自定义一个事件监听，继承自事件体系-适配器
  public void mousePressed(MouseEvent e) {//重写鼠标的点击事件
   if(e.getButton()==MouseEvent.BUTTON3){//如果是鼠标右键则执行以下操作
   int x=e.getX();//获取鼠标的x坐标
   int y=e.getY();
   String s="当前鼠标坐标为"+x+","+y;
   jb.setText(s);//重置标签的内容
   }
  }
  
 }
