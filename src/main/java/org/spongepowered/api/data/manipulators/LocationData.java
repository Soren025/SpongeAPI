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

package org.spongepowered.api.data.manipulators;

import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.data.DataManipulator;
import org.spongepowered.api.util.RelativePositions;
import org.spongepowered.api.world.Location;

import java.util.EnumSet;

public interface LocationData extends SingleValueData<Location, LocationData> {

    /**
     * Get the location of this entity.
     *
     * @return The location
     */
    Location getLocation();

    /**
     * Sets the location of this entity. This is equivalent to a teleport,
     * and also moves this entity's passengers.
     *
     * @param location The location to set
     * @return True if the teleport was successful
     */
    boolean setLocation(Location location);

    /**
     * Moves the entity to the specified location, and sets the rotation.
     *
     * <p>The format of the rotation is represented by:</p>
     *
     * <ul><code>x -> yaw</code>, <code>y -> pitch</code>, <code>z -> roll
     * </code></ul>
     *
     * @param location The location to set
     * @param rotation The rotation to set
     * @return True if the teleport was successful
     */
    boolean setLocationAndRotation(Location location, Vector3d rotation);

    /**
     * Moves the entity to the specified location, and sets the rotation. {@link RelativePositions}
     * listed inside the EnumSet are considered relative.
     *
     * <p>The format of the rotation is represented by:</p>
     *
     * <ul><code>x -> yaw</code>, <code>y -> pitch</code>, <code>z -> roll
     * </code></ul>
     *
     * @param location The location to set
     * @param rotation The rotation to set
     * @param relativePositions The coordinates to set relatively
     * @return True if the teleport was successful
     */
    boolean setLocationAndRotation(Location location, Vector3d rotation, EnumSet<RelativePositions> relativePositions);

}
