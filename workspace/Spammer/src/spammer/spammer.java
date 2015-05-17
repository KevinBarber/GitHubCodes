package spammer;

public class spammer
{
public static void main(String[] args)
{
	using System;
	using System.Collections.Generic;
	using System.ComponentModel;
	using System.Data;
	using System.Drawing;
	using System.Linq;
	using System.Text;
	using System.Windows.Forms;

	namespace _xUnLeasHeDx__SpamBot_v2
	{
	    public partial class Form1 : Form
	    {
	        int speed;
	        int amount;
	        int counter;

	        public Form1()
	        {
	            InitializeComponent();
	        }

	        private void Form1_Load(object sender, EventArgs e)
	        {
	            /* * * * * * * * * * * * * * * * * * * * * * 
	             * You can edit the texts in the toolbox,  *
	             * but I've edited them in the "Form1_Load"*
	             * area to make it more n00bfriendly.      *
	             * * * * * * * * * * * * * * * * * * * * * */

	            this.Text = "-xUnLeasHeDx- SpamBot v2";
	            label1.Text = "Text";
	            label2.Text = "Amount";
	            label3.Text = "Speed";
	            label4.Text = "Slow";
	            label5.Text = "Fast";
	            button1.Text = "Start";
	            button2.Text = "Stop";
			
		    trackBar1.Value = 5;
	        }

	        private void button1_Click(object sender, EventArgs e)
	        {
	            if (textBox1.Text == "")
	            {
	                MessageBox.Show("Please enter a text!");
	            }

	            if (textBox2.Text == "")
	            {
	                MessageBox.Show("Please enter a limit!");
	            }

	            string spamTextLimit = textBox2.Text;
	            for (int i = 0; i < spamTextLimit.Length; i++)
	            {
	                if (!char.IsNumber(spamTextLimit[i]))
	                {
	                    MessageBox.Show("Please enter a valid number!");
	                    textBox2.Text = "";
	                    return;
	                }
	            }
	            progressBar1.Value = 0;
	            amount = Convert.ToInt32(textBox2.Text);
	            Clipboard.SetText(textBox1.Text);

	            speed = trackBar1.Value;
	            if (speed == 0)
	                speed = 10;
	            else
	                speed = 11 - speed;

	            System.Threading.Thread.Sleep(3000);

	            progressBar1.Maximum = amount;

	            counter = 0;
	            timer1.Enabled = true;
	        }

	        private void button2_Click(object sender, EventArgs e)
	        {
	            timer1.Enabled = false;
	            counter = 0;
	        }

	        private void timer1_Tick(object sender, EventArgs e)
	        {
	            for (int i = 0; i < speed; i++)
	            {
	                SendKeys.Send("^{V}");
	                SendKeys.Send("{Enter}");
	                counter++;
	                progressBar1.Value++;

	                if (trackBar1.Value == 10)
	                {
	                    System.Threading.Thread.Sleep(1000); //1 Second
	                }
	                else if (trackBar1.Value == 9)
	                {
	                    System.Threading.Thread.Sleep(900); //0,9  Seconds
	                }
	                else if (trackBar1.Value == 8)
	                {
	                    System.Threading.Thread.Sleep(800);  //0,8 Seconds
	                }
	                else if (trackBar1.Value == 7)
	                {
	                    System.Threading.Thread.Sleep(700); //0,7 Seconds
	                }
	                else if (trackBar1.Value == 6)
	                {
	                    System.Threading.Thread.Sleep(600); //0,6 Seconds
	                }
	                else if (trackBar1.Value == 5)
	                {
	                    System.Threading.Thread.Sleep(500); //0,5 Seconds
	                }
	                else if (trackBar1.Value == 4)
	                {
	                    System.Threading.Thread.Sleep(400); //0,4 Seconds
	                }
	                else if (trackBar1.Value == 3)
	                {
	                    System.Threading.Thread.Sleep(300); //0,3 Seconds
	                }
	                else if (trackBar1.Value == 2)
	                {
	                    System.Threading.Thread.Sleep(200); //0,2 Seconds
	                }
	                else if (trackBar1.Value == 1)
	                {
	                    System.Threading.Thread.Sleep(100); //0,1 Seconds
	                }
	                else if (trackBar1.Value == 0)
	                {
	                    System.Threading.Thread.Sleep(0); //0 Seconds
	                }
	                
	                if (counter >= amount)
	                {
	                    counter = 0;
	                    timer1.Enabled = false;
	                    break;
	                }
	            }
	        }
	    }
	}
}
}
