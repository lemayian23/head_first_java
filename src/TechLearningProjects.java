/*

 *
 * This file contains two Java learning projects:
 * 1. An enhanced BottleSong with multiple features
 * 2. An enhanced PhraseOMatic with multiple features
 */

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class TechLearningProjects {

    // ==================== BOTTLE SONG ENHANCED ====================

    /**
     * Enhanced BottleSong with multiple features
     */
    public static class EnhancedBottleSong {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("🎵 ENHANCED BOTTLE SONG GENERATOR 🎵");
            System.out.println("=====================================");

            System.out.print("Enter starting number of bottles (1-99): ");
            int startingBottles = scanner.nextInt();

            System.out.print("Add delay between verses? (yes/no): ");
            String delayChoice = scanner.next();
            boolean addDelay = delayChoice.equalsIgnoreCase("yes");

            System.out.print("Sing full song or one verse? (full/verse): ");
            String songChoice = scanner.next();

            if (songChoice.equalsIgnoreCase("full")) {
                singFullSong(startingBottles, addDelay);
            } else {
                singVerse(startingBottles);
            }

            scanner.close();
        }

        /**
         * Sings the complete bottle song
         * @param startingBottles Number of bottles to start with
         * @param addDelay Whether to add delay between verses
         */
        public static void singFullSong(int startingBottles, boolean addDelay) {
            for (int i = startingBottles; i >= 0; i--) {
                singVerse(i);

                if (i > 0 && addDelay) {
                    addDelay(2000); // 2 second delay
                }

                if (i > 0) {
                    System.out.println(); // Blank line between verses
                }
            }
        }

        /**
         * Sings a single verse of the bottle song
         * @param bottles Number of bottles in this verse
         */
        public static void singVerse(int bottles) {
            String word = bottles == 1 ? "bottle" : "bottles";
            String nextWord = (bottles - 1) == 1 ? "bottle" : "bottles";

            if (bottles > 0) {
                System.out.println("🎶 " + bottles + " green " + word + ", hanging on the wall");
                System.out.println("🎶 " + bottles + " green " + word + ", hanging on the wall");
                System.out.println("🎶 And if the green " + word + " should accidentally fall,");

                if (bottles - 1 > 0) {
                    System.out.println("🎶 There'll be " + (bottles - 1) + " green " + nextWord + ", hanging on the wall");
                } else {
                    System.out.println("🎶 There'll be no green bottles, hanging on the wall");
                }
            } else {
                System.out.println("🎶 No more green bottles, hanging on the wall");
                System.out.println("🎶 No more green bottles, hanging on the wall");
                System.out.println("🎶 'Cause there are no more green bottles to fall!");
                System.out.println("\n🎵 THE END 🎵");
            }
        }

        /**
         * Delay to make music more realistic
         * @param milliseconds Delay in milliseconds
         */
        private static void addDelay(int milliseconds) {
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Delay interrupted!");
            }
        }
    }

    // ==================== PHRASE-O-MATIC ENHANCED ====================

    /**
     * Enhanced PhraseOMatic with multiple features
     */
    public static class EnhancedPhraseOMatic {

        // Add these static variables at the top of EnhancedPhraseOMatic class
        private static int totalPhrasesGenerated = 0;
        private static int phrasesSavedToFile = 0;

// Update in generateSinglePhrase():
        totalPhrasesGenerated++;
System.out.println("📊 Total phrases generated today: " + totalPhrasesGenerated);

// Update in generateAndSavePhrases():
        phrasesSavedToFile += count;
System.out.println("💾 Total phrases saved to files: " + phrasesSavedToFile);

        // Word lists
        private static final String[] WORD_LIST_ONE = {
                "agnostic", "opinionated", "voice activated", "haptically driven",
                "extensible", "reactive", "agent based", "functional",
                "AI enabled", "strongly typed", "quantum", "blockchain"
        };

        private static final String[] WORD_LIST_TWO = {
                "loosely coupled", "six sigma", "asynchronous", "event driven",
                "pub-sub", "IoT", "cloud native", "service oriented",
                "containerized", "serverless", "microservices", "distributed ledger",
                "machine learning", "edge computing"
        };

        private static final String[] WORD_LIST_THREE = {
                "framework", "library", "DSL", "REST API",
                "repository", "pipeline", "service", "mesh",
                "architecture", "perspective", "design", "orientation",
                "platform", "solution", "ecosystem"
        };

        // Additional word lists for more variety
        private static final String[] INTENSIFIERS = {
                "extremely", "highly", "remarkably", "unbelievably",
                "incredibly", "absolutely", "utterly", "completely"
        };

        private static final String[] CONTEXTS = {
                "enterprise", "consumer", "mission-critical", "scalable",
                "fault-tolerant", "real-time", "global", "local"
        };

        private static final Random RANDOM = new Random();

        // Add this method to EnhancedPhraseOMatic
        public static void copyToClipboard(String text) {
            try {
                java.awt.Toolkit.getDefaultToolkit()
                        .getSystemClipboard()
                        .setContents(new java.awt.datatransfer.StringSelection(text), null);
                System.out.println("📋 Phrase copied to clipboard!");
            } catch (Exception e) {
                System.out.println("⚠️ Could not copy to clipboard: " + e.getMessage());
            }
        }

        // Call it after generating a phrase:
        String phrase = buildEnhancedPhrase();
System.out.println("What we need is a " + phrase);
        copyToClipboard(phrase);

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("🚀 ENHANCED PHRASE-O-MATIC 🚀");
            System.out.println("==============================");

            System.out.println("Choose an option:");
            System.out.println("1. Generate single phrase");
            System.out.println("2. Generate multiple phrases");
            System.out.println("3. Generate and save phrases to file");
            System.out.println("4. Generate with custom pattern");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    generateSinglePhrase();
                    break;

                case 2:
                    System.out.print("How many phrases to generate? ");
                    int count = scanner.nextInt();
                    generateMultiplePhrases(count);
                    break;

                case 3:
                    System.out.print("How many phrases to generate and save? ");
                    int saveCount = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter filename to save: ");
                    String filename = scanner.nextLine();
                    generateAndSavePhrases(saveCount, filename);
                    break;

                case 4:
                    scanner.nextLine(); // Consume newline
                    System.out.println("Available patterns:");
                    System.out.println("A = Adjective, B = Technology, C = Noun");
                    System.out.println("D = Intensifier, E = Context");
                    System.out.print("Enter pattern (e.g., D-A-B-C or A-B-A-C-E): ");
                    String pattern = scanner.nextLine();
                    generateCustomPhrase(pattern);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            scanner.close();
        }

        /**
         * Generates a single random phrase
         */
        public static void generateSinglePhrase() {
            String phrase = buildBasicPhrase();
            System.out.println("\n💡 Generated Phrase:");
            System.out.println("====================");
            System.out.println("What we need is a " + phrase);
            System.out.println("====================\n");
        }

        /**
         * Generates multiple random phrases
         * @param count Number of phrases to generate
         */
        public static void generateMultiplePhrases(int count) {
            System.out.println("\n💡 Generated Phrases:");
            System.out.println("=====================");
            for (int i = 0; i < count; i++) {
                String phrase = buildEnhancedPhrase();
                System.out.println((i + 1) + ". " + phrase);
            }
            System.out.println("=====================\n");
        }

        /**
         * Generates phrases and saves them to a file
         * @param count Number of phrases to generate
         * @param filename Name of the file to save to
         */
        public static void generateAndSavePhrases(int count, String filename) {
            try (FileWriter writer = new FileWriter(filename)) {
                writer.write("=== PHRASE-O-MATIC OUTPUT ===\n");
                writer.write("Generated on: " + java.time.LocalDateTime.now() + "\n");
                writer.write("Number of phrases: " + count + "\n\n");

                for (int i = 0; i < count; i++) {
                    String phrase = buildEnhancedPhrase();
                    String line = (i + 1) + ". What we need is a " + phrase + "\n";
                    writer.write(line);
                    System.out.println((i + 1) + ". " + phrase);
                }

                writer.write("\n=== END OF OUTPUT ===");
                System.out.println("\n✅ Saved " + count + " phrases to " + filename);

            } catch (IOException e) {
                System.err.println("❌ Error writing to file: " + e.getMessage());
            }
        }

        // Add this option to BottleSong main menu
System.out.print("Enable funny mode? (yes/no): ");
        boolean funnyMode = scanner.next().equalsIgnoreCase("yes");

        // Modify singVerse() method:
        public static void singVerse(int bottles, boolean funnyMode) {
            String word = bottles == 1 ? "bottle" : "bottles";

            if (funnyMode) {
                String[] funnyComments = {
                        "...wait, why are they green anyway?",
                        "...hope the wall is strong enough!",
                        "...don't look directly at them!",
                        "...is that eco-friendly glass?"
                };

                if (bottles > 0) {
                    System.out.println(bottles + " suspiciously green " + word + ", hanging on the wall");
                    System.out.println(bottles + " very questionable " + word + ", hanging on the wall");
                    System.out.println("And if one green bottle should attempt an escape,");

                    Random rand = new Random();
                    System.out.println(funnyComments[rand.nextInt(funnyComments.length)]);
                }
            }
        }
        // Add to EnhancedPhraseOMatic
        public static void generateQuickRandom() {
            String[][] quickCombos = {
                    {"agile", "cloud", "solution"},
                    {"dynamic", "scalable", "platform"},
                    {"innovative", "AI-powered", "framework"},
                    {"modern", "serverless", "architecture"}
            };

            Random rand = new Random();
            String[] combo = quickCombos[rand.nextInt(quickCombos.length)];

            System.out.println("⚡ Quick random phrase: " +
                    combo[0] + " " + combo[1] + " " + combo[2]);

            // Add fun rating
            String[] ratings = {"⭐", "⭐⭐", "⭐⭐⭐", "⭐⭐⭐⭐", "⭐⭐⭐⭐⭐"};
            System.out.println("Coolness rating: " + ratings[rand.nextInt(ratings.length)]);
        }
        /**
         * Generates a phrase based on a custom pattern
         * @param pattern Pattern like "A-B-C" or "D-A-B-C-E"
         */
        public static void generateCustomPhrase(String pattern) {
            String[] parts = pattern.split("-");
            StringBuilder phrase = new StringBuilder();

            for (String part : parts) {
                switch (part.toUpperCase()) {
                    case "A":
                        phrase.append(getRandomWord(WORD_LIST_ONE)).append(" ");
                        break;
                    case "B":
                        phrase.append(getRandomWord(WORD_LIST_TWO)).append(" ");
                        break;
                    case "C":
                        phrase.append(getRandomWord(WORD_LIST_THREE)).append(" ");
                        break;
                    case "D":
                        phrase.append(getRandomWord(INTENSIFIERS)).append(" ");
                        break;
                    case "E":
                        phrase.append(getRandomWord(CONTEXTS)).append(" ");
                        break;
                    default:
                        phrase.append("[UNKNOWN] ");
                }
            }

            System.out.println("\n🎯 Custom Pattern Phrase:");
            System.out.println("Pattern used: " + pattern);
            System.out.println("Result: What we need is a " + phrase.toString().trim());
        }

        /**
         * Builds a basic three-part phrase
         * @return Generated phrase
         */
        private static String buildBasicPhrase() {
            return getRandomWord(WORD_LIST_ONE) + " " +
                    getRandomWord(WORD_LIST_TWO) + " " +
                    getRandomWord(WORD_LIST_THREE);
        }

        /**
         * Builds an enhanced phrase with optional intensifiers
         * @return Generated phrase
         */
        private static String buildEnhancedPhrase() {
            // 30% chance to add an intensifier
            if (RANDOM.nextInt(100) < 30) {
                return getRandomWord(INTENSIFIERS) + " " + buildBasicPhrase();
            }
            // 20% chance to add a context
            else if (RANDOM.nextInt(100) < 20) {
                return buildBasicPhrase() + " for " + getRandomWord(CONTEXTS) + " applications";
            }
            else {
                return buildBasicPhrase();
            }
        }

        /**
         * Gets a random word from an array
         * @param array Array of words to choose from
         * @return Random word from the array
         */
        private static String getRandomWord(String[] array) {
            return array[RANDOM.nextInt(array.length)];
        }
    }

    // ==================== MAIN MENU ====================

    /**
     * Main menu to choose which program to run
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("════════════════════════════════════════");
        System.out.println("       JAVA LEARNING PROJECTS MENU      ");
        System.out.println("════════════════════════════════════════");
        System.out.println("1. Run Enhanced BottleSong");
        System.out.println("2. Run Enhanced Phrase-O-Matic");
        System.out.println("3. Run Both Programs");
        System.out.println("4. Exit");
        System.out.println("════════════════════════════════════════");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                EnhancedBottleSong.main(args);
                break;
            case 2:
                EnhancedPhraseOMatic.main(args);
                break;
            case 3:
                System.out.println("\n" + "=".repeat(50));
                EnhancedBottleSong.main(args);
                System.out.println("\n" + "=".repeat(50));
                EnhancedPhraseOMatic.main(args);
                break;
            case 4:
                System.out.println("Goodbye! 👋");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
    // Add this class inside TechLearningProjects.java
    public static class ConsoleColors {
        // Reset
        public static final String RESET = "\033[0m";

        // Colors
        public static final String RED = "\033[0;31m";
        public static final String GREEN = "\033[0;32m";
        public static final String YELLOW = "\033[0;33m";
        public static final String BLUE = "\033[0;34m";
        public static final String PURPLE = "\033[0;35m";
        public static final String CYAN = "\033[0;36m";
        public static final String WHITE = "\033[0;37m";

        // Bold Colors
        public static final String RED_BOLD = "\033[1;31m";
        public static final String GREEN_BOLD = "\033[1;32m";
        public static final String YELLOW_BOLD = "\033[1;33m";
        public static final String BLUE_BOLD = "\033[1;34m";
    }

// Then use it in your print statements:
System.out.println(ConsoleColors.GREEN_BOLD + "🎵 ENHANCED BOTTLE SONG GENERATOR 🎵" + ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN + bottles + ConsoleColors.YELLOW + " green " + word + ConsoleColors.RESET + ", hanging on the wall");
}
// Add this method
public static void printBanner(String programName) {
    System.out.println();
    System.out.println("╔══════════════════════════════════════════════════════════╗");
    System.out.println("║                                                          ║");
    System.out.println("║   ██████╗ ██████╗  ██████╗  ██████╗ ██████╗ ███████╗    ║");
    System.out.println("║   ██╔══██╗██╔══██╗██╔═══██╗██╔════╝██╔═══██╗██╔════╝    ║");
    System.out.println("║   ██████╔╝██████╔╝██║   ██║██║     ██║   ██║███████╗    ║");
    System.out.println("║   ██╔═══╝ ██╔══██╗██║   ██║██║     ██║   ██║╚════██║    ║");
    System.out.println("║   ██║     ██║  ██║╚██████╔╝╚██████╗╚██████╔╝███████║    ║");
    System.out.println("║   ╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═════╝ ╚══════╝    ║");
    System.out.println("║                                                          ║");
    System.out.println("║                   " + programName + "                  ║");
    System.out.println("║                                                          ║");
    System.out.println("╚══════════════════════════════════════════════════════════╝");
    System.out.println();
}
