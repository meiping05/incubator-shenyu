/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.agent.core.bytebuddy;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.utility.JavaModule;

/**
 * TransformListener.
 */
public class TransformListener implements AgentBuilder.Listener {
    @Override
    public void onDiscovery(final String typeName, final ClassLoader classLoader,
                            final JavaModule module, final boolean loaded) {
    }

    @Override
    public void onTransformation(final TypeDescription typeDescription, final ClassLoader classLoader,
                                 final JavaModule module, final boolean loaded, final DynamicType dynamicType) {
    }

    @Override
    public void onIgnored(final TypeDescription typeDescription, final ClassLoader classLoader,
                          final JavaModule module, final boolean loaded) {
    }

    @Override
    public void onError(final String typeName, final ClassLoader classLoader, final JavaModule module,
                        final boolean loaded, final Throwable throwable) {
    }

    @Override
    public void onComplete(final String typeName, final ClassLoader classLoader,
                           final JavaModule module, final boolean loaded) {
    }
}
