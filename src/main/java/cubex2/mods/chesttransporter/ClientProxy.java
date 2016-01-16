package cubex2.mods.chesttransporter;

import cubex2.mods.chesttransporter.client.ModelLoaderCT;
import cubex2.mods.chesttransporter.client.ModelRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoaderRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit()
    {
        ModelLoaderRegistry.registerLoader(new ModelLoaderCT());
    }

    @Override
    public void registerModels()
    {
        ModelResourceLocation l;

        Item item = ChestTransporter.chestTransporter;
        l = new ModelResourceLocation("chesttransporter:smart_wood", "inventory");
        ModelBakery.addVariantName(item, "chesttransporter:smart_wood");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, l);

        item = ChestTransporter.chestTransporterIron;
        l = new ModelResourceLocation("chesttransporter:smart_iron", "inventory");
        ModelBakery.addVariantName(item, "chesttransporter:smart_iron");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, l);

        item = ChestTransporter.chestTransporterGold;
        l = new ModelResourceLocation("chesttransporter:smart_gold", "inventory");
        ModelBakery.addVariantName(item, "chesttransporter:smart_gold");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, l);

        item = ChestTransporter.chestTransporterDiamond;
        l = new ModelResourceLocation("chesttransporter:smart_diamond", "inventory");
        ModelBakery.addVariantName(item, "chesttransporter:smart_diamond");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, l);
    }

    @Override
    public void addModelLocation(String name)
    {
        ModelRegistry.getInstance().modelLocations.put(name, new ResourceLocation("chesttransporter:item/" + name));
    }
}
