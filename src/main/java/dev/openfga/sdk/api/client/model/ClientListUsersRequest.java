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

package dev.openfga.sdk.api.client.model;

import dev.openfga.sdk.api.model.FgaObject;
import dev.openfga.sdk.api.model.UserTypeFilter;
import java.util.List;

public class ClientListUsersRequest {
    private FgaObject _object;
    private String relation;
    private List<UserTypeFilter> userFilters;
    private List<ClientTupleKey> contextualTupleKeys;
    private Object context;

    public ClientListUsersRequest _object(FgaObject _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     **/
    public FgaObject getObject() {
        return _object;
    }

    public ClientListUsersRequest relation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * Get relation
     * @return relation
     **/
    public String getRelation() {
        return relation;
    }

    public ClientListUsersRequest userFilters(List<UserTypeFilter> userFilters) {
        this.userFilters = userFilters;
        return this;
    }

    /**
     * Get userFilters
     * @return userFilters
     **/
    public List<UserTypeFilter> getUserFilters() {
        return userFilters;
    }

    public ClientListUsersRequest contextualTupleKeys(List<ClientTupleKey> contextualTupleKeys) {
        this.contextualTupleKeys = contextualTupleKeys;
        return this;
    }

    public List<ClientTupleKey> getContextualTupleKeys() {
        return contextualTupleKeys;
    }

    public ClientListUsersRequest context(Object context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     * @return context
     **/
    public Object getContext() {
        return context;
    }
}
