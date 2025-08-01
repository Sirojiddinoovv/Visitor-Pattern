package uz.nodir.collateral.model.dto.property.request.param

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import uz.nodir.collateral.model.dto.property.request.PropertyRequestDTO
import uz.nodir.collateral.model.enums.CollateralType
import uz.nodir.collateral.service.business.mapper.PropertyToEntityVisitor
import java.time.LocalDate

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:47 AM
 */

data class RealEstateParamDTO(

    @JsonProperty(value = "area")
    @field:Min(value = 1)
    val area: Double? = null,

    @JsonProperty(value = "address")
    @field:NotBlank(message = "Address is required")
    val address: String? = null,

    override val description: String,

    override val price: Long,

    override val purchaseDate: LocalDate

) : PropertyRequestDTO {

    override fun <T> accept(visitor: PropertyToEntityVisitor<T>): T {
        return visitor.visit(this)
    }
}