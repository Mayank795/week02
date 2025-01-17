class PalindromeChecker {
    // Attribute to hold the text
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Check if the cleaned text is equal to its reverse
        return cleanedText.equals(new StringBuilder(cleanedText).reverse().toString());
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("'" + text + "' is a palindrome.");
        } else {
            System.out.println("'" + text + "' is not a palindrome.");
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Example 1: A palindrome string
        PalindromeChecker checker1 = new PalindromeChecker("A man, a plan, a canal, Panama");
        checker1.displayResult();

        // Example 2: A non-palindrome string
        PalindromeChecker checker2 = new PalindromeChecker("Hello, World!");
        checker2.displayResult();
    }
}
