/*
 * Head Database is a fast and user-friendly plugin to allow thousands of custom heads for Minecraft.
 * Copyright (C) Arcaniax-Development
 * Copyright (C) Arcaniax team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package me.arcaniax.hdb.api;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DatabaseLoadEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private int amount = 0;

    /**
     * Fired after the database is loaded. You must wait for this to be done.
     * Events relying on HeadDatabase must be registered afterwards.
     *
     * @param amount Amount of seconds HeadDatabase took to load
     */
    public DatabaseLoadEvent(int amount) {
        this.amount = amount;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return Amount of seconds HeadDatabase took to load
     */
    public int getAmount() {
        return this.amount;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
