import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
 TextField t1;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq;
 int c,a,b;
 int ch;
  demo()
  {
    setVisible(true);
    setSize(300,500);
   setLayout(new FlowLayout());
    t1=new TextField(20);
   b1=new Button("1");
   b2=new Button("2");
   b3=new Button("3");
   b4=new Button("4");
   b5=new Button("5");
   b6=new Button("6");
   b7=new Button("7");
   b8=new Button("8");
   b9=new Button("9");
   b0=new Button("0");
   bdot=new Button(".");
   badd=new Button("+");
   bsub=new Button("-");
   bmul=new Button("*");
   bdiv=new Button("/");
   beq=new Button("=");

   Panel pa=new Panel();
   pa.setLayout(new GridLayout(4,4,10,10));
   pa.setBackground(Color.yellow);
  
  add(t1);
  pa.add(b1);pa.add(b2);pa.add(b3);pa.add(badd);
  pa.add(b4);pa.add(b5);pa.add(b6);pa.add(bsub);
  pa.add(b7);pa.add(b8);pa.add(b9);pa.add(bmul);
  pa.add(b0);pa.add(bdot);pa.add(beq);pa.add(bdiv);
  add(pa);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this);
 b5.addActionListener(this);
 b6.addActionListener(this);
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this);
 b0.addActionListener(this);
 badd.addActionListener(this);
 bsub.addActionListener(this);
 bmul.addActionListener(this);
 bdiv.addActionListener(this);
 beq.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
  
    if(ae.getSource()==b1)
      t1.setText(t1.getText()+1);
    if(ae.getSource()==b2)
      t1.setText(t1.getText()+2);
    if(ae.getSource()==b3)
      t1.setText(t1.getText()+3);
    if(ae.getSource()==b4)
      t1.setText(t1.getText()+4);
   if(ae.getSource()==b5)
      t1.setText(t1.getText()+5);
   if(ae.getSource()==b6)
      t1.setText(t1.getText()+6);
   if(ae.getSource()==b7)
      t1.setText(t1.getText()+7);
   if(ae.getSource()==b8)
      t1.setText(t1.getText()+8);
   if(ae.getSource()==b9)
      t1.setText(t1.getText()+9);
   if(ae.getSource()==b0)
      t1.setText(t1.getText()+0);
  if(ae.getSource()==bdot)
    {
      t1.setText(t1.getText()+".");
    }
   if(ae.getSource()==badd)
    {
       a=Integer.parseInt(t1.getText());
      t1.setText("");
      ch=1;
    }
   if(ae.getSource()==bsub)
    {
       a=Integer.parseInt(t1.getText());
      t1.setText("");
      ch=2;
    }
  if(ae.getSource()==bmul)
    {
      a=Integer.parseInt(t1.getText());
      t1.setText("");
      ch=3;
    }
  if(ae.getSource()==bdiv)
    {
      a=Integer.parseInt(t1.getText());
      t1.setText("");
      ch=4;
    }
  if(ae.getSource()==beq)
    {
      b=Integer.parseInt(t1.getText());
      if(ch==1)
      {
         c=a+b;
        t1.setText(""+c);
      }
     if(ch==2)
      {
        c=a-b;
         t1.setText(""+c);
      }
     if(ch==3)
      {
       c=a*b;
         t1.setText(""+c);
      }
    if(ch==4)
      {
        c=a/b;
         t1.setText(""+c);
      }
   
    }
  }
}
class cal
{
 public static void main(String arg[])
 {
   demo ob=new demo();
 }
}