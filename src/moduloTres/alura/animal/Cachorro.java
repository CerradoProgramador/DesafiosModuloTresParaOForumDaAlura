package moduloTres.alura.animal;

public class Cachorro extends Animal {
    String abanarRabo;
    String somCachorro;

    public void setAbanarRabo(String abanarRabo) {
        this.abanarRabo = abanarRabo;
    }

    public String getAbanarRabo() {
        return abanarRabo;
    }

    public void setSomCachorro(String somCachorro) {
        this.somCachorro = somCachorro;
    }

    public String getSomCachorro() {
        return somCachorro;
    }

    @Override
    public void emitirSom(){
        System.out.println(getAbanarRabo());
        System.out.println(getSomCachorro());
    }

}
