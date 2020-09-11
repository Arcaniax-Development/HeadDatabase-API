/*
 *  _    _                _ _____        _        _                                  _____ _____
 * | |  | |              | |  __ \      | |      | |                           /\   |  __ \_   _|
 * | |__| | ___  __ _  __| | |  | | __ _| |_ __ _| |__   __ _ ___  ___ ______ /  \  | |__) || |
 * |  __  |/ _ \/ _` |/ _` | |  | |/ _` | __/ _` | '_ \ / _` / __|/ _ \______/ /\ \ |  ___/ | |
 * | |  | |  __/ (_| | (_| | |__| | (_| | || (_| | |_) | (_| \__ \  __/     / ____ \| |    _| |_
 * |_|  |_|\___|\__,_|\__,_|_____/ \__,_|\__\__,_|_.__/ \__,_|___/\___|    /_/    \_\_|   |_____|
 *
 *    Head Database is a fast and user-friendly plugin that allows you to obtain thousands
 *                of custom Minecraft skulls that feature unique designs.
 *                           Copyright (C) 2020 Arcaniax
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.arcaniax.hdb.api;

import me.arcaniax.hdb.enums.CategoryEnum;
import me.arcaniax.hdb.enums.EconomyEnum;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class PlayerClickHeadEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final CategoryEnum categoryEnum;
    private final ItemStack head;
    private double price = 0.0D;
    private String headID = "";
    private boolean economy = false;
    private EconomyEnum economyEnum = EconomyEnum.CURRENCY;
    private boolean isCancelled = false;

    public PlayerClickHeadEvent(Player player, double price, String headID, EconomyEnum economyEnum, ItemStack head, CategoryEnum categoryEnum) {
        this.player = player;
        this.price = price;
        this.headID = headID;
        this.economy = true;
        this.economyEnum = economyEnum;
        this.head = head;
        this.categoryEnum = categoryEnum;
    }

    public PlayerClickHeadEvent(Player player, String headID, ItemStack head, CategoryEnum categoryEnum) {
        this.player = player;
        this.headID = headID;
        this.head = head;
        this.categoryEnum = categoryEnum;
    }

    /**
     * @return handlers
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return {@link CategoryEnum}
     */
    public CategoryEnum getCategoryEnum() {
        return this.categoryEnum;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * @return the head price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * @return the headID
     */
    public String getHeadID() {
        return this.headID;
    }

    /**
     * @return whether or not economy is in use
     */
    public boolean isEconomy() {
        return this.economy;
    }

    /**
     * @return {@link EconomyEnum}
     */
    public EconomyEnum getEconomyEnum() {
        return this.economyEnum;
    }

    /**
     * @return null
     */
    public ItemStack getHead() {
        return null;
    }

    /**
     * @return Whether or not something is cancelled
     */
    public boolean isCancelled() {
        return this.isCancelled;
    }

    /**
     * @param b cancel
     */
    public void setCancelled(Boolean b) {
        this.isCancelled = b;
    }

    /**
     * @return HDB Handlers
     */
    public HandlerList getHandlers() {
        return handlers;
    }
}
