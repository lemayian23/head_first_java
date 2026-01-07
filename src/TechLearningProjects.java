/*
 * TechLearningProjects.java
 *
 * This file contains two Java learning projects:
 * 1. An enhanced BottleSong with multiple features
 * 2. An enhanced PhraseOMatic with multiple features
 */

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TechLearningProjects {

    // CONSOLE COLORS

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

    // ==================== BANNER ====================

    public static void printBanner(String programName) {
        System.out.println(ConsoleColors.BLUE_BOLD);
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                                                          ║");
        System.out.println("║   ██████╗ ██████╗  ██████╗  ██████╗ ██████╗ ███████╗    ║");
        System.out.println("║   ██╔══██╗██╔══██╗██╔═══██╗██╔════╝██╔═══██╗██╔════╝    ║");
        System.out.println("║   ██████╔╝██████╔╝██║   ██║██║     ██║   ██║███████╗    ║");
        System.out.println("║   ██╔═══╝ ██╔══██╗██║   ██║██║     ██║   ██║╚════██║    ║");
        System.out.println("║   ██║     ██║  ██║╚██████╔╝╚██████╗╚██████╔╝███████║    ║");
        System.out.println("║   ╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═════╝ ╚══════╝    ║");
        System.out.println("║                                                          ║");
        System.out.printf("║                   %-36s║%n", programName);
        System.out.println("║                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println(ConsoleColors.RESET);
    }

    // ==================== PROGRESS BAR ====================

    public static void showProgress(int current, int total, String message) {
        int width = 50; // width of progress bar
        int progress = (current * width) / total;

        System.out.print("\r" + message + " [");
        for (int i = 0; i < width; i++) {
            if (i < progress) System.out.print("=");
            else if (i == progress) System.out.print(">");
            else System.out.print(" ");
        }
        System.out.print("] " + current + "/" + total);

        if (current == total) System.out.println(); // New line when complete
    }

    // ==================== BOTTLE SONG ENHANCED ====================

    public static class EnhancedBottleSong {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            printBanner("BOTTLE SONG GENERATOR");
            System.out.println(ConsoleColors.GREEN_BOLD + "🎵 ENHANCED BOTTLE SONG GENERATOR 🎵" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "=====================================" + ConsoleColors.RESET);

            System.out.print("Enter starting number of bottles (1-99): ");
            int startingBottles = scanner.nextInt();

            System.out.print("Add delay between verses? (yes/no): ");
            String delayChoice = scanner.next();
            boolean addDelay = delayChoice.equalsIgnoreCase("yes");

            System.out.print("Enable funny mode? (yes/no): ");
            boolean funnyMode = scanner.next().equalsIgnoreCase("yes");

            System.out.print("Sing full song or one verse? (full/verse): ");
            String songChoice = scanner.next();

            if (songChoice.equalsIgnoreCase("full")) {
                singFullSong(startingBottles, addDelay, funnyMode);
            } else {
                singVerse(startingBottles, funnyMode);
            }

            scanner.close();
        }

        public static void singFullSong(int startingBottles, boolean addDelay, boolean funnyMode) {
            System.out.println(ConsoleColors.YELLOW + "\n🎶 Starting the song with " + startingBottles + " bottles... 🎶" + ConsoleColors.RESET);

            for (int i = startingBottles; i >= 0; i--) {
                singVerse(i, funnyMode);

                if (i > 0 && addDelay) {
                    addDelay(2000);
                }

                if (i > 0) {
                    System.out.println();
                }

                // Show progress
                if (startingBottles > 5) {
                    showProgress(startingBottles - i, startingBottles, "Singing");
                }
            }
        }

        public static void singVerse(int bottles, boolean funnyMode) {
            String word = bottles == 1 ? "bottle" : "bottles";
            String nextWord = (bottles - 1) == 1 ? "bottle" : "bottles";

            if (funnyMode) {
                Random rand = new Random();
                String[] funnyComments = {
                        "...wait, why are they green anyway?",
                        "...hope the wall is strong enough!",
                        "...don't look directly at them!",
                        "...is that eco-friendly glass?",
                        "...they're probably recycled!",
                        "...did anyone clean these?",
                        "...hope they're not slippery!"
                };

                if (bottles > 0) {
                    System.out.println(ConsoleColors.CYAN + bottles + ConsoleColors.YELLOW + " suspiciously green " + word + ConsoleColors.RESET + ", hanging on the wall");
                    System.out.println(ConsoleColors.CYAN + bottles + ConsoleColors.YELLOW + " very questionable " + word + ConsoleColors.RESET + ", hanging on the wall");
                    System.out.println("And if one green bottle should attempt an escape,");
                    System.out.println(ConsoleColors.PURPLE + funnyComments[rand.nextInt(funnyComments.length)] + ConsoleColors.RESET);

                    if (bottles - 1 > 0) {
                        System.out.println("There'll be " + (bottles - 1) + " suspicious green " + nextWord + ", hanging on the wall");
                    } else {
                        System.out.println("There'll be no suspicious bottles, hanging on the wall");
                    }
                } else {
                    System.out.println("No more suspicious bottles, hanging on the wall");
                    System.out.println("No more suspicious bottles, hanging on the wall");
                    System.out.println("'Cause there are no more bottles to question!");
                    System.out.println("\n" + ConsoleColors.GREEN_BOLD + "🎵 THE END (and good riddance!) 🎵" + ConsoleColors.RESET);
                }
            } else {
                if (bottles > 0) {
                    System.out.println(ConsoleColors.CYAN + bottles + ConsoleColors.YELLOW + " green " + word + ConsoleColors.RESET + ", hanging on the wall");
                    System.out.println(ConsoleColors.CYAN + bottles + ConsoleColors.YELLOW + " green " + word + ConsoleColors.RESET + ", hanging on the wall");
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
                    System.out.println("\n" + ConsoleColors.GREEN_BOLD + "🎵 THE END 🎵" + ConsoleColors.RESET);
                }
            }
        }

        private static void addDelay(int milliseconds) {
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Delay interrupted!");
            }
        }

        public static void singVerse(int bottles) {
            singVerse(bottles, false);
        }
    }

    // ==================== PHRASE-O-MATIC ENHANCED ====================

    public static class EnhancedPhraseOMatic {

        // Statistics
        private static int totalPhrasesGenerated = 0;
        private static int phrasesSavedToFile = 0;
        private static List<String> favoritePhrases = new ArrayList<>();

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

        private static final String[] INTENSIFIERS = {
                "extremely", "highly", "remarkably", "unbelievably",
                "incredibly", "absolutely", "utterly", "completely"
        };

        private static final String[] CONTEXTS = {
                "enterprise", "consumer", "mission-critical", "scalable",
                "fault-tolerant", "real-time", "global", "local"
        };

        private static final Random RANDOM = new Random();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            printBanner("PHRASE-O-MATIC");
            System.out.println(ConsoleColors.GREEN_BOLD + "🚀 ENHANCED PHRASE-O-MATIC 🚀" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "==============================" + ConsoleColors.RESET);

            while (true) {
                System.out.println("\n" + ConsoleColors.YELLOW + "Choose an option:" + ConsoleColors.RESET);
                System.out.println("1. Generate single phrase");
                System.out.println("2. Generate multiple phrases");
                System.out.println("3. Generate and save phrases to file");
                System.out.println("4. Generate with custom pattern");
                System.out.println("5. Quick random phrase");
                System.out.println("6. Show statistics");
                System.out.println("7. Show favorite phrases");
                System.out.println("8. Surprise Me!");
                System.out.println("9. Exit to main menu");

                System.out.print(ConsoleColors.BLUE + "Enter your choice (1-9): " + ConsoleColors.RESET);
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        generateSinglePhrase(scanner);
                        break;
                    case 2:
                        System.out.print("How many phrases to generate? ");
                        int count = scanner.nextInt();
                        generateMultiplePhrases(count);
                        break;
                    case 3:
                        System.out.print("How many phrases to generate and save? ");
                        int saveCount = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter filename to save: ");
                        String filename = scanner.nextLine();
                        generateAndSavePhrases(saveCount, filename);
                        break;
                    case 4:
                        System.out.println("Available patterns:");
                        System.out.println("A = Adjective, B = Technology, C = Noun");
                        System.out.println("D = Intensifier, E = Context");
                        System.out.print("Enter pattern (e.g., D-A-B-C or A-B-A-C-E): ");
                        String pattern = scanner.nextLine();
                        generateCustomPhrase(pattern);
                        break;
                    case 5:
                        generateQuickRandom();
                        break;
                    case 6:
                        showStatistics();
                        break;
                    case 7:
                        showFavorites();
                        break;
                    case 8:
                        surpriseMe();
                        break;
                    case 9:
                        System.out.println("Returning to main menu...");
                        return;
                    default:
                        System.out.println(ConsoleColors.RED + "Invalid choice!" + ConsoleColors.RESET);
                }
            }
        }

        public static void generateSinglePhrase(Scanner scanner) {
            String phrase = buildEnhancedPhrase();
            totalPhrasesGenerated++;

            System.out.println(ConsoleColors.GREEN + "\n💡 Generated Phrase:" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "====================" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.YELLOW_BOLD + "What we need is a " + phrase + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "====================\n" + ConsoleColors.RESET);

            copyToClipboard(phrase);
            sharePhrase(phrase);

            System.out.print("Add to favorites? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                addToFavorites(phrase);
            }

            System.out.println(ConsoleColors.BLUE + "📊 Total phrases generated today: " + totalPhrasesGenerated + ConsoleColors.RESET);
        }

        public static void generateMultiplePhrases(int count) {
            System.out.println(ConsoleColors.GREEN + "\n💡 Generated Phrases:" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "=====================" + ConsoleColors.RESET);
            for (int i = 0; i < count; i++) {
                String phrase = buildEnhancedPhrase();
                totalPhrasesGenerated++;
                System.out.println(ConsoleColors.YELLOW + (i + 1) + ". " + phrase + ConsoleColors.RESET);

                if (count > 10) {
                    showProgress(i + 1, count, "Generating phrases");
                }
            }
            System.out.println(ConsoleColors.CYAN + "=====================\n" + ConsoleColors.RESET);
        }

        public static void generateAndSavePhrases(int count, String filename) {
            try (FileWriter writer = new FileWriter(filename)) {
                writer.write("=== PHRASE-O-MATIC OUTPUT ===\n");
                writer.write("Generated on: " + java.time.LocalDateTime.now() + "\n");
                writer.write("Number of phrases: " + count + "\n\n");

                for (int i = 0; i < count; i++) {
                    String phrase = buildEnhancedPhrase();
                    totalPhrasesGenerated++;
                    String line = (i + 1) + ". What we need is a " + phrase + "\n";
                    writer.write(line);

                    if (count > 20) {
                        showProgress(i + 1, count, "Saving phrases");
                    }
                }

                phrasesSavedToFile += count;
                writer.write("\n=== END OF OUTPUT ===");
                System.out.println(ConsoleColors.GREEN + "\n✅ Saved " + count + " phrases to " + filename + ConsoleColors.RESET);
                System.out.println(ConsoleColors.BLUE + "💾 Total phrases saved to files: " + phrasesSavedToFile + ConsoleColors.RESET);

            } catch (IOException e) {
                System.err.println(ConsoleColors.RED + "❌ Error writing to file: " + e.getMessage() + ConsoleColors.RESET);
            }
        }

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

            totalPhrasesGenerated++;
            System.out.println(ConsoleColors.GREEN + "\n🎯 Custom Pattern Phrase:" + ConsoleColors.RESET);
            System.out.println("Pattern used: " + pattern);
            System.out.println(ConsoleColors.YELLOW_BOLD + "Result: What we need is a " + phrase.toString().trim() + ConsoleColors.RESET);
        }

        public static void generateQuickRandom() {
            String[][] quickCombos = {
                    {"agile", "cloud", "solution"},
                    {"dynamic", "scalable", "platform"},
                    {"innovative", "AI-powered", "framework"},
                    {"modern", "serverless", "architecture"},
                    {"robust", "distributed", "system"},
                    {"flexible", "hybrid", "infrastructure"}
            };

            Random rand = new Random();
            String[] combo = quickCombos[rand.nextInt(quickCombos.length)];
            String phrase = combo[0] + " " + combo[1] + " " + combo[2];
            totalPhrasesGenerated++;

            System.out.println(ConsoleColors.PURPLE + "\n⚡ Quick random phrase:" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.YELLOW_BOLD + phrase + ConsoleColors.RESET);

            String[] ratings = {"⭐", "⭐⭐", "⭐⭐⭐", "⭐⭐⭐⭐", "⭐⭐⭐⭐⭐"};
            System.out.println("Coolness rating: " + ConsoleColors.YELLOW + ratings[rand.nextInt(ratings.length)] + ConsoleColors.RESET);

            copyToClipboard(phrase);
        }

        public static void showStatistics() {
            System.out.println(ConsoleColors.BLUE_BOLD + "\n📊 PHRASE-O-MATIC STATISTICS" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "===========================" + ConsoleColors.RESET);
            System.out.println("Total phrases generated: " + ConsoleColors.YELLOW + totalPhrasesGenerated + ConsoleColors.RESET);
            System.out.println("Phrases saved to files: " + ConsoleColors.YELLOW + phrasesSavedToFile + ConsoleColors.RESET);
            System.out.println("Favorite phrases saved: " + ConsoleColors.YELLOW + favoritePhrases.size() + ConsoleColors.RESET);
            System.out.println("Word list sizes:");
            System.out.println("  - Adjectives: " + WORD_LIST_ONE.length);
            System.out.println("  - Technologies: " + WORD_LIST_TWO.length);
            System.out.println("  - Nouns: " + WORD_LIST_THREE.length);
            System.out.println("  - Intensifiers: " + INTENSIFIERS.length);
            System.out.println("  - Contexts: " + CONTEXTS.length);
        }

        public static void surpriseMe() {
            Random rand = new Random();
            int surprise = rand.nextInt(5);


            switch(surprise) {
                case 0:
                    System.out.println("Here's a limerick:");
                    System.out.println(ConsoleColors.YELLOW);
                    System.out.println("There once was a coder so keen,");
                    System.out.println("Whose code was remarkably clean.");
                    System.out.println("With functions so neat,");
                    System.out.println("And no obsolete,");
                    System.out.println("The best coder you've ever seen!");
                    System.out.println(ConsoleColors.RESET);
                    break;

                case 1:
                    System.out.println("Tech Fact:");
                    String[] facts = {
                            "The first computer bug was an actual moth!",
                            "Java was originally called Oak.",
                            "Python is named after Monty Python, not the snake.",
                            "There are over 700 programming languages!",
                            "The first computer mouse was made of wood."
                    };
                    System.out.println(ConsoleColors.CYAN + facts[rand.nextInt(facts.length)] + ConsoleColors.RESET);
                    break;

                case 2:
                    System.out.println("Quick phrase challenge:");
                    System.out.println("Can you say this 5 times fast?");
                    String[] tongueTwisters = {
                            "Serverless service services servers servicelessly",
                            "Cloud-native containerized container containers",
                            "Microservices messily manage messages",
                            "Distributed database design decisions",
                            "Framework functionality facilitates features"
                    };
                    System.out.println(ConsoleColors.YELLOW + tongueTwisters[rand.nextInt(tongueTwisters.length)] + ConsoleColors.RESET);
                    break;

                case 3:
                    System.out.println("Developer joke:");
                    String[] jokes = {
                            "Why do programmers prefer dark mode?\nBecause light attracts bugs!",
                            "How many programmers does it take to change a light bulb?\nNone, that's a hardware problem!",
                            "What's a programmer's favorite place?\nThe Foo Bar!",
                            "Why do Java developers wear glasses?\nBecause they can't C#!",
                            "What's the object-oriented way to become wealthy?\nInheritance!"
                    };
                    System.out.println(ConsoleColors.GREEN + jokes[rand.nextInt(jokes.length)] + ConsoleColors.RESET);
                    break;

                case 4:
                    System.out.println("Random tech phrase:");
                    String randomPhrase = buildEnhancedPhrase();
                    totalPhrasesGenerated++;
                    System.out.println(ConsoleColors.YELLOW_BOLD + randomPhrase + ConsoleColors.RESET);
                    copyToClipboard(randomPhrase);
                    break;
            }
        }

        public static void addToFavorites(String phrase) {
            favoritePhrases.add(phrase);
            System.out.println(ConsoleColors.RED + "❤️ Added to favorites!" + ConsoleColors.RESET);
        }

        public static void showFavorites() {
            if (favoritePhrases.isEmpty()) {
                System.out.println(ConsoleColors.YELLOW + "No favorites yet!" + ConsoleColors.RESET);
            } else {
                System.out.println(ConsoleColors.RED_BOLD + "\n❤️ YOUR FAVORITE PHRASES:" + ConsoleColors.RESET);
                System.out.println(ConsoleColors.RED + "========================" + ConsoleColors.RESET);
                for (int i = 0; i < favoritePhrases.size(); i++) {
                    System.out.println(ConsoleColors.YELLOW + (i + 1) + ". " + favoritePhrases.get(i) + ConsoleColors.RESET);
                }
            }
        }

        public static void copyToClipboard(String text) {
            try {
                java.awt.Toolkit.getDefaultToolkit()
                        .getSystemClipboard()
                        .setContents(new java.awt.datatransfer.StringSelection(text), null);
                System.out.println(ConsoleColors.GREEN + "📋 Phrase copied to clipboard!" + ConsoleColors.RESET);
            } catch (Exception e) {
                System.out.println(ConsoleColors.RED + "⚠️ Could not copy to clipboard: " + e.getMessage() + ConsoleColors.RESET);
            }
        }

        public static void sharePhrase(String phrase) {
            System.out.println(ConsoleColors.BLUE + "\n📱 Share this phrase:" + ConsoleColors.RESET);
            System.out.println("====================");
            System.out.println("Twitter: " + phrase.substring(0, Math.min(phrase.length(), 280)));
            System.out.println("Slack: \"" + phrase + "\" - generated by Phrase-O-Matic!");
            System.out.println("Email subject: Check out this cool phrase!");
            System.out.println("Email body: I generated this using my Java program: " + phrase);
            System.out.println("====================");
        }

        private static String buildBasicPhrase() {
            return getRandomWord(WORD_LIST_ONE) + " " +
                    getRandomWord(WORD_LIST_TWO) + " " +
                    getRandomWord(WORD_LIST_THREE);
        }

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

        private static String getRandomWord(String[] array) {
            return array[RANDOM.nextInt(array.length)];
        }
    }

    // ==================== MAIN MENU ====================

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(ConsoleColors.BLUE_BOLD);
            System.out.println("════════════════════════════════════════════════════════════");
            System.out.println("               JAVA LEARNING PROJECTS MENU                 ");
            System.out.println("════════════════════════════════════════════════════════════");
            System.out.println(ConsoleColors.RESET);
            System.out.println("1. 🎵 Run Enhanced BottleSong");
            System.out.println("2. 🚀 Run Enhanced Phrase-O-Matic");
            System.out.println("3. 📊 Show Project Information");
            System.out.println("4. 🚪 Exit");
            System.out.println(ConsoleColors.BLUE_BOLD);
            System.out.println("════════════════════════════════════════════════════════════");
            System.out.println(ConsoleColors.RESET);

            System.out.print(ConsoleColors.GREEN + "Enter your choice (1-4): " + ConsoleColors.RESET);

            if (!scanner.hasNextInt()) {
                System.out.println(ConsoleColors.RED + "Please enter a number!" + ConsoleColors.RESET);
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    EnhancedBottleSong.main(args);
                    break;
                case 2:
                    EnhancedPhraseOMatic.main(args);
                    break;
                case 3:
                    showProjectInfo();
                    break;
                case 4:
                    System.out.println(ConsoleColors.YELLOW_BOLD + "\nThank you for using Java Learning Projects! Goodbye! 👋" + ConsoleColors.RESET);
                    scanner.close();
                    return;
                default:
                    System.out.println(ConsoleColors.RED + "Invalid choice! Please try again." + ConsoleColors.RESET);
            }

            System.out.print(ConsoleColors.CYAN + "\nPress Enter to continue..." + ConsoleColors.RESET);
            scanner.nextLine();
        }
    }

    // Add to EnhancedPhraseOMatic main method, right after Scanner creation:
System.out.print("Enter a secret code (or press Enter to skip): ");
    String secretCode = scanner.nextLine();

if (secretCode.equals("java4life") || secretCode.equals("bottlesong")) {
        System.out.println(ConsoleColors.PURPLE_BOLD + "\n🎉 SECRET MODE UNLOCKED! 🎉");
        System.out.println("You found the easter egg! Here's a special phrase:");

        String[] secretPhrases = {
                "ULTIMATE quantum blockchain AI framework",
                "MAGICAL voice-activated edge computing platform",
                "LEGENDARY haptically driven distributed ledger",
                "MYTHICAL agent-based serverless architecture"
        };
        Random rand = new Random();
        System.out.println(secretPhrases[rand.nextInt(secretPhrases.length)]);
        System.out.println(ConsoleColors.RESET);
    }

    // Add to generateSinglePhrase() method, after phrase generation:
    int phraseLength = phrase.length();
System.out.println("📏 Phrase length: " + phraseLength + " characters");

// Add fun comments based on length:
if (phraseLength > 60) {
        System.out.println("😲 That's quite a mouthful!");
    } else if (phraseLength < 30) {
        System.out.println("✨ Short and sweet!");
    } else {
        System.out.println("👍 Perfect length!");
    }

    public static void showProjectInfo() {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n📚 PROJECT INFORMATION" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "=====================" + ConsoleColors.RESET);
        System.out.println("This project contains two Java learning programs:");
        System.out.println();
        System.out.println(ConsoleColors.YELLOW_BOLD + "1. Enhanced BottleSong Features:" + ConsoleColors.RESET);
        System.out.println("   • Custom starting bottle count");
        System.out.println("   • Delay between verses option");
        System.out.println("   • Funny mode with humorous lyrics");
        System.out.println("   • Progress bar for long songs");
        System.out.println("   • Colorful console output");
        System.out.println();
        System.out.println(ConsoleColors.YELLOW_BOLD + "2. Enhanced Phrase-O-Matic Features:" + ConsoleColors.RESET);
        System.out.println("   • Multiple generation modes");
        System.out.println("   • File saving capability");
        System.out.println("   • Custom pattern generation");
        System.out.println("   • Clipboard integration");
        System.out.println("   • Favorite phrases list");
        System.out.println("   • Statistics tracking");
        System.out.println("   • Surprise me feature");
        System.out.println("   • Quick random phrases");
        System.out.println("   • Share functionality");
        System.out.println();
        System.out.println(ConsoleColors.GREEN + "File Location: " + ConsoleColors.RESET + "TechLearningProjects.java");
        System.out.println(ConsoleColors.GREEN + "Compilation: " + ConsoleColors.RESET + "javac TechLearningProjects.java");
        System.out.println(ConsoleColors.GREEN + "Execution: " + ConsoleColors.RESET + "java TechLearningProjects");
    }
}