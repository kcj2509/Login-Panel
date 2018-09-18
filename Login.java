import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginFrame extends JFrame implements ActionListener
{
 JTextField tLog;
 JPasswordField tPas;
 
 JButton bSub,bClr,bCls;

 LoginFrame()
 {
  super("Login");
  setSize(400,250);
  setLocation(200,100);

  LoginPanel lp=new LoginPanel(40,15,15,15);
  add(lp);

  JLabel l1=new JLabel("Login-Id");
  l1.setFont(new Font("lucida console",Font.PLAIN,18));
  l1.setForeground(Color.white);
  
  JLabel l2=new JLabel("Password");
  l2.setFont(new Font("lucida console",Font.PLAIN,18));
  l2.setForeground(Color.white);
  
  tLog=new JTextField();
  tLog.setFont(new Font("lucida console",Font.PLAIN,18));

  tPas=new JPasswordField();
  tPas.setFont(new Font("lucida console",Font.PLAIN,18));

  bSub=new JButton("Submit");
  bSub.setFont(new Font("lucida console",Font.PLAIN,18));
  bSub.setBackground(new Color(160,70,70));
  bSub.setForeground(Color.white);

  bClr=new JButton("Clear");
  bClr.setFont(new Font("lucida console",Font.PLAIN,18));
  bClr.setBackground(new Color(70,160,70));
  bClr.setForeground(Color.white);

  bCls=new JButton("Close");  
  bCls.setFont(new Font("lucida console",Font.PLAIN,18));
  bCls.setBackground(new Color(70,70,160));
  bCls.setForeground(Color.white);

  lp.setLayout(new BorderLayout(10,30));
  
  LoginPanel p1=new LoginPanel(10,10,10,10);
  p1.setBorder(BorderFactory.createLineBorder(Color.orange,1));

   LoginPanel p11=new LoginPanel(0,0,0,0);
   p11.setLayout(new BorderLayout(10,10));
   p11.add(l1,BorderLayout.WEST);
   p11.add(tLog,BorderLayout.CENTER);

   LoginPanel p12=new LoginPanel(0,0,0,0);
   p12.setLayout(new BorderLayout(10,10));
   p12.add(l2,BorderLayout.WEST);
   p12.add(tPas,BorderLayout.CENTER);
     
  p1.setLayout(new GridLayout(2,1,5,5));  
  p1.add(p11);
  p1.add(p12);

  LoginPanel p2=new LoginPanel(10,10,10,10);
  p2.setBorder(BorderFactory.createLineBorder(Color.orange,1));

  p2.setLayout(new GridLayout(1,3,10,5));  
  p2.add(bSub);
  p2.add(bClr);
  p2.add(bCls);

  lp.add(p1,BorderLayout.CENTER);
  lp.add(p2,BorderLayout.SOUTH);

  bSub.addActionListener(this);
  bClr.addActionListener(this);
  bCls.addActionListener(this);

 }

 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==bCls)
   System.exit(0);

  if(ae.getSource()==bClr)
  {
   tLog.setText("");
   tPas.setText("");
  }
  else
  {
   JOptionPane.showMessageDialog(this,"Okay..");
  }
 }

}

class LoginPanel extends JPanel
{
 int top,left,bottom,right;

 LoginPanel(int top,int left,int bottom,int right)
 {
  this.top=top;
  this.left=left;
  this.bottom=bottom;
  this.right=right;
 }

 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);
  setBackground(new Color(50,50,50));
 }

 public Insets getInsets()
 {
  return new Insets(top,left,bottom,right);
 }  
}

class Login
{
 public static void main(String...arg)
 {
  LoginFrame lf=new LoginFrame();
  lf.setVisible(true);

  //lf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		-default  
  //lf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
  //lf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  

  lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

 }
}


