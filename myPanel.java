import javax.swing.JPanel;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class myPanel extends JPanel {

    Rain[] drops = new Rain[1000];

    
    myPanel(){

        this.setLayout(null);
        this.setPreferredSize(new Dimension(800,800));
        this.setBackground(Color.DARK_GRAY);

        for (int i = 0; i < drops.length; i++) {
            drops[i] = new Rain();
            drops[i].assign(); 
        }

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                for (int i = 0; i < drops.length; i++) {
                    drops[i].fall();
                    repaint();
                } 
            }
            
        };
        timer.scheduleAtFixedRate(task, 0, 1000/60);



    }


    public void paint(Graphics g){

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;


        g2.setColor(Color.CYAN);
        for (int i = 0; i < drops.length; i++) {
            g2.fillRect(drops[i].getRainX(), drops[i].getRainY(), drops[i].getRainWidth(), drops[i].getRainHeight()); 
        }




    }



}
