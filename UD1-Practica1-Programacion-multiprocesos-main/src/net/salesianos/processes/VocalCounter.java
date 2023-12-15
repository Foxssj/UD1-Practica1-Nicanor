package net.salesianos.processes;

public class VocalCounter {
    public static void main(String[] args) {
        String vocal = args[0];
        String line = args[1];
        int count = 0;
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == vocal.charAt(0)) {
                count++;
            }
        }
        System.out.println(vocal + "," + count);
    }
}

