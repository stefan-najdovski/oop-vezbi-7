package me.snajdovski.zadaca4;

import java.util.HashSet;
import java.util.Set;

/*
Да се креира множество од стрингови и да се додадат пет елементи.
Елементите од множеството да се испечатат.
 */
public class Main {

        public static void main(String[] args) {
            Set<String> set = new HashSet<>();
            set.add("Vodorod");
            set.add("Litium");
            set.add("Natrium");
            set.add("Kalium");
            set.add("Rubidium");
            set.add("Ceziuim");
            set.add("Francium");

            for (String element : set) {
                System.out.println(element);
            }

        }
}
