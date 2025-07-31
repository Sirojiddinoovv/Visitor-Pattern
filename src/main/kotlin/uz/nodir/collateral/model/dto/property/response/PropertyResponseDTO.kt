package uz.nodir.collateral.model.dto.property.response

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver
import jakarta.persistence.Column
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import uz.nodir.collateral.model.entity.Vehicle
import uz.nodir.collateral.model.enums.CollateralType
import uz.nodir.collateral.service.business.converter.CollateralTypeIdResolver
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
@JsonTypeIdResolver(value = CollateralTypeIdResolver::class)
interface PropertyResponseDTO {

    val id: Long?

    val type: CollateralType?

    val description: String?

    val price: Long?

    val purchaseDate: LocalDate?
}