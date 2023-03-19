package kaptainwutax.seedcrackerX.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.util.Util;

public class DatabaseCommand extends ClientCommand {

    public static String databaseURL = "http://localhost:5000";

    @Override
    public String getName() {
        return "database";
    }

    @Override
    public void build(LiteralArgumentBuilder<FabricClientCommandSource> builder) {
        builder.executes(this::openURL);
    }

    public int openURL(CommandContext<FabricClientCommandSource> context) {
        Util.getOperatingSystem().open(databaseURL);
        return 0;
    }
}
