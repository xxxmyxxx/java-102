package University;

public class Calisan {
    private String adSoyad;
    private String telefon;
    private String email;

    public Calisan (String adSoyad,String telefon,String email){
        this.adSoyad=adSoyad;
        this.telefon=telefon;
        this.email=email;
    }
    public String getAdSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad=adSoyad;

    }
    public String getTelefon(){
        return telefon;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }
    public String getEmail(){
        System.out.println(this.email);
        return email;

    }
    public void setEmail(String email){
        this.email=email;
    }
    public void giris(){
        System.out.println(this.adSoyad+" giris yapti");
    }
    public void cikis(){
        System.out.println(this.adSoyad+ " cikis yapti");
    }
    public void yemekhane(){
        System.out.println(this.adSoyad+" yemekhaneye girdi");
    }
}
