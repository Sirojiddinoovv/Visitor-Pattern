package uz.nodir.collateral.service.core.persistence

import uz.nodir.collateral.model.entity.Property

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:23 AM
 */

interface PropertyDAO {

    fun save(property: Property): Property

    fun findAll(): List<Property>

    fun findById(id: Long): Property?

    fun deleteById(id: Long)
}