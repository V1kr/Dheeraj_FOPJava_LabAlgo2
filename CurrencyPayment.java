import java.util.*;

public class CurrencyPayment {
  public static void printMinimumNotes(int[] denominations, int amount) {
    Arrays.sort(denominations);

    int[] notesDenominations = new int[denominations.length];
    int[] notesCounts = new int[denominations.length];
    int notesIndex = 0;

    for (int i = denominations.length - 1; i >= 0; i--) {
        int currentDenomination = denominations[i];
        int count = amount / currentDenomination;

        if (count > 0) {
            notesDenominations[notesIndex] = currentDenomination;
            notesCounts[notesIndex] = count;
            notesIndex++;
            amount %= currentDenomination;
        }
    }

    System.out.println("Your payment approach in order to give the minimum number of notes will be:");
    for (int i = 0; i < notesIndex; i++) {
        System.out.println(notesDenominations[i] + ":" + notesCounts[i]);
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of currency denominations: ");
        int size = scanner.nextInt();
        int[] denominations = new int[size];

        System.out.print("Enter the currency denominations value: ");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        printMinimumNotes(denominations, amount);

        scanner.close();
    }
}