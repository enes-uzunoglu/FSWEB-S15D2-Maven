package org.example.entity;

import java.util.*;

public class StringSet {
    // Metin içindeki benzersiz kelimeleri döndüren metot
    public static Collection<String> findUniqueWords(String text) {
        // Noktalama işaretlerini kaldırmak için replaceAll kullanıyoruz
        text = text.replaceAll("[.,!?\";]", "");  // Düzgün noktalama işaretlerini kaldırmak için
        String[] words = text.split("\\s+"); // Kelimeleri ayırıyoruz
        Set<String> uniqueWords = new HashSet<>(); // Set kullanarak benzersiz kelimeleri tutuyoruz
        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word.toLowerCase());  // Küçük harflerle ekliyoruz, büyük/küçük harfe duyarlı olmamak için
            }
        }
        return uniqueWords; // Benzersiz kelimeleri döndürüyoruz
    }
}
