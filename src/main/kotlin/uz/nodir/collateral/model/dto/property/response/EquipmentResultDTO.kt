package uz.nodir.collateral.model.dto.property.response

import uz.nodir.collateral.model.enums.CollateralType
import java.time.LocalDate

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:9:01 AM
 */


data class EquipmentResultDTO(

    val serial: String? = null,

    val model: String? = null,

    override val id: Long?,

    override val type: CollateralType?,

    override val description: String?,

    override val price: Long?,

    override val purchaseDate: LocalDate?

    ) : PropertyResponseDTO