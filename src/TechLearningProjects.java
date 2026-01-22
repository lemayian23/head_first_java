// ==================== ENHANCED PHRASEOMATIC WITH NEW FEATURES ====================

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

// Color constants - NOT as an inner class
class ConsoleColors {
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
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD = "\033[1;36m";
}

public class EnhancedPhraseOMatic {
    // Statistics
    private static int totalPhrasesGenerated = 0;
    private static List<String> favoritePhrases = new ArrayList<>();
    private static String lastGeneratedPhrase = "";

    // Word lists (same as before)
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

        System.out.println(ConsoleColors.CYAN_BOLD + "═══════════════════════════════════════════" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN_BOLD + "       ENHANCED PHRASE-O-MATIC v2.0       " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN_BOLD + "═══════════════════════════════════════════" + ConsoleColors.RESET);

        // Rest of the main method (without the interface declaration inside)
        // ... rest of your code ...

        while (true) {
            System.out.println("\n" + ConsoleColors.YELLOW + "MAIN MENU:" + ConsoleColors.RESET);
            System.out.println("1.  Generate single phrase");
            System.out.println("2.  Generate multiple phrases");
            System.out.println("3.  Quick random phrase");
            System.out.println("4.  Analyze a phrase");
            System.out.println("5.  Quick word counter");
            System.out.println("6.  Show daily tech tip");
            System.out.println("7.  Show statistics");
            System.out.println("8.  Show favorite phrases");
            System.out.println("9.  Surprise Me!");
            System.out.println("10. Java syntax quiz");
            System.out.println("11. Check code quality");
            System.out.println("12. Debug challenge");
            System.out.println("13. Generate Java code snippet");
            System.out.println("14. Code formatter");
            System.out.println("15. Exit to main program");

            System.out.print(ConsoleColors.BLUE + "\nEnter your choice (1-15): " + ConsoleColors.RESET);

            if (!scanner.hasNextInt()) {
                System.out.println(ConsoleColors.RED + "Please enter a number!" + ConsoleColors.RESET);
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    generateSinglePhrase(scanner);
                    break;
                case 2:
                    System.out.print("How many phrases to generate? ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    generateMultiplePhrases(count);
                    break;
                case 3:
                    generateQuickRandom();
                    break;
                case 4:
                    System.out.print("Enter a phrase to analyze (or press Enter for random): ");
                    String phraseToAnalyze = scanner.nextLine();
                    if (phraseToAnalyze.trim().isEmpty()) {
                        phraseToAnalyze = buildEnhancedPhrase();
                        totalPhrasesGenerated++;
                        System.out.println("Using random phrase: " + ConsoleColors.YELLOW + phraseToAnalyze + ConsoleColors.RESET);
                    }
                    analyzePhrase(phraseToAnalyze);
                    break;
                case 5:
                    quickWordCount();
                    break;
                case 6:
                    showDailyTip();
                    break;
                case 7:
                    showStatistics();
                    break;
                case 8:
                    showFavorites();
                    break;
                case 9:
                    surpriseMe();
                    break;
                case 10:
                    javaSyntaxQuiz(scanner);
                    break;
                case 11:
                    checkCodeQuality();
                    break;
                case 12:
                    debugChallenge();
                    break;
                case 13:
                    generateJavaCodeSnippet();
                    break;
                case 14:
                    codeFormatter();
                    break;
                case 15:
                    System.out.println(ConsoleColors.GREEN + "Returning to main program..." + ConsoleColors.RESET);
                    scanner.close();
                    return;
                default:
                    System.out.println(ConsoleColors.RED + "Invalid choice! Please try again." + ConsoleColors.RESET);
            }

            System.out.print(ConsoleColors.CYAN + "\nPress Enter to continue..." + ConsoleColors.RESET);
            scanner.nextLine();
        }
    }

    // Add missing method implementations:
    private static void debugChallenge() {
        System.out.println("Debug challenge feature would go here.");
    }

    private static void generateJavaCodeSnippet() {
        System.out.println("Generate Java code snippet feature would go here.");
    }

    private static void codeFormatter() {
        System.out.println("Code formatter feature would go here.");
    }

    // ... rest of your methods remain the same ...
}