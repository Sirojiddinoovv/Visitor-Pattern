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
 * Time:8:48 AM
 */

data class VehicleParamDTO(

    @JsonProperty(value = "model")
    @field:NotBlank(message = "Model is required")
    val model: String,

    @JsonProperty(value = "year")
    @field:Min(value = 1, message = "Year is required")
    val year: Int,

    override val description: String,

    override val price: Long,

    override val purchaseDate: LocalDate

): PropertyRequestDTO {

    override fun <T> accept(visitor: PropertyToEntityVisitor<T>): T {
        return visitor.visit(this)
    }
}