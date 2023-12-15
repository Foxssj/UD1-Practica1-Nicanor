package net.salesianos.processes;

public class WordCounter {
    public static void main(String[] args) {
        String line = args[0];
        String[] words = line.split(" ");
        System.out.println(words.length);
    }
}
