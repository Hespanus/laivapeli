public class Ammus {
    
    private double tuuli;
    private double nopeus; //metriä/sekunti
    private int alkuY;
    //private int alkuX;
    private double tahtaysX;
    private double tahtaysY;
    private double sijaintiX;
    private double sijaintiY;

    

    public Ammus(double tuuli, double tahtaysX, int tahtaysY){
        this.tuuli = tuuli;
        this.tahtaysX = tahtaysX;
        this.tahtaysY = tahtaysY;
        alkuY = 5500;
        //alkuX = tahtaysX;
        sijaintiX = tahtaysX;
        sijaintiY = alkuY;
        nopeus = 500;

    }

    public void liikutaAmmusta(){
        sijaintiY -= nopeus/10;
        sijaintiX += 2*tuuli/10;
    }

    public void pysaytaAmmus(){
        sijaintiY = 0;
        sijaintiX = 0;

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
