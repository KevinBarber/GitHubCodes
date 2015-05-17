import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Thu Dec 08 14:16:42 EST 2011
 */
 
 
 
/**
 * @author Bradley Chelsey
 */
public class tictactoe extends JFrame {
        public tictactoe() {
                initComponents();
        }
 
        public void button1ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button2ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button3ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button4ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button5ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button6ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button7ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button8ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void button9ActionPerformed(ActionEvent e) {
                // TODO add your code here
        }
 
        public void initComponents() {
                // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
                // Generated using JFormDesigner Evaluation license - Bradley Chelsey
                button1 = new JButton();
                button2 = new JButton();
                button3 = new JButton();
                button4 = new JButton();
                button5 = new JButton();
                button6 = new JButton();
                button7 = new JButton();
                button8 = new JButton();
                button9 = new JButton();
 
                //======== this ========
                setTitle("Tic Tac Toe");
                Container contentPane = getContentPane();
 
                //---- button1 ----
                button1.setText("");
                button1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button1ActionPerformed(e);
                        }
                });
 
                //---- button2 ----
                button2.setText("");
                button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button2ActionPerformed(e);
                        }
                });
 
                //---- button3 ----
                button3.setText("");
                button3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button3ActionPerformed(e);
                        }
                });
 
                //---- button4 ----
                button4.setText("");
                button4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button4ActionPerformed(e);
                        }
                });
 
                //---- button5 ----
                button5.setText("");
                button5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button5ActionPerformed(e);
                        }
                });
 
                //---- button6 ----
                button6.setText("");
                button6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button6ActionPerformed(e);
                        }
                });
 
                //---- button7 ----
                button7.setText("");
                button7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button7ActionPerformed(e);
                        }
                });
 
                //---- button8 ----
                button8.setText("");
                button8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button8ActionPerformed(e);
                        }
                });
 
                //---- button9 ----
               button9.setText("")
                button9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                button9ActionPerformed(e);
                        }
                });
 
                GroupLayout contentPaneLayout = new GroupLayout(contentPane);
                contentPane.setLayout(contentPaneLayout);
                contentPaneLayout.setHorizontalGroup(
                        contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addComponent(button7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(11, Short.MAX_VALUE))
                );
                contentPaneLayout.setVerticalGroup(
                        contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(button7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(15, Short.MAX_VALUE))
                );
                pack();
                setLocationRelativeTo(getOwner());
                // JFormDesigner - End of component initialization  //GEN-END:initComponents
        }
 
        // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
        // Generated using JFormDesigner Evaluation license - Bradley Chelsey
        public JButton button1;
        public JButton button2;
        public JButton button3;
        public JButton button4;
        public JButton button5;
        public JButton button6;
        public JButton button7;
        public JButton button8;
        public JButton button9;
        // JFormDesigner - End of variables declaration  //GEN-END:variables
}
clone this paste RAW Paste Data

