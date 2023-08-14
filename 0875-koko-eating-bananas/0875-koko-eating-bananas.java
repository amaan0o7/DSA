class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int l = 1;
         int r = Integer.MIN_VALUE;;
        int n = piles.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            r = Math.max(r, piles[i]);
        }
        while (l < r) {
            int m = (l + r) / 2, total = 0;
            for (int p : piles)
                total += (p + m - 1) / m;
            if (total > H)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}