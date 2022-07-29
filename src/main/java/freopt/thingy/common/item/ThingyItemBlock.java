package freopt.thingy.common.item;

import freopt.thingy.Thingy;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ThingyItemBlock extends ItemBlock {
    public ThingyItemBlock(Block block) {
        super(block);
        this.setRegistryName(block.getRegistryName());
        this.setTranslationKey(block.getTranslationKey());

    }
}
