package dailywork05;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args)
	{
		String s=JOptionPane.showInputDialog("请输入您的姓名：");
		String i="请先注册。谢谢！";
		if (s!= null)
		{
			JOptionPane.showMessageDialog(null, "长江大学图书馆欢迎你："+s);
		}
		else
			JOptionPane.showMessageDialog(null, i);
		
	}

}
//