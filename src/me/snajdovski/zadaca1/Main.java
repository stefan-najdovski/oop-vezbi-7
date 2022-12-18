import java.util.ArrayList;
/*
1. Да се креира листа од стрингови во која ќе се сместуваат имиња на
лекови. Да се додадат неколку елементи. Доколку последниот елемент
е Paracetamol, да се испечати: "Лекот помага за намалување на
телесната температура". Во спротивно, да се испечати: "Намената на
лекот е непозната!".
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> lekovi = new ArrayList<>();

        lekovi.add("Aspirin");
        lekovi.add("Ibuprofen");
        lekovi.add("Nurofen");
        lekovi.add("Naproxen");
        lekovi.add("Diclofenac");
        lekovi.add("Voltaren");
        lekovi.add("Paracetamol");

     //Da se proveri dali posledniot element e paracetamol
        if(lekovi.get(lekovi.size()-1).equals("Paracetamol")){
            System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura");
        }else {
            System.out.println("Namenata na lekot e nepoznata!");
        }

    }
}