package uz.nodir.collateral.service.business.mapper

import uz.nodir.collateral.model.entity.Equipment
import uz.nodir.collateral.model.entity.RealEstate
import uz.nodir.collateral.model.entity.Vehicle

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:56 AM
 */

interface PropertyVisitor<T> {

    fun visit(property: Equipment): T

    fun visit(property: Vehicle): T

    fun visit(property: RealEstate): T
}