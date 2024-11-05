package me.bunnky.idreamofeasy.slimefun.setup;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import me.bunnky.idreamofeasy.IDreamOfEasy;
import me.bunnky.idreamofeasy.slimefun.items.BiomeCompass;
import me.bunnky.idreamofeasy.slimefun.items.Chisel;
import me.bunnky.idreamofeasy.slimefun.items.ElectricExplosivePickaxe;
import me.bunnky.idreamofeasy.slimefun.items.ElectricExplosiveShovel;
import me.bunnky.idreamofeasy.slimefun.items.idols.TerranIdol;
import me.bunnky.idreamofeasy.slimefun.items.idols.FlameheartIdol;
import me.bunnky.idreamofeasy.slimefun.items.Jawn;
import me.bunnky.idreamofeasy.slimefun.items.LavaBoat;
import me.bunnky.idreamofeasy.slimefun.items.Magnetoid;
import me.bunnky.idreamofeasy.slimefun.items.idols.DivineIdol;
import me.bunnky.idreamofeasy.slimefun.items.idols.TorrentIdol;
import me.bunnky.idreamofeasy.slimefun.machines.ElectricCable;
import me.bunnky.idreamofeasy.slimefun.machines.ElectricShearer;
import me.bunnky.idreamofeasy.slimefun.machines.PlayerHopper;
import me.bunnky.idreamofeasy.slimefun.machines.StackDispenser;
import me.bunnky.idreamofeasy.slimefun.machines.SupplyHopper;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.BatRepeller;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.CreeperRepeller;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.EndermanRepeller;
import me.bunnky.idreamofeasy.slimefun.items.TrimVault;
import me.bunnky.idreamofeasy.slimefun.items.WisterShears;
import me.bunnky.idreamofeasy.slimefun.machines.multiblock.AdvancedTerrabore;
import me.bunnky.idreamofeasy.slimefun.machines.ElectricBlastFurnace;
import me.bunnky.idreamofeasy.slimefun.machines.ElectricLogStripper;
import me.bunnky.idreamofeasy.slimefun.machines.ElectricSmoker;
import me.bunnky.idreamofeasy.slimefun.machines.multiblock.EliteTerrabore;
import me.bunnky.idreamofeasy.slimefun.machines.RadiationAbsorber;
import me.bunnky.idreamofeasy.slimefun.machines.multiblock.Terrabore;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.SkeletonRepeller;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.SlimeRepeller;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.SpiderRepeller;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.WitchRepeller;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.ZombieRepeller;
import me.bunnky.idreamofeasy.slimefun.machines.repellers.ZombieVillagerRepeller;
import me.bunnky.idreamofeasy.utils.IDOEUtility;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

@UtilityClass
public class Setup {
    private static final String TRIM_VAULT = "9d6f99f3c5d982ebde8da657d0652aa08064bf6d6b495fda23c6e47123c093e7";
    private static final String REPELLER = "10892dff2ad75e47b08bf637d8dd2d10ed767f80b8144d5eda5db4d2e18614d8";

    public static void setup() {

        IDreamOfEasy plugin = IDreamOfEasy.getInstance();

        ItemStack groupItem = new CustomItemStack(Material.CALIBRATED_SCULK_SENSOR, "&2易梦");
        NamespacedKey groupId = new NamespacedKey(IDreamOfEasy.getInstance(), "i_dream_of_easy");
        ItemGroup group = new ItemGroup(groupId, groupItem);

        //########################
        //  ITEMS
        //########################

        //////////////////////////////////////////////
        //////////////// MULTIBLOCK //////////////////
        //////////////////////////////////////////////

        SlimefunItemStack terrabore = new SlimefunItemStack(
            "IDOE_TERRABORE",
            Material.NETHERITE_SHOVEL,
            "&e盾构机",
            "",
            "&f该多方块结构会挖掘",
            "&f下方 7x7 区域内的",
            "&c任何方块&f。",
            "&f放入煤矿或其他相似物品",
            "&f作为机器燃料。",
            ""
        );

        SlimefunItemStack terraboreAdvanced = new SlimefunItemStack(
            "IDOE_TERRABORE_ADVANCED",
            Material.NETHERITE_PICKAXE,
            "&e高级盾构机",
            "",
            "&f该多方块结构会挖掘",
            "&f下方 11x11 区域内的",
            "&c任何方块&f。",
            "&f放入煤矿或其他相似物品",
            "&f作为机器燃料。",
            "",
            "&a+ 精准采集"
        );

        SlimefunItemStack terraboreElite = new SlimefunItemStack(
            "IDOE_TERRABORE_ELITE",
            Material.NETHERITE_BLOCK,
            "&e精英盾构机",
            "",
            "&f该多方块结构会挖掘",
            "&f下方 21x21 区域内的",
            "&c任何方块&f。",
            "&f放入煤矿或其他相似物品",
            "&f作为机器燃料。",
            "",
            "&a+ 精准采集"
        );

        //////////////////////////////////////////////
        ///////////////// MACHINES ///////////////////
        //////////////////////////////////////////////
        SlimefunItemStack supplyHopper = new SlimefunItemStack(
            "IDOE_HOPPER_SUPPLY",
            Material.HOPPER,
            "&a补给漏斗",
            "",
            "&f站在该漏斗下方会自动",
            "&f接收物品到你的物品栏",
            "",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(250)
        );

        SlimefunItemStack playerHopper = new SlimefunItemStack(
            "IDOE_HOPPER_PLAYER",
            Material.HOPPER,
            "&a玩家漏斗",
            "",
            "&f站在该漏斗上方会自动",
            "&f吸取你物品栏中的物品",
            "",
            "&8⇨ &4不会吸取护甲与副手物品",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(250)
        );

        SlimefunItemStack stackDispenser = new SlimefunItemStack(
            "IDOE_DISPENSER_STACK",
            Material.DISPENSER,
            "&a堆叠发射器",
            "",
            "&f会试图发射",
            "&f一整组物品",
            ""
        );

        SlimefunItemStack electricCable = new SlimefunItemStack(
            "IDOE_ELECTRIC_CABLE",
            Material.CHAIN,
            "&a电线",
            "",
            "&f会伤害任何触碰的实体",
            "",
            "&8⇨ &a不会对拥有者生效",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(100),
            "",
            "&e伤害：&72"
        );

        SlimefunItemStack electricCable2 = new SlimefunItemStack(
            "IDOE_ELECTRIC_CABLE_2",
            Material.YELLOW_STAINED_GLASS_PANE,
            "&a电线 &7(&eII&7)",
            "",
            "&f会伤害任何触碰的实体",
            "",
            "&8⇨ &a不会对拥有者生效",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(150),
            "",
            "&e伤害：&74"
        );

        SlimefunItemStack electricCable3 = new SlimefunItemStack(
            "IDOE_ELECTRIC_CABLE_3",
            Material.IRON_BARS,
            "&a电线 &7(&eIII&7)",
            "",
            "&f会伤害任何触碰的实体",
            "",
            "&8⇨ &a不会对拥有者生效",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(200),
            "",
            "&e伤害：&76"
        );

        SlimefunItemStack radiationAbsorber = new SlimefunItemStack(
            "IDOE_RADIATION_ABSORBER",
            Material.GREEN_CONCRETE,
            "&a辐射吸收器",
            "",
            LoreBuilder.range(2),
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(250)
        );

        SlimefunItemStack radiationAbsorber2 = new SlimefunItemStack(
            "IDOE_RADIATION_ABSORBER_2",
            Material.LIME_CONCRETE,
            "&a辐射吸收器 &7(&eII&7)",
            "",
            LoreBuilder.range(4),
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(750)
        );

        SlimefunItemStack radiationAbsorber3 = new SlimefunItemStack(
            "IDOE_RADIATION_ABSORBER_3",
            Material.SLIME_BLOCK,
            "&a辐射吸收器 &7(&eIII&7)",
            "",
            LoreBuilder.range(7),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(1800)
        );

        SlimefunItemStack electricBlastFurnace = new SlimefunItemStack(
            "IDOE_ELECTRIC_BLASTFURNACE",
            Material.BLAST_FURNACE,
            "&a电力高炉",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(48)
        );

        SlimefunItemStack electricBlastFurnace2 = new SlimefunItemStack(
            "IDOE_ELECTRIC_BLASTFURNACE_2",
            Material.BLAST_FURNACE,
            "&a电力高炉 &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(80)
        );

        SlimefunItemStack electricBlastFurnace3 = new SlimefunItemStack(
            "IDOE_ELECTRIC_BLASTFURNACE_3",
            Material.BLAST_FURNACE,
            "&a电力高炉 &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(8),
            LoreBuilder.powerPerSecond(120)
        );

        SlimefunItemStack electricSmoker = new SlimefunItemStack(
            "IDOE_ELECTRIC_SMOKER",
            Material.SMOKER,
            "&a电力烟熏炉",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(48)
        );

        SlimefunItemStack electricSmoker2 = new SlimefunItemStack(
            "IDOE_ELECTRIC_SMOKER_2",
            Material.SMOKER,
            "&a电力烟熏炉 &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(80)
        );

        SlimefunItemStack electricSmoker3 = new SlimefunItemStack(
            "IDOE_ELECTRIC_SMOKER_3",
            Material.SMOKER,
            "&a电力烟熏炉 &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(8),
            LoreBuilder.powerPerSecond(120)
        );

        SlimefunItemStack electricLogStripper = new SlimefunItemStack(
            "IDOE_ELECTRIC_LOG_STRIPPER",
            Material.STONECUTTER,
            "&a电力去皮器",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(48)
        );

        SlimefunItemStack electricLogStripper2 = new SlimefunItemStack(
            "IDOE_ELECTRIC_LOG_STRIPPER_2",
            Material.STONECUTTER,
            "&a电力去皮器 &7(&eII&7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(80)
        );

        SlimefunItemStack electricLogStripper3 = new SlimefunItemStack(
            "IDOE_ELECTRIC_LOG_STRIPPER_3",
            Material.STONECUTTER,
            "&a电力去皮器 &7(&eIII&7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(8),
            LoreBuilder.powerPerSecond(120)
        );

        SlimefunItemStack electricShearer = new SlimefunItemStack(
            "IDOE_ELECTRIC_SHEARER",
            Material.LOOM,
            "&a电力剪毛机",
            "",
            LoreBuilder.range(4),
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(120)
        );

        SlimefunItemStack zombieRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_ZOMBIE",
            REPELLER,
            "&a僵尸抑制器",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(125)
        );

        SlimefunItemStack spiderRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_SPIDER",
            REPELLER,
            "&a蜘蛛抑制器",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(125)
        );

        SlimefunItemStack skeletonRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_SKELETON",
            REPELLER,
            "&a骷髅抑制器",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(125)
        );

        SlimefunItemStack creeperRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_CREEPER",
            REPELLER,
            "&a苦力怕抑制器",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(125)
        );

        SlimefunItemStack slimeRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_SLIME",
            REPELLER,
            "&a史莱姆抑制器",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(175)
        );

        SlimefunItemStack zombieVillagerRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_ZOMBIE_VILLAGER",
            REPELLER,
            "&a僵尸村民",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(125)
        );

        SlimefunItemStack batRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_BAT",
            REPELLER,
            "&a蝙蝠抑制器",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(75)
        );

        SlimefunItemStack endermanRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_ENDERMAN",
            REPELLER,
            "&a末影人",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(125)
        );

        SlimefunItemStack witchRepeller = new SlimefunItemStack(
            "IDOE_REPELLER_WITCH",
            REPELLER,
            "&a女巫抑制器",
            "",
            "&f在区块中放置该机器",
            "&f将阻止指定生物的生成",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(125)
        );

        //////////////////////////////////////////////
        /////////////////// TOOLS ////////////////////
        //////////////////////////////////////////////

        SlimefunItemStack magnetoid = new SlimefunItemStack(
            "IDOE_MAGNETOID",
            Material.ECHO_SHARD,
            "&a磁石",
            "",
            "&f磁石会不断吸收周围的物品",
            "",
            LoreBuilder.powerCharged(0, 50),
            LoreBuilder.range(8),
            "",
            "&e副手手持&7以使用"
        );

        SlimefunItemStack jawn = new SlimefunItemStack(
            "IDOE_JAWN",
            Material.BONE,
            "&a头颅移除器",
            "",
            "&f可瞬间破坏任何头颅",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE
        );

        SlimefunItemStack lavaBoat = new SlimefunItemStack(
            "IDOE_LAVABOAT",
            Material.DARK_OAK_BOAT,
            "&a岩浆船",
            "",
            "&f在脚下放置一艘防火船",
            "&f以在岩浆上行驶",
            "",
            "&8⇨ &4在水中无浮力",
            "&8⇨ &4烫烫烫！",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE
        );

        SlimefunItemStack trimVault = new SlimefunItemStack(
            "IDOE_TRIM_VAULT",
            TRIM_VAULT,
            "&a盔甲纹饰宝库",
            "",
            "&f破坏以获得随机的",
            "&f盔甲纹饰模版",
            ""
        );

        SlimefunItemStack wisterShears = new SlimefunItemStack(
            "IDOE_WISTER_SHEARS",
            Material.SHEARS,
            "&a韦斯特之剪",
            "",
            "&f可以修剪所有的东西",
            "",
            "&8⇨ &a不可破坏",
            "",
            "&e左键点击&7以修剪树叶于草丛",
            "&e右键点击&7对生物使用"
        );

        ItemMeta wistermeta = wisterShears.getItemMeta();
        wistermeta.setUnbreakable(true);
        wistermeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        wisterShears.setItemMeta(wistermeta);

        SlimefunItemStack chisel = new SlimefunItemStack(
            "IDOE_CHISEL",
            Material.POINTED_DRIPSTONE,
            "&a凿子",
            "",
            "&f将部分方块雕纹",
            "",
            LoreBuilder.powerCharged(0, 250),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE
        );

        SlimefunItemStack electricPick = new SlimefunItemStack(
            "IDOE_ELECTRIC_EXPLOSIVE_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&a电力爆炸镐",
            "",
            "&f电动的爆炸镐",
            "",
            LoreBuilder.powerCharged(0, 700)
        );
        ItemMeta pickMeta = electricPick.getItemMeta();
        pickMeta.setUnbreakable(true);
        pickMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        electricPick.setItemMeta(pickMeta);

        SlimefunItemStack electricShovel = new SlimefunItemStack(
            "IDOE_ELECTRIC_EXPLOSIVE_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&a电力爆炸铲",
            "",
            "&f电动的爆炸铲",
            "",
            LoreBuilder.powerCharged(0, 900)
        );

        ItemMeta shovelMeta = electricShovel.getItemMeta();
        shovelMeta.setUnbreakable(true);
        shovelMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        electricShovel.setItemMeta(shovelMeta);

        SlimefunItemStack biomeCompass = new SlimefunItemStack(
            "IDOE_BIOMECOMPASS",
            Material.COMPASS,
            "&a生物群系探针",
            "",
            "&f在" + BiomeCompass.getRange() + "格内搜索",
            "&f指定的生物群系。优先指向新区域。",
            "",
            "&8⇨ &a可记忆位置",
            "",
            "&e蹲下 + 右键点击 空气&7切换到下一个生物群系",
            "&e蹲下 + 右键点击 任意方块&7切换到上一个生物群系",
            "&e右键点击&7进行搜索"
        );

        SlimefunItemStack flameheartIdol = new SlimefunItemStack(
            "IDOE_IDOL_FLAMEHEART",
            Material.BLAZE_POWDER,
            "&c&l火焰之心神像",
            "&e不会消耗",
            "",
            "&8⇨ &a岩浆行者：&720%",
            "&8⇨ &a消防员：&720%",
            "&8⇨ &a战士：&720%",
            "&8⇨ &a骑士：&730%",
            "",
            "&e右键点击&7切换消息显示",
            "&c防火"
        );

        SlimefunItemStack torrentIdol = new SlimefunItemStack(
            "IDOE_IDOL_TORRENT",
            Material.HEART_OF_THE_SEA,
            "&b&l激流神像",
            "&e不会消耗",
            "",
            "&8⇨ &a潜水者：&720%",
            "&8⇨ &a天使：&775%",
            "&8⇨ &a旋风：&760%",
            "&8⇨ &a旅行者：&760%",
            "",
            "&e右键点击&7切换消息显示",
            "&c防火"
        );

        SlimefunItemStack terranIdol = new SlimefunItemStack(
            "IDOE_IDOL_TERRAN",
            Material.HONEYCOMB,
            "&a&l人族神像",
            "&e不会消耗",
            "",
            "&8⇨ &a穴居者：&750%",
            "&8⇨ &a矿工：&720%",
            "&8⇨ &a农夫：&720%",
            "&8⇨ &a猎人：&720%",
            "",
            "&e右键点击&7切换消息显示",
            "&c防火"
        );

        SlimefunItemStack divineIdol = new SlimefunItemStack(
            "IDOE_IDOL_DIVINE",
            Material.AMETHYST_SHARD,
            "&d&lDivine Idol",
            "&e不会消耗",
            "",
            "&8⇨ &a魔法师：&780%",
            "&8⇨ &a巫师：&720%",
            "&8⇨ &a智者：&720%",
            "&8⇨ &a铁砧： &720%",
            "",
            "&e右键点击&7切换消息显示",
            "&c防火"
        );

        SlimefunItemStack enchantedGoldenApple = new SlimefunItemStack(
            "IDOE_ENCHANTED_GOLDEN_APPLE",
            new ItemStack(Material.ENCHANTED_GOLDEN_APPLE)
        );

        SlimefunItemStack badOmenPotion = new SlimefunItemStack(
            "IDOE_POTION_BAD_OMEN",
            Color.BLACK,
            new PotionEffect(PotionEffectType.BAD_OMEN, 6000, 0),
            "&a不详药水"
        );
        IDOEUtility.setGlow(badOmenPotion);

        //########################
        //  RECIPES
        //########################

        //////////////////////////////////////////////
        ///////////////// MACHINES ///////////////////
        //////////////////////////////////////////////
        ItemStack[] playerHopperRecipe = {
            SlimefunItems.ENERGY_CONNECTOR, SlimefunItems.EARTH_RUNE, SlimefunItems.INFUSED_MAGNET,
            SlimefunItems.ENDER_RUNE, SlimefunItems.INFUSED_HOPPER, SlimefunItems.ENDER_RUNE,
            SlimefunItems.INFUSED_MAGNET, SlimefunItems.EARTH_RUNE, SlimefunItems.ENERGY_CONNECTOR
        };

        ItemStack[] supplyHopperRecipe = {
            SlimefunItems.ENERGY_CONNECTOR, SlimefunItems.EARTH_RUNE, SlimefunItems.INFUSED_MAGNET,
            SlimefunItems.ENDER_RUNE, new ItemStack(Material.DROPPER), SlimefunItems.ENDER_RUNE,
            SlimefunItems.INFUSED_MAGNET, SlimefunItems.EARTH_RUNE, SlimefunItems.ENERGY_CONNECTOR
        };

        ItemStack[] stackDispenserRecipe = {
            SlimefunItems.STEEL_PLATE, SlimefunItems.BATTERY, SlimefunItems.STEEL_PLATE,
            SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.BLOCK_PLACER, SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.STEEL_PLATE, SlimefunItems.BATTERY, SlimefunItems.STEEL_PLATE
        };

        ItemStack[] electricCableRecipe = {
            new ItemStack(Material.CHAIN), new ItemStack(Material.CHAIN), new ItemStack(Material.CHAIN),
            new ItemStack(Material.CHAIN), SlimefunItems.ENERGY_CONNECTOR, new ItemStack(Material.CHAIN),
            new ItemStack(Material.CHAIN), new ItemStack(Material.CHAIN), new ItemStack(Material.CHAIN)
        };

        ItemStack[] electricCable2Recipe = {
            electricCable, electricCable, electricCable,
            electricCable, SlimefunItems.ENERGY_CONNECTOR, electricCable,
            electricCable, electricCable, electricCable
        };

        ItemStack[] electricCable3Recipe = {
            electricCable2, electricCable2, electricCable2,
            electricCable2, SlimefunItems.ENERGY_CONNECTOR, electricCable2,
            electricCable2, electricCable2, electricCable2
        };

        ItemStack[] radiationAbsorberRecipe = {
            SlimefunItems.REINFORCED_PLATE, SlimefunItems.NETHER_ICE_COOLANT_CELL, SlimefunItems.REINFORCED_PLATE,
            SlimefunItems.HEATING_COIL, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.HEATING_COIL,
            SlimefunItems.REINFORCED_PLATE, SlimefunItems.NETHER_ICE_COOLANT_CELL, SlimefunItems.REINFORCED_PLATE
        };

        ItemStack[] radiationAbsorber2Recipe = {
            SlimefunItems.REINFORCED_PLATE, SlimefunItems.NETHER_ICE_COOLANT_CELL, SlimefunItems.REINFORCED_PLATE,
            SlimefunItems.HEATING_COIL, radiationAbsorber, SlimefunItems.HEATING_COIL,
            SlimefunItems.REINFORCED_PLATE, SlimefunItems.NETHER_ICE_COOLANT_CELL, SlimefunItems.REINFORCED_PLATE
        };

        ItemStack[] radiationAbsorber3Recipe = {
            SlimefunItems.REINFORCED_PLATE, SlimefunItems.NETHER_ICE_COOLANT_CELL, SlimefunItems.REINFORCED_PLATE,
            SlimefunItems.HEATING_COIL, radiationAbsorber2, SlimefunItems.HEATING_COIL,
            SlimefunItems.REINFORCED_PLATE, SlimefunItems.NETHER_ICE_COOLANT_CELL, SlimefunItems.REINFORCED_PLATE
        };

        ItemStack[] electricBlastFurnaceRecipe = {
            null, SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.BLAST_FURNACE), SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL
        };

        ItemStack[] electricBlastFurnaceRecipe2 = {
            null, SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, electricBlastFurnace, SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL
        };

        ItemStack[] electricBlastFurnaceRecipe3 = {
            null, SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, electricBlastFurnace2, SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HEATING_COIL
        };

        ItemStack[] electricSmokerRecipe = {
            new ItemStack(Material.FLINT_AND_STEEL), SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.SMOKER), SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.IGNITION_CHAMBER
        };

        ItemStack[] electricSmokerRecipe2 = {
            new ItemStack(Material.FLINT_AND_STEEL), SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, electricSmoker, SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.IGNITION_CHAMBER
        };

        ItemStack[] electricSmokerRecipe3 = {
            new ItemStack(Material.FLINT_AND_STEEL), SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, electricSmoker2, SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.HEATING_COIL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.IGNITION_CHAMBER
        };

        ItemStack[] electricLogStripperRecipe = {
            SlimefunItems.LUMBER_AXE, SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.STONECUTTER), SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.COPPER_WIRE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.COPPER_WIRE
        };

        ItemStack[] electricLogStripperRecipe2 = {
            SlimefunItems.LUMBER_AXE, SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, electricLogStripper, SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.COPPER_WIRE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.COPPER_WIRE
        };

        ItemStack[] electricLogStripperRecipe3 = {
            SlimefunItems.LUMBER_AXE, SlimefunItems.BATTERY, null,
            SlimefunItems.ELECTRIC_MOTOR, electricLogStripper2, SlimefunItems.ELECTRIC_MOTOR,
            SlimefunItems.COPPER_WIRE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.COPPER_WIRE
        };

        ItemStack[] electricShererRecipe = {
            SlimefunItems.SOLAR_PANEL, SlimefunItems.BATTERY, SlimefunItems.SOLAR_PANEL,
            SlimefunItems.GOLD_22K, new ItemStack(Material.SHEARS), SlimefunItems.GOLD_22K,
            SlimefunItems.GOLD_22K, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.GOLD_22K
        };

        ItemStack[] zombieRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.ZOMBIE_HEAD), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] spiderRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.SPIDER_EYE), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] skeletonRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.SKELETON_SKULL), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] creeperRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.CREEPER_HEAD), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] slimeRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.SLIME_BLOCK), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] zombieVillagerRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.ROTTEN_FLESH), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] batRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.APPLE), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] endermanRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.ENDER_EYE), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        ItemStack[] witchRepellerRecipe = {
            new ItemStack(Material.NETHERITE_SWORD), new ItemStack(Material.GLOWSTONE_DUST), SlimefunItems.GRAPPLING_HOOK,
            SlimefunItems.MAGICAL_GLASS, SlimefunItems.NECROTIC_SKULL, SlimefunItems.MAGICAL_GLASS,
            SlimefunItems.TRASH_CAN, SlimefunItems.LAVA_CRYSTAL, SlimefunItems.NEPTUNIUM
        };

        //////////////////////////////////////////////
        /////////////////// TOOLS ////////////////////
        //////////////////////////////////////////////
        ItemStack[] magnetoidRecipe = {
            null, SlimefunItems.GRAPPLING_HOOK, null,
            SlimefunItems.REDSTONE_ALLOY, SlimefunItems.INFUSED_MAGNET, SlimefunItems.REDSTONE_ALLOY,
            null, SlimefunItems.ELECTRIC_MOTOR, null
        };

        ItemStack[] jawnRecipe = {
            SlimefunItems.ENCHANTMENT_RUNE, SlimefunItems.ENCHANTMENT_RUNE, SlimefunItems.ENCHANTMENT_RUNE,
            SlimefunItems.ENCHANTMENT_RUNE, new ItemStack(Material.BONE), SlimefunItems.ENCHANTMENT_RUNE,
            SlimefunItems.ENCHANTMENT_RUNE, SlimefunItems.ENCHANTMENT_RUNE, SlimefunItems.ENCHANTMENT_RUNE
        };

        ItemStack[] lavaBoatRecipe = {
            null, null, null,
            new ItemStack(Material.OBSIDIAN), SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.OBSIDIAN),
            new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN)
        };

        ItemStack[] trimVaultRecipe = {
            SlimefunItems.PLASTIC_SHEET, SlimefunItems.SALT, SlimefunItems.PLASTIC_SHEET,
            SlimefunItems.STEEL_PLATE, new ItemStack(Material.NETHERITE_INGOT), SlimefunItems.STEEL_PLATE,
            SlimefunItems.PLASTIC_SHEET, SlimefunItems.OUTPUT_CHEST, SlimefunItems.PLASTIC_SHEET
        };

        ItemStack[] wisterShearsRecipe = {
            SlimefunItems.EARTH_RUNE, new ItemStack(Material.SHORT_GRASS), SlimefunItems.EARTH_RUNE,
            SlimefunItems.EARTH_RUNE, new ItemStack(Material.SHEARS), SlimefunItems.EARTH_RUNE,
            SlimefunItems.EARTH_RUNE, new ItemStack(Material.OAK_LEAVES), SlimefunItems.EARTH_RUNE
        };

        ItemStack[] biomeCompassRecipe = {
            new ItemStack(Material.ICE), new ItemStack(Material.GRASS_BLOCK), new ItemStack(Material.MAGMA_BLOCK),
            new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.COMPASS), new ItemStack(Material.SPYGLASS),
            new ItemStack(Material.CRIMSON_FUNGUS), new ItemStack(Material.SCULK), new ItemStack(Material.END_STONE)
        };

        ItemStack[] chiselRecipe = {
            SlimefunItems.ALUMINUM_BRASS_INGOT, null, SlimefunItems.ALUMINUM_BRASS_INGOT,
            SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.ALUMINUM_BRASS_INGOT,
            null, SlimefunItems.ALUMINUM_BRASS_INGOT, null,
        };

        ItemStack[] electricPickRecipe = {
            SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.EXPLOSIVE_PICKAXE, SlimefunItems.SYNTHETIC_DIAMOND,
            null, SlimefunItems.BIG_CAPACITOR, null,
            null, SlimefunItems.SYNTHETIC_DIAMOND, null,
        };

        ItemStack[] electricShovelRecipe = {
            null, SlimefunItems.EXPLOSIVE_SHOVEL, null,
            null, SlimefunItems.BIG_CAPACITOR, null,
            null, SlimefunItems.SYNTHETIC_DIAMOND, null,
        };


        //////////////////////////////////////////////
        /////////////////// IDOLS ////////////////////
        //////////////////////////////////////////////
        ItemStack[] flamheartIdolRecipe = {
            SlimefunItem.getById("ENDER_LAVA_TALISMAN").getItem(), SlimefunItems.TALISMAN_LAVA, SlimefunItem.getById("ENDER_WARRIOR_TALISMAN").getItem(),
            SlimefunItems.TALISMAN_WARRIOR, SlimefunItems.BOOSTED_URANIUM, SlimefunItems.TALISMAN_KNIGHT,
            SlimefunItem.getById("ENDER_KNIGHT_TALISMAN").getItem(), SlimefunItems.TALISMAN_FIRE, SlimefunItem.getById("ENDER_FIRE_TALISMAN").getItem()
        };

        ItemStack[] torrentIdolRecipe = {
            SlimefunItem.getById("ENDER_WATER_TALISMAN").getItem(), SlimefunItems.TALISMAN_WATER, SlimefunItem.getById("ENDER_ANGEL_TALISMAN").getItem(),
            SlimefunItems.TALISMAN_ANGEL, SlimefunItems.BOOSTED_URANIUM, SlimefunItems.TALISMAN_WHIRLWIND,
            SlimefunItem.getById("ENDER_WHIRLWIND_TALISMAN").getItem(), SlimefunItems.TALISMAN_TRAVELLER, SlimefunItem.getById("ENDER_TRAVELLER_TALISMAN").getItem()
        };

        ItemStack[] terranIdolRecipe = {
            SlimefunItem.getById("ENDER_CAVEMAN_TALISMAN").getItem(), SlimefunItems.TALISMAN_CAVEMAN, SlimefunItem.getById("ENDER_MINER_TALISMAN").getItem(),
            SlimefunItems.TALISMAN_MINER, SlimefunItems.BOOSTED_URANIUM, SlimefunItems.TALISMAN_FARMER,
            SlimefunItem.getById("ENDER_FARMER_TALISMAN").getItem(), SlimefunItems.TALISMAN_HUNTER, SlimefunItem.getById("ENDER_HUNTER_TALISMAN").getItem()
        };

        ItemStack[] divineIdolRecipe = {
            SlimefunItem.getById("ENDER_MAGICIAN_TALISMAN").getItem(), SlimefunItems.TALISMAN_MAGICIAN, SlimefunItem.getById("ENDER_WIZARD_TALISMAN").getItem(),
            SlimefunItems.TALISMAN_WIZARD, SlimefunItems.BOOSTED_URANIUM, SlimefunItems.TALISMAN_WISE,
            SlimefunItem.getById("ENDER_WISE_TALISMAN").getItem(), SlimefunItems.TALISMAN_ANVIL, SlimefunItem.getById("ENDER_ANVIL_TALISMAN").getItem()
        };

        ItemStack[] enchantedGoldenAppleRecipe = {
            SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK,
            SlimefunItems.GOLD_24K_BLOCK, new ItemStack(Material.APPLE), SlimefunItems.GOLD_24K_BLOCK,
            SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK, SlimefunItems.GOLD_24K_BLOCK
        };

        ItemStack[] badOmenPotionRecipe = {
            null, new ItemStack(Material.FERMENTED_SPIDER_EYE), null,
            new ItemStack(Material.POISONOUS_POTATO), SlimefunItems.MEDICINE, new ItemStack(Material.GHAST_TEAR),
            null, new ItemStack(Material.NETHER_WART), null,
        };

        //########################
        //  INSTANTIATE
        //########################

        SlimefunItem playerHopperItem = new PlayerHopper(group, playerHopper, RecipeType.MAGIC_WORKBENCH, playerHopperRecipe, 500, 5000);
        SlimefunItem supplyHopperItem = new SupplyHopper(group, supplyHopper, RecipeType.MAGIC_WORKBENCH, supplyHopperRecipe, 500, 5000);
        SlimefunItem stackDispenserItem = new StackDispenser(group, stackDispenser, RecipeType.MAGIC_WORKBENCH, stackDispenserRecipe);
        SlimefunItem electricCableItem = new ElectricCable(group, electricCable, RecipeType.MAGIC_WORKBENCH, electricCableRecipe, IDOEUtility.output(electricCable, 8), 200, 2000, 2.0, 0.5);
        SlimefunItem electricCableItem2 = new ElectricCable(group, electricCable2, RecipeType.MAGIC_WORKBENCH, electricCable2Recipe, IDOEUtility.output(electricCable2, 4), 300, 3000, 4.0, 1);
        SlimefunItem electricCableItem3 = new ElectricCable(group, electricCable3, RecipeType.MAGIC_WORKBENCH, electricCable3Recipe, IDOEUtility.output(electricCable3, 2), 400, 4000, 6.0, 2);

        SlimefunItem radiationabsorber = new RadiationAbsorber(group, radiationAbsorber, RecipeType.ENHANCED_CRAFTING_TABLE, radiationAbsorberRecipe, 250, 1600, 2);
        SlimefunItem radiationabsorber2 = new RadiationAbsorber(group, radiationAbsorber2, RecipeType.ENHANCED_CRAFTING_TABLE, radiationAbsorber2Recipe, 750, 3800, 4);
        SlimefunItem radiationabsorber3 = new RadiationAbsorber(group, radiationAbsorber3, RecipeType.ENHANCED_CRAFTING_TABLE, radiationAbsorber3Recipe, 1800, 12300, 7);

        SlimefunItem electricBlastFurnaceItem = new ElectricBlastFurnace(group, electricBlastFurnace, RecipeType.ENHANCED_CRAFTING_TABLE, electricBlastFurnaceRecipe).setCapacity(1024).setEnergyConsumption(24).setProcessingSpeed(2);
        SlimefunItem electricBlastFurnaceItem2 = new ElectricBlastFurnace(group, electricBlastFurnace2, RecipeType.ENHANCED_CRAFTING_TABLE, electricBlastFurnaceRecipe2).setCapacity(1024).setEnergyConsumption(48).setProcessingSpeed(4);
        SlimefunItem electricBlastFurnaceItem3 = new ElectricBlastFurnace(group, electricBlastFurnace3, RecipeType.ENHANCED_CRAFTING_TABLE, electricBlastFurnaceRecipe3).setCapacity(1024).setEnergyConsumption(60).setProcessingSpeed(8);

        SlimefunItem electricSmokerItem = new ElectricSmoker(group, electricSmoker, RecipeType.ENHANCED_CRAFTING_TABLE, electricSmokerRecipe).setCapacity(1024).setEnergyConsumption(24).setProcessingSpeed(2);
        SlimefunItem electricSmokerItem2 = new ElectricSmoker(group, electricSmoker2, RecipeType.ENHANCED_CRAFTING_TABLE, electricSmokerRecipe2).setCapacity(1024).setEnergyConsumption(48).setProcessingSpeed(4);
        SlimefunItem electricSmokerItem3 = new ElectricSmoker(group, electricSmoker3, RecipeType.ENHANCED_CRAFTING_TABLE, electricSmokerRecipe3).setCapacity(1024).setEnergyConsumption(60).setProcessingSpeed(8);

        SlimefunItem electricLogStripperItem = new ElectricLogStripper(group, electricLogStripper, RecipeType.ENHANCED_CRAFTING_TABLE, electricLogStripperRecipe).setCapacity(1024).setEnergyConsumption(24).setProcessingSpeed(2);
        SlimefunItem electricLogStripperItem2 = new ElectricLogStripper(group, electricLogStripper2, RecipeType.ENHANCED_CRAFTING_TABLE, electricLogStripperRecipe2).setCapacity(1024).setEnergyConsumption(48).setProcessingSpeed(4);
        SlimefunItem electricLogStripperItem3 = new ElectricLogStripper(group, electricLogStripper3, RecipeType.ENHANCED_CRAFTING_TABLE, electricLogStripperRecipe3).setCapacity(1024).setEnergyConsumption(60).setProcessingSpeed(8);

        SlimefunItem electricShearerItem = new ElectricShearer(group, electricShearer, RecipeType.ENHANCED_CRAFTING_TABLE, electricShererRecipe, 120, 1024, 4);

        SlimefunItem zombieRepellerItem = new ZombieRepeller(group, zombieRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, zombieRepellerRecipe, 250, 1200);
        SlimefunItem spiderRepellerItem = new SpiderRepeller(group, spiderRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, spiderRepellerRecipe, 250, 1200);
        SlimefunItem skeletonRepellerItem = new SkeletonRepeller(group, skeletonRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, skeletonRepellerRecipe, 250, 1200);
        SlimefunItem creeperRepellerItem = new CreeperRepeller(group, creeperRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, creeperRepellerRecipe, 250, 1200);
        SlimefunItem slimeRepellerItem = new SlimeRepeller(group, slimeRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, slimeRepellerRecipe, 350, 1200);
        SlimefunItem zombieVillagerRepellerItem = new ZombieVillagerRepeller(group, zombieVillagerRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, zombieVillagerRepellerRecipe, 350, 1200);
        SlimefunItem batRepellerItem = new BatRepeller(group, batRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, batRepellerRecipe, 150, 1200);
        SlimefunItem endermanRepellerItem = new EndermanRepeller(group, endermanRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, endermanRepellerRecipe, 250, 1200);
        SlimefunItem witchRepellerItem = new WitchRepeller(group, witchRepeller, RecipeType.ENHANCED_CRAFTING_TABLE, witchRepellerRecipe, 250, 1200);

        SlimefunItem magnetoidItem = new Magnetoid(group, magnetoid, RecipeType.MAGIC_WORKBENCH, magnetoidRecipe, 50);
        SlimefunItem jawnItem = new Jawn(group, jawn, RecipeType.MAGIC_WORKBENCH, jawnRecipe);
        SlimefunItem lavaBoatItem = new LavaBoat(group, lavaBoat, RecipeType.MAGIC_WORKBENCH, lavaBoatRecipe);
        SlimefunItem trimVaultItem = new TrimVault(group, trimVault, RecipeType.MAGIC_WORKBENCH, trimVaultRecipe);
        SlimefunItem wisterShearsItem = new WisterShears(group, wisterShears, RecipeType.MAGIC_WORKBENCH, wisterShearsRecipe);
        SlimefunItem biomeCompassItem = new BiomeCompass(group, biomeCompass, RecipeType.MAGIC_WORKBENCH, biomeCompassRecipe);
        SlimefunItem chiselItem = new Chisel(group, chisel, RecipeType.MAGIC_WORKBENCH, chiselRecipe, 250);
        SlimefunItem electricPickItem = new ElectricExplosivePickaxe(group, electricPick, RecipeType.MAGIC_WORKBENCH, electricPickRecipe, 700);
        SlimefunItem electricShovelItem = new ElectricExplosiveShovel(group, electricShovel, RecipeType.MAGIC_WORKBENCH, electricShovelRecipe, 900);

        SlimefunItem enchantedGoldenAppleItem = new SlimefunItem(group, enchantedGoldenApple, RecipeType.ANCIENT_ALTAR, enchantedGoldenAppleRecipe);
        SlimefunItem badOmenPotionItem = new SlimefunItem(group, badOmenPotion, RecipeType.JUICER, badOmenPotionRecipe);

        SlimefunItem flameheartIdolItem = new FlameheartIdol(group, flameheartIdol, RecipeType.MAGIC_WORKBENCH, flamheartIdolRecipe);
        SlimefunItem torrentIdolItem = new TorrentIdol(group, torrentIdol, RecipeType.MAGIC_WORKBENCH, torrentIdolRecipe);
        SlimefunItem terranIdolItem = new TerranIdol(group, terranIdol, RecipeType.MAGIC_WORKBENCH, terranIdolRecipe);
        SlimefunItem divineIdolItem = new DivineIdol(group, divineIdol, RecipeType.MAGIC_WORKBENCH, divineIdolRecipe);

        //########################
        //  REGISTER
        //########################

        new Terrabore(group, terrabore).register(plugin);
        new AdvancedTerrabore(group, terraboreAdvanced).register(plugin);
        new EliteTerrabore(group, terraboreElite).register(plugin);

        stackDispenserItem.register(plugin);
        playerHopperItem.register(plugin);
        supplyHopperItem.register(plugin);
        electricCableItem.register(plugin);
        electricCableItem2.register(plugin);
        electricCableItem3.register(plugin);

        flameheartIdolItem.register(plugin);
        torrentIdolItem.register(plugin);
        terranIdolItem.register(plugin);
        divineIdolItem.register(plugin);

        magnetoidItem.register(plugin);
        jawnItem.register(plugin);
        lavaBoatItem.register(plugin);
        trimVaultItem.register(plugin);
        wisterShearsItem.register(plugin);
        biomeCompassItem.register(plugin);
        chiselItem.register(plugin);
        electricPickItem.register(plugin);
        electricShovelItem.register(plugin);

        enchantedGoldenAppleItem.register(plugin);
        badOmenPotionItem.register(plugin);

        radiationabsorber.register(plugin);
        radiationabsorber2.register(plugin);
        radiationabsorber3.register(plugin);

        electricBlastFurnaceItem.register(plugin);
        electricBlastFurnaceItem2.register(plugin);
        electricBlastFurnaceItem3.register(plugin);

        electricSmokerItem.register(plugin);
        electricSmokerItem2.register(plugin);
        electricSmokerItem3.register(plugin);

        electricLogStripperItem.register(plugin);
        electricLogStripperItem2.register(plugin);
        electricLogStripperItem3.register(plugin);

        electricShearerItem.register(plugin);

        zombieRepellerItem.register(plugin);
        spiderRepellerItem.register(plugin);
        skeletonRepellerItem.register(plugin);
        creeperRepellerItem.register(plugin);
        slimeRepellerItem.register(plugin);
        zombieVillagerRepellerItem.register(plugin);
        batRepellerItem.register(plugin);
        endermanRepellerItem.register(plugin);
        witchRepellerItem.register(plugin);
    }
}
