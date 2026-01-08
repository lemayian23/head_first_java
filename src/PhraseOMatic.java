/* public class BottleSong {
    public static void main(String [] args) {
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
                System.out.println("There'll be " + bottlesNum + "green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}

 */


public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};

        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service", "mesh", "architecture", "perspective", "design", "orientation"};


        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);
// now build a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
// print out the phrase
        System.out.println("What we need is a " + phrase);

    }
    // Add this method to the EnhancedPhraseOMatic class (anywhere after the other methods):

    /**
     * Analyzes a phrase and shows word count statistics
     */
    public static void analyzePhrase(String phrase) {
        System.out.println(ConsoleColors.BLUE_BOLD + "\n📊 PHRASE ANALYSIS" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.CYAN + "=================" + ConsoleColors.RESET);

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
        // In the switch statement, update/add options:
        System.out.println("8. Analyze a phrase");
        System.out.println("9. Surprise Me!");
        System.out.println("10. Show statistics");
        System.out.println("11. Show favorite phrases");
        System.out.println("12. Exit to main menu");

// Add this case to the switch:
        case 8:
        System.out.print("Enter a phrase to analyze (or press Enter for random): ");
        String phraseToAnalyze = scanner.nextLine();
        if (phraseToAnalyze.trim().isEmpty()) {
            phraseToAnalyze = buildEnhancedPhrase();
            System.out.println("Using random phrase: " + phraseToAnalyze);
        }
        analyzePhrase(phraseToAnalyze);
        break;

        // Calculate readability score (simple Flesch-like)
        double readability = 206.835 - (1.015 * wordCount) - (84.6 * (syllableCount / (double)wordCount));

        // Display results
        System.out.println("📝 Original phrase: " + ConsoleColors.YELLOW + phrase + ConsoleColors.RESET);
        System.out.println("🔢 Word count: " + ConsoleColors.GREEN + wordCount + ConsoleColors.RESET);
        System.out.println("🔤 Character count: " + ConsoleColors.GREEN + charCount + ConsoleColors.RESET);
        System.out.println("🏆 Longest word: " + ConsoleColors.GREEN + longestWord + " (" + longestWord.length() + " letters)" + ConsoleColors.RESET);
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

        // Funny comment
        if (phrase.toLowerCase().contains("blockchain") && phrase.toLowerCase().contains("ai")) {
            System.out.println("💰 Bonus: This phrase could get you VC funding!");
        }
        if (phrase.toLowerCase().contains("serverless") && phrase.toLowerCase().contains("cloud")) {
            System.out.println("☁️  Double cloud points!");
        }
    }

    /**
     * Helper method to count syllables (rough estimate)
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

        return Math.max(1, syllables); // Every word has at least 1 syllable
    }

    /**
     * Helper method to detect tech buzzwords
     */
// Add this simple method to EnhancedPhraseOMatic:
    public static void quickWordCount() {
        String phrase = buildEnhancedPhrase();
        String[] words = phrase.split(" ");

        System.out.println(ConsoleColors.GREEN_BOLD + "\n🔤 QUICK WORD COUNTER" + ConsoleColors.RESET);
        System.out.println("Phrase: " + ConsoleColors.YELLOW + phrase + ConsoleColors.RESET);
        System.out.println("Word count: " + words.length);

        // Show word breakdown
        System.out.println("Word breakdown:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("  " + (i+1) + ". \"" + words[i] + "\" (" + words[i].length() + " letters)");
        }

        // Fun fact
        if (words.length == 3) {
            System.out.println("✨ Perfect tech phrase structure!");
        }
    }

    // Add to menu as option 9
    private static boolean isTechBuzzword(String word) {
        String[] buzzwords = {
                "ai", "blockchain", "cloud", "serverless", "microservices",
                "iot", "quantum", "machine", "learning", "edge",
                "distributed", "container", "framework", "api", "api",
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
}