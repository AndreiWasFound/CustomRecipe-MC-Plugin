package me.AndreiWasFound.CustomRecipe;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.addRecipe(getEmeraldPickaxeRecipe());
		Bukkit.addRecipe(getEmeraldBlockPickaxeRecipe());
		Bukkit.addRecipe(getNetherStarRecipe());
		Bukkit.addRecipe(getLapisLazuliPickaxeRecipe());
		Bukkit.addRecipe(getLapisLazuliBlockPickaxeRecipe());
		Bukkit.addRecipe(getRedstonePickaxeRecipe());
		Bukkit.addRecipe(getDiamondShieldOakPlanksRecipe());
		Bukkit.addRecipe(getDiamondShieldSprucePlanksRecipe());
		Bukkit.addRecipe(getDiamondShieldJunglePlanksRecipe());
		Bukkit.addRecipe(getDiamondShieldDarkOakPlanksRecipe());
		Bukkit.addRecipe(getDiamondShieldBirchPlanksRecipe());
		Bukkit.addRecipe(getDiamondShieldAcaciaPlanksRecipe());
		Bukkit.addRecipe(getObsidianPickaxeRecipe());
	}

	@Override
	public void onDisable() {

	}
		
	public ShapedRecipe getEmeraldPickaxeRecipe() {
		
		ItemStack item2 = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta1 = item2.getItemMeta();
		
		meta1.setDisplayName(ChatColor.GREEN + "Emerald Pickaxe");
		meta1.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
		List<String> lore1 = new ArrayList<String>();
		lore1.add(ChatColor.translateAlternateColorCodes('&', "&7Fortune 10"));
		meta1.setLore(lore1);
		meta1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item2.setItemMeta(meta1);
		
		NamespacedKey key2 = new NamespacedKey(this, "emerald_pickaxe");
		
		ShapedRecipe recipe2 = new ShapedRecipe(key2, item2);
		
		recipe2.shape("EEE", " S ", " S ");
		
		recipe2.setIngredient('S', Material.STICK);
		recipe2.setIngredient('E', Material.EMERALD);
		
		
		return recipe2;

	}
	
	public ShapedRecipe getEmeraldBlockPickaxeRecipe() {
		
		ItemStack item3 = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta2 = item3.getItemMeta();
		
		meta2.setDisplayName(ChatColor.DARK_GREEN + "Emerald Block Pickaxe");
		meta2.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 50, true);
		List<String> lore2 = new ArrayList<String>();
		lore2.add(ChatColor.translateAlternateColorCodes('&', "&7Fortune 50"));
		meta2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta2.setLore(lore2);
		
		item3.setItemMeta(meta2);
		
		NamespacedKey key3 = new NamespacedKey(this, "emerald_block_pickaxe");
		
		ShapedRecipe recipe3 = new ShapedRecipe(key3, item3);
		
		recipe3.shape("EEE", " S ", " S ");
		
		recipe3.setIngredient('S', Material.STICK);
		recipe3.setIngredient('E', Material.EMERALD_BLOCK);
		
		
		return recipe3;

	}
	
	public ShapedRecipe getNetherStarRecipe() {
		
		ItemStack item4 = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta3 = item4.getItemMeta();
		
		meta3.setDisplayName(ChatColor.WHITE + "Nether Star Pickaxe");
		meta3.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 100, true);
		meta3.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta3.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		meta3.setUnbreakable(true);
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Fortune 100"));
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Efficiency 10"));
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Sharpness 10"));
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreakable"));
		meta3.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta3.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta3.setLore(lore3);
		
		item4.setItemMeta(meta3);
		
		NamespacedKey key4 = new NamespacedKey(this, "nether_star_pickaxe");
		
		ShapedRecipe recipe4 = new ShapedRecipe(key4, item4);
		
		recipe4.shape("NNN", " B ", " B ");
		
		recipe4.setIngredient('B', Material.BLAZE_ROD);
		recipe4.setIngredient('N', Material.NETHER_STAR);
		
		
		return recipe4;

	}
	
	
	public ShapedRecipe getLapisLazuliPickaxeRecipe() {
		
		ItemStack item5 = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta meta3 = item5.getItemMeta();
		
		meta3.setDisplayName(ChatColor.DARK_BLUE + "Lapis Lazuli Pickaxe");
		meta3.addEnchant(Enchantment.DIG_SPEED, 5, true);
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Efficiency 5"));
		meta3.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta3.setLore(lore3);
		
		item5.setItemMeta(meta3);
		
		NamespacedKey key4 = new NamespacedKey(this, "lapis_lazuli_pickaxe");
		
		ShapedRecipe recipe5 = new ShapedRecipe(key4, item5);
		
		recipe5.shape("LLL", " S ", " S ");
		
		recipe5.setIngredient('S', Material.STICK);
		recipe5.setIngredient('L', Material.LAPIS_LAZULI);
		
		
		return recipe5;

	}
	
	public ShapedRecipe getLapisLazuliBlockPickaxeRecipe() {
		
		ItemStack item5 = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta meta3 = item5.getItemMeta();
		
		meta3.setDisplayName(ChatColor.DARK_BLUE + "Lapis Lazuli Block Pickaxe");
		meta3.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta3.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
		meta3.addEnchant(Enchantment.DURABILITY, 3, true);
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Efficiency 5"));
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Fortune 3"));
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreaking 3"));
		meta3.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta3.setLore(lore3);
		
		item5.setItemMeta(meta3);
		
		NamespacedKey key4 = new NamespacedKey(this, "lapis_lazuli_block_pickaxe");
		
		ShapedRecipe recipe5 = new ShapedRecipe(key4, item5);
		
		recipe5.shape("LLL", " S ", " S ");
		
		recipe5.setIngredient('S', Material.STICK);
		recipe5.setIngredient('L', Material.LAPIS_BLOCK);
		
		
		return recipe5;

	}
	public ShapedRecipe getRedstonePickaxeRecipe() {
		
		ItemStack item5 = new ItemStack(Material.STONE_PICKAXE);
		ItemMeta meta3 = item5.getItemMeta();
		
		meta3.setDisplayName(ChatColor.RED + "Redstone Pickaxe");
		meta3.addEnchant(Enchantment.DIG_SPEED, 15, true);
		meta3.addEnchant(Enchantment.DURABILITY, 1, true);
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Efficiency 15"));
		meta3.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta3.setLore(lore3);
		
		item5.setItemMeta(meta3);
		
		NamespacedKey key4 = new NamespacedKey(this, "redstone_pickaxe");
		
		ShapedRecipe recipe5 = new ShapedRecipe(key4, item5);
		
		recipe5.shape("RRR", " S ", " S ");
		
		recipe5.setIngredient('S', Material.STICK);
		recipe5.setIngredient('R', Material.REDSTONE);
		
		
		return recipe5;

	}
	
	public ShapedRecipe getDiamondShieldOakPlanksRecipe() {
		
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Diamond Shield");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreaking 15"));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		NamespacedKey key = new NamespacedKey(this, "diamond_shield_oak_planks");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PDP", "PPP", " P ");
		
		recipe.setIngredient('P', Material.OAK_PLANKS);
		recipe.setIngredient('D', Material.DIAMOND);
		
		
		return recipe;

	}
	
	public ShapedRecipe getDiamondShieldSprucePlanksRecipe() {
		
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Diamond Shield");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreaking 15"));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		NamespacedKey key = new NamespacedKey(this, "diamond_shield_spruce_planks");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PDP", "PPP", " P ");
		
		recipe.setIngredient('P', Material.SPRUCE_PLANKS);
		recipe.setIngredient('D', Material.DIAMOND);
		
		
		return recipe;

	}
	
	public ShapedRecipe getDiamondShieldJunglePlanksRecipe() {
		
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Diamond Shield");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreaking 15"));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		NamespacedKey key = new NamespacedKey(this, "diamond_shield_jungle_planks");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PDP", "PPP", " P ");
		
		recipe.setIngredient('P', Material.JUNGLE_PLANKS);
		recipe.setIngredient('D', Material.DIAMOND);
		
		
		return recipe;

	}
	
	public ShapedRecipe getDiamondShieldDarkOakPlanksRecipe() {
		
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Diamond Shield");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreaking 15"));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		NamespacedKey key = new NamespacedKey(this, "diamond_shield_dark_oak_planks");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PDP", "PPP", " P ");
		
		recipe.setIngredient('P', Material.DARK_OAK_PLANKS);
		recipe.setIngredient('D', Material.DIAMOND);
		
		
		return recipe;

	}
	
	public ShapedRecipe getDiamondShieldBirchPlanksRecipe() {
		
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Diamond Shield");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreaking 15"));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		NamespacedKey key = new NamespacedKey(this, "diamond_shield_birch_planks");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PDP", "PPP", " P ");
		
		recipe.setIngredient('P', Material.BIRCH_PLANKS);
		recipe.setIngredient('D', Material.DIAMOND);
		
		
		return recipe;

	}
	
	public ShapedRecipe getDiamondShieldAcaciaPlanksRecipe() {
		
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Diamond Shield");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Unbreaking 15"));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		NamespacedKey key = new NamespacedKey(this, "diamond_shield_acacia_planks");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PDP", "PPP", " P ");
		
		recipe.setIngredient('P', Material.ACACIA_PLANKS);
		recipe.setIngredient('D', Material.DIAMOND);
		
		
		return recipe;

	}
	
	public ShapedRecipe getObsidianPickaxeRecipe() {
		
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_GRAY + "Obsidian Pickaxe");
		meta.setUnbreakable(true);
		
		item.setItemMeta(meta);
		
		NamespacedKey key = new NamespacedKey(this, "obsidian_pickaxe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("OOO", " S ", " S ");
		
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('O', Material.OBSIDIAN);
		
		
		return recipe;

	}
}
	
