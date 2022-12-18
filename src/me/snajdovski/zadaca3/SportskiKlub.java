package me.snajdovski.zadaca3;

import java.util.List;

public class SportskiKlub implements Comparable<SportskiKlub> {
    private String Ime;
    private String typeOfSport;
    private int numberOfMembers;

    public SportskiKlub(String ime, String tipNaSport, int brojNaClenovi) {
        this.Ime = ime;
        this.typeOfSport = tipNaSport;
        this.numberOfMembers = brojNaClenovi;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String Ime) {
        this.Ime = Ime;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public static List<SportskiKlub> sortClubsByIme(List<SportskiKlub> clubs) {
        clubs.sort((c1, c2) -> c1.getIme().compareTo(c2.getIme()));
        return clubs;
    }

    @Override
    public int compareTo(SportskiKlub o) {
      return  this.Ime.compareTo(o.Ime);
    }
}
