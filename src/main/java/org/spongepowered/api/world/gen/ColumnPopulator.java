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

package org.spongepowered.api.world.gen;

import org.spongepowered.api.util.gen.MutableBlockBuffer;
import org.spongepowered.api.world.biome.BiomeType;

/**
 * A populator which acts directly on the {@link MutableBlockBuffer} during the
 * generation phase rather than the population phase. Similar to the
 * GeneratorPopulator however the ColumnPopulator only acts upon a single 1x1
 * column of the chunk.
 */
public interface ColumnPopulator {

    /**
     * Operates on a single 1x1 column of the given {@link MutableBlockBuffer}.
     * The given x,z position is the location of the column relative to the
     * buffer.
     *
     * @param buffer The buffer to apply the changes to. The buffer can be of
     *            any size.
     * @param biome The biome of the targeted column
     * @param x The X position of the column, relative to the buffer
     * @param z The Z position of the column, relative to the buffer
     */
    void populate(MutableBlockBuffer buffer, BiomeType biome, int x, int z);

}
