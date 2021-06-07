public class Laiva {
    
    private int alkuX;
    private int alkuY;
    private double nopeus;
    private double sijaintiX;
    private double sijaintiY;

    public Laiva(double nopeus){
        this.alkuX = 0;
        this.alkuY = 1500;
        this.nopeus = nopeus*1000/60/60; //nopeus metriä/sekunti
        this.sijaintiX = alkuX;
        this.sijaintiY = alkuY;
    }

    public void liikutaLaivaa(){
        this.sijaintiX += nopeus/10; //eteneminen sekunnin kymmenesosassa
    }
    public void pysaytaLaiva(){
        sijaintiX = 0;
        sijaintiY = 0;
    }

    public double getsijaintiX(){
        return sijaintiX;
    }

    public double getsijaintiY(){
        return sijaintiY;
    }

    public double getnopeus(){
        return nopeus;
    }

    
}
