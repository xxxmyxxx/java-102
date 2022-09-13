package University;

public class Asistan extends Akademisyen {
    String ofisSaati;

    public Asistan(String adSoyad,String email,String telefon,String unvan,String bolum,String ofisSaati) {
        super(adSoyad, telefon, email, unvan, bolum);
        this.ofisSaati = ofisSaati;
    }
    public String getOfisSaati(){
        return ofisSaati;
    }
    public void setOfisSaati(String ofisSaati){
        this.ofisSaati=ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getAdSoyad()+" quize basladi");
    }
}
