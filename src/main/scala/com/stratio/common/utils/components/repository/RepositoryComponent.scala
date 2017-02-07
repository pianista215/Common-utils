/*
 * Copyright (C) 2015 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.common.utils.components.repository

import scala.util.Try

trait RepositoryComponent[K, V] {

  val repository: Repository

  trait Repository {

    def get(entity: String, id: K): Try[Option[V]]

    def getAll(entity: String): Try[Seq[V]]

    def getNodes(entity: String): Try[Seq[K]]

    def count(entity: String): Try[Long]

    def exists(entity: String, id: K): Try[Boolean]

    def create(entity: String, id: K, element: V): Try[V]

    def upsert(entity: String, id: K, element: V): Try[V]

    def update(entity: String, id: K, element: V): Try[Unit]

    def delete(entity: String, id: K): Try[Unit]

    def deleteAll(entity: String): Try[Unit]
  }
}
