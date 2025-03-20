import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {

    // Benzersiz kelimeleri döndüren metod
    public static List<String> findUniqueWords(String input) {
        // Metni kelimelere ayırıyoruz
        String[] words = input.split(" ");

        // Set kullanarak benzersiz kelimeleri alıyoruz
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.trim()); // Trim ile gereksiz boşlukları da temizliyoruz
        }

        // Set'teki benzersiz kelimeleri listeye çeviriyoruz
        return new ArrayList<>(uniqueWords);
    }

    public static void main(String[] args) {
        String input = "apple banana apple cherry banana orange apple";
        List<String> uniqueWords = findUniqueWords(input);
        System.out.println(uniqueWords);
    }
}
