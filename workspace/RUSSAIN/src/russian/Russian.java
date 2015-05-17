package russian;

import javax.swing.JOptionPane;

public class Russian
{
public static void main(String[] args)

	{
		int yn = JOptionPane.showConfirmDialog(null, "Are you Ready to be hacked??", null, JOptionPane.YES_NO_OPTION);
		if(yn == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "HAHAHHA GOTCCHA");
		}

		else{
			JOptionPane.showMessageDialog(null, "LAWLLLALALALALALA HAHAHA.");
		}
			

	}
}

