package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Metodica_HIVRNA
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Metodica_HIVRNAResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Metodica_HIVRNAResponseProjection() {
    }

    public Metodica_HIVRNAResponseProjection(Metodica_HIVRNAResponseProjection projection) {
        super(projection);
    }

    public Metodica_HIVRNAResponseProjection(List<Metodica_HIVRNAResponseProjection> projections) {
        super(projections);
    }

    public Metodica_HIVRNAResponseProjection all$() {
        return all$(3);
    }

    public Metodica_HIVRNAResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.codice();
        this.codice_DAD();
        this.limite_di_rilevabilita();
        this.limite_superiore();
        this.nome();
        this.visibile();
        this.typename();
        return this;
    }

    public Metodica_HIVRNAResponseProjection _clientId() {
        return _clientId(null);
    }

    public Metodica_HIVRNAResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection _createdby() {
        return _createdby(null);
    }

    public Metodica_HIVRNAResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection _createdon() {
        return _createdon(null);
    }

    public Metodica_HIVRNAResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection _id() {
        return _id(null);
    }

    public Metodica_HIVRNAResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Metodica_HIVRNAResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Metodica_HIVRNAResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Metodica_HIVRNAResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Metodica_HIVRNAResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection codice() {
        return codice(null);
    }

    public Metodica_HIVRNAResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Metodica_HIVRNAResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection limite_di_rilevabilita() {
        return limite_di_rilevabilita(null);
    }

    public Metodica_HIVRNAResponseProjection limite_di_rilevabilita(String alias) {
        add$(new GraphQLResponseField("limite_di_rilevabilita").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection limite_superiore() {
        return limite_superiore(null);
    }

    public Metodica_HIVRNAResponseProjection limite_superiore(String alias) {
        add$(new GraphQLResponseField("limite_superiore").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection nome() {
        return nome(null);
    }

    public Metodica_HIVRNAResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection visibile() {
        return visibile(null);
    }

    public Metodica_HIVRNAResponseProjection visibile(String alias) {
        add$(new GraphQLResponseField("visibile").alias(alias));
        return this;
    }

    public Metodica_HIVRNAResponseProjection typename() {
        return typename(null);
    }

    public Metodica_HIVRNAResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Metodica_HIVRNAResponseProjection deepCopy$() {
        return new Metodica_HIVRNAResponseProjection(this);
    }


}
