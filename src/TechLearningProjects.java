// ==================== ENHANCED PHRASEOMATIC WITH NEW FEATURES ====================

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public static class EnhancedPhraseOMatic {
    // Statistics
    private static int totalPhrasesGenerated = 0;
    private static List<String> favoritePhrases = new ArrayList<>();
    private static String lastGeneratedPhrase = "";

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

        System.out.println(ConsoleColors.CYAN_BOLD + "═══════════════════════════════════════════" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN_BOLD + "       ENHANCED PHRASE-O-MATIC v2.0       " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN_BOLD + "═══════════════════════════════════════════" + ConsoleColors.RESET);

        // Secret easter egg
        System.out.print("Enter a secret code (or press Enter to skip): ");
        String secretCode = scanner.nextLine();

        if (secretCode.equals("java4life") || secretCode.equals("bottlesong")) {
            System.out.println(ConsoleColors.PURPLE_BOLD + "\n🎉 SECRET MODE UNLOCKED! 🎉" + ConsoleColors.RESET);
            System.out.println("You found the easter egg! Here's a special phrase:");

            String[] secretPhrases = {
                    "ULTIMATE quantum blockchain AI framework",
                    "MAGICAL voice-activated edge computing platform",
                    "LEGENDARY haptically driven distributed ledger",
                    "MYTHICAL agent-based serverless architecture"
            };
            System.out.println(secretPhrases[RANDOM.nextInt(secretPhrases.length)]);
            System.out.println(ConsoleColors.RESET);
        }

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

            // ==================== CONSOLE COLORS ====================

// Remove the "public static class ConsoleColors {" l

// Color constants - NOT as an inner class
            interface ConsoleColors {
                // Reset
                String RESET = "\033[0m";

                // Colors
                String RED = "\033[0;31m";
                String GREEN = "\033[0;32m";
                String YELLOW = "\033[0;33m";
                String BLUE = "\033[0;34m";
                String PURPLE = "\033[0;35m";
                String CYAN = "\033[0;36m";
                String WHITE = "\033[0;37m";

                // Bold Colors
                String RED_BOLD = "\033[1;31m";
                String GREEN_BOLD = "\033[1;32m";
                String YELLOW_BOLD = "\033[1;33m";
                String BLUE_BOLD = "\033[1;34m";
                String PURPLE_BOLD = "\033[1;35m";
                String CYAN_BOLD = "\033[1;36m";
            }

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
                    generateCodeSnippet();
                    break;
                case 14:
                    codeFormatter();
                    break;
                case 15:
                    System.out.println(ConsoleColors.GREEN + "Returning to main program..." + ConsoleColors.RESET);
                    return;
                default:
                    System.out.println(ConsoleColors.RED + "Invalid choice! Please try again." + ConsoleColors.RESET);
            }

            System.out.print(ConsoleColors.CYAN + "\nPress Enter to continue..." + ConsoleColors.RESET);
            scanner.nextLine();
        }
    }

    /**
     * Generates a single random phrase
     */
    public static void generateSinglePhrase(Scanner scanner) {
        String phrase = buildEnhancedPhrase();
        lastGeneratedPhrase = phrase;
        totalPhrasesGenerated++;

        System.out.println(ConsoleColors.GREEN + "\n💡 GENERATED PHRASE:" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "═══════════════════════" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW_BOLD + "What we need is a " + phrase + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "═══════════════════════" + ConsoleColors.RESET);

        // Add phrase length display
        int phraseLength = phrase.length();
        System.out.println("📏 Phrase length: " + phraseLength + " characters");

        // Add fun comments based on length
        if (phraseLength > 60) {
            System.out.println("😲 That's quite a mouthful!");
        } else if (phraseLength < 30) {
            System.out.println("✨ Short and sweet!");
        } else {
            System.out.println("👍 Perfect length!");
        }

        copyToClipboard(phrase);

        System.out.print("\nAdd to favorites? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            addToFavorites(phrase);
        }

        System.out.print("Analyze this phrase? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            analyzePhrase(phrase);
        }

        System.out.println(ConsoleColors.BLUE + "\n📊 Total phrases generated: " + totalPhrasesGenerated + ConsoleColors.RESET);

        // Show programming tip after phrase generation
        showProgrammingTip();
    }

    /**
     * Shows a quick programming tip
     */
    public static void showProgrammingTip() {
        String[] tips = {
                "💡 Remember: Arrays start at 0 in Java!",
                "💡 Pro tip: Use meaningful variable names!",
                "💡 Debug tip: System.out.println() is your friend!",
                "💡 Best practice: Comment your code!",
                "💡 Java fact: Use .equals() for String comparison!",
                "💡 Efficiency tip: Break code into methods!",
                "💡 Learning tip: Practice every day!",
                "💡 Memory tip: Close your Scanner objects!"
        };

        System.out.println(ConsoleColors.GREEN_BOLD + "\n" + tips[RANDOM.nextInt(tips.length)] + ConsoleColors.RESET);
    }

    /**
     * Generates multiple random phrases
     */
    public static void generateMultiplePhrases(int count) {
        System.out.println(ConsoleColors.GREEN + "\n💡 GENERATED PHRASES:" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "════════════════════════" + ConsoleColors.RESET);
        for (int i = 0; i < count; i++) {
            String phrase = buildEnhancedPhrase();
            lastGeneratedPhrase = phrase;
            totalPhrasesGenerated++;
            System.out.println(ConsoleColors.YELLOW + (i + 1) + ". " + phrase + ConsoleColors.RESET);

            // Add fun facts between phrases for longer lists
            if (count > 5 && i % 3 == 0 && i > 0) {
                String[] facts = {
                        "💡 Fun fact: This uses Random.nextInt()!",
                        "🎵 Did you know? Java was released in 1995!",
                        "📚 Trivia: 'public static void main' is the entry point!",
                        "🤔 Thought: Practice makes perfect!"
                };
                System.out.println(ConsoleColors.PURPLE + facts[RANDOM.nextInt(facts.length)] + ConsoleColors.RESET);
            }
        }
        System.out.println(ConsoleColors.CYAN + "════════════════════════" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "\n✅ Generated " + count + " phrases!" + ConsoleColors.RESET);
    }

    /**
     * Quick random phrase generator
     */
    public static void generateQuickRandom() {
        String[][] quickCombos = {
                {"agile", "cloud", "solution"},
                {"dynamic", "scalable", "platform"},
                {"innovative", "AI-powered", "framework"},
                {"modern", "serverless", "architecture"},
                {"robust", "distributed", "system"},
                {"flexible", "hybrid", "infrastructure"}
        };

        String[] combo = quickCombos[RANDOM.nextInt(quickCombos.length)];
        String phrase = combo[0] + " " + combo[1] + " " + combo[2];
        lastGeneratedPhrase = phrase;
        totalPhrasesGenerated++;

        System.out.println(ConsoleColors.PURPLE + "\n⚡ QUICK RANDOM PHRASE:" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW_BOLD + phrase + ConsoleColors.RESET);

        String[] ratings = {"⭐", "⭐⭐", "⭐⭐⭐", "⭐⭐⭐⭐", "⭐⭐⭐⭐⭐"};
        System.out.println("Coolness rating: " + ConsoleColors.YELLOW + ratings[RANDOM.nextInt(ratings.length)] + ConsoleColors.RESET);

        copyToClipboard(phrase);
    }

    /**
     * Analyzes a phrase and shows word count statistics
     */
    public static void analyzePhrase(String phrase) {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n📊 PHRASE ANALYSIS" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "══════════════════" + ConsoleColors.RESET);

        // Count words
        String[] words = phrase.split(" ");
        int wordCount = words.length;

        // Count characters (excluding spaces)
        int charCount = phrase.replace(" ", "").length();

        // Find longest word
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Count syllables (rough estimate)
        int syllableCount = 0;
        for (String word : words) {
            syllableCount += countSyllables(word);
        }

        // Display results
        System.out.println("📝 Original phrase: " + ConsoleColors.YELLOW + phrase + ConsoleColors.RESET);
        System.out.println("🔢 Word count: " + ConsoleColors.GREEN + wordCount + ConsoleColors.RESET);
        System.out.println("🔤 Character count: " + ConsoleColors.GREEN + charCount + ConsoleColors.RESET);
        System.out.println("🏆 Longest word: " + ConsoleColors.GREEN + longestWord +
                " (" + longestWord.length() + " letters)" + ConsoleColors.RESET);
        System.out.println("🎵 Estimated syllables: " + ConsoleColors.GREEN + syllableCount + ConsoleColors.RESET);

        // Fun rating based on length
        System.out.print("📏 Length rating: ");
        if (wordCount <= 3) {
            System.out.println(ConsoleColors.GREEN + "Short & Sweet! ✨" + ConsoleColors.RESET);
        } else if (wordCount <= 5) {
            System.out.println(ConsoleColors.YELLOW + "Just Right! 👍" + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.RED + "Mouthful! 😲" + ConsoleColors.RESET);
        }

        // Tech buzzword detector
        System.out.print("🚀 Tech level: ");
        int techWords = 0;
        for (String word : words) {
            if (isTechBuzzword(word)) {
                techWords++;
            }
        }

        if (techWords >= 3) {
            System.out.println(ConsoleColors.CYAN + "Ultra-Techy! 🤖 (" + techWords + " buzzwords)" + ConsoleColors.RESET);
        } else if (techWords >= 2) {
            System.out.println(ConsoleColors.BLUE + "Pretty Techy! 💻 (" + techWords + " buzzwords)" + ConsoleColors.RESET);
        } else {
            System.out.println("Normal Tech Level 👨‍💻");
        }

        // Funny comments
        if (phrase.toLowerCase().contains("blockchain") && phrase.toLowerCase().contains("ai")) {
            System.out.println("💰 Bonus: This phrase could get you VC funding!");
        }
        if (phrase.toLowerCase().contains("serverless") && phrase.toLowerCase().contains("cloud")) {
            System.out.println("☁️  Double cloud points!");
        }
        if (phrase.toLowerCase().contains("microservices") && phrase.toLowerCase().contains("distributed")) {
            System.out.println("🔗 Distributed systems expert!");
        }
    }

    /**
     * Quick word counter feature
     */
    public static void quickWordCount() {
        String phrase = buildEnhancedPhrase();
        lastGeneratedPhrase = phrase;
        totalPhrasesGenerated++;
        String[] words = phrase.split(" ");

        System.out.println(ConsoleColors.GREEN_BOLD + "\n🔤 QUICK WORD COUNTER" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "══════════════════════" + ConsoleColors.RESET);
        System.out.println("Phrase: " + ConsoleColors.YELLOW + phrase + ConsoleColors.RESET);
        System.out.println("Total words: " + ConsoleColors.GREEN + words.length + ConsoleColors.RESET);

        // Show word breakdown
        System.out.println("\nWord breakdown:");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int letters = word.length();
            String color = letters > 10 ? ConsoleColors.RED :
                    letters > 7 ? ConsoleColors.YELLOW : ConsoleColors.GREEN;
            System.out.println("  " + (i+1) + ". \"" + word + "\" " + color + "(" + letters + " letters)" + ConsoleColors.RESET);
        }

        // Fun facts
        if (words.length == 3) {
            System.out.println(ConsoleColors.GREEN + "\n✨ Perfect tech phrase structure!" + ConsoleColors.RESET);
        }
        if (words.length > 5) {
            System.out.println(ConsoleColors.YELLOW + "\n⚠️  That's a long phrase for a meeting!" + ConsoleColors.RESET);
        }
    }

    /**
     * Shows a daily tech tip about programming or technology
     */
    public static void showDailyTip() {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n💡 DAILY TECH TIP" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "══════════════════" + ConsoleColors.RESET);

        String[] tips = {
                "Tip: Use meaningful variable names like 'userCount' instead of 'x' or 'temp'",
                "Tip: Always close your Scanner objects to prevent resource leaks",
                "Tip: Comment your code today, thank yourself tomorrow!",
                "Tip: The 'final' keyword makes variables constant - use it for values that won't change",
                "Tip: Arrays start at index 0 in Java (and most programming languages)",
                "Tip: Use System.out.println() for debugging - it's a programmer's best friend!",
                "Tip: Break complex problems into smaller methods - each should do one thing well",
                "Tip: String concatenation with '+' is fine for small operations",
                "Tip: Always test edge cases - what happens with empty input or maximum values?",
                "Tip: Use try-catch blocks to handle potential errors gracefully",
                "Tip: The 'private' keyword helps with encapsulation - hide what doesn't need to be public",
                "Tip: DRY = Don't Repeat Yourself. If you're copying code, make it a method!",
                "Tip: Use .equals() to compare Strings, not == (which compares memory addresses)",
                "Tip: Arrays have a .length property, Strings have .length() method",
                "Tip: Random.nextInt(10) gives numbers 0-9, not 1-10",
                "Tip: While loops are great when you don't know how many iterations you need",
                "Tip: Switch statements are cleaner than long if-else chains for multiple conditions",
                "Tip: Use StringBuilder when concatenating Strings in a loop for better performance",
                "Tip: The main() method is static because it needs to be called without creating an object",
                "Tip: Java is case-sensitive - 'myVariable' and 'MyVariable' are different"
        };

        // Get today's day of month to show different tip each day
        int dayOfMonth = LocalDate.now().getDayOfMonth();
        int tipIndex = (dayOfMonth - 1) % tips.length; // Ensure we stay within array bounds

        System.out.println("Day " + dayOfMonth + " of the month:");
        System.out.println(ConsoleColors.YELLOW + tips[tipIndex] + ConsoleColors.RESET);

        // Add a small challenge related to the tip
        System.out.println(ConsoleColors.GREEN + "\n🎯 Related Challenge:" + ConsoleColors.RESET);
        String[] challenges = {
                "Find one place in this program where you could improve a variable name",
                "Add a comment explaining why a particular piece of code works",
                "Think of an edge case you haven't tested yet",
                "Identify a method that could be broken into smaller pieces",
                "Find where .equals() is used instead of ==",
                "Look for a place where StringBuilder might be useful",
                "Find a switch statement or where one could be used"
        };
        System.out.println(ConsoleColors.CYAN + challenges[RANDOM.nextInt(challenges.length)] + ConsoleColors.RESET);
    }

    /**
     * Interactive Java syntax quiz
     */
    public static void javaSyntaxQuiz(Scanner scanner) {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n🧠 JAVA SYNTAX QUIZ" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "═══════════════════" + ConsoleColors.RESET);
        System.out.println("Test your Java knowledge! Answer 3 quick questions.");

        int score = 0;
        int totalQuestions = 3;

        // Question 1
        System.out.println("\n1. What does this code output?");
        System.out.println("   int x = 5;");
        System.out.println("   System.out.println(x++);");
        System.out.println("   A) 5");
        System.out.println("   B) 6");
        System.out.println("   C) 0");
        System.out.print("   Your answer (A/B/C): ");
        String answer1 = scanner.nextLine().toUpperCase();
        if (answer1.equals("A")) {
            System.out.println("   " + ConsoleColors.GREEN + "✅ Correct! x++ returns then increments." + ConsoleColors.RESET);
            score++;
        } else {
            System.out.println("   " + ConsoleColors.RED + "❌ Incorrect! The answer is A) 5 (post-increment)" + ConsoleColors.RESET);
        }

        // Question 2
        System.out.println("\n2. Which is correct for array declaration?");
        System.out.println("   A) int array[5];");
        System.out.println("   B) int[] array = new int[5];");
        System.out.println("   C) array int[5];");
        System.out.print("   Your answer (A/B/C): ");
        String answer2 = scanner.nextLine().toUpperCase();
        if (answer2.equals("B")) {
            System.out.println("   " + ConsoleColors.GREEN + "✅ Correct! Java uses 'new' for arrays." + ConsoleColors.RESET);
            score++;
        } else {
            System.out.println("   " + ConsoleColors.RED + "❌ Incorrect! The answer is B) int[] array = new int[5]" + ConsoleColors.RESET);
        }

        // Question 3
        System.out.println("\n3. What's the output?");
        System.out.println("   String s1 = \"Hello\";");
        System.out.println("   String s2 = \"Hello\";");
        System.out.println("   System.out.println(s1 == s2);");
        System.out.println("   A) true");
        System.out.println("   B) false");
        System.out.println("   C) Error");
        System.out.print("   Your answer (A/B/C): ");
        String answer3 = scanner.nextLine().toUpperCase();
        if (answer3.equals("A")) {
            System.out.println("   " + ConsoleColors.GREEN + "✅ Correct! String literals are pooled." + ConsoleColors.RESET);
            score++;
        } else {
            System.out.println("   " + ConsoleColors.RED + "❌ Incorrect! The answer is A) true (string pool)" + ConsoleColors.RESET);
        }

        // Results
        System.out.println("\n" + ConsoleColors.YELLOW_BOLD + "📊 QUIZ RESULTS" + ConsoleColors.RESET);
        System.out.println("Score: " + score + "/" + totalQuestions);

        if (score == totalQuestions) {
            System.out.println(ConsoleColors.GREEN_BOLD + "🎉 Perfect! You're a Java pro!" + ConsoleColors.RESET);
        } else if (score >= totalQuestions/2) {
            System.out.println(ConsoleColors.YELLOW + "👍 Good job! Keep practicing!" + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.CYAN + "📚 Keep learning! You'll get better!" + ConsoleColors.RESET);
        }

        // Fun fact
        String[] facts = {
                "💡 Java was originally called Oak!",
                "💡 Java arrays start at index 0!",
                "💡 Use .equals() to compare String content!",
                "💡 main() method must be public static void!",
                "💡 System.out.println() prints with new line!"
        };
        Random rand = new Random();
        System.out.println("\n" + facts[rand.nextInt(facts.length)]);
    }

    /**
     * Checks code quality of a Java code snippet
     */
    public static void checkCodeQuality() {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n🔍 CODE QUALITY CHECKER" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "═══════════════════════" + ConsoleColors.RESET);

        String[] commonIssues = {
                "Missing semicolon (;) at end of statement",
                "Unused import statements",
                "Variable declared but never used",
                "Magic numbers (use constants instead)",
                "Long methods (should be under 20 lines)",
                "Poor variable names (x, temp, data)",
                "Missing comments for complex logic",
                "No error handling (try-catch blocks)",
                "Hard-coded values (put in constants)",
                "Duplicate code (violates DRY principle)"
        };

        String[] goodPractices = {
                "✅ Meaningful variable names",
                "✅ Proper indentation",
                "✅ Consistent naming conventions",
                "✅ Comments for complex logic",
                "✅ Error handling with try-catch",
                "✅ Methods do one thing only",
                "✅ Constants for magic numbers",
                "✅ Proper access modifiers",
                "✅ Code reuse through methods",
                "✅ Input validation"
        };

        Random rand = new Random();

        System.out.println("Common issues to watch for:");
        for (int i = 0; i < 3; i++) {
            System.out.println("  • " + ConsoleColors.RED + commonIssues[rand.nextInt(commonIssues.length)] + ConsoleColors.RESET);
        }

        System.out.println("\nGood practices in your code:");
        for (int i = 0; i < 3; i++) {
            System.out.println("  • " + ConsoleColors.GREEN + goodPractices[rand.nextInt(goodPractices.length)] + ConsoleColors.RESET);
        }

        // Simple code analysis challenge
        System.out.println(ConsoleColors.YELLOW + "\n🎯 Quick Challenge:" + ConsoleColors.RESET);
        String[] challenges = {
                "Find a variable that could have a better name",
                "Look for a magic number you could make a constant",
                "Find a method that could be split into smaller methods",
                "Check if all Scanner objects are properly closed",
                "Look for duplicate code that could be a method"
        };
        System.out.println(ConsoleColors.CYAN + challenges[rand.nextInt(challenges.length)] + ConsoleColors.RESET);

        // Fun rating
        System.out.print("\nYour code quality rating: ");
        String[] ratings = {"⭐ Needs work", "⭐⭐ Okay", "⭐⭐⭐ Good", "⭐⭐⭐⭐ Great", "⭐⭐⭐⭐⭐ Excellent!"};
        System.out.println(ConsoleColors.YELLOW_BOLD + ratings[rand.nextInt(ratings.length)] + ConsoleColors.RESET);
    }

    /**
     * Shows statistics
     */
    public static void showStatistics() {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n📊 PHRASE-O-MATIC STATISTICS" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "══════════════════════════════" + ConsoleColors.RESET);
        System.out.println("Total phrases generated: " + ConsoleColors.YELLOW + totalPhrasesGenerated + ConsoleColors.RESET);
        System.out.println("Favorite phrases saved: " + ConsoleColors.YELLOW + favoritePhrases.size() + ConsoleColors.RESET);
        System.out.println("Last phrase: " + ConsoleColors.YELLOW +
                (lastGeneratedPhrase.isEmpty() ? "None yet" : lastGeneratedPhrase) + ConsoleColors.RESET);
        System.out.println("\nWord list sizes:");
        System.out.println("  • Adjectives: " + WORD_LIST_ONE.length + " words");
        System.out.println("  • Technologies: " + WORD_LIST_TWO.length + " words");
        System.out.println("  • Nouns: " + WORD_LIST_THREE.length + " words");
        System.out.println("  • Intensifiers: " + INTENSIFIERS.length + " words");
        System.out.println("  • Contexts: " + CONTEXTS.length + " words");
    }

    /**
     * Surprise Me feature
     */
    public static void surpriseMe() {
        Random rand = new Random();
        int surprise = rand.nextInt(5);

        System.out.println(ConsoleColors.PURPLE_BOLD + "\n🎁 SURPRISE! 🎁" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.PURPLE + "═══════════════" + ConsoleColors.RESET);

        switch(surprise) {
            case 0:
                System.out.println("Here's a programmer limerick:");
                System.out.println(ConsoleColors.YELLOW);
                System.out.println("There once was a coder so keen,");
                System.out.println("Whose code was remarkably clean.");
                System.out.println("With functions so neat,");
                System.out.println("And no obsolete,");
                System.out.println("The best coder you've ever seen!");
                System.out.println(ConsoleColors.RESET);
                break;

            case 1:
                System.out.println("Tech Fact of the Day:");
                String[] facts = {
                        "The first computer bug was an actual moth stuck in a relay!",
                        "Java was originally called Oak, named after an oak tree.",
                        "Python is named after Monty Python, not the snake!",
                        "There are over 700 programming languages in existence.",
                        "The first computer mouse was made of wood in 1964."
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
                System.out.println("Developer Joke:");
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
                System.out.println("Random Special Phrase:");
                String specialPhrase = "SUPER " + buildEnhancedPhrase().toUpperCase();
                totalPhrasesGenerated++;
                System.out.println(ConsoleColors.YELLOW_BOLD + specialPhrase + ConsoleColors.RESET);
                copyToClipboard(specialPhrase);
                break;
        }
    }

    /**
     * Adds phrase to favorites
     */
    public static void addToFavorites(String phrase) {
        favoritePhrases.add(phrase);
        System.out.println(ConsoleColors.RED + "❤️  Added to favorites! Total favorites: " + favoritePhrases.size() + ConsoleColors.RESET);
    }

    /**
     * Shows favorite phrases
     */
    public static void showFavorites() {
        if (favoritePhrases.isEmpty()) {
            System.out.println(ConsoleColors.YELLOW + "\nNo favorites yet! Generate some phrases first." + ConsoleColors.RESET);
        } else {
            System.out.println(ConsoleColors.RED_BOLD + "\n❤️  YOUR FAVORITE PHRASES (" + favoritePhrases.size() + ")" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + "════════════════════════════════════════" + ConsoleColors.RESET);
            for (int i = 0; i < favoritePhrases.size(); i++) {
                System.out.println(ConsoleColors.YELLOW + (i + 1) + ". " + favoritePhrases.get(i) + ConsoleColors.RESET);
            }
        }
    }

    /**
     * Copies last phrase to clipboard
     */
    public static void copyLastPhrase() {
        if (lastGeneratedPhrase.isEmpty()) {
            System.out.println(ConsoleColors.RED + "No phrase generated yet!" + ConsoleColors.RESET);
        } else {
            System.out.println("Last phrase was: " + ConsoleColors.YELLOW + lastGeneratedPhrase + ConsoleColors.RESET);
            copyToClipboard(lastGeneratedPhrase);
        }
    }

    /**
     * Copies text to clipboard
     */
    public static void copyToClipboard(String text) {
        try {
            java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(text);
            java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            System.out.println(ConsoleColors.GREEN + "📋 Copied to clipboard!" + ConsoleColors.RESET);
        } catch (Exception e) {
            System.out.println(ConsoleColors.RED + "⚠️  Could not copy to clipboard: " + e.getMessage() + ConsoleColors.RESET);
        }
    }

    /**
     * Helper method to count syllables
     */
    private static int countSyllables(String word) {
        word = word.toLowerCase();
        int syllables = 0;
        boolean previousWasVowel = false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            boolean isVowel = "aeiouy".indexOf(c) >= 0;

            if (isVowel && !previousWasVowel) {
                syllables++;
            }
            previousWasVowel = isVowel;
        }

        // Adjust for silent e
        if (word.endsWith("e") && syllables > 1) {
            syllables--;
        }

        return Math.max(1, syllables);
    }

    /**
     * Helper method to detect tech buzzwords
     */
    private static boolean isTechBuzzword(String word) {
        String[] buzzwords = {
                "ai", "blockchain", "cloud", "serverless", "microservices",
                "iot", "quantum", "machine", "learning", "edge",
                "distributed", "container", "framework", "api",
                "reactive", "functional", "agnostic", "native", "driven"
        };

        String lowerWord = word.toLowerCase();
        for (String buzz : buzzwords) {
            if (lowerWord.contains(buzz)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Builds a basic three-part phrase
     */
    private static String buildBasicPhrase() {
        return getRandomWord(WORD_LIST_ONE) + " " +
                getRandomWord(WORD_LIST_TWO) + " " +
                getRandomWord(WORD_LIST_THREE);
    }

    /**
     * Builds an enhanced phrase
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
     */
    private static String getRandomWord(String[] array) {
        return array[RANDOM.nextInt(array.length)];
    }
}