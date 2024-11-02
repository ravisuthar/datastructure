package dinesh.varyani.trie;

public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();//empty
    }

    private static class TrieNode {
        private TrieNode[] children;
        private boolean isWord = false;

        public TrieNode() {
            this.children = new TrieNode[26]; //storing english words a->z
            this.isWord = false;
        }
    }

    public void insert(String word) {

        if (null == word || word.isEmpty()) {
            throw new IllegalArgumentException("invalid input") ;
        }

        TrieNode current = this.root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                TrieNode newNode = new TrieNode();
                current.children[index] = newNode;
                current = newNode;
            } else {
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode current = this.root;
       // char[] result = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
           // result[i] = ch;
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            } else {
                current = current.children[index];
            }
        }
        //return word.contains(String.valueOf(result));
        return current.isWord;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        System.out.println(trie.search("cat"));
    }
}
