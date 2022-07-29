package freopt.thingy.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;

import java.util.ArrayList;

public class ModBlocks {

    public static ArrayList<Block> BLOCKS = new ArrayList<>();

    public static void initBlocks(RegistryEvent.Register<Block> event) {
        for (Block block: BLOCKS) {
            event.getRegistry().register(block);
        }
    }
}
