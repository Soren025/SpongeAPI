/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api.world.biome;

import org.spongepowered.api.util.annotation.CatalogedBy;
import org.spongepowered.api.world.gen.ColumnPopulator;
import org.spongepowered.api.world.gen.GeneratorPopulator;
import org.spongepowered.api.world.gen.Populator;

import java.util.List;

/**
 * Represents a biome.
 */
@CatalogedBy(BiomeTypes.class)
public interface BiomeType {

    /**
     * Gets the name of this biome type.
     *
     * @return The name of this biome type
     */
    String getName();

    /**
     * Get the temperature of this biome.
     *
     * @return The temperature
     */
    double getTemperature();

    /**
     * Get the humidity of this biome.
     *
     * @return The humidity
     */
    double getHumidity();

    /**
     * Get the minimum terrain height of this biome.
     *
     * @return The min height
     */
    float getMinHeight();

    /**
     * Get the maximum terrain height of this biome.
     *
     * @return The max height
     */
    float getMaxHeight();

    /**
     * Gets the {@link ColumnPopulator} for this biome. The column populator
     * replaces the base terrain
     * 
     * @return The column populator
     */
    ColumnPopulator getColumnPopulator();

    /**
     * Gets a mutable list of {@link GeneratorPopulator}s. These populators work
     * strictly on a single chunk. They will be executed directly after the
     * {@link #getColumnPopulator() column populator} is called. These generator
     * populators are typically used to generate large terrain features, like
     * caves and ravines.
     *
     * @return The generator populators
     */
    List<GeneratorPopulator> getGeneratorPopulators();

    /**
     * Returns a mutable list of {@link Populator}s specific to this biome.
     * Changing this list will affect population of all new chunks.
     *
     * @return The populators
     */
    List<Populator> getPopulators();

}
