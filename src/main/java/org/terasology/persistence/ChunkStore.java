/*
 * Copyright 2013 Moving Blocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.persistence;

import org.terasology.entitySystem.EntityRef;
import org.terasology.math.Vector3i;
import org.terasology.world.chunks.Chunk;

/**
 * A chunk store is used to save a chunk and its entity contents.
 *
 * @author Immortius
 */
public interface ChunkStore {

    /**
     * @return The position of the chunk in its world
     */
    public Vector3i getChunkPosition();

    /**
     * @return The chunk itself
     */
    public Chunk getChunk();

    /**
     * Saves the chunk store, deactivating contained entities
     */
    public void save();

    /**
     * Saves the chunk store
     *
     * @param deactivateEntities Whether the contained entities should be deactivated
     */
    public void save(boolean deactivateEntities);

    /**
     * Stores an entity into this chunk store
     *
     * @param entity
     */
    public void store(EntityRef entity);

    /**
     * Restores all the entities stored with this chunk
     */
    public void restoreEntities();

    void storeAllEntities();
}