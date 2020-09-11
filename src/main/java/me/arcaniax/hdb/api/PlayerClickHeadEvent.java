package me.arcaniax.hdb.api;

import me.arcaniax.hdb.enums.CategoryEnum;
import me.arcaniax.hdb.enums.EconomyEnum;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class PlayerClickHeadEvent
  extends Event
{
  private static final HandlerList handlers = new HandlerList();
  private Player player;
  private double price = 0.0D;
  private String headID = "";
  private boolean economy = false;
  private EconomyEnum economyEnum = EconomyEnum.CURRENCY;
  private CategoryEnum categoryEnum;
  private ItemStack head;
  private boolean isCancelled = false;
  
  public PlayerClickHeadEvent(Player player, double price, String headID, EconomyEnum economyEnum, ItemStack head, CategoryEnum categoryEnum)
  {
    this.player = player;
    this.price = price;
    this.headID = headID;
    this.economy = true;
    this.economyEnum = economyEnum;
    this.head = head;
    this.categoryEnum = categoryEnum;
  }
  
  public PlayerClickHeadEvent(Player player, String headID, ItemStack head, CategoryEnum categoryEnum)
  {
    this.player = player;
    this.headID = headID;
    this.head = head;
    this.categoryEnum = categoryEnum;
  }
  
  public CategoryEnum getCategoryEnum()
  {
    return this.categoryEnum;
  }
  
  public Player getPlayer()
  {
    return this.player;
  }
  
  public double getPrice()
  {
    return this.price;
  }
  
  public String getHeadID()
  {
    return this.headID;
  }
  
  public boolean isEconomy()
  {
    return this.economy;
  }
  
  public EconomyEnum getEconomyEnum()
  {
    return this.economyEnum;
  }
  
  public ItemStack getHead()
  {
    return null;
  }
  
  public boolean isCancelled()
  {
    return this.isCancelled;
  }
  
  public void setCancelled(Boolean b)
  {
    this.isCancelled = b.booleanValue();
  }
  
  public HandlerList getHandlers()
  {
    return handlers;
  }
  
  public static HandlerList getHandlerList()
  {
    return handlers;
  }
}
