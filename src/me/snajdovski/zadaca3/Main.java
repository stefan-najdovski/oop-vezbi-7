package me.snajdovski.zadaca3;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

     public static void main(String[] args) {
         List<SportskiKlub> clubs = Arrays.asList(

                 new SportskiKlub("Rabotnicki", "Fudbal", 150),
                 new SportskiKlub("Pelister", "Fudbal", 100),
                 new SportskiKlub("Vardar", "Fudbal", 200),
                 new SportskiKlub("Shkendija", "Fudbal", 300),
                 new SportskiKlub("Partizan", "Fudbal", 400),
                 new SportskiKlub("Crvena Zvezda", "Fudbal", 200),
                    new SportskiKlub("Makedonija", "Fudbal", 100)
         );

            //print empty line
            System.out.println();

         System.out.println("Nesortran club");
         for (SportskiKlub sportskiKlub : clubs) {
             System.out.println(sportskiKlub.getIme() + " ");
         }

         Collections.sort(clubs);
         List<SportskiKlub> sortedClubs = SportskiKlub.sortClubsByIme(clubs);


         System.out.println();

         //Prv nacin za sortiranje
         System.out.println("Prv nacin za sortiranje");
            for (SportskiKlub club : clubs) {
                System.out.println(club.getIme());
            }

         System.out.println();

        //Vtor nacin za sortiranje
         System.out.println("Vtor nacin na sortiranje");
         for (SportskiKlub club : sortedClubs) {
             System.out.println(club.getNumberOfMembers());
         }

     }

}
