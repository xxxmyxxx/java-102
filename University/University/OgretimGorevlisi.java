package University;

public class OgretimGorevlisi extends Akademisyen{
    int kapiNo;
    public OgretimGorevlisi(String adSoyad,String email,String telefon,String unvan,String bolum ,int kapiNo){
        super(adSoyad,telefon,email,unvan,bolum);
        this.kapiNo=kapiNo;
    }
    public int getKapiNo(){
        return kapiNo;
    }
    public void setKapiNo(int kapiNo){
        this.kapiNo=kapiNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getAdSoyad()+" Senato toplantisina katildi");
    }
    public void sinavYap(){
        System.out.println(this.getAdSoyad()+" Sinavi baslatti");
    }
}
