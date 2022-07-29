package freopt.thingy.common.block;

import freopt.thingy.Thingy;
import freopt.thingy.common.item.ModItems;
import freopt.thingy.common.item.ThingyItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class ThingyBlock extends Block {
    public ThingyBlock(Material material, String name, Boolean doCreateItemBlock) {
        super(material);
        setRegistryName(new ResourceLocation(Thingy.MODID,name));
        setTranslationKey(Thingy.MODID+"."+name);
        if (doCreateItemBlock) {
            ModItems.ITEMS.add(new ThingyItemBlock(this));
            setCreativeTab(Thingy.creativeTab);
        }
    }

    public ThingyBlock(Material material, String name) {
        this(material,name,true);
    }
}
