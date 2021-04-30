package bridge_pattern;

public interface Weapon {
  void wield();
  void swing();
  void unwield();
  Enchantment getEnchantment();
}