/*
 * Copyright (C) 2021 AOSP-Krypton Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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

package com.krypton.updater.model.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Fts4
import androidx.room.Ignore
import androidx.room.PrimaryKey

import java.util.Date

@Fts4
@Entity(tableName = DatabaseDetails.CHANGELOG_TABLE_NAME)
class ChangelogEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "rowid")
    @Ignore
    var rowId: Int = 0

    lateinit var date: Date

    lateinit var sha: String

    // TODO : remove this annotation once everything is in kotlin
    @JvmField
    var changelog: String? = null
}
