package uz.nodir.collateral.utils

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * Author:Nodir
 * User:smart
 * Date:7/31/2025
 * Time:8:41 AM
 */
object DateUtils {

    fun dateTimeNow(): LocalDateTime {
        return LocalDateTime.now(
            ZoneId.of("Asia/Tashkent")
        )
    }

    fun dateNow(): LocalDate {
        return LocalDate.now(
            ZoneId.of("Asia/Tashkent")
        )
    }
}