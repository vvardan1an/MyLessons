package Bchecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("I (love) [Java}");
        braceChecker.check();
    }
}
