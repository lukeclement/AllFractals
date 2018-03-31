public class Part{
    private double posX;
    private double posY;
    private int x;
    private int y;
    
    public Part(int x, int y, double scale, double offX, double offY){
        this.x=x;
        this.y=y;
        posX=(double)x*scale-offX;
        posY=offY-(double)y*scale;
    }
    
    public getValue(){
        Complex c=new Complex(posX,posY);
        Complex z=new Complex(0,0);
        int iterations=0
        while((z.getReal()<=2.0E+307||z.getImaginary()<=2.0E+307)&&loops<255){
            z=(z.square()).plus(c);
            iterations++;
        }
        return iterations;
    }
    
}
