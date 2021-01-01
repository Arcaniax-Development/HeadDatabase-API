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
 *                           Copyright (C) 2021 Arcaniax
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
package me.arcaniax.hdb.object.head;

import me.arcaniax.hdb.enums.CategoryEnum;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collection;

public class Head {
    public String b64;
    public String name;
    public String lore;
    public String id;
    public String uuid;
    public CategoryEnum c;
    public boolean recent = false;
    public Collection<String> tags = new ArrayList();
    public boolean isCustom = false;
    long ID = 0L;
    long number = 0L;
    private double price = -1.0D;

    /**
     * @return The head price
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * @param price Set the price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @param input The search string
     * @return The search output
     */
    public boolean search(String input) {
        return false;
    }

    /**
     * @return Head
     */
    public ItemStack getHead() {
        return null;
    }
}
