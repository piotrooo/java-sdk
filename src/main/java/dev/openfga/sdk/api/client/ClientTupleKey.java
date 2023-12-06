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

package dev.openfga.sdk.api.client;

import dev.openfga.sdk.api.model.ContextualTupleKeys;
import dev.openfga.sdk.api.model.TupleKey;
import dev.openfga.sdk.api.model.WriteRequestWrites;
import java.util.Collection;
import java.util.stream.Collectors;

public class ClientTupleKey extends ClientTupleKeyWithoutCondition {
    private ClientRelationshipCondition condition;

    public ClientTupleKey condition(ClientRelationshipCondition condition) {
        this.condition = condition;
        return this;
    }

    public ClientRelationshipCondition getCondition() {
        return condition;
    }

    public TupleKey asTupleKey() {
        var tupleKey = new TupleKey().user(getUser()).relation(getRelation())._object(getObject());

        if (condition != null) {
            tupleKey.condition(condition.asRelationshipCondition());
        }

        return tupleKey;
    }

    public static ContextualTupleKeys asContextualTupleKeys(Collection<ClientTupleKey> tupleKeys) {
        return new ContextualTupleKeys()
                .tupleKeys(tupleKeys.stream().map(ClientTupleKey::asTupleKey).collect(Collectors.toList()));
    }

    public static WriteRequestWrites asWriteRequestWrites(Collection<ClientTupleKey> tupleKeys) {
        return new WriteRequestWrites()
                .tupleKeys(tupleKeys.stream().map(ClientTupleKey::asTupleKey).collect(Collectors.toList()));
    }

    /* Overrides for correct typing */

    @Override
    public ClientTupleKey user(String user) {
        super.user(user);
        return this;
    }

    @Override
    public ClientTupleKey relation(String relation) {
        super.relation(relation);
        return this;
    }

    @Override
    public ClientTupleKey _object(String _object) {
        super._object(_object);
        return this;
    }
}
