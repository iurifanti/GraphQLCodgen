package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Motivazione_inizio_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Motivazione_inizio_ARVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Motivazione_inizio_ARVResponseProjection() {
    }

    public Motivazione_inizio_ARVResponseProjection(Motivazione_inizio_ARVResponseProjection projection) {
        super(projection);
    }

    public Motivazione_inizio_ARVResponseProjection(List<Motivazione_inizio_ARVResponseProjection> projections) {
        super(projections);
    }

    public Motivazione_inizio_ARVResponseProjection all$() {
        return all$(3);
    }

    public Motivazione_inizio_ARVResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.codice_DAD();
        this.gruppo();
        this.nome();
        this.sottogruppo();
        this.visualizzato();
        this.typename();
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Motivazione_inizio_ARVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Motivazione_inizio_ARVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Motivazione_inizio_ARVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _id() {
        return _id(null);
    }

    public Motivazione_inizio_ARVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Motivazione_inizio_ARVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Motivazione_inizio_ARVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Motivazione_inizio_ARVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Motivazione_inizio_ARVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Motivazione_inizio_ARVResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection gruppo() {
        return gruppo(null);
    }

    public Motivazione_inizio_ARVResponseProjection gruppo(String alias) {
        add$(new GraphQLResponseField("gruppo").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection nome() {
        return nome(null);
    }

    public Motivazione_inizio_ARVResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection sottogruppo() {
        return sottogruppo(null);
    }

    public Motivazione_inizio_ARVResponseProjection sottogruppo(String alias) {
        add$(new GraphQLResponseField("sottogruppo").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection visualizzato() {
        return visualizzato(null);
    }

    public Motivazione_inizio_ARVResponseProjection visualizzato(String alias) {
        add$(new GraphQLResponseField("visualizzato").alias(alias));
        return this;
    }

    public Motivazione_inizio_ARVResponseProjection typename() {
        return typename(null);
    }

    public Motivazione_inizio_ARVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Motivazione_inizio_ARVResponseProjection deepCopy$() {
        return new Motivazione_inizio_ARVResponseProjection(this);
    }


}
