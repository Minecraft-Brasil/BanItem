package fr.andross.banitem.utils;

import org.bukkit.Bukkit;

/**
 * Class that contains some notable versions nodes, so the plugin can handle multiple versions
 * Those variables are used to check versions compatibility
 * @version 2.2
 * @author Andross
 */
public final class BanVersion {
    /**
     * In 1.13+, MaterialData are totally removed from ItemStack, and the durability is part of ItemMeta
     */
    public static final boolean v13OrMore = Bukkit.getBukkitVersion().matches("(1\\.13)(.*)|(1\\.14)(.*)|(1\\.15)(.*)|(1\\.16)(.*)");

    /**
     * In 1.12+, the PlayerPickupItemEvent is now deprecated, and should use the EntityPickupItemEvent
     */
    public static final boolean v12OrMore = v13OrMore || Bukkit.getBukkitVersion().matches("(1\\.12)(.*)");

    /**
     * In 1.9+, the off hand have been added. Also added PotionMeta#getBasePotionData()
     */
    public static final boolean v9OrMore = v12OrMore || Bukkit.getBukkitVersion().matches("(1\\.9)(.*)|(1\\.10)(.*)|(1\\.11)(.*)");

    /**
     * In 1.8+, armor stand event have been added.
     */
    public static final boolean v8OrMore = v9OrMore || Bukkit.getBukkitVersion().matches("(1\\.8)(.*)");
}