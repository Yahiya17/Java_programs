import java.awt.*;
class frame
{
public static void main(String args[])
{
Frame f=new Frame();
f.setSize(500,300);
f.setVisible(true);
f.setTitle("My frame");
Button b = new Button("Click Me!!");  
b.setBounds(30,100,80,30); 
b.setBackground(Color.PINK);
b.setForeground(Color.RED);
f.add(b);  
}
}