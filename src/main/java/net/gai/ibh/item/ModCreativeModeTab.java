package net.gai.ibh.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab IBH_TAB = new CreativeModeTab("ibhtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST.get());
        }
    };
}
