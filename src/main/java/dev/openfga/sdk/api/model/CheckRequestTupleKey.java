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

package dev.openfga.sdk.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * CheckRequestTupleKey
 */
@JsonPropertyOrder({
    CheckRequestTupleKey.JSON_PROPERTY_USER,
    CheckRequestTupleKey.JSON_PROPERTY_RELATION,
    CheckRequestTupleKey.JSON_PROPERTY_OBJECT
})
public class CheckRequestTupleKey {
    public static final String JSON_PROPERTY_USER = "user";
    private String user;

    public static final String JSON_PROPERTY_RELATION = "relation";
    private String relation;

    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object;

    public CheckRequestTupleKey() {}

    public CheckRequestTupleKey user(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUser() {
        return user;
    }

    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUser(String user) {
        this.user = user;
    }

    public CheckRequestTupleKey relation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * Get relation
     * @return relation
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_RELATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getRelation() {
        return relation;
    }

    @JsonProperty(JSON_PROPERTY_RELATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRelation(String relation) {
        this.relation = relation;
    }

    public CheckRequestTupleKey _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(String _object) {
        this._object = _object;
    }

    /**
     * Return true if this CheckRequestTupleKey object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRequestTupleKey checkRequestTupleKey = (CheckRequestTupleKey) o;
        return Objects.equals(this.user, checkRequestTupleKey.user)
                && Objects.equals(this.relation, checkRequestTupleKey.relation)
                && Objects.equals(this._object, checkRequestTupleKey._object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, relation, _object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRequestTupleKey {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `user` to the URL query string
        if (getUser() != null) {
            joiner.add(String.format(
                    "%suser%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getUser()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        // add `relation` to the URL query string
        if (getRelation() != null) {
            joiner.add(String.format(
                    "%srelation%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getRelation()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        // add `object` to the URL query string
        if (getObject() != null) {
            joiner.add(String.format(
                    "%sobject%s=%s",
                    prefix,
                    suffix,
                    URLEncoder.encode(String.valueOf(getObject()), StandardCharsets.UTF_8)
                            .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
