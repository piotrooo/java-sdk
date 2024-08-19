/*
 * OpenFGA
 * A high performance and flexible authorization/permission engine built for developers and inspired by Google Zanzibar.
 *
 * The version of the OpenAPI document: 1.x
 * Contact: community@openfga.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package dev.openfga.sdk.api.configuration;

import java.net.http.HttpClient;
import java.net.http.HttpConnectTimeoutException;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Map;

/**
 * Configuration overrides for an api client. Values are initialized to null, and any values unset are intended to fall
 * through to the values of a {@link Configuration}.
 * <p>
 * More details on intended usage of this class can be found in the documentation of the {@link Configuration#override(ConfigurationOverride)} method.
 */
public class ConfigurationOverride implements BaseConfiguration {
    private String apiUrl;
    private Credentials credentials;
    private String userAgent;
    private Duration readTimeout;
    private Duration connectTimeout;
    private Integer maxRetries;
    private Duration minimumRetryDelay;
    private Map<String, String> additionalHeaders;
    private TelemetryConfiguration telemetryConfiguration;

    public ConfigurationOverride() {
        this.apiUrl = null;
        this.credentials = null;
        this.userAgent = null;
        this.readTimeout = null;
        this.connectTimeout = null;
        this.additionalHeaders = null;
        this.telemetryConfiguration = null;
    }

    /**
     * Set the API URL for the http client.
     *
     * @param apiUrl The URL.
     * @return This object.
     */
    public ConfigurationOverride apiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
        return this;
    }

    /**
     * Get the API URL that was set.
     *
     * @return The url.
     */
    @Override
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * Set the credentials.
     *
     * @param credentials The credentials.
     * @return This object.
     */
    public ConfigurationOverride credentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the configured credentials.
     *
     * @return The credentials.
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Set the user agent.
     *
     * @param userAgent The user agent.
     * @return This object.
     */
    public ConfigurationOverride userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * Get the user agent.
     *
     * @return The user agent.
     */
    @Override
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Set the read timeout for the http client.
     *
     * <p>This is the value used by default for each request, though it can be
     * overridden on a per-request basis with a request interceptor.</p>
     *
     * @param readTimeout The read timeout used by default by the http client.
     *                    Setting this value to null resets the timeout to an
     *                    effectively infinite value.
     * @return This object.
     */
    public ConfigurationOverride readTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Get the read timeout that was set.
     *
     * @return The read timeout, or null if no timeout was set. Null represents
     * an infinite wait time.
     */
    @Override
    public Duration getReadTimeout() {
        return readTimeout;
    }

    /**
     * Sets the connect timeout (in milliseconds) for the http client.
     *
     * <p> In the case where a new connection needs to be established, if
     * the connection cannot be established within the given {@code
     * duration}, then {@link HttpClient#send(HttpRequest, BodyHandler)
     * HttpClient::send} throws an {@link HttpConnectTimeoutException}, or
     * {@link HttpClient#sendAsync(HttpRequest, BodyHandler)
     * HttpClient::sendAsync} completes exceptionally with an
     * {@code HttpConnectTimeoutException}. If a new connection does not
     * need to be established, for example if a connection can be reused
     * from a previous request, then this timeout duration has no effect.
     *
     * @param connectTimeout connection timeout in milliseconds
     * @return This object.
     */
    public ConfigurationOverride connectTimeout(Duration connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Get connection timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    @Override
    public Duration getConnectTimeout() {
        return connectTimeout;
    }

    public ConfigurationOverride maxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    @Override
    public Integer getMaxRetries() {
        return maxRetries;
    }

    public ConfigurationOverride minimumRetryDelay(Duration minimumRetryDelay) {
        this.minimumRetryDelay = minimumRetryDelay;
        return this;
    }

    @Override
    public Duration getMinimumRetryDelay() {
        return minimumRetryDelay;
    }

    public ConfigurationOverride additionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    public ConfigurationOverride addHeaders(AdditionalHeadersSupplier supplier) {
        if (supplier == null || supplier.getAdditionalHeaders() == null) {
            // No headers to add.
            return this;
        }

        var additionalHeaders = supplier.getAdditionalHeaders();
        if (this.additionalHeaders != null) {
            this.additionalHeaders.putAll(additionalHeaders);
        } else {
            this.additionalHeaders = additionalHeaders;
        }
        return this;
    }

    public Map<String, String> getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    public ConfigurationOverride telemetryConfiguration(TelemetryConfiguration telemetryConfiguration) {
        this.telemetryConfiguration = telemetryConfiguration;
        return this;
    }

    public TelemetryConfiguration getTelemetryConfiguration() {
        return telemetryConfiguration;
    }
}
