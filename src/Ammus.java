public class Ammus {
    
    private double tuuli;
    private double nopeus; //metriä/sekunti
    private int alkuY;
    //private int alkuX;
    private int tahtaysX;
    private double tahtaysY;
    private double sijaintiX;
    private double sijaintiY;

    

    public Ammus(double tuuli, int tahtaysX, int tahtaysY){
        this.tuuli = tuuli;
        this.tahtaysX = tahtaysX;
        this.tahtaysY = tahtaysY;
        alkuY = 0;
        //alkuX = tahtaysX;
        sijaintiX = tahtaysX;
        sijaintiY = alkuY;
        nopeus = 500;

    }

    public void liikutaAmmusta(){
        this.sijaintiY += nopeus/10;
        if(tahtaysX < 6000){
            sijaintiX += tuuli/10;
        }else if(tahtaysX > 6000){
            sijaintiX -= tuuli/10;
        }
    }
    public double getSijaintiX(){
        return sijaintiX;
    }

    public double getSijaintiY(){
        return sijaintiY;
    }

    public double getTahtaysY(){
        return tahtaysY;
    }




}
