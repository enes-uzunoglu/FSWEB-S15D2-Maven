package org.example.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskData {
    private Set<Task> annTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks){
        this.annTasks = annTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String x){
        switch (x.toLowerCase()){
            case "ann":
                return annTasks;
            case "bobs":
                return bobsTasks;
            case "carols":
                return carolsTasks;
            case "all":
                Set<Task> all = new HashSet<>();
                all.addAll(annTasks);
                all.addAll(bobsTasks);
                all.addAll(carolsTasks);
                return all;
            default:
                return Set.of(); // Geçersiz bir input durumunda boş bir set döndürür
        }
    }

    public Set<Task> getUnion(List<Set<Task>> taskSets){
        Set<Task> unionSet = new HashSet<>();
        for (Set<Task> taskSet : taskSets){
            unionSet.addAll(taskSet); // Her setteki tüm elemanları birleştirir
        }
        return unionSet;
    }

    public Set<Task> getIntersect(Set<Task> task1, Set<Task> task2){
        task1.retainAll(task2);   // task1'de ve task2'de bulunan ortak elemanları tutar
        return task1;
    }

    public Set<Task> getDifference(Set<Task> task1, Set<Task> task2){
        task1.removeAll(task2); // task2'deki tüm elemanları task1'den çıkarır
        return task1;
    }

    public Set<Task> getUnion(Set<Task> taskSet, Set<Task> taskSet2) {
        Set<Task> unionSet = new HashSet<>(taskSet);
        unionSet.addAll(taskSet2); // taskSet2'deki tüm elemanları taskSet'e ekler
        return unionSet;
    }

    public Set<Task> getIntersection(Set<Task> taskSet, Set<Task> taskSet2) {
        Set<Task> intersectionSet = new HashSet<>(taskSet);
        intersectionSet.retainAll(taskSet2); // taskSet ve taskSet2'deki ortak elemanları tutar
        return intersectionSet;
    }

    // getDifferences metodunun içeriği:
    public Set<Task> getDifferences(Set<Task> taskSet, Set<Task> taskSet2) {
        // taskSet'teki ancak taskSet2'de olmayan elemanları döndüren kod:
        Set<Task> differenceSet = new HashSet<>(taskSet);
        differenceSet.removeAll(taskSet2); // taskSet2'deki elemanları taskSet'ten çıkarır
        return differenceSet;
    }
}
