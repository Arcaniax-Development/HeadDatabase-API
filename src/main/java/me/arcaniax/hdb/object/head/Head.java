package me.arcaniax.hdb.object.head;

import java.util.ArrayList;
import java.util.Collection;
import me.arcaniax.hdb.enums.CategoryEnum;
import org.bukkit.inventory.ItemStack;

public class Head
{
  public String b64;
  public String name;
  public String lore;
  public String id;
  public String uuid;
  public CategoryEnum c;
  public boolean recent = false;
  public Collection<String> tags = new ArrayList();
  public boolean isCustom = false;
  private double price = -1.0D;
  long ID = 0L;
  long number = 0L;
  
  public void setPrice(Double price)
  {
    this.price = price.doubleValue();
  }
  
  public double getPrice()
  {
    return this.price;
  }
  
  public boolean search(String input)
  {
    return false;
  }
  
  public ItemStack getHead()
  {
    return null;
  }
}
