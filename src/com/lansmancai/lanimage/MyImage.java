package com.lansmancai.lanimage;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 * 图片对象
 * 
 */
public class MyImage extends BufferedImage {
	// 是否已经保存
	private boolean isSaved = true;

	/**
	 * @param width
	 *            int
	 * @param height
	 *            int
	 * @param type
	 *            int
	 */
	public MyImage(int width, int height, int type) {
		super(width, height, type);
		this.getGraphics().fillRect(0, 0, width, height);
	}

	/**
	 * 设置是否保存
	 * 
	 * @param b
	 *            boolean
	 * @return void
	 */
	public void setIsSaved(boolean b) {
		this.isSaved = b;
	}

	/**
	 * 是否已经保存
	 * 
	 * @return boolean
	 */
	public boolean isSaved() {
		return this.isSaved;
	}
}
