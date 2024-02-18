import java.util.*;

public class Tour {
    
    public static void main(String[] args) {

        // a)
        HashMap<String, String> visitedPlaces = new HashMap<>();
        visitedPlaces.put("Polska", "Warszawa");
        visitedPlaces.put("Niemcy", "Berlin");
        visitedPlaces.put("Francja", "Paryż");
        visitedPlaces.put("Hiszpania", "Madryt");
        visitedPlaces.put("Włochy", "Rzym");

        System.out.println("a)");
        printCountriesCities(visitedPlaces);

        // b)
        List<String> visitedCities = new ArrayList<>(visitedPlaces.values());
        visitedCities.add("Rzym");
        visitedCities.add("Berlin");
        visitedCities.add("Toronto");

        System.out.println("b)");
        printCities(visitedCities);
        
        // c)
        HashSet<String> visitedUniqueCities = new HashSet<>(visitedCities);

        System.out.println("c)");
        printUniqueCities(visitedUniqueCities);
    }

    public static void printCountriesCities(HashMap<String, String> visitedPlaces) {
        System.out.println("Odwiedzone miejsca:");
        for (Map.Entry<String, String> place : visitedPlaces.entrySet()) {
            System.out.println("- " + place.getKey() + ": " + place.getValue());
        }

        // czy kolekcja zawiera Szwecję?
        if (visitedPlaces.containsKey("Szwecja")) {
            System.out.println("Kolekcja [Map] zawiera Szwecje");
        } else {
            System.out.println("Kolekcja [Map] nie zawiera Szwecji");
        }

        // wypisanie liczby elementów w kolekcji
        System.out.println("Map zawiera " + visitedPlaces.size() + " elementow\n");
    }

    public static void printCities(List<String> visitedCities) {
        System.out.println("Nazwy miast:");
        for (String city : visitedCities) {
            System.out.println("- " + city);
        }

        // czy kolekcja zawiera Paryż?
        if (visitedCities.contains("Paryż")) {
            System.out.println("Kolekcja [List] zawiera Paryż");
        } else {
            System.out.println("Kolekcja [List] nie zawiera Paryża");
        }

        // wypisanie liczby elementów w kolekcji
        System.out.println("List zawiera " + visitedCities.size() + " elementow\n");
    }

    public static void printUniqueCities(HashSet<String> visitedCities) {
        System.out.println("Unikalne nazwy miast:");
        for (String city : visitedCities) {
            System.out.println("- " + city);
        }

        // czy kolekcja zawiera Rzym?
        if (visitedCities.contains("Rzym")) {
            System.out.println("Kolekcja [Set] zawiera Rzym");
        } else {
            System.out.println("Kolekcja [Set] nie zawiera Rzymu");
        }

        // wypisanie liczby elementów w kolekcji
        System.out.println("Set zawiera " + visitedCities.size() + " elementow\n");
    }
}
