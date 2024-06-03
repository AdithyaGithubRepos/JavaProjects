
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    JButton plus = new JButton("+");
    JButton mns = new JButton("-");
    JButton div = new JButton("/");
    JButton mlt = new JButton("*");
    JButton clear = new JButton("Clear");
    JTextField num1f = new JTextField();
    JTextField num2f = new JTextField();
    JLabel result = new JLabel();
    JLabel info = new JLabel("TBVT Gui version 2.0");
    JPanel rp = new JPanel();
    Font mfnt = new Font("Serif", Font.BOLD, 15);
    int num1;
    int num2;
    int nresult;

    public static void main(String[] args) {
        new Main();
    }

    Main(){
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setTitle("TBVT2");
       this.setResizable(false);
       this.setSize(500, 500);
       this.setLocationRelativeTo(null);
       this.setLayout(null);
       num1f.setBounds(171, 150, 138, 25);
       num1f.setVisible(true);
       num2f.setBounds(171, 200, 139, 25);
       num2f.setVisible(true);
       plus.setBounds(171, 250, 38, 25);
       plus.addActionListener(this);
       plus.setFocusable(false);
       plus.setVisible(true);
       info.setBounds(171, 50, 150, 25);
       info.setFont(mfnt);
       info.setVisible(true);
       clear.setBounds(171, 325, 150, 35);
       clear.addActionListener(this);
       clear.setVisible(true);
       result.setBounds(171, 375, 150, 25);
       result.setFont(mfnt);
       result.setVisible(true);
       mns.setBounds(220, 250, 38, 25);
       mns.addActionListener(this);
       mns.setFocusable(false);
       mns.setVisible(true);
       div.setBounds(270, 250, 38, 25);
       div.addActionListener(this);
       div.setFocusable(false);
       div.setVisible(true);
       mlt.setBounds(220, 280, 38, 25);
       mlt.addActionListener(this);
       mlt.setFocusable(false);
       mlt.setVisible(true);
       this.add(mlt);
       this.add(div);
       this.add(mns);
       this.add(result);
       this.add(clear);
       this.add(info);
       this.add(plus);
       this.add(num2f);
       this.add(num1f);
       this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==clear) {
        num1f.setText("");
        num2f.setText("");
      }

      if(e.getSource()==plus) {
       try {
        int num1 = Integer.parseInt(num1f.getText());
        int num2 = Integer.parseInt(num2f.getText());
        int nresult = num1 + num2;
        JOptionPane.showMessageDialog(this, String.valueOf(nresult));
       } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Error! Please make sure that both fields are Filled with valid numbers!");
       }

      }

      if(e.getSource()==mns) {
        try {
         int num1 = Integer.parseInt(num1f.getText());
         int num2 = Integer.parseInt(num2f.getText());
         int nresult = num1 - num2;
         JOptionPane.showMessageDialog(this, String.valueOf(nresult));
        } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(this, "Error! Please make sure that both fields are Filled with valid numbers!");
        }
 
       }

       if(e.getSource()==div) {
        try {
         int num1 = Integer.parseInt(num1f.getText());
         int num2 = Integer.parseInt(num2f.getText());
         int nresult = num1 / num2;
         JOptionPane.showMessageDialog(this, String.valueOf(nresult));
        } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(this, "Error! Please make sure that both fields are Filled with valid numbers!");
        }
 
       }

       if(e.getSource()==mlt) {
        try {
         int num1 = Integer.parseInt(num1f.getText());
         int num2 = Integer.parseInt(num2f.getText());
         int nresult = num1 * num2;
         JOptionPane.showMessageDialog(this, String.valueOf(nresult));
        } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(this, "Error! Please make sure that both fields are Filled with valid numbers!");
        }
 
       }

    }

}
