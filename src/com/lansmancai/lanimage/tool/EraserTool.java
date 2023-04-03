package com.lansmancai.lanimage.tool;

import com.lansmancai.lanimage.ImageFrame;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * ��Ƥ������
 * 
 */
public class EraserTool extends AbstractTool {
	private static Tool tool = null;

	private EraserTool(ImageFrame frame) {
		super(frame, "img/erasercursor.gif");
	}

	public static Tool getInstance(ImageFrame frame) {
		if (tool == null) {
			tool = new EraserTool(frame);
		}
		return tool;
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
		int x = 0;
		int y = 0;
		// ��Ƥ��
		int size = 4;
		if (getPressX() > 0 && getPressY() > 0) {
			g.setColor(Color.WHITE);
			x = e.getX() - getPressX() > 0 ? getPressX() : e.getX();
			y = e.getY() - getPressY() > 0 ? getPressY() : e.getY();
			g.fillRect(x - size, y - size, Math.abs(e.getX() - getPressX())
					+ size, Math.abs(e.getY() - getPressY()) + size);
			setPressX(e.getX());
			setPressY(e.getY());
			getFrame().getDrawSpace().repaint();
		}
	}

}
