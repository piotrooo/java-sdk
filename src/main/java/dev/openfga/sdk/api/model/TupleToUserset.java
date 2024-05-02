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
import java.util.Objects;
import java.util.StringJoiner;

/**
 * TupleToUserset
 */
@JsonPropertyOrder({TupleToUserset.JSON_PROPERTY_TUPLESET, TupleToUserset.JSON_PROPERTY_COMPUTED_USERSET})
public class TupleToUserset {
    public static final String JSON_PROPERTY_TUPLESET = "tupleset";
    private ObjectRelation tupleset;

    public static final String JSON_PROPERTY_COMPUTED_USERSET = "computedUserset";
    private ObjectRelation computedUserset;

    public TupleToUserset() {}

    public TupleToUserset tupleset(ObjectRelation tupleset) {
        this.tupleset = tupleset;
        return this;
    }

    /**
     * Get tupleset
     * @return tupleset
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TUPLESET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ObjectRelation getTupleset() {
        return tupleset;
    }

    @JsonProperty(JSON_PROPERTY_TUPLESET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTupleset(ObjectRelation tupleset) {
        this.tupleset = tupleset;
    }

    public TupleToUserset computedUserset(ObjectRelation computedUserset) {
        this.computedUserset = computedUserset;
        return this;
    }

    /**
     * Get computedUserset
     * @return computedUserset
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_COMPUTED_USERSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ObjectRelation getComputedUserset() {
        return computedUserset;
    }

    @JsonProperty(JSON_PROPERTY_COMPUTED_USERSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setComputedUserset(ObjectRelation computedUserset) {
        this.computedUserset = computedUserset;
    }

    /**
     * Return true if this TupleToUserset object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TupleToUserset tupleToUserset = (TupleToUserset) o;
        return Objects.equals(this.tupleset, tupleToUserset.tupleset)
                && Objects.equals(this.computedUserset, tupleToUserset.computedUserset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tupleset, computedUserset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TupleToUserset {\n");
        sb.append("    tupleset: ").append(toIndentedString(tupleset)).append("\n");
        sb.append("    computedUserset: ")
                .append(toIndentedString(computedUserset))
                .append("\n");
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

        // add `tupleset` to the URL query string
        if (getTupleset() != null) {
            joiner.add(getTupleset().toUrlQueryString(prefix + "tupleset" + suffix));
        }

        // add `computedUserset` to the URL query string
        if (getComputedUserset() != null) {
            joiner.add(getComputedUserset().toUrlQueryString(prefix + "computedUserset" + suffix));
        }

        return joiner.toString();
    }
}
