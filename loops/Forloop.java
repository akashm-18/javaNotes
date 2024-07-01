package loops;

public class Forloop {
    public static void main(String[] args) {
        // Initially checks the i value then executes the block definition. After this
        // increment gets place.
        int i = 1;
        for (; i <= 7;) { // We can do like this.But two semicolon is compulasary.
            System.out.println("Day : " + i);
            i++;
            for (int j = 1; j <= 24; j++) {
                System.out.println("Hour : " + j);
            }
        }
    }
}
