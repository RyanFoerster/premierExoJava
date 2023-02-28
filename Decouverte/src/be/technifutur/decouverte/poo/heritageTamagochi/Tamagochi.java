package be.technifutur.decouverte.poo.heritageTamagochi;

public abstract class Tamagochi {
    int vie;
    int humeur;
    int faim;



    public void manger(){
        System.out.println("Je mange comme un tamagochi");
    }

    public void jouer(){
        System.out.println("Je joue comme un tamagochi");
    }

    public abstract void dormir();

    public void manger(String aliment){
        System.out.println("Je mange : " + aliment);
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getHumeur() {
        return humeur;
    }

    public void setHumeur(int humeur) {
        this.humeur = humeur;
    }

    public int getFaim() {
        return faim;
    }

    public void setFaim(int faim) {
        this.faim = faim;
    }
}
