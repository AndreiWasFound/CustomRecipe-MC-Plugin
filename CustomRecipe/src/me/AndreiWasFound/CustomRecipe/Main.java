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
		Bukkit.addRecipe(getRecipe());
		Bukkit.addRecipe(getEmeraldPickaxeRecipe());
		Bukkit.addRecipe(getEmeraldBlockPickaxeRecipe());
		Bukkit.addRecipe(getNetherStarRecipe());
	}

	@Override
	public void onDisable() {

	}
	
	public ShapedRecipe getRecipe() {
		
		ItemStack item1 = new ItemStack(Material.NETHER_STAR);
		
		NamespacedKey key1 = new NamespacedKey(this, "nether_star");
		
		ShapedRecipe recipe1 = new ShapedRecipe(key1, item1);
		
		recipe1.shape(" T ", "TET", " T ");
		
		recipe1.setIngredient('T', Material.GHAST_TEAR);
		recipe1.setIngredient('E', Material.EMERALD_BLOCK);
		
		
		return recipe1;
	}
	
	public ShapedRecipe getEmeraldPickaxeRecipe() {
		
		ItemStack item2 = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta1 = item2.getItemMeta();
		
		meta1.setDisplayName(ChatColor.GREEN + "Emerald Pickaxe");
		meta1.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
		
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
		
		recipe4.shape("NNN", " S ", " S ");
		
		recipe4.setIngredient('S', Material.STICK);
		recipe4.setIngredient('N', Material.NETHER_STAR);
		
		
		return recipe4;

	}
	
}
	
