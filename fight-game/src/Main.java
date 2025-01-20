//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 5, 15, 150, 120, 50);
        Fighter f2 = new Fighter("Mike Tyson", 5, 15, 150, 95, 50);
        Match match = new Match(f1, f2, 90, 125);
        match.run();
    }
}