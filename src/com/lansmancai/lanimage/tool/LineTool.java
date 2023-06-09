package com.lansmancai.lanimage.tool;

import com.lansmancai.lanimage.ImageFrame;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * 直线工具
 * 
 */
public class LineTool extends AbstractTool {
	private static Tool tool = null;

	private LineTool(ImageFrame frame) {
		super(frame);
		// super.setShape( new LineShape() );
	}

	public static Tool getInstance(ImageFrame frame) {
		if (tool == null) {
			tool = new LineTool(frame);
		}
		return tool;
	}

	/**
	 * 画图形
	 * 
	 * @param g
	 *            Graphics
	 * @param x1
	 *            起点x坐标
	 * @param y1
	 *            起点y坐标
	 * @param x2
	 *            终点x坐标
	 * @param y2
	 *            终点y坐标
	 * @return void
	 */
	public void draw(Graphics g, int x1, int y1, int x2, int y2) {
		g.drawLine(x1, y1, x2, y2);
	}
}
