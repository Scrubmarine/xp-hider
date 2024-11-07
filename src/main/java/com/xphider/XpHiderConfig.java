package com.xphider;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("XP Hider")
public interface XpHiderConfig extends Config
{
	@ConfigItem(
		keyName = "total xp",
		name = "Total XP",
		description = "Hide total XP"
	)
	default boolean hideTotalXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "attack xp",
			name = "Attack XP",
			description = "Hide attack XP"
	)
	default boolean hideAttackXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "strength xp",
			name = "Strength XP",
			description = "Hide strength XP"
	)
	default boolean hideStrengthXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "defence xp",
			name = "Defence XP",
			description = "Hide defence XP"
	)
	default boolean hideDefenceXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "ranged xp",
			name = "Ranged XP",
			description = "Hide ranged XP"
	)
	default boolean hideRangedXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "prayer xp",
			name = "Prayer XP",
			description = "Hide prayer XP"
	)
	default boolean hidePrayerXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "magic xp",
			name = "Magic XP",
			description = "Hide magic XP"
	)
	default boolean hideMagicXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "runecraft xp",
			name = "Runecraft XP",
			description = "Hide runecraft XP"
	)
	default boolean hideRunecraftXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "construction xp",
			name = "Construction XP",
			description = "Hide construction XP"
	)
	default boolean hideConstructionXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hitpoints xp",
			name = "Hitpoints XP",
			description = "Hide hitpoints XP"
	)
	default boolean hideHitpointsXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "agility xp",
			name = "Agility XP",
			description = "Hide agility XP"
	)
	default boolean hideAgilityXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "herblore xp",
			name = "Herblore XP",
			description = "Hide herblore XP"
	)
	default boolean hideHerbloreXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "thieving xp",
			name = "Thieving XP",
			description = "Hide thieving XP"
	)
	default boolean hideThievingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "crafting xp",
			name = "Crafting XP",
			description = "Hide crafting XP"
	)
	default boolean hideCraftingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "fletching xp",
			name = "Fletching XP",
			description = "Hide fletching XP"
	)
	default boolean hideFletchingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "slayer xp",
			name = "Slayer XP",
			description = "Hide slayer XP"
	)
	default boolean hideSlayerXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hunter xp",
			name = "Hunter XP",
			description = "Hide hunter XP"
	)
	default boolean hideHunterXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "mining xp",
			name = "Mining XP",
			description = "Hide mining XP"
	)
	default boolean hideMiningXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "smithing xp",
			name = "Smithing XP",
			description = "Hide smithing XP"
	)
	default boolean hideSmithingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "fishing xp",
			name = "Fishing XP",
			description = "Hide fishing XP"
	)
	default boolean hideFishingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "cooking xp",
			name = "Cooking XP",
			description = "Hide cooking XP"
	)
	default boolean hideCookingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "firemaking xp",
			name = "Firemaking XP",
			description = "Hide firemaking XP"
	)
	default boolean hideFiremakingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "woodcutting xp",
			name = "Woodcutting XP",
			description = "Hide woodcutting XP"
	)
	default boolean hideWoodcuttingXp()
	{
		return false;
	}

	@ConfigItem(
			keyName = "farming xp",
			name = "Farming XP",
			description = "Hide farming XP"
	)
	default boolean hideFarmingXp()
	{
		return false;
	}


}
