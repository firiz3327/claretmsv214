package net.swordie.ms.claretms;

import net.swordie.ms.client.character.items.Equip;

public final class ClaretMSConstants {

    public static final boolean AUTO_GOLDEN_HAMMER = true;
    private static final int[][] ENCHANT_SUCCESS_RATES = new int[][]{
            {950, 0},
            {900, 0},
            {850, 0},
            {850, 0},
            {800, 0},

            {750, 0},
            {750, 0},
            {700, 0},
            {650, 0},
            {650, 0},

            {600, 0},
            {550, 0},
            {500, 3},
            {450, 6},
            {450, 9},

            {400, 12},
            {400, 15},
            {350, 18},
            {350, 21},
            {300, 24},

            {300, 40},
            {300, 56},
            {30, 112},
            {20, 224},
            {10, 396},
    };

    private static final int[][] ENCHANT_SUCCESS_RATES_SUPERIOR = new int[][]{
            {800, 0},
            {750, 0},
            {700, 0},
            {650, 0},
            {600, 0},

            {550, 18},
            {500, 30},
            {450, 42},
            {450, 60},
            {400, 95},

            {350, 130},
            {350, 162},
            {30, 485},
            {20, 490},
            {10, 500},
    };

    public static final int BASE_CHAR_POT_UP_RATE = 5; // 5 %

    public static long getEnchantmentMesoCost(int reqLevel, int chuc, boolean superior) {
        // すべて半額
        if (superior) {
            return (long) Math.pow(reqLevel, 3.56) / 2;
        }
        if (chuc < 10) {
            return (long) (1000 + Math.pow(reqLevel, 3) * (chuc + 1) / 25) / 2;
        } else {
            final double v = Math.pow(reqLevel, 3) * Math.pow(chuc + 1, 2.7);
            if (chuc < 15) {
                return (long) (1000 + v / 400) / 2;
            } else {
                return (long) (1000 + v / 200) / 2;
            }
        }
    }

    public static int getEnchantmentSuccessRate(Equip equip) {
        if (equip.getDropStreak() >= 2) {
            return 1000;
        }
        int chuc = equip.getChuc();
        if (chuc < 0 || chuc > 24) {
            return 0;
        } else if (equip.isSuperiorEqp()) {
            return ENCHANT_SUCCESS_RATES_SUPERIOR[chuc][0];
        } else {
            return ENCHANT_SUCCESS_RATES[chuc][0];
        }
    }

    public static int getEnchantmentDestroyRate(Equip equip) {
        if (equip.getDropStreak() >= 2) {
            return 0;
        }
        int chuc = equip.getChuc();
        if (chuc < 0 || chuc > 24) {
            return 0;
        } else if (equip.isSuperiorEqp()) {
            return ENCHANT_SUCCESS_RATES_SUPERIOR[chuc][1];
        } else {
            return ENCHANT_SUCCESS_RATES[chuc][1];
        }
    }

}
