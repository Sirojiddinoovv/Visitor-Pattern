package uz.nodir.collateral.model.dto.property.request.param

import com.fasterxml.jackson.annotation.JsonProperty
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

data class EquipmentParamDTO(
    @JsonProperty(value = "serial")
    @field:NotBlank(message = "Serial is required")
    val serial: String,

    @JsonProperty(value = "model")
    @field:NotBlank(message = "Model is required")
    val model: String? = null,

    override val description: String,

    override val price: Long,

    override val purchaseDate: LocalDate

): PropertyRequestDTO {

    override fun <T> accept(visitor: PropertyToEntityVisitor<T>): T {
        return visitor.visit(this)
    }
}