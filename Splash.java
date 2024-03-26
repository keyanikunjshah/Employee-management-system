
package employee.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash  extends JFrame implements ActionListener{
      Splash(){
          //getcontent pane  is a method of jframe returns an object 
          //setbackground is a method of swing.component all jlabel,jframes inj]herit swing componenet 
          //java.lang.Object
   //└── java.awt.Component
      // └── javax.swing.JComponent
         //  ├── javax.swing.JPanel
          // ├── javax.swing.JLabel
           //└── javax.swing.JButton
          getContentPane().setBackground(Color.WHITE);
          setLayout(null);
          JLabel heading=new  JLabel("EMPLOYEE MANAGEMENT SYSTEM");
          heading.setBounds(80, 30, 1200, 60);
          heading.setFont(new Font("serif",Font.PLAIN,60));
          heading.setForeground(Color.red);
          add(heading);
          ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
         Image i2 =i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
          ImageIcon i3=new ImageIcon(i2);
          JLabel image=new JLabel(i3);
          image.setBounds(50,100,1050,500);
          add(image);
          JButton clickhere=new JButton("CLICK HERE TO CONTINUE");
          
          clickhere.setBounds(400,400,300,70);
         image. add(clickhere);
         clickhere.setBackground(Color.BLACK);
         clickhere.setForeground(Color.WHITE);
         clickhere.addActionListener(this);
          setSize(1170,650);
          setLocation(50,50);
          setVisible(true);
         
      }
      public void actionPerformed(ActionEvent ae){
          
    setVisible(false);
     new Login();
      
      }
    public static void main(String args[]){
        new Splash();
        
        
}
}