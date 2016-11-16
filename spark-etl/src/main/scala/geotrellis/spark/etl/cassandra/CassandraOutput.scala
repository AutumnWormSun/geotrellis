/*
 * Copyright 2016 Azavea
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package geotrellis.spark.etl.cassandra

import geotrellis.spark.etl.OutputPlugin
import geotrellis.spark.etl.config.EtlConf
import geotrellis.spark.io.cassandra.CassandraAttributeStore

trait CassandraOutput[K, V, M] extends OutputPlugin[K, V, M] {
  val name = "cassandra"
  
  def attributes(conf: EtlConf) = CassandraAttributeStore(getInstance(conf.outputProfile))
}
