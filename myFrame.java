import javax.swing.JFrame;

public class myFrame extends JFrame{
    
    myFrame(){

        this.setTitle("Rain App");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new myPanel());
        this.pack();
        this.setVisible(true);


    }



}
