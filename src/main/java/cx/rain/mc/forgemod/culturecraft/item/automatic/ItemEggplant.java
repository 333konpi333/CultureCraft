package cx.rain.mc.forgemod.culturecraft.item.automatic;

import cx.rain.mc.forgemod.culturecraft.api.annotation.ModItem;
import cx.rain.mc.forgemod.culturecraft.group.Groups;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

@ModItem(name = "eggplant")
public class ItemEggplant extends Item {
    public static Food food = new Food.Builder()
            .hunger(1)
            .saturation(3)
            .build();
    public ItemEggplant(){
        super(new Properties()
        .group(Groups.FOODS)
        .food(food)
        .maxStackSize(64));
    }
}