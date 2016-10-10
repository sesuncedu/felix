/*
 * Copyright (c) OSGi Alliance (2016). All Rights Reserved.
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
package org.apache.felix.schematizer.impl;

import java.lang.reflect.Type;
import java.util.Collection;

import org.osgi.converter.TypeReference;

public class CollectionNode
        extends NodeImpl
{
    private final Class<? extends Collection<?>> collectionType;

    public CollectionNode(
            String aName,
            Type aType,
            String anAbsolutePath,
            Class<? extends Collection<?>> aCollectionType ) {
        super( aName, aType, true, anAbsolutePath );
        collectionType = aCollectionType;
    }

    public CollectionNode(
            String aName,
            TypeReference<?> aTypeRef,
            String anAbsolutePath,
            Class<? extends Collection<?>> aCollectionType ) {
        super( aName, aTypeRef, true, anAbsolutePath );
        collectionType = aCollectionType;
    }

    @Override
    public Class<? extends Collection<?>> collectionType() {
        return collectionType;
    }
}
