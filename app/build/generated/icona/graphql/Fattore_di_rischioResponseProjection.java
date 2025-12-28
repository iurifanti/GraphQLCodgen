package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Fattore_di_rischio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Fattore_di_rischioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Fattore_di_rischioResponseProjection() {
    }

    public Fattore_di_rischioResponseProjection(Fattore_di_rischioResponseProjection projection) {
        super(projection);
    }

    public Fattore_di_rischioResponseProjection(List<Fattore_di_rischioResponseProjection> projections) {
        super(projections);
    }

    public Fattore_di_rischioResponseProjection all$() {
        return all$(3);
    }

    public Fattore_di_rischioResponseProjection all$(int maxDepth) {
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
        this.nome();
        this.typename();
        return this;
    }

    public Fattore_di_rischioResponseProjection _clientId() {
        return _clientId(null);
    }

    public Fattore_di_rischioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection _createdby() {
        return _createdby(null);
    }

    public Fattore_di_rischioResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection _createdon() {
        return _createdon(null);
    }

    public Fattore_di_rischioResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection _id() {
        return _id(null);
    }

    public Fattore_di_rischioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Fattore_di_rischioResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Fattore_di_rischioResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Fattore_di_rischioResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Fattore_di_rischioResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection codice() {
        return codice(null);
    }

    public Fattore_di_rischioResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Fattore_di_rischioResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection nome() {
        return nome(null);
    }

    public Fattore_di_rischioResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Fattore_di_rischioResponseProjection typename() {
        return typename(null);
    }

    public Fattore_di_rischioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Fattore_di_rischioResponseProjection deepCopy$() {
        return new Fattore_di_rischioResponseProjection(this);
    }


}
