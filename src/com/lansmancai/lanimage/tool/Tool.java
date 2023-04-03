package com.lansmancai.lanimage.tool;

import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Color;

/**
 * ���й��ߵĽӿ�
 * 
 */
public interface Tool {
	// ��������
	public static final String ARROW_TOOL = "ArrowTool";
	public static final String PENCIL_TOOL = "PencilTool";
	public static final String BRUSH_TOOL = "BrushTool";
	public static final String CUT_TOOL = "CutTool";
	public static final String ERASER_TOOL = "EraserTool";
	public static final String LINE_TOOL = "LineTool";
	public static final String RECT_TOOL = "RectTool";
	public static final String POLYGON_TOOL = "PolygonTool";
	public static final String ROUND_TOOL = "RoundTool";
	public static final String ROUNDRECT_TOOL = "RoundRectTool";
	public static final String ATOMIZER_TOOL = "AtomizerTool";
	public static final String COLORPICKED_TOOL = "ColorPickedTool";

	/**
	 * �϶����
	 * 
	 * @param e
	 *            MouseEvent
	 * @param jg
	 *            Graphics
	 * @return void
	 */
	public void mouseDragged(MouseEvent e);

	/**
	 * �ƶ����
	 * 
	 * @param e
	 *            MouseEvent
	 * @return void
	 */
	public void mouseMoved(MouseEvent e);

	/**
	 * �ɿ����
	 * 
	 * @param e
	 *            MouseEvent
	 * @return void
	 */
	public void mouseReleased(MouseEvent e);

	/**
	 * �������
	 * 
	 * @param e
	 *            MouseEvent
	 * @return void
	 */
	public void mousePressed(MouseEvent e);

	/**
	 * ���
	 * 
	 * @param e
	 *            MouseEvent
	 * @return void
	 */
	public void mouseClicked(MouseEvent e);
}