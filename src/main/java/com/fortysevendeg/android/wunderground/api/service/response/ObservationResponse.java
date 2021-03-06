/*
 *
 *  * Copyright (C) 2012 47 Degrees, LLC
 *  * http://47deg.com
 *  * hello@47deg.com
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.fortysevendeg.android.wunderground.api.service.response;

import it.restrung.rest.annotations.JsonProperty;
import it.restrung.rest.marshalling.response.AbstractJSONResponse;

import java.io.Serializable;

/**
 * ObservationResponse class
 *
 * http://www.wunderground.com/weather/api/d/docs?d=data/conditions
 *
 * Returns the current temperature, weather condition, humidity, wind, 'feels like' temperature, barometric pressure, and visibility
 *
 */
public class ObservationResponse extends AbstractJSONResponse implements Serializable {

    private ImageResponse image;

    @JsonProperty("display_location")
    private LocationResponse displayLocation;

    @JsonProperty("observation_location")
    private LocationResponse observationLocation;

    private String estimated;

    @JsonProperty("station_id")
    private String stationId;

    @JsonProperty("observation_time")
    private String observationTime;

    @JsonProperty("observation_time_rfc822")
    private String observationTimeRfc822;

    @JsonProperty("observation_epoch")
    private String observationEpoch;

    @JsonProperty("local_time_rfc822")
    private String localTimeRfc822;

    @JsonProperty("local_epoch")
    private String localEpoch;

    @JsonProperty("local_tz_short")
    private String localTzShort;

    @JsonProperty("local_tz_long")
    private String localTzLong;

    @JsonProperty("local_tz_offset")
    private String localTzOffset;

    private String weather;

    @JsonProperty("temperature_string")
    private String temperatureString;

    @JsonProperty("temp_f")
    private Double tempF;

    @JsonProperty("temp_c")
    private Double tempC;

    @JsonProperty("relative_humidity")
    private String relativeHumidity;

    @JsonProperty("wind_string")
    private String windString;

    @JsonProperty("wind_dir")
    private String windDir;

    @JsonProperty("wind_degrees")
    private Double windDegrees;

    @JsonProperty("wind_mph")
    private Double windMph;

    @JsonProperty("wind_gust_mph")
    private Double windGustMph;

    @JsonProperty("wind_kph")
    private Double windKph;

    @JsonProperty("wind_gust_kph")
    private Double windGustKph;

    @JsonProperty("pressure_mb")
    private Double pressureMb;

    @JsonProperty("pressure_in")
    private Double pressureIn;

    @JsonProperty("pressure_trend")
    private String pressureTrend;

    @JsonProperty("dewpoint_string")
    private String dewPointString;

    @JsonProperty("dewpoint_f")
    private Double dewPointF;

    @JsonProperty("dewpoint_c")
    private Double dewPointC;

    @JsonProperty("heat_index_string")
    private String heatIndexString;

    @JsonProperty("heat_index_f")
    private String heatIndexF;

    @JsonProperty("heat_index_c")
    private String heatIndexC;

    @JsonProperty("windchill_string")
    private String windChillString;

    @JsonProperty("windchill_f")
    private String windChillF;

    @JsonProperty("windchill_c")
    private String windChillC;

    @JsonProperty("feelslike_string")
    private String feelsLikeString;

    @JsonProperty("feelslike_f")
    private Double feelsLikeF;

    @JsonProperty("feelslike_c")
    private Double feelsLikeC;

    @JsonProperty("visibility_mi")
    private Double visibilityMi;

    @JsonProperty("visibility_km")
    private Double visibilityKm;

    @JsonProperty("solarradiation")
    private String solarRadiation;

    private Double uV;

    @JsonProperty("precip_1hr_string")
    private String precip1hrString;

    @JsonProperty("precip_1hr_in")
    private String precip1hrIn;

    @JsonProperty("precip_1hr_metric")
    private String precip1hrMetric;

    @JsonProperty("precip_today_string")
    private String precipTodayString;

    @JsonProperty("precip_today_in")
    private String precipTodayIn;

    @JsonProperty("precip_today_metric")
    private String precipTodayMetric;

    private String icon;

    @JsonProperty("icon_url")
    private String iconUrl;

    @JsonProperty("forecast_url")
    private String forecastUrl;

    @JsonProperty("history_url")
    private String historyUrl;

    @JsonProperty("ob_url")
    private String obUrl;

    public ImageResponse getImage() {
        return image;
    }

    public void setImage(ImageResponse image) {
        this.image = image;
    }

    public LocationResponse getDisplayLocation() {
        return displayLocation;
    }

    public void setDisplayLocation(LocationResponse displayLocation) {
        this.displayLocation = displayLocation;
    }

    public LocationResponse getObservationLocation() {
        return observationLocation;
    }

    public void setObservationLocation(LocationResponse observationLocation) {
        this.observationLocation = observationLocation;
    }

    public String getEstimated() {
        return estimated;
    }

    public void setEstimated(String estimated) {
        this.estimated = estimated;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getObservationTimeRfc822() {
        return observationTimeRfc822;
    }

    public void setObservationTimeRfc822(String observationTimeRfc822) {
        this.observationTimeRfc822 = observationTimeRfc822;
    }

    public String getObservationEpoch() {
        return observationEpoch;
    }

    public void setObservationEpoch(String observationEpoch) {
        this.observationEpoch = observationEpoch;
    }

    public String getLocalTimeRfc822() {
        return localTimeRfc822;
    }

    public void setLocalTimeRfc822(String localTimeRfc822) {
        this.localTimeRfc822 = localTimeRfc822;
    }

    public String getLocalEpoch() {
        return localEpoch;
    }

    public void setLocalEpoch(String localEpoch) {
        this.localEpoch = localEpoch;
    }

    public String getLocalTzShort() {
        return localTzShort;
    }

    public void setLocalTzShort(String localTzShort) {
        this.localTzShort = localTzShort;
    }

    public String getLocalTzLong() {
        return localTzLong;
    }

    public void setLocalTzLong(String localTzLong) {
        this.localTzLong = localTzLong;
    }

    public String getLocalTzOffset() {
        return localTzOffset;
    }

    public void setLocalTzOffset(String localTzOffset) {
        this.localTzOffset = localTzOffset;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperatureString() {
        return temperatureString;
    }

    public void setTemperatureString(String temperatureString) {
        this.temperatureString = temperatureString;
    }

    public Double getTempF() {
        return tempF;
    }

    public void setTempF(Double tempF) {
        this.tempF = tempF;
    }

    public Double getTempC() {
        return tempC;
    }

    public void setTempC(Double tempC) {
        this.tempC = tempC;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(String relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public String getWindString() {
        return windString;
    }

    public void setWindString(String windString) {
        this.windString = windString;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Double getWindDegrees() {
        return windDegrees;
    }

    public void setWindDegrees(Double windDegrees) {
        this.windDegrees = windDegrees;
    }

    public Double getWindMph() {
        return windMph;
    }

    public void setWindMph(Double windMph) {
        this.windMph = windMph;
    }

    public Double getWindGustMph() {
        return windGustMph;
    }

    public void setWindGustMph(Double windGustMph) {
        this.windGustMph = windGustMph;
    }

    public Double getWindKph() {
        return windKph;
    }

    public void setWindKph(Double windKph) {
        this.windKph = windKph;
    }

    public Double getWindGustKph() {
        return windGustKph;
    }

    public void setWindGustKph(Double windGustKph) {
        this.windGustKph = windGustKph;
    }

    public Double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(Double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public Double getPressureIn() {
        return pressureIn;
    }

    public void setPressureIn(Double pressureIn) {
        this.pressureIn = pressureIn;
    }

    public String getPressureTrend() {
        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {
        this.pressureTrend = pressureTrend;
    }

    public String getDewPointString() {
        return dewPointString;
    }

    public void setDewPointString(String dewPointString) {
        this.dewPointString = dewPointString;
    }

    public Double getDewPointF() {
        return dewPointF;
    }

    public void setDewPointF(Double dewPointF) {
        this.dewPointF = dewPointF;
    }

    public Double getDewPointC() {
        return dewPointC;
    }

    public void setDewPointC(Double dewPointC) {
        this.dewPointC = dewPointC;
    }

    public String getHeatIndexString() {
        return heatIndexString;
    }

    public void setHeatIndexString(String heatIndexString) {
        this.heatIndexString = heatIndexString;
    }

    public String getHeatIndexF() {
        return heatIndexF;
    }

    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    public String getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public String getWindChillString() {
        return windChillString;
    }

    public void setWindChillString(String windChillString) {
        this.windChillString = windChillString;
    }

    public String getWindChillF() {
        return windChillF;
    }

    public void setWindChillF(String windChillF) {
        this.windChillF = windChillF;
    }

    public String getWindChillC() {
        return windChillC;
    }

    public void setWindChillC(String windChillC) {
        this.windChillC = windChillC;
    }

    public String getFeelsLikeString() {
        return feelsLikeString;
    }

    public void setFeelsLikeString(String feelsLikeString) {
        this.feelsLikeString = feelsLikeString;
    }

    public Double getFeelsLikeF() {
        return feelsLikeF;
    }

    public void setFeelsLikeF(Double feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    public Double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(Double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public Double getVisibilityMi() {
        return visibilityMi;
    }

    public void setVisibilityMi(Double visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public Double getVisibilityKm() {
        return visibilityKm;
    }

    public void setVisibilityKm(Double visibilityKm) {
        this.visibilityKm = visibilityKm;
    }

    public String getSolarRadiation() {
        return solarRadiation;
    }

    public void setSolarRadiation(String solarRadiation) {
        this.solarRadiation = solarRadiation;
    }

    public Double getuV() {
        return uV;
    }

    public void setuV(Double uV) {
        this.uV = uV;
    }

    public String getPrecip1hrString() {
        return precip1hrString;
    }

    public void setPrecip1hrString(String precip1hrString) {
        this.precip1hrString = precip1hrString;
    }

    public String getPrecip1hrIn() {
        return precip1hrIn;
    }

    public void setPrecip1hrIn(String precip1hrIn) {
        this.precip1hrIn = precip1hrIn;
    }

    public String getPrecip1hrMetric() {
        return precip1hrMetric;
    }

    public void setPrecip1hrMetric(String precip1hrMetric) {
        this.precip1hrMetric = precip1hrMetric;
    }

    public String getPrecipTodayString() {
        return precipTodayString;
    }

    public void setPrecipTodayString(String precipTodayString) {
        this.precipTodayString = precipTodayString;
    }

    public String getPrecipTodayIn() {
        return precipTodayIn;
    }

    public void setPrecipTodayIn(String precipTodayIn) {
        this.precipTodayIn = precipTodayIn;
    }

    public String getPrecipTodayMetric() {
        return precipTodayMetric;
    }

    public void setPrecipTodayMetric(String precipTodayMetric) {
        this.precipTodayMetric = precipTodayMetric;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getForecastUrl() {
        return forecastUrl;
    }

    public void setForecastUrl(String forecastUrl) {
        this.forecastUrl = forecastUrl;
    }

    public String getHistoryUrl() {
        return historyUrl;
    }

    public void setHistoryUrl(String historyUrl) {
        this.historyUrl = historyUrl;
    }

    public String getObUrl() {
        return obUrl;
    }

    public void setObUrl(String obUrl) {
        this.obUrl = obUrl;
    }
}
