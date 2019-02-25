import java.util.ArrayList;
public class Image{
    private Pixel[][] image;
    public Image(){
       this(100,100);
    }
    
    public Image(int w, int h){
        image = new Pixel[w][h];
        for(int i = 0; i<w; i++){
            for(int j =0; 0<h; j++){
                image[i][j] = new Pixel();
            }
        }
    }
    
    public void setImage(Pixel[][] newI){
        for(int i = 0; i<image.length; i++){
            for(int j = 0; j<image[0].length; i++){
                image[i][j] = newI[i][j];
            }
        }
    }
    
    public void setSize(int x, int y){

    }
    
    public void setPixel(int x, int y, Pixel p){
        image[x][y]=p;
    }
}