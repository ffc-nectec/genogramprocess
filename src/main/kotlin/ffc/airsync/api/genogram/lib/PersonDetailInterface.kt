/*
 * Copyright (c) 2020 NSTDA
 *   National Science and Technology Development Agency, Thailand
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ffc.airsync.api.genogram.lib

/**
 * สำหรับดึงข้อมูลที่จำเป็นของคน
 */
interface PersonDetailInterface<P> {
    /**
     * พ่อที่ถูกกำหนดใน entity แล้ว
     */
    fun getFatherInRelation(person: P): P?
    fun setFather(person: P, fatherIdCard: String)

    /**
     * แม่ที่ถูกกำหนดใน entity แล้ว
     */
    fun getMotherInRelation(person: P): P?
    fun setMother(person: P, motherIdCard: String)

    /**
     * แฟนที่ถูกกำหนดใน entity แล้ว
     */
    fun getMateInRelation(person: P): List<P>
    fun addMate(person: P, mateIdCard: String)

    fun getIdCard(person: P): String
    fun getFirstName(person: P): String
    fun getLastName(person: P): String
    fun getPcuCode(person: P): String?
    fun getHouseNumber(person: P): String?
    fun getFatherInformationId(person: P): String?
    fun getFatherFirstName(person: P): String?
    fun getFatherLastName(person: P): String?
    fun getMotherInformationId(person: P): String?
    fun getMotherFirstName(person: P): String?
    fun getMotherLastName(person: P): String?
    fun getMateInformationId(person: P): String?
    fun getMateFirstName(person: P): String?
    fun getMateLastName(person: P): String?
    fun getAge(person: P): Int?
    fun getSex(person: P): GENOSEX?
}

enum class GENOSEX { MALE, FEMALE }
