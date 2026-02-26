import java.awt.*;
import java.applet.*;
/*<applet code="Flag" width=600 height=600>
</applet>*/
public class Flag extends Applet
{
    public void init()
    {
        setBackground(Color. black);
        setForeground(Color.white);
    }
    public void paint(Graphics g)
    {
        g.drawRect(100,100,250,70);
        g.drawRect(100,170,250,70);
        g.drawOval(180,170,70,70);
        g.drawLine(215,170,215,240);
        g.drawLine(180,205,250,205);
        g.drawRect(100,240,250,70);
        g.drawRect(70,100,30,500);
    }
}
