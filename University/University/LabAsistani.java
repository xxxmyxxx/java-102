package University;

public class LabAsistani extends Asistan {
    public LabAsistani(String adSoyad,String telefon,String email,String unvan,String bolum,String ofisSaati){
        super(adSoyad,email,telefon,unvan,bolum,ofisSaati);
    }
    public void lablaraGiris(){
        System.out.println(this.getAdSoyad()+" lab a giris yapti");
    }
    @Override
    public void derseGir(){
        System.out.println(this.getAdSoyad()+" kisisi derse girdi.");

    }
}
