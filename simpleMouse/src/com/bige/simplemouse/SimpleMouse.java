package com.bige.simplemouse;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleMouse implements MouseListener {
	JFrame a = new JFrame("鼠标事件演示窗口"); // 窗体标题
	Container contentPane = a.getContentPane();
	JLabel label = new JLabel("初始状态", JLabel.CENTER); // 使事件的文字居中

	public void go() {
		contentPane.addMouseListener(this);
		contentPane.add(label);
		a.setSize(640, 480);
		a.setVisible(true);
		a.setResizable(false);
	}

	public void mousePressed(MouseEvent e) {
		label.setText("按下鼠标按钮");
	}

	public void mouseReleased(MouseEvent e) {
		label.setText("释放鼠标按钮");
	}

	public void mouseEntered(MouseEvent e) {
		label.setText("鼠标光标进入按钮");
	}

	public void mouseExited(MouseEvent e) {
		label.setText("鼠标光标离开按钮");
	}

	public void mouseClicked(MouseEvent e) {
		label.setText("单击鼠标");
	}

	public static void main(String[] args) {
		SimpleMouse b = new SimpleMouse();
		b.go();
	}
}