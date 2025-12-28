package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Metodica_genoma_HCV_HBV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Metodica_genoma_HCV_HBVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Metodica_genoma_HCV_HBVResponseProjection() {
    }

    public Metodica_genoma_HCV_HBVResponseProjection(Metodica_genoma_HCV_HBVResponseProjection projection) {
        super(projection);
    }

    public Metodica_genoma_HCV_HBVResponseProjection(List<Metodica_genoma_HCV_HBVResponseProjection> projections) {
        super(projections);
    }

    public Metodica_genoma_HCV_HBVResponseProjection all$() {
        return all$(3);
    }

    public Metodica_genoma_HCV_HBVResponseProjection all$(int maxDepth) {
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
        this.hbv();
        this.hcv();
        this.hdv();
        this.nome();
        this.typename();
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _id() {
        return _id(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection codice() {
        return codice(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection codice_inchehp() {
        return codice_inchehp(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection codice_inchehp(String alias) {
        add$(new GraphQLResponseField("codice_inchehp").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection hbv() {
        return hbv(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection hbv(String alias) {
        add$(new GraphQLResponseField("hbv").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection hcv() {
        return hcv(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection hcv(String alias) {
        add$(new GraphQLResponseField("hcv").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection hdv() {
        return hdv(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection hdv(String alias) {
        add$(new GraphQLResponseField("hdv").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection nome() {
        return nome(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Metodica_genoma_HCV_HBVResponseProjection typename() {
        return typename(null);
    }

    public Metodica_genoma_HCV_HBVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Metodica_genoma_HCV_HBVResponseProjection deepCopy$() {
        return new Metodica_genoma_HCV_HBVResponseProjection(this);
    }


}
