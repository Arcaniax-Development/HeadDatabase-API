package me.arcaniax.hdb.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.arcaniax.hdb.enums.CategoryEnum;
import me.arcaniax.hdb.object.head.Head;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public class HeadDatabaseAPI
{
  private String prefix = "api";
  
  public void setPrefixID(String prefix)
  {
    this.prefix = prefix;
  }
  
  public boolean isHead(String ID)
  {
    return false;
  }
  
  public ItemStack getItemHead(String ID)
  {
    return null;
  }
  
  public String getItemID(ItemStack is)
  {
    return null;
  }
  
  public boolean addHead(CategoryEnum category, Head head)
  {
    return false;
  }
  
  public List<Head> getHeads(CategoryEnum category)
  {
    return new ArrayList();
  }
  
  public ItemStack getRandomHead()
  {
    return null;
  }
  
  public CategoryEnum getCategory(String id)
  {
    return null;
  }
  
  public boolean setBlockSkin(Block block, String ID)
  {
    return false;
  }
  
  public String addHead(CategoryEnum category, String name, UUID uuid)
  {
    return null;
  }
  
  public String addHead(CategoryEnum category, String name, String base64)
  {
    return null;
  }
  
  public boolean removeHead(String id)
  {
    return false;
  }
}
