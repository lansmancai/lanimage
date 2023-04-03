package com.lansmancai.lanimage;

import com.lansmancai.lanimage.ImageFrame;
import com.lansmancai.lanimage.tool.*;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 * ����������
 * 
 */
public class ImageAction extends AbstractAction {
	private String name = "";
	private ImageFrame frame = null;
	private Color color = null;
	private Tool tool = null;
	private JPanel colorPanel = null;

	/**
	 * ������
	 * 
	 * @param icon
	 *            ImageIcon ͼ��
	 * @param name
	 *            ����
	 * @param frame
	 *            ImageFrame
	 */
	public ImageAction(Color color, JPanel colorPanel) {
		// ���ø�������
		super();
		this.color = color;
		this.colorPanel = colorPanel;
	}

	/**
	 * ������
	 * 
	 * @param icon
	 *            ImageIcon ͼ��
	 * @param name
	 *            ����
	 * @param frame
	 *            ImageFrame
	 */
	public ImageAction(ImageIcon icon, String name, ImageFrame frame) {
		// ���ø�������
		super("", icon);
		this.name = name;
		this.frame = frame;
	}

	/**
	 * ��дvoid actionPerformed( ActionEvent e )����
	 * 
	 * @param e
	 *            ActionEvent
	 */
	public void actionPerformed(ActionEvent e) {
		// ����tool
		tool = name != "" ? ToolFactory.getToolInstance(frame, name) : tool;
		if (tool != null) {
			// ��������ʹ�õ�tool
			frame.setTool(tool);
		}
		if (color != null) {
			// ��������ʹ�õ���ɫ
			AbstractTool.color = color;
			colorPanel.setBackground(color);
		}
	}
}