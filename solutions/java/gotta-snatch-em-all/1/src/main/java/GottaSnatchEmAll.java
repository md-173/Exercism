import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards); 
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !theirCollection.containsAll(myCollection) &&
                !myCollection.containsAll(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> inCommon = new HashSet<>(collections.get(0));
        for(int i = 1; i < collections.size(); i++) {
            inCommon.retainAll(collections.get(i));
        }
        return inCommon;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allSet = new HashSet<>(collections.get(0));
        for(int i = 1; i < collections.size(); i++) {
            allSet.addAll(collections.get(i));
        }
        return allSet;
    }
}
