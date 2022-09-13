package University;

public class Memur extends Calisan {
    private String departman;
    private String mesai;

    public Memur(String adSoyad,String telefon,String email,String departman,String mesai){
        super(adSoyad,telefon,email);
        this.departman=departman;
        this.mesai=mesai;
    }
    public String getDepatman(){
        return departman;
    }
    public void setDepatman(String departman){
        this.departman=departman;
    }
    public String getMesai(){
        return mesai;
    }
    public void setMesai(String mesai){
        this.mesai=mesai;
    }
    public void calis(){
        System.out.println(this.getAdSoyad()+" isine basladi.kolay gelsin usta");
    }
}
