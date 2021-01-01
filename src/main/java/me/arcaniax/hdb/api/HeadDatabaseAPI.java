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
package me.arcaniax.hdb.api;

import me.arcaniax.hdb.enums.CategoryEnum;
import me.arcaniax.hdb.object.head.Head;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;	
import java.util.List;	
import java.util.UUID;

public class HeadDatabaseAPI {

    /**
     * Sets the prefix ID to be used by the API for added heads
     *
     * @param prefix The prefix to use
     */
    public void setPrefixID(String prefix) {}

    /**
     * Checks whether or not a head exists with the given ID
     *
     * @param ID The ID to check
     * @return true if a head exists with the given ID, otherwise false
     */
    public boolean isHead(String ID) {
        return false;
    }

    /**
     * Checks if a Block is a decorative (non-player) head
     *
     * @param block The block to check
     * @return true if the block is a decorative head, otherwise false
     */
    public boolean isDecorativeHead(Block block) {
        return false;
    }

    /**
     * Checks if an ItemStack is a decorative (non-player) head
     *
     * @param itemStack The item to check
     * @return true if the item is a decorative head, otherwise false
     */
    public boolean isDecorativeHead(ItemStack itemStack) {
        return false;
    }

    /**
     * Gets an ItemStack of a head with the given ID
     *
     * @param id The ID of the head to get
     * @return An ItemStack of a head with the given ID, or null if one does not exist
     */
    public ItemStack getItemHead(String id) {
        return null;
    }

    /**
     * Gets an ItemStack of a head from a player skull Block
     *
     * @param block The ID of the head to get
     * @return An ItemStack of a head from the given block, or null if the block is not a head
     */
    public ItemStack getItemHead(Block block) {
        return null;
    }

    /**
     * Gets the head ID of an ItemStack
     *
     * @param itemStack The item to get the ID from
     * @return The head ID of the item, or null if the item is not a head or is not in the database
     */
    public String getItemID(ItemStack itemStack) {
        return null;
    }

    /**
     * Gets the head ID of a Block
     *
     * @param block The block to get the ID from
     * @return The head ID of the block, or null if the block is not a head or is not in the database
     */
    public String getBlockID(Block block) {
        return null;
    }

    /**
     * Gets the base64 string from a head ID
     *
     * @param id The ID of the head
     * @return The base64 String from a head ID, or null if one does not exist
     */
    public String getBase64(String id) {
        return null;
    }

    /**
     * Gets the base64 String from an ItemStack
     *
     * @param itemStack The ItemStack
     * @return The base64 String from an ItemStack, or null if one does not exist
     */
    public String getBase64(ItemStack itemStack) {
        return null;
    }

    /**
     * Gets the base64 String from a Block
     *
     * @param block The Block to get the base64 string from
     * @return The base64 String from the Block, or null if the block is not a head or does not have a base64 String
     */
    public String getBase64(Block block) {
        return null;
    }

    /**
     * Adds a new Head to the database
     *
     * @param category The category to add the head to
     * @param head     The head to add
     * @return true if the head was successfully added, otherwise false
     */
    public boolean addHead(CategoryEnum category, Head head) {
        return false;
    }

    /**
     * Gets a List of all Heads in a given category in the database
     *
     * @param category The category to check
     * @return A list of heads in the given category, or an empty list if none
     */
    public List<Head> getHeads(CategoryEnum category) {
        return new ArrayList<>();
    }

    /**
     * @return a random head from the database as an ItemStack
     */
    public ItemStack getRandomHead() {
        return null;
    }

    /**
     * Gets the Category that a head ID is part of
     *
     * @param id The ID of the head
     * @return The category that the head ID belongs to, or null if not found
     */
    public CategoryEnum getCategory(String id) {
        return null;
    }

    /**
     * Sets the texture of a player head block to the given head ID
     *
     * @param block The block to set the texture of
     * @param id    The ID of the head to set the texture to
     * @return true if the block texture was successfully applied, otherwise false
     */
    public boolean setBlockSkin(Block block, String id) {
        return false;
    }

    /**
     * Adds a head to the database
     *
     * @param category The category to add to
     * @param name     The name of the head
     * @param uuid     The UUID owner of the head
     * @return The ID of the head that was added, or null if unable to add
     */
    public String addHead(CategoryEnum category, String name, UUID uuid) {
        return null;
    }

    /**
     * Adds a head to the database
     *
     * @param category The category to add to
     * @param name     The name of the head
     * @param base64   The base64 texture string of the head
     * @return The ID of the head that was added, or null if unable to add
     */
    public String addHead(CategoryEnum category, String name, String base64) {
        return null;
    }

    /**
     * Removes a head from the database
     *
     * @param id The ID of the head to remove
     * @return true if the head was removed, or false if a head with the ID was not found
     */
    public boolean removeHead(String id) {
        return false;
    }

}
