package freopt.thingy;

import freopt.thingy.common.block.ModBlocks;
import freopt.thingy.common.item.ModItems;
import freopt.thingy.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Thingy.MODID, name = Thingy.NAME, version = Thingy.NAME)
@Mod.EventBusSubscriber(modid = Thingy.MODID)
public class Thingy {
    public static final Logger LOGGER = LogManager.getLogger("thingy");
    public static final String MODID = "thingy";
    public static final String NAME = "Thingy";
    public static final String VERSION = "1.0";

    @Mod.Instance public static Thingy INSTANCE;

    @SidedProxy
            (clientSide = "freopt.thingy.proxy.ClientProxy",
            serverSide = "freopt.thingy.proxy.CommonProxy")

    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public static final CreativeTabs creativeTab = new CreativeTabs("thingy") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.BEEF);
        }
    };

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.initBlocks(event);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.initItems(event);
    }

    @SubscribeEvent
    public static void reigsterItemModels(ModelRegistryEvent event) {
        for (Item item: ModItems.ITEMS) {
            ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
        }
    }

}
