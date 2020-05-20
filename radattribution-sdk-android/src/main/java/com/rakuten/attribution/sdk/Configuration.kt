package com.rakuten.attribution.sdk

/**
 * A type that provides an ability to configure SDK
 *
 * @property appId android application id
 * @property privateKey RS256 private to sign requests
 * @property isManualAppLaunch if application opened from link with the associated domain - `false`,
 * @property endpointUrl url which sdk will send analytics to,
 * otherwise `true`
 */
data class Configuration(
    val appId: String,
    val privateKey: String,
    val isManualAppLaunch: Boolean,
    val endpointUrl: String
)