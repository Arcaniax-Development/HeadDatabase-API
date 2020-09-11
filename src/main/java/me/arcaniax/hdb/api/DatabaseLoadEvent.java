package me.arcaniax.hdb.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DatabaseLoadEvent
  extends Event
{
  private static final HandlerList handlers = new HandlerList();
  private int amount = 0;
  
  public DatabaseLoadEvent(int amount)
  {
    this.amount = amount;
  }
  
  public int getAmount()
  {
    return this.amount;
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
