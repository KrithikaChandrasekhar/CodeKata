public class CoinChangeWays {
    public static int countWaysToMakeChange(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("Input cannot be null or empty");
        int[] coins = {1, 5, 10, 25};
        int [] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int currentAmount = coin; currentAmount <= amount; currentAmount++)
                dp[currentAmount] += dp[currentAmount - coin];
        }
        return dp[amount];
    }
}
