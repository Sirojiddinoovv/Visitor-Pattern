package uz.nodir.collateral.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:54 AM
 */

@Entity
@Table(name = "vehicle")
data class Vehicle(

    @Column(name = "model")
    var model: String? = null,

    @Column(name = "year")
    var year: Int? = null,
) : Property()