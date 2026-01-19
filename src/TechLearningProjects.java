/*
 * TechLearningProjects.java
 * Combined Java Learning Projects with all features
 * Contains both original and enhanced versions
 */

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class TechLearningProjects {

    // ==================== ORIGINAL BOTTLESONG (FIXED) ====================

    public static class BottleSong {
        public static void main(String[] args) {
            int bottlesNum = 10;
            String word = "bottles";

            while (bottlesNum > 0) {
                if (bottlesNum == 1) {
                    word = "bottle";
                }
                System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
                System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
                System.out.println("And if the green bottle should accidentally fall, ");
                bottlesNum = bottlesNum - 1;

                if (bottlesNum > 0) {
                    System.out.println("There'll be " + bottlesNum + " green " +
                            (bottlesNum == 1 ? "bottle" : "bottles") + ", hanging on the wall");
                } else {
                    System.out.println("There'll be no green bottles, hanging on the wall");
                }
                System.out.println(); // Add blank line between verses
            }
        }
    }

    // ==================== ORIGINAL PHRASEOMATIC (FIXED) ====================

    public static class PhraseOMatic {
        public static void main(String[] args) {
            String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven",
                    "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

            String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven",
                    "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
                    "microservices", "distributed ledger"};

            String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository",
                    "pipeline", "service", "mesh", "architecture", "perspective", "design", "orientation"};

            // find out how many words are in each list
            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;

            // generate three random numbers
            Random randomGenerator = new Random();
            int rand1 = randomGenerator.nextInt(oneLength);
            int rand2 = randomGenerator.nextInt(twoLength);
            int rand3 = randomGenerator.nextInt(threeLength);

            // now build a phrase
            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

            // print out the phrase
            System.out.println("What we need is a " + phrase);
        }
    }

    // ==================== CONSOLE COLORS ====================

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
        public static final String PURPLE_BOLD = "\033[1;35m";
        public static final String CYAN_BOLD = "\033[1;36m";
    }

    // ==================== ENHANCED PHRASEOMATIC WITH NEW FEATURES ====================

    public static class EnhancedPhraseOMatic {

        /**
         * Shows code formatting examples and tips
         */
        public static void codeFormatter() {
            System.out.println(ConsoleColors.BLUE_BOLD + "\n✨ CODE FORMATTER" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "══════════════════" + ConsoleColors.RESET);
            System.out.println("Learn Java code formatting best practices!");

            String[][] formats = {
                    {
                            "📏 Indentation",
                            "// Good (4 spaces or 1 tab):\n" +
                                    "if (condition) {\n" +
                                    "    System.out.println(\"Hello\");\n" +
                                    "    if (anotherCondition) {\n" +
                                    "        System.out.println(\"Nested\");\n" +
                                    "    }\n" +
                                    "}\n" +
                                    "\n" +
                                    "// Bad (inconsistent):\n" +
                                    "if (condition) {\n" +
                                    "System.out.println(\"Hello\");\n" +
                                    "  if (anotherCondition) {\n" +
                                    "        System.out.println(\"Nested\");\n" +
                                    "  }\n" +
                                    "}"
                    },
                    {
                            "🏷️  Naming Conventions",
                            "// Classes: PascalCase\n" +
                                    "public class MyClass {\n" +
                                    "    \n" +
                                    "    // Variables: camelCase\n" +
                                    "    private int userCount;\n" +
                                    "    private String firstName;\n" +
                                    "    \n" +
                                    "    // Constants: UPPER_CASE\n" +
                                    "    public static final int MAX_USERS = 100;\n" +
                                    "    \n" +
                                    "    // Methods: camelCase\n" +
                                    "    public void calculateTotal() {\n" +
                                    "        // method body\n" +
                                    "    }\n" +
                                    "}"
                    },
                    {
                            "📝 Comments",
                            "// Single line comment\n" +
                                    "\n" +
                                    "/*\n" +
                                    " * Multi-line comment\n" +
                                    " * Use for longer explanations\n" +
                                    " */\n" +
                                    "\n" +
                                    "/**\n" +
                                    " * Javadoc comment for documentation\n" +
                                    " * @param username The user's name\n" +
                                    " * @return Welcome message\n" +
                                    " */\n" +
                                    "public String welcomeUser(String username) {\n" +
                                    "    // Good: Explain WHY, not WHAT\n" +
                                    "    return \"Hello, \" + username;\n" +
                                    "}"
                    },
                    {
                            "📦 Spacing",
                            "// Good spacing:\n" +
                                    "if (x > 5 && y < 10) {\n" +
                                    "    result = calculate(x, y);\n" +
                                    "}\n" +
                                    "\n" +
                                    "// Around operators:\n" +
                                    "int sum = a + b;\n" +
                                    "boolean isEqual = (x == y);\n" +
                                    "\n" +
                                    "// After commas:\n" +
                                    "String[] fruits = {\"apple\", \"banana\", \"orange\"};\n" +
                                    "\n" +
                                    "// Around braces:\n" +
                                    "public void myMethod() {\n" +
                                    "    // code\n" +
                                    "}"
                    },
                    {
                            "🧹 Clean Code",
                            "// Keep methods short (under 20 lines):\n" +
                                    "public void processUser() {\n" +
                                    "    validateInput();\n" +
                                    "    calculateResult();\n" +
                                    "    displayOutput();\n" +
                                    "}\n" +
                                    "\n" +
                                    "// One purpose per method:\n" +
                                    "private void validateInput() {\n" +
                                    "    // only validation logic\n" +
                                    "}\n" +
                                    "\n" +
                                    "private void calculateResult() {\n" +
                                    "    // only calculation logic\n" +
                                    "}\n" +
                                    "\n" +
                                    "private void displayOutput() {\n" +
                                    "    // only display logic\n" +
                                    "}"
                    }
            };

            Random rand = new Random();
            int index = rand.nextInt(formats.length);

            System.out.println("📚 Topic: " + formats[index][0]);
            System.out.println(ConsoleColors.YELLOW + "══════════════════════════════════" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN + formats[index][1] + ConsoleColors.RESET);

            // Quick formatting challenge
            System.out.println(ConsoleColors.PURPLE + "\n🎯 FORMATTING CHALLENGE:" + ConsoleColors.RESET);
            String[] challenges = {
                    "Find code in this project that needs better indentation",
                    "Look for a variable that could have a better name",
                    "Find a method that could use a Javadoc comment",
                    "Look for inconsistent spacing around operators",
                    "Find a method that's too long and could be split"
            };
            System.out.println(ConsoleColors.CYAN + challenges[rand.nextInt(challenges.length)] + ConsoleColors.RESET);

            // Formatting tip
            String[] tips = {
                    "💡 Tip: Consistent formatting makes code easier to read!",
                    "💡 Tip: Use IDE auto-format (Ctrl+Alt+L in IntelliJ)!",
                    "💡 Tip: Good names reduce need for comments!",
                    "💡 Tip: Short methods are easier to test and debug!",
                    "💡 Tip: Format as you code, not at the end!"
            };
            System.out.println("\n" + tips[rand.nextInt(tips.length)]);

            // Copy option
            System.out.print(ConsoleColors.BLUE + "\n📋 Copy formatting example? (yes/no): " + ConsoleColors.RESET);
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                copyToClipboard(formats[index][1]);
                System.out.println(ConsoleColors.GREEN + "✅ Copied to clipboard!" + ConsoleColors.RESET);
            }
        }

        /**
         * Debugging challenge - find the bug in the code!
         */
        public static void debugChallenge() {
            System.out.println(ConsoleColors.BLUE_BOLD + "\n🔍 DEBUG CHALLENGE" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "═══════════════════" + ConsoleColors.RESET);
            System.out.println("Find the bug in this Java code!");

            String[][] challenges = {
                    {
                            "Bug: Array Index Out of Bounds",
                            "String[] fruits = {\"apple\", \"banana\"};\n" +
                                    "for (int i = 0; i <= fruits.length; i++) {\n" +
                                    "    System.out.println(fruits[i]);\n" +
                                    "}",
                            "Change 'i <= fruits.length' to 'i < fruits.length'\n" +
                                    "Arrays go from 0 to length-1"
                    },
                    {
                            "Bug: Integer Division",
                            "int a = 5;\n" +
                                    "int b = 2;\n" +
                                    "double result = a / b;\n" +
                                    "System.out.println(\"Result: \" + result); // Prints 2.0 not 2.5",
                            "Change to: double result = (double) a / b;\n" +
                                    "Or: double result = a / 2.0;"
                    },
                    {
                            "Bug: String Comparison",
                            "String s1 = new String(\"hello\");\n" +
                                    "String s2 = new String(\"hello\");\n" +
                                    "if (s1 == s2) {\n" +
                                    "    System.out.println(\"Equal\");\n" +
                                    "} else {\n" +
                                    "    System.out.println(\"Not equal\");\n" +
                                    "}",
                            "Use .equals() for String content comparison:\n" +
                                    "if (s1.equals(s2))"
                    },
                    {
                            "Bug: Infinite Loop",
                            "int i = 0;\n" +
                                    "while (i < 10) {\n" +
                                    "    System.out.println(\"Number: \" + i);\n" +
                                    "    // Missing i++\n" +
                                    "}",
                            "Add i++ inside the loop:\n" +
                                    "while (i < 10) {\n" +
                                    "    System.out.println(\"Number: \" + i);\n" +
                                    "    i++;\n" +
                                    "}"
                    },
                    {
                            "Bug: Scanner Issue",
                            "Scanner scanner = new Scanner(System.in);\n" +
                                    "System.out.print(\"Enter age: \");\n" +
                                    "int age = scanner.nextInt();\n" +
                                    "System.out.print(\"Enter name: \");\n" +
                                    "String name = scanner.nextLine(); // Skips!\n",
                            "Add scanner.nextLine() after nextInt():\n" +
                                    "int age = scanner.nextInt();\n" +
                                    "scanner.nextLine(); // Consume newline\n" +
                                    "String name = scanner.nextLine();"
                    }
            };

            Random rand = new Random();
            int index = rand.nextInt(challenges.length);

            System.out.println("⚠️  Buggy Code:");
            System.out.println(ConsoleColors.YELLOW + "═══════════════════" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.RED + challenges[index][1] + ConsoleColors.RESET);

            System.out.print("\n💭 Think about the bug... Press Enter when ready for the solution...");
            new Scanner(System.in).nextLine();

            System.out.println("\n✅ Solution:");
            System.out.println(ConsoleColors.GREEN + "═══════════════════" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN + challenges[index][2] + ConsoleColors.RESET);

            // Debugging tips
            String[] tips = {
                    "💡 Tip: Always test edge cases!",
                    "💡 Tip: Use print statements for debugging!",
                    "💡 Tip: Step through code line by line!",
                    "💡 Tip: Check array indices carefully!",
                    "💡 Tip: Watch for off-by-one errors!"
            };
            System.out.println("\n" + ConsoleColors.PURPLE + tips[rand.nextInt(tips.length)] + ConsoleColors.RESET);

            // Mini quiz
            System.out.print("\n🎯 Quick check: Did you spot the bug before the solution? (yes/no): ");
            String answer = new Scanner(System.in).nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println(ConsoleColors.GREEN_BOLD + "🎉 Great debugging skills!" + ConsoleColors.RESET);
            } else {
                System.out.println(ConsoleColors.CYAN + "📚 Keep practicing! Debugging takes time to master." + ConsoleColors.RESET);
            }
        }


        /**
         * Generates useful Java code snippets
         */
        public static void generateCodeSnippet() {
            System.out.println(ConsoleColors.BLUE_BOLD + "\n💻 JAVA CODE SNIPPET GENERATOR" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.CYAN + "═══════════════════════════════" + ConsoleColors.RESET);

            String[][] snippets = {
                    {
                            "📝 Array Declaration & Initialization",
                            "// Declare and initialize an array\n" +
                                    "String[] fruits = {\"apple\", \"banana\", \"orange\"};\n" +
                                    "int[] numbers = new int[5]; // Array of 5 integers\n" +
                                    "// Access elements (arrays start at 0)\n" +
                                    "System.out.println(fruits[0]); // Prints: apple"
                    },
                    {
                            "🔄 For Loop Example",
                            "// Loop through an array\n" +
                                    "for (int i = 0; i < fruits.length; i++) {\n" +
                                    "    System.out.println(\"Fruit \" + i + \": \" + fruits[i]);\n" +
                                    "}\n" +
                                    "// Enhanced for loop (for-each)\n" +
                                    "for (String fruit : fruits) {\n" +
                                    "    System.out.println(fruit);\n" +
                                    "}"
                    },
                    {
                            "🎲 Random Number Generation",
                            "import java.util.Random;\n" +
                                    "\n" +
                                    "Random rand = new Random();\n" +
                                    "int randomNum = rand.nextInt(10); // 0-9\n" +
                                    "int diceRoll = rand.nextInt(6) + 1; // 1-6\n" +
                                    "boolean coinFlip = rand.nextBoolean(); // true/false"
                    },
                    {
                            "🔤 String Manipulation",
                            "String name = \"Java\";\n" +
                                    "System.out.println(name.length()); // 4\n" +
                                    "System.out.println(name.toUpperCase()); // JAVA\n" +
                                    "System.out.println(name.toLowerCase()); // java\n" +
                                    "System.out.println(name.charAt(0)); // J\n" +
                                    "System.out.println(name.substring(1, 3)); // av"
                    },
                    {
                            "📊 Scanner Input Example",
                            "import java.util.Scanner;\n" +
                                    "\n" +
                                    "Scanner scanner = new Scanner(System.in);\n" +
                                    "System.out.print(\"Enter your name: \");\n" +
                                    "String userName = scanner.nextLine();\n" +
                                    "System.out.print(\"Enter your age: \");\n" +
                                    "int age = scanner.nextInt();\n" +
                                    "scanner.close(); // Don't forget to close!"
                    },
                    {
                            "✅ If-Else Statement",
                            "int score = 85;\n" +
                                    "\n" +
                                    "if (score >= 90) {\n" +
                                    "    System.out.println(\"Grade: A\");\n" +
                                    "} else if (score >= 80) {\n" +
                                    "    System.out.println(\"Grade: B\");\n" +
                                    "} else if (score >= 70) {\n" +
                                    "    System.out.println(\"Grade: C\");\n" +
                                    "} else {\n" +
                                    "    System.out.println(\"Grade: F\");\n" +
                                    "}"
                    }
            };

            Random rand = new Random();
            int index = rand.nextInt(snippets.length);

            System.out.println(snippets[index][0]);
            System.out.println(ConsoleColors.YELLOW + "═══════════════════════════════" + ConsoleColors.RESET);
            System.out.println(ConsoleColors.GREEN + snippets[index][1] + ConsoleColors.RESET);

            // Copy to clipboard option
            System.out.print(ConsoleColors.CYAN + "\n📋 Copy this snippet to clipboard? (yes/no): " + ConsoleColors.RESET);
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                copyToClipboard(snippets[index][1]);
            }

            // Learning tip
            String[] tips = {
                    "💡 Try modifying this code to practice!",
                    "💡 Type this code in your IDE and run it!",
                    "💡 Experiment with different values!",
                    "💡 Add your own features to the code!"
            };
            System.out.println(ConsoleColors.PURPLE + "\n" + tips[rand.nextInt(tips.length)] + ConsoleColors.RESET);
        }
        // Statistics
        private static int totalPhrasesGenerated = 0;
        private static int phrasesSavedToFile = 0;
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

            // secret easter egg print function
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
                System.out.println("12. Copy last phrase to clipboard");
                System.out.println("13. Exit to main program");
                System.out.println("14. Debug challenge");
                System.out.println("15. Generate Java code snippet");
                System.out.println("16. Copy last phrase to clipboard");
                System.out.println("17. Exit to main program");

                System.out.print(ConsoleColors.BLUE + "\nEnter your choice (1-13): " + ConsoleColors.RESET);

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
                        copyLastPhrase();
                        break;
                    case 13:
                        generateCodeSnippet();
                        break;
                    case 14:
                        debugChallenge();
                        break;
                    case 15:
                        generateCodeSnippet();
                        break;
                    case 16:
                        copyLastPhrase();
                        break;
                    case 17:
                        System.out.println(ConsoleColors.GREEN + "Returning to main program..." + ConsoleColors.RESET);
                        return;
                    default:
                        System.out.println(ConsoleColors.RED + "Invalid choice! Please try again." + ConsoleColors.RESET);
                }

                System.out.print(ConsoleColors.CYAN + "\nPress Enter to continue..." + ConsoleColors.RESET);
                scanner.nextLine();
            }
        }


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

    // ==================== MAIN PROGRAM MENU ====================

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(ConsoleColors.CYAN_BOLD + "══════════════════════════════════════════════════════════════" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN_BOLD + "              JAVA LEARNING PROJECTS - MAIN MENU              " + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN_BOLD + "══════════════════════════════════════════════════════════════" + ConsoleColors.RESET);

        while (true) {
            System.out.println("\n" + ConsoleColors.YELLOW + "Choose a program to run:" + ConsoleColors.RESET);
            System.out.println("1. 🎵 Original BottleSong (Simple)");
            System.out.println("2. 🎵 Enhanced BottleSong (From previous version)");
            System.out.println("3. 🚀 Original PhraseOMatic (Simple)");
            System.out.println("4. 🚀 Enhanced PhraseOMatic (With new features!)");
            System.out.println("5. ℹ️  About these programs");
            System.out.println("6. 🚪 Exit");

            System.out.print(ConsoleColors.BLUE + "\nEnter your choice (1-6): " + ConsoleColors.RESET);

            if (!scanner.hasNextInt()) {
                System.out.println(ConsoleColors.RED + "Please enter a number!" + ConsoleColors.RESET);
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println(ConsoleColors.CYAN + "\nRunning Original BottleSong..." + ConsoleColors.RESET);
                    BottleSong.main(args);
                    break;
                case 2:
                    System.out.println(ConsoleColors.CYAN + "\nNote: Enhanced BottleSong is in the full version." + ConsoleColors.RESET);
                    System.out.println("Run 'TechLearningProjectsFull.java' for all enhanced features.");
                    break;
                case 3:
                    System.out.println(ConsoleColors.CYAN + "\nRunning Original PhraseOMatic..." + ConsoleColors.RESET);
                    PhraseOMatic.main(args);
                    break;
                case 4:
                    System.out.println(ConsoleColors.CYAN + "\nRunning Enhanced PhraseOMatic..." + ConsoleColors.RESET);
                    EnhancedPhraseOMatic.main(args);
                    break;
                case 5:
                    showAboutInfo();
                    break;
                case 6:
                    System.out.println(ConsoleColors.GREEN_BOLD + "\nThank you for learning Java! Goodbye! 👋" + ConsoleColors.RESET);
                    scanner.close();
                    return;
                default:
                    System.out.println(ConsoleColors.RED + "Invalid choice! Please try again." + ConsoleColors.RESET);
            }

            System.out.print(ConsoleColors.CYAN + "\nPress Enter to continue..." + ConsoleColors.RESET);
            scanner.nextLine();
        }
    }

    /**
     * Shows about information
     */
    public static void showAboutInfo() {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n📚 ABOUT JAVA LEARNING PROJECTS" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "═══════════════════════════════" + ConsoleColors.RESET);
        System.out.println("These programs demonstrate Java programming concepts:");
        System.out.println();
        System.out.println(ConsoleColors.YELLOW + "🎵 BottleSong teaches:" + ConsoleColors.RESET);
        System.out.println("   • While loops and conditionals");
        System.out.println("   • String manipulation");
        System.out.println("   • Variable updating");
        System.out.println();
        System.out.println(ConsoleColors.YELLOW + "🚀 PhraseOMatic teaches:" + ConsoleColors.RESET);
        System.out.println("   • Arrays and random number generation");
        System.out.println("   • String concatenation");
        System.out.println("   • Array length properties");
        System.out.println();
        System.out.println(ConsoleColors.YELLOW + "✨ Enhanced Features:" + ConsoleColors.RESET);
        System.out.println("   • Word analysis and statistics");
        System.out.println("   • Syllable counting algorithm");
        System.out.println("   • Tech buzzword detection");
        System.out.println("   • Clipboard integration");
        System.out.println("   • Favorites system");
        System.out.println("   • Colorful console output");
        System.out.println("   • Daily tech tips");
        System.out.println("   • Easter egg secrets!");
        System.out.println("   • Java syntax quiz");
        System.out.println("   • Code quality checker");
        System.out.println();
        System.out.println(ConsoleColors.GREEN + "Created to help learn Java programming concepts!" + ConsoleColors.RESET);
    }

    quickBug();
}