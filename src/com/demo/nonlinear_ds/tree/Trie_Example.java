package com.demo.nonlinear_ds.tree;

// Trie (Prefix Tree)
/*
A trie is a tree data structure used for efficient retrieval of keys
in a dataset of strings, often used for implementing dictionaries and autocomplete.
 */

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) return false;
            node = node.children[index];
        }
        return node.isEndOfWord;
    }


}

public class Trie_Example {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");

        System.out.println(trie.search("apple")); // Output: true
        System.out.println(trie.search("app")); // Output: true
        System.out.println(trie.search("appl")); // Output: false
    }
}
