package com.ibrahim.bigdata.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.ibrahim.bigdata.converters.TypeConverter


//This data class is used to represent the response from the ExchangeRate API.
@Entity(tableName = "exchange_rate_response")
@TypeConverters(TypeConverter::class)
data class ExchangeRateResponse(
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "result")
    @SerializedName("result")
    val result: String?,
    @ColumnInfo(name = "documentation")
    @SerializedName("documentation")
    val documentation: String?,
    @ColumnInfo(name = "terms_of_use")
    @SerializedName("terms_of_use")
    val termsOfUse: String?,
    @ColumnInfo(name = "time_last_update_unix")
    @SerializedName("time_last_update_unix")
    val timeLastUpdateUnix: Long?,
    @ColumnInfo(name = "time_last_update_utc")
    @SerializedName("time_last_update_utc")
    val timeLastUpdateUtc: String?,
    @ColumnInfo(name = "time_next_update_unix")
    @SerializedName("time_next_update_unix")
    val timeNextUpdateUnix: Long?,
    @ColumnInfo(name = "time_next_update_utc")
    @SerializedName("time_next_update_utc")
    val timeNextUpdateUtc: String?,
    @ColumnInfo(name = "base_code")
    @SerializedName("base_code")
    val baseCode: String?,
    @ColumnInfo(name = "conversion_rates")
    @SerializedName("conversion_rates")
    val conversionRates: Map<String, Double>?
)