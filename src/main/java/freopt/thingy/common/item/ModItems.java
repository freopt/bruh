package freopt.thingy.common.item;

import freopt.thingy.common.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

import java.util.ArrayList;

public class ModItems {

    public static final ArrayList<Item> ITEMS = new ArrayList<>();

    public static void initItems(RegistryEvent.Register<Item> event) {
        for (Item item: ModItems.ITEMS) {
            event.getRegistry().register(item);
        }
    }
}
