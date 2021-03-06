package net.minecraft.server;

public class EnchantmentInfiniteArrows extends Enchantment {

    public EnchantmentInfiniteArrows(Enchantment.Rarity enchantment_rarity, EnumItemSlot... aenumitemslot) {
        super(enchantment_rarity, EnchantmentSlotType.BOW, aenumitemslot);
    }

    public int a(int i) {
        return 20;
    }

    public int b(int i) {
        return 50;
    }

    public int getMaxLevel() {
        return 1;
    }

    public boolean a(Enchantment enchantment) {
        return enchantment instanceof EnchantmentMending ? false : super.a(enchantment);
    }
}
