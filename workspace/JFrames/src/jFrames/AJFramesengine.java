package jFrames;

import javax.swing.JFrame;

public class AJFramesengine
{
	public static void ain(String[] args)
	{
		MainDraw();
	}

	public static void MainDraw()
	{
		JFrameMain jFrameMain = new JFrameMain("");
		jFrameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
