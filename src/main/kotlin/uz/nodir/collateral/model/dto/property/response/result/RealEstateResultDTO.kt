package uz.nodir.collateral.model.dto.property.response.result

import uz.nodir.collateral.model.dto.property.response.PropertyResponseDTO
import uz.nodir.collateral.model.enums.CollateralType
import java.time.LocalDate

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:9:00 AM
 */

data class RealEstateResultDTO(
    override val id: Long?,

    override val type: CollateralType?,

    override val description: String?,

    override val price: Long?,

    override val purchaseDate: LocalDate?,

    val area: Double? = null,

    val address: String? = null

) : PropertyResponseDTO