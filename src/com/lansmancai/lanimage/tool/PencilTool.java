package com.lansmancai.lanimage.tool;

import com.lansmancai.lanimage.ImageFrame;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * 铅笔工具
 * 
 */
public class PencilTool extends AbstractTool {
	private static Tool tool = null;

	private PencilTool(ImageFrame frame) {
		super(frame, "img/pencilcursor.gif");
	}

	public static Tool getInstance(ImageFrame frame) {
		if (tool == null) {
			tool = new PencilTool(frame);
		}
		return tool;
	}

	/**
	 * 拖动鼠标
	 * 
	 * @param e
	 *            MouseEvent
	 * @return void
	 */
	public void mouseDragged(MouseEvent e) {
		super.mouseDragged(e);
		// 获取图片的Graphics对象
		Graphics g = getFrame().getBufferedImage().getGraphics();
		if (getPressX() > 0 && getPressY() > 0) {
			g.setColor(AbstractTool.color);
			g.drawLine(getPressX(), getPressY(), e.getX(), e.getY());
			setPressX(e.getX());
			setPressY(e.getY());
			getFrame().getDrawSpace().repaint();
		}
	}
}
