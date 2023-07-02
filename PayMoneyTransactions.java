import java.util.Scanner;

public class PayMoneyTransactions {
  public static int findTransactionToAchieveTarget(int[] transactions, int target) {
    int cumulativeSum = 0;
    for (int i = 0; i < transactions.length; i++) {
      cumulativeSum += transactions[i];
      if (cumulativeSum >= target)
        return i + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the size of the transaction array: ");
    int size = scanner.nextInt();
    int[] transactions = new int[size];
    System.out.print("Enter the values of the array: ");
    for (int i = 0; i < size; i++)
      transactions[i] = scanner.nextInt();

    System.out.print("Enter the total number of targets that need to be achieved: ");
    int numTargets = scanner.nextInt();

    for (int i = 0; i < numTargets; i++) {
      System.out.print("Enter the value of the target: ");
      int target = scanner.nextInt();
      int result = findTransactionToAchieveTarget(transactions, target);
      if (result != -1)
        System.out.println("Target achieved after " + result + " transaction(s)");
      else
        System.out.println("Given target is not achieved");
    }
  }
}
