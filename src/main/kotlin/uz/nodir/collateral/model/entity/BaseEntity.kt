package uz.nodir.collateral.model.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import uz.nodir.collateral.utils.DateUtils
import java.time.LocalDate
import java.time.LocalDateTime

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:39 AM
 */

@MappedSuperclass
abstract class BaseEntity(
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    var createdAt: LocalDateTime = DateUtils.dateTimeNow(),

    @LastModifiedDate
    @Column(name = "updated_at", insertable = false)
    var updatedAt: LocalDateTime? = DateUtils.dateTimeNow(),

    @Column(name = "created_date")
    var createdDate: LocalDate? = DateUtils.dateNow(),
) {
}