public class Video{
    private Image[] video;
    private int FPS;
    public Video( int fps, int length){
        this.FPS = fps;
        video = new Image[fps*length];
    }
    
    public int getFPS()
    {
        return FPS;
    }
    
}