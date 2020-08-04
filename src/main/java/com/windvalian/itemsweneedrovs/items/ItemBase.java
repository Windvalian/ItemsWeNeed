package com.windvalian.itemsweneedrovs.items;

import com.windvalian.itemsweneedrovs.Main;
import com.windvalian.itemsweneedrovs.init.ModItems;
import com.windvalian.itemsweneedrovs.util.IHasModel;

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
