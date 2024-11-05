package me.bunnky.idreamofeasy;

import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.BlobBuildUpdater;
import io.papermc.lib.PaperLib;
import me.bunnky.idreamofeasy.listeners.IdolListener;
import me.bunnky.idreamofeasy.listeners.MagnetoidListener;
import me.bunnky.idreamofeasy.slimefun.setup.Setup;
import net.guizhanss.minecraft.guizhanlib.updater.GuizhanUpdater;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import javax.annotation.Nonnull;
import java.text.MessageFormat;
import java.util.logging.Level;

public class IDreamOfEasy extends JavaPlugin implements SlimefunAddon {
    private static IDreamOfEasy instance;
    private final String username;
    private final String repo;

    private static final int MAJOR = 20;
    private static final int PATCH = 6;

    public IDreamOfEasy() {
        this.username = "SlimefunGuguProject";
        this.repo = "IDreamOfEasy";
    }

    @Override
    public void onEnable() {
        instance = this;

        int version = PaperLib.getMinecraftVersion();
        int patchVersion = PaperLib.getMinecraftPatchVersion();

        if (version != MAJOR || patchVersion != PATCH) {
            getLogger().severe("###############################################");
            getLogger().severe("# IDOE 仅支持 Minecraft 版本 1." + MAJOR + "." + PATCH + " #");
            getLogger().severe("###############################################");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        if (!getServer().getPluginManager().isPluginEnabled("GuizhanLibPlugin")) {
            getLogger().log(Level.SEVERE, "本插件需要 鬼斩前置库插件(GuizhanLibPlugin) 才能运行!");
            getLogger().log(Level.SEVERE, "从此处下载: https://50l.cc/gzlib");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        getLogger().info(" ┳  ┳┓┳┓┏┓┏┓┳┳┓  ┏┓┏┓  ┏┓┏┓┏┓┓┏ ");
        getLogger().info(" ┃  ┃┃┣┫┣ ┣┫┃┃┃  ┃┃┣   ┣ ┣┫┗┓┗┫ ");
        getLogger().info(" ┻  ┻┛┛┗┗┛┛┗┛ ┗  ┗┛┻   ┗┛┛┗┗┛┗┛ ");
        getLogger().info("        IDOE by Bunnky          ");
        getLogger().info("    易梦 - 粘液科技简中汉化组汉化    ");
        saveDefaultConfig();

        setupMetrics();
        tryUpdate();

        Setup.setup();

        new MagnetoidListener(this);
        new IdolListener(this);
    }

    public void setupMetrics() {
        Metrics metrics = new Metrics(this, 23610);
    }

    public void tryUpdate() {
        if (getConfig().getBoolean("options.auto-update", true)
            && getDescription().getVersion().startsWith("Build")
        ) {
            GuizhanUpdater.start(this, getFile(), username, repo, "master");
        }
    }

    public static void consoleMsg(@Nonnull String string) {
        instance.getLogger().info(string);
    }

    public static IDreamOfEasy getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {}

    @Override
    public String getBugTrackerURL() {
        return MessageFormat.format("https://github.com/{0}/{1}/issues", this.username, this.repo);
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
