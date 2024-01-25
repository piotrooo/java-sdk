/*
 * OpenFGA
 * A high performance and flexible authorization/permission engine built for developers and inspired by Google Zanzibar.
 *
 * The version of the OpenAPI document: 0.1
 * Contact: community@openfga.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package dev.openfga.sdk.api.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AccessTokenTest {

    private static Stream<Arguments> expTimeAndResults() {
        return Stream.of(
                Arguments.of(Instant.now().plus(1, ChronoUnit.HOURS), true),
                Arguments.of(Instant.now().minus(1, ChronoUnit.HOURS), false),
                Arguments.of(Instant.now().minus(10, ChronoUnit.MINUTES), false),
                Arguments.of(Instant.now().plus(10, ChronoUnit.MINUTES), true),
                Arguments.of(Instant.now(), true));
    }

    @MethodSource("expTimeAndResults")
    @ParameterizedTest
    public void testTokenValid(Instant exp, boolean valid) {
        AccessToken accessToken = new AccessToken();
        accessToken.setToken("token");
        accessToken.setExpiresAt(exp);
        assertEquals(valid, accessToken.isValid());
    }
}
