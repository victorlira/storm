/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.storm.druid.bolt;

import com.metamx.tranquility.beam.Beam;
import org.apache.storm.task.IMetricsContext;

import java.io.Serializable;
import java.util.Map;

/**
 * Factory to create Druid Beams.
 * @deprecated the preferred way to ingest streaming events to druid is through Kafka, as such storm-druid
 * is deprecated and will be removed in 2.x releases of storm.
 */
@Deprecated
public interface DruidBeamFactory<E>  extends  Serializable {
    public Beam<E> makeBeam(Map<?,?> conf, IMetricsContext metrics);
}