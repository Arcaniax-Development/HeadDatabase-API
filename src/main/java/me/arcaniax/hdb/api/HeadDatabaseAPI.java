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
import me.arcaniax.hdb.object.head.Head;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HeadDatabaseAPI {

    private String prefix = "api";

    /**
     * The prefix ID
     *
     * @param prefix Prefix ID
     */
    public void setPrefixID(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Whether or not a head is a head
     *
     * @param ID String ID
     * @return false
     */
    public boolean isHead(String ID) {
        return false;
    }

    /**
     * Get an Item has head
     *
     * @param ID String ID
     * @return null
     */
    public ItemStack getItemHead(String ID) {
        return null;
    }

    /**
     * Get an Item ID
     *
     * @param is ItemStack
     * @return null
     */
    public String getItemID(ItemStack is) {
        return null;
    }

    /**
     * @param category {@link CategoryEnum}
     * @param head     Head
     * @return false
     */
    public boolean addHead(CategoryEnum category, Head head) {
        return false;
    }

    /**
     * @param category {@link CategoryEnum}
     * @return The heads as ArrayList
     */
    public List<Head> getHeads(CategoryEnum category) {
        return new ArrayList();
    }

    /**
     * Get a random head
     *
     * @return null
     */
    public ItemStack getRandomHead() {
        return null;
    }

    /**
     * @param id String
     * @return null
     */
    public CategoryEnum getCategory(String id) {
        return null;
    }

    /**
     * @param block The block
     * @param ID    String ID
     * @return false
     */
    public boolean setBlockSkin(Block block, String ID) {
        return false;
    }

    /**
     * @param category {@link CategoryEnum}
     * @param name     String name
     * @param uuid     head uuid
     * @return null
     */
    public String addHead(CategoryEnum category, String name, UUID uuid) {
        return null;
    }

    /**
     * @param category {@link CategoryEnum}
     * @param name     head name
     * @param base64   the head base64 code
     * @return null
     */
    public String addHead(CategoryEnum category, String name, String base64) {
        return null;
    }

    /**
     * @param id the head id
     * @return false
     */
    public boolean removeHead(String id) {
        return false;
    }
}
