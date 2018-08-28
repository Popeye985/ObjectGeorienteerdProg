package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Werknemer w = new Werknemer("Karen", "Damen", "Studio 100"  );
        System.out.println(w);
    }

        }
class Werknemer extends Persoon {
    private String werkgever;

    public Werknemer(String voornaam, String achternaam, String werkgever) {
        super(voornaam, achternaam);
        this.werkgever = werkgever;
    }
    public String getWerkgever(){
        return werkgever;
    }
    @Override
    public String toString (){
        return String.format("%s %s werkt bij %s", getVoornaam(),getAchternaam(), getWerkgever());
    }

}

class Persoon{
    private String voornaam;
    private String achternaam;

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }





    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;



    }



    @Override
    public int hashCode() {

        return Objects.hash(voornaam, achternaam);
    }
}




