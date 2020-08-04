package com.windvalian.ItemsWeNeedROV.items;

import com.windvalian.ItemsWeNeedROV.Main;
import com.windvalian.ItemsWeNeedROV.init.ModItems;
import com.windvalian.ItemsWeNeedROV.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String radio)
	{
		setUnlocalizedName(radio);
		setRegistryName(radio);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
}
