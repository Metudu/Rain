import java.util.Random;


public class Rain {
    Random rand = new Random();


    private int rainX;
    private int rainY;
    private final int rainWidth = 2;

    private final int rainHeight = 10;
    private final int rainSpeed = 3;


    public void assign(){
        rainX = rand.nextInt(800);
        rainY = rand.nextInt(800)-800;
    }

    public void fall(){
        if(rainY + rainSpeed > 800)
            rainY = -15;

        rainY += rainSpeed;
    }






    public int getRainX() {
        return rainX;
    }

    public void setRainX(int rainX) {
        this.rainX = rainX;
    }

    public int getRainY() {
        return rainY;
    }

    public void setRainY(int rainY) {
        this.rainY = rainY;
    }

    public int getRainWidth() {
        return rainWidth;
    }

    public int getRainHeight() {
        return rainHeight;
    }

}
