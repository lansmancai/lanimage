package com.lansmancai.lanimage.tool;

import com.lansmancai.lanimage.ImageFrame;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * 矩形工具
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
		// 计算起点
		int x = x2 > x1 ? x1 : x2;
		int y = y2 > y1 ? y1 : y2;
		// 画矩形
		g.drawRect(x, y, Math.abs(x1 - x2), Math.abs(y1 - y2));
	}
}
