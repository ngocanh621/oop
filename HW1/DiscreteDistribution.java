import java.util.Random;

public class DiscreteDistribution {
    public static void main(String[] args) {

        int[] weights = new int[args.length];
        int totalWeight = 0;

        for (int i = 0; i < args.length; i++) {
            weights[i] = Integer.parseInt(args[i]);
            totalWeight += weights[i];
        }

        Random rand = new Random();
        int randValue = rand.nextInt(totalWeight);

        int cumulativeWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            cumulativeWeight += weights[i];
            if (randValue < cumulativeWeight) {
                System.out.println(i);
                return;
            }
        }
    }
}
