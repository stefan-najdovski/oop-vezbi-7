package me.snajdovski.zadaca5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

        public static void main(String[] args) {


            Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
            Set<String> set2 = new HashSet<>(Arrays.asList("C", "D", "E"));

        // Pecati unija na dvete mnozestva
            Set<String> union = new HashSet<>(set1);
            union.addAll(set2);
            System.out.println("Union: " + union);

        // Pecati presek na dvete mnozestva
            Set<String> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);
            System.out.println("Intersection: " + intersection);


        }
}
