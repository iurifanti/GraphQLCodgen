package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Unita_di_misura_viremia
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Unita_di_misura_viremiaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Unita_di_misura_viremiaResponseProjection() {
    }

    public Unita_di_misura_viremiaResponseProjection(Unita_di_misura_viremiaResponseProjection projection) {
        super(projection);
    }

    public Unita_di_misura_viremiaResponseProjection(List<Unita_di_misura_viremiaResponseProjection> projections) {
        super(projections);
    }

    public Unita_di_misura_viremiaResponseProjection all$() {
        return all$(3);
    }

    public Unita_di_misura_viremiaResponseProjection all$(int maxDepth) {
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
        this.codice_inchehp();
        this.nome();
        this.typename();
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _clientId() {
        return _clientId(null);
    }

    public Unita_di_misura_viremiaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _createdby() {
        return _createdby(null);
    }

    public Unita_di_misura_viremiaResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _createdon() {
        return _createdon(null);
    }

    public Unita_di_misura_viremiaResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _id() {
        return _id(null);
    }

    public Unita_di_misura_viremiaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Unita_di_misura_viremiaResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Unita_di_misura_viremiaResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Unita_di_misura_viremiaResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Unita_di_misura_viremiaResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection codice() {
        return codice(null);
    }

    public Unita_di_misura_viremiaResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Unita_di_misura_viremiaResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection codice_inchehp() {
        return codice_inchehp(null);
    }

    public Unita_di_misura_viremiaResponseProjection codice_inchehp(String alias) {
        add$(new GraphQLResponseField("codice_inchehp").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection nome() {
        return nome(null);
    }

    public Unita_di_misura_viremiaResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Unita_di_misura_viremiaResponseProjection typename() {
        return typename(null);
    }

    public Unita_di_misura_viremiaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Unita_di_misura_viremiaResponseProjection deepCopy$() {
        return new Unita_di_misura_viremiaResponseProjection(this);
    }


}
