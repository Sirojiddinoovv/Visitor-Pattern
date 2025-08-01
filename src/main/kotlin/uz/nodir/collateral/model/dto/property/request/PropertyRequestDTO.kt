package uz.nodir.collateral.model.dto.property.request

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import org.jetbrains.annotations.NotNull
import uz.nodir.collateral.model.enums.CollateralType
import uz.nodir.collateral.service.business.converter.CollateralRequestTypeIdResolver
import java.time.LocalDate

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:43 AM
 */

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonTypeIdResolver(value = CollateralRequestTypeIdResolver::class)
interface PropertyRequestDTO {

    @get:JsonProperty("id")
    @get:Min(value = 1L)
    val id: Long

    @get:JsonProperty("type")
    @get:NotNull
    val type: CollateralType?

    @get:JsonProperty("description")
    @get:NotBlank
    val description: String?

    @get:JsonProperty("price")
    @get:Min(value = 1L)
    val price: Long

    @get:JsonProperty("purchaseDate")
    @get:NotNull
    val purchaseDate: LocalDate?
}