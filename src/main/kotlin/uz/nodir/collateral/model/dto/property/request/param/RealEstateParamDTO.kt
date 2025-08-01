package uz.nodir.collateral.model.dto.property.request.param

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import uz.nodir.collateral.model.dto.property.request.PropertyRequestDTO
import uz.nodir.collateral.model.enums.CollateralType
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
    val area: Double,

    @JsonProperty(value = "address")
    @field:NotBlank(message = "Address is required")
    val address: String,

    override val id: Long,

    override val type: CollateralType,

    override val description: String,

    override val price: Long,

    override val purchaseDate: LocalDate

) : PropertyRequestDTO