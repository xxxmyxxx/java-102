package University;

public class Guvenlik extends Memur{
    String belge;
    public Guvenlik(String adSoyad,String telefon,String email,String deparman,String mesai,String belge){
        super(adSoyad,telefon,email,deparman,mesai);
        this.belge=belge;
    }
    public String getBelge(){
        return belge=belge;
    }
    public void setBelge(){
        this.belge=belge;
    }
    public void nobet(){
        System.out.println(this.getAdSoyad()+ " guvenlik memuru nobetine basladi.");
    }
}
