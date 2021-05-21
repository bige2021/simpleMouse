package com.bige.simplemouse;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleMouse implements MouseListener {
	JFrame a = new JFrame("����¼���ʾ����"); // �������
	Container contentPane = a.getContentPane();
	JLabel label = new JLabel("��ʼ״̬", JLabel.CENTER); // ʹ�¼������־���

	public void go() {
		contentPane.addMouseListener(this);
		contentPane.add(label);
		a.setSize(640, 480);
		a.setVisible(true);
		a.setResizable(false);
	}

	public void mousePressed(MouseEvent e) {
		label.setText("������갴ť");
	}

	public void mouseReleased(MouseEvent e) {
		label.setText("�ͷ���갴ť");
	}

	public void mouseEntered(MouseEvent e) {
		label.setText("�������밴ť");
	}

	public void mouseExited(MouseEvent e) {
		label.setText("������뿪��ť");
	}

	public void mouseClicked(MouseEvent e) {
		label.setText("�������");
	}

	public static void main(String[] args) {
		SimpleMouse b = new SimpleMouse();
		b.go();
	}
}