package com.company;

public class BankrekeningMain {

    public static void main(String[] args) {
        BankRekening rekening = new BankRekening();
        Klant karen = new Klant(rekening);
        karen.setVoornaam("Karen");
        karen.setAchternaam("Damen");
    }
}

class BankRekening {
    private int bankRekening;
    private int saldo;


    public int getSaldo() {
        return saldo;
    }

    public void storten(int bedrag) {
        saldo += bedrag;
    }

    public void afhalen(int bedrag) {
        saldo -= bedrag;
    }
}

class BasisPersoon {
    private String voornaam;
    private String achternaam;

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}

class Klant extends BasisPersoon {
    public Klant(BankRekening rekening) {
    }


}
