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
package me.arcaniax.hdb.object.head;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class VanillaHead extends Head {

    Material material;
    short data = -1;

    /**
     * @return the head from an ItemStack
     */
    public ItemStack getHead() {
        return null;
    }

}
