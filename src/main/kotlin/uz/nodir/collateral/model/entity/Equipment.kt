package uz.nodir.collateral.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO
import uz.nodir.collateral.service.business.mapper.PropertyToDtoVisitor

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:55 AM
 */

@Entity
@Table(name = "equipment")
data class Equipment(

    @Column(name = "serial")
    val serial: String? = null,

    @Column(name = "model")
    val model: String? = null,
) : Property() {

    override fun <T> accept(visitor: PropertyToDtoVisitor<out T>) {
        visitor.visit(this)
    }
}