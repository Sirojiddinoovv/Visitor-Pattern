package uz.nodir.collateral.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import uz.nodir.collateral.model.entity.Property

/**
 * Author:Nodir
 * User:smart
 * Date:8/1/2025
 * Time:8:24 AM
 */

@Repository
interface PropertyRepository : JpaRepository<Property, Long>