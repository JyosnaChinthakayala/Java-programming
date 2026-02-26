import java.awt.*;
import java.applet.*;
/*<applet code="Example" width=200 height=200>
</applet>*/
public class Example extends Applet
{
    public void init()
    {
        setBackground(Color.blue);
        setForeground(Color.red);
    }
    public void paint(Graphics g)
    {
        int x[]={50,100,110,75,40};
        int y[]={50,50,85,110,85};
        g.drawPolygon(x,y,5);
        g.fillOval(55,55,40,40);
        String s="java";
        Color c=new Color(23,233,23);
       g.setColor(c);
        g.drawString(s,65,80);
    }
}