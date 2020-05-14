class Trie {

    /** Initialize your data structure here. */
    class TrieNode{
        boolean flag;
        TrieNode[] c;
        public TrieNode(){
            flag=false;
            c=new TrieNode[26];
        }
    }
    TrieNode root;
    public Trie() {
       root=new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode t=root;
        for(int i=0;i<word.length();i++){
            int temp=word.charAt(i)-'a';
            if(root.c[temp]==null){
                root.c[temp]=new TrieNode();
            }
            root=root.c[temp];
        }
        root.flag=true;
        root=t;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode root=this.root;
        for(int i=0;i<word.length();i++){
            int temp=word.charAt(i)-'a';
            if(root.c[temp]==null){
                return false;
            }
            root=root.c[temp];
        }
        if(root.flag) return true;
        return false;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode root=this.root;
        for(int i=0;i<prefix.length();i++){
            int temp=prefix.charAt(i)-'a';
            if(root.c[temp]==null){
                return false;
            }
            root=root.c[temp];
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */