package uz.nodir.collateral.model.dto.property.response

import jakarta.persistence.Column
import uz.nodir.collateral.model.enums.CollateralType
import java.time.LocalDate

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:9:03 AM
 */
data class VehicleResultDTO(

    val model: String? = null,

    val year: Int? = null,

    override val id: Long?,

    override val type: CollateralType?,

    override val description: String?,

    override val price: Long?,

    override val purchaseDate: LocalDate?,
): PropertyResponseDTO