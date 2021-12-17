import java.util.*;

public class FriendScore {
    private TreeMap<Integer, List<Character>> myGraph = new TreeMap<>();
    private TreeMap<Integer, HashSet<Integer>> firstFriends = new TreeMap<>();
    private TreeMap<Integer, HashSet<Integer>> secondFriends = new TreeMap<>();

    private void firstFriends() {
        for (int i = 0; i < myGraph.size(); i++) {
            firstFriends.putIfAbsent(i, new HashSet<>());
            for (int friend = 0; friend < myGraph.size(); friend++) {
                if (myGraph.get(friend).get(i) == 'Y') {
                    HashSet<Integer> set = firstFriends.get(i);
                    set.add(friend);
                    firstFriends.put(i,set);
                }
            }
        }
    }
    private void secondFriends() {
        for (int i = 0; i < firstFriends.size(); i++) {
            secondFriends.putIfAbsent(i, new HashSet<>());
            for (int friend : firstFriends.get(i)) {
                secondFriends.get(i).addAll(firstFriends.get(friend));
                secondFriends.get(i).addAll(firstFriends.get(i));
            }
        }
    }
    private void makeGraph(String[] friends) {
        for (int i = 0; i < friends.length; i++) {
            char[] charArray = friends[i].toCharArray();
            ArrayList<Character> charList = new ArrayList<>();
            for (char a : charArray) {
                charList.add(a);
            }
            myGraph.put(i, charList);
        }
    }
    public int highestScore(String[] friends) {
        makeGraph(friends);
        firstFriends();
        secondFriends();
        int ret = 0;
        for (int k : secondFriends.keySet()) {
            if (secondFriends.get(k).size() > ret) {
                ret = secondFriends.get(k).size() - 1;
            }
        }
        return ret;
    }
}
