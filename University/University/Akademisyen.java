package University;

public class Akademisyen extends Calisan{
    private String unvan;
    private String bolum;
    public Akademisyen(String adSoyad,String telefon,String eposta,String unvan,String bolum){
        super(adSoyad,telefon,eposta);
        this.unvan=unvan;
        this.bolum=bolum;
    }
    public String getUnvan(){
        return unvan;
    }
    public void setUnvan(String unvan){
        this.unvan=unvan;
    }
    public String getBolum(){
        return bolum;
    }
    public void setBolum(String bolum){
        this.bolum=bolum;
    }
    public void derseGir(){
        System.out.println(this.getAdSoyad()+" derse giris yapti..");
    }

}
