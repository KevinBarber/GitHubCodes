package jFrames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameMain extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel panelControl;
	private JButton remove, removeALL, color;
	private Color colors[] = new Color[8];
	private int colorInt = 0;

	JTextField textfield;
	JLabel label;

	JFrameMain(String title)
	{
		super(title);

		StartUp();
		this.setSize(2880, 1800);
		this.setVisible(true);
	}

	void StartUp()
	{

		colors[0] = Color.PINK;
		colors[1] = Color.BLACK;
		colors[2] = Color.BLUE;
		colors[3] = Color.YELLOW;
		colors[4] = Color.RED;
		colors[5] = Color.GREEN;
		colors[6] = Color.ORANGE;
		colors[7] = Color.CYAN;

		textfield = new JTextField(20);
		label = new JLabel("Name");

		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(textfield);

		panel.setBackground(Color.WHITE);
		panel.setBorder(BorderFactory.createTitledBorder("Information Checker"));

		remove = new JButton("Remove");
		removeALL = new JButton("Remove All");
		color = new JButton("Color!");

		remove.addActionListener(this);
		removeALL.addActionListener(this);
		color.addActionListener(this);

		panelControl = new JPanel();
		panelControl.add(remove);
		panelControl.add(removeALL);
		panelControl.add(color);

		panelControl.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		this.add(panel);
		this.add(panel, BorderLayout.CENTER);
		this.add(panelControl, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		String text = textfield.getText(); 
		System.out.println(text);
		

		if (event.getSource() == remove)
		{
			panelControl.remove(0);
			panelControl.repaint();
		} else if (event.getSource() == color)
		{
			if (colorInt == 7)
			{
				colorInt = 0;
			} else
				colorInt++;
			panelControl.setBorder(BorderFactory
					.createLineBorder(colors[colorInt]));
		} else
		{
			panelControl.removeAll();
			panelControl.repaint();
		}
	}
}
