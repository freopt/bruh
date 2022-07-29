package freopt.thingy.common.item;

import freopt.thingy.Thingy;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ThingyItem extends Item {

    public ThingyItem(String name) {
        this.setRegistryName(new ResourceLocation(Thingy.MODID,name));
        this.setTranslationKey(Thingy.MODID+"."+name);
        this.setCreativeTab(Thingy.creativeTab);
    }

}
