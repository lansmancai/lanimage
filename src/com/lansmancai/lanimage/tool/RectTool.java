package com.lansmancai.lanimage.tool;

import com.lansmancai.lanimage.ImageFrame;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * ���ι���
 * 
 */
public class RectTool extends AbstractTool {
	private static Tool tool = null;

	private RectTool(ImageFrame frame) {
		super(frame);
	}

	public static Tool getInstance(ImageFrame frame) {
		if (tool == null) {
			tool = new RectTool(frame);
		}
		return tool;
	}

	/**
	 * ��ͼ��
	 * 
	 * @param g
	 *            Graphics
	 * @param x1
	 *            ���x����
	 * @param y1
	 *            ���y����
	 * @param x2
	 *            �յ�x����
	 * @param y2
	 *            �յ�y����
	 * @return void
	 */
	public void draw(Graphics g, int x1, int y1, int x2, int y2) {
		// �������
		int x = x2 > x1 ? x1 : x2;
		int y = y2 > y1 ? y1 : y2;
		// ������
		g.drawRect(x, y, Math.abs(x1 - x2), Math.abs(y1 - y2));
	}
}