package uz.nodir.collateral.model.dto.property.response

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver
import uz.nodir.collateral.model.enums.CollateralType
import uz.nodir.collateral.service.business.converter.CollateralResponseTypeIdResolver
import java.time.LocalDate

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:58 AM
 */

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonTypeIdResolver(value = CollateralResponseTypeIdResolver::class)
interface PropertyResponseDTO {

    val id: Long?

    val type: CollateralType?

    val description: String?

    val price: Long?

    val purchaseDate: LocalDate?
}