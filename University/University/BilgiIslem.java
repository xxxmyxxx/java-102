package University;

public class BilgiIslem extends Memur{
    String gorev;
    public BilgiIslem(String adSoyad,String telefon,String email,String departman,String mesai,String gorev){
        super(adSoyad,telefon,email,departman,mesai);
        this.gorev=gorev;

    }
    public String getGorev(){
        return gorev;
    }
    public void setGorev(){
        this.gorev=gorev;
    }
    public void networkKurulumu(){
        System.out.println(this.getAdSoyad()+" network kurulumuna basladi");
    }
}
