package uz.nodir.collateral.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import uz.nodir.collateral.service.business.mapper.PropertyToDtoVisitor

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:52 AM
 */

@Entity
@Table(name = "real_estate")
data class RealEstate(

    @Column(name = "area")
    val area: Double? = null,

    @Column(name = "address")
    val address: String? = null,
) : Property() {

    override fun <T> accept(visitor: PropertyToDtoVisitor<out T>) =
        visitor.visit(this)

}