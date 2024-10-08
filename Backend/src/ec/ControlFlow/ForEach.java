package ec.ControlFlow;

public class ForEach {
    public static void main(String[] args) {
        // Arrays of numbers
        int[] numbers = {7, 12, 23, 34, 45, 56, 68, 79, 81, 92};

        // Array of fictional characters inspired by a One Piece-like universe
        String[] pirateCrew = {
                "Captain Rojo - A fearless leader with a burning passion for adventure and a unique flame sword.",
                "Navigator Coraline - A skilled navigator who controls sea currents with her magical conch shell.",
                "Chef Tempura - A master chef who can cook dishes that temporarily boost the crew's abilities.",
                "Sniper Blitz - A sharpshooter with lightning reflexes and a rifle that never misses.",
                "Doctor Seagull - A quirky doctor who can heal wounds with rare herbs and bizarre elixirs.",
                "Engineer Gear - A genius inventor who creates gadgets and weapons out of scrap metal.",
                "Martial Artist Lotus - A calm fighter who uses water-style martial arts to defeat her enemies.",
                "Musician Echo - A bard whose music can hypnotize enemies or inspire allies in battle.",
                "Scout Shadow - A stealthy scout who can blend into the environment and gather crucial intel.",
                "First Mate Ironclad - The loyal first mate with an impenetrable iron body and unbreakable will."
        };

        // Print each number in the numbers array
        for (int num : numbers) {
            System.out.printf("The number is %d%n", num);
        }

        // Print each pirate character's name only
        for (String pirateC : pirateCrew) {
            System.out.println(pirateC.substring(0, pirateC.indexOf('-')).trim());
        }
    }
}
