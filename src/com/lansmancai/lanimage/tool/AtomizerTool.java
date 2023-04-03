package com.lansmancai.lanimage.tool;

import com.lansmancai.lanimage.ImageFrame;
import java.util.Random;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

/**
 * ��ī����
 * 
 */
public class AtomizerTool extends AbstractTool {
	private static Tool tool = null;

	private AtomizerTool(ImageFrame frame) {
		super(frame, "img/atomizercursor.gif");
	}

	public static Tool getInstance(ImageFrame frame) {
		if (tool == null) {
			tool = new AtomizerTool(frame);
		}
		return tool;
	}

	/**
	 * �������
	 * 
	 * @param e
	 *            MouseEvent
	 * @return void
	 */
	public void mousePressed(MouseEvent e) {
		if (e.getX() > 0 && e.getX() < AbstractTool.drawWidth && e.getY() > 0
				&& e.getY() < AbstractTool.drawHeight) {
			setPressX(e.getX());
			setPressY(e.getY());
			Graphics g = getFrame().getBufferedImage().getGraphics();
			draw(e, g);
		}
	}

	/**
	 * �϶����
	 * 
	 * @param e
	 *            MouseEvent
	 * @return void
	 */
	public void mouseDragged(MouseEvent e) {
		super.mouseDragged(e);
		Graphics g = getFrame().getBufferedImage().getGraphics();
		draw(e, g);
	}

	/**
	 * ��ͼ
	 * 
	 * @param e
	 *            MouseEvent
	 * @param g
	 *            Graphics
	 * @return void
	 */
	public void draw(MouseEvent e, Graphics g) {
		int x = 0;
		int y = 0;
		// ��ǹ��С
		int size = 8;
		// ��ǹ����
		int count = 10;
		if (getPressX() > 0 && getPressY() > 0
				&& e.getX() < AbstractTool.drawWidth
				&& e.getY() < AbstractTool.drawHeight) {
			g.setColor(AbstractTool.color);
			for (int i = 0; i < count; i++) {
				x = new Random().nextInt(size) + 1;
				y = new Random().nextInt(size) + 1;
				g.fillRect(e.getX() + x, e.getY() + y, 1, 1);
			}

			setPressX(e.getX());
			setPressY(e.getY());
			getFrame().getDrawSpace().repaint();
		}
	}

}
