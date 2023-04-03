package com.lansmancai.lanimage;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 * ͼƬ����
 * 
 */
public class MyImage extends BufferedImage {
	// �Ƿ��Ѿ�����
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
	 * �����Ƿ񱣴�
	 * 
	 * @param b
	 *            boolean
	 * @return void
	 */
	public void setIsSaved(boolean b) {
		this.isSaved = b;
	}

	/**
	 * �Ƿ��Ѿ�����
	 * 
	 * @return boolean
	 */
	public boolean isSaved() {
		return this.isSaved;
	}
}
