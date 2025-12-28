package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HBV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HBVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HBVResponseProjection() {
    }

    public Markers_HBVResponseProjection(Markers_HBVResponseProjection projection) {
        super(projection);
    }

    public Markers_HBVResponseProjection(List<Markers_HBVResponseProjection> projections) {
        super(projections);
    }

    public Markers_HBVResponseProjection all$() {
        return all$(3);
    }

    public Markers_HBVResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.altra_metodica();
        this.altra_unita_di_misura();
        this.codice_centro();
        this.data();
        this.esito();
        this.genotipo_hbv();
        this.lower_limit();
        this.metodica_genoma();
        this.paziente_i();
        this.tipologia_test();
        this.unita_di_misura();
        this.valore();
        if (projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HBV___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HBV___associables", projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HBV___associables", 0) + 1);
            this.metodica_genoma_HBV___associables(new Metodica_genoma_HCV_HBVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HBV___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HBV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HBV", projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HBV", 0) + 1);
            this.metodica_genoma_HBV(new Metodica_genoma_HCV_HBVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HBV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HBVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", 0) + 1);
            this.unita_di_misura_viremia___associables(new Unita_di_misura_viremiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HBVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", 0) + 1);
            this.unita_di_misura_viremia(new Unita_di_misura_viremiaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.PazienteResponseProjection.Paziente_markers_HBV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HBVResponseProjection.PazienteResponseProjection.Paziente_markers_HBV", projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.PazienteResponseProjection.Paziente_markers_HBV", 0) + 1);
            this.Paziente_markers_HBV(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HBVResponseProjection.PazienteResponseProjection.Paziente_markers_HBV", 0)));
        }
        this.typename();
        return this;
    }

    public Markers_HBVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Markers_HBVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Markers_HBVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Markers_HBVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection _id() {
        return _id(null);
    }

    public Markers_HBVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Markers_HBVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Markers_HBVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Markers_HBVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Markers_HBVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection altra_metodica() {
        return altra_metodica(null);
    }

    public Markers_HBVResponseProjection altra_metodica(String alias) {
        add$(new GraphQLResponseField("altra_metodica").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection altra_unita_di_misura() {
        return altra_unita_di_misura(null);
    }

    public Markers_HBVResponseProjection altra_unita_di_misura(String alias) {
        add$(new GraphQLResponseField("altra_unita_di_misura").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Markers_HBVResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection data() {
        return data(null);
    }

    public Markers_HBVResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection esito() {
        return esito(null);
    }

    public Markers_HBVResponseProjection esito(String alias) {
        add$(new GraphQLResponseField("esito").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection genotipo_hbv() {
        return genotipo_hbv(null);
    }

    public Markers_HBVResponseProjection genotipo_hbv(String alias) {
        add$(new GraphQLResponseField("genotipo_hbv").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection lower_limit() {
        return lower_limit(null);
    }

    public Markers_HBVResponseProjection lower_limit(String alias) {
        add$(new GraphQLResponseField("lower_limit").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection metodica_genoma() {
        return metodica_genoma(null);
    }

    public Markers_HBVResponseProjection metodica_genoma(String alias) {
        add$(new GraphQLResponseField("metodica_genoma").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection paziente_i() {
        return paziente_i(null);
    }

    public Markers_HBVResponseProjection paziente_i(String alias) {
        add$(new GraphQLResponseField("paziente_i").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection tipologia_test() {
        return tipologia_test(null);
    }

    public Markers_HBVResponseProjection tipologia_test(String alias) {
        add$(new GraphQLResponseField("tipologia_test").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection unita_di_misura() {
        return unita_di_misura(null);
    }

    public Markers_HBVResponseProjection unita_di_misura(String alias) {
        add$(new GraphQLResponseField("unita_di_misura").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection valore() {
        return valore(null);
    }

    public Markers_HBVResponseProjection valore(String alias) {
        add$(new GraphQLResponseField("valore").alias(alias));
        return this;
    }

    public Markers_HBVResponseProjection metodica_genoma_HBV___associables(Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        return metodica_genoma_HBV___associables((String)null, subProjection);
    }

    public Markers_HBVResponseProjection metodica_genoma_HBV___associables(String alias, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HBV___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HBVResponseProjection metodica_genoma_HBV___associables(Markers_HBVMetodica_genoma_HBV___associablesParametrizedInput input, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        return metodica_genoma_HBV___associables(null, input, subProjection);
    }

    public Markers_HBVResponseProjection metodica_genoma_HBV___associables(String alias, Markers_HBVMetodica_genoma_HBV___associablesParametrizedInput input, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HBV___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HBVResponseProjection metodica_genoma_HBV(Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        return metodica_genoma_HBV(null, subProjection);
    }

    public Markers_HBVResponseProjection metodica_genoma_HBV(String alias, Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HBV").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HBVResponseProjection unita_di_misura_viremia___associables(Unita_di_misura_viremiaPageResponseProjection subProjection) {
        return unita_di_misura_viremia___associables((String)null, subProjection);
    }

    public Markers_HBVResponseProjection unita_di_misura_viremia___associables(String alias, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HBVResponseProjection unita_di_misura_viremia___associables(Markers_HBVUnita_di_misura_viremia___associablesParametrizedInput input, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        return unita_di_misura_viremia___associables(null, input, subProjection);
    }

    public Markers_HBVResponseProjection unita_di_misura_viremia___associables(String alias, Markers_HBVUnita_di_misura_viremia___associablesParametrizedInput input, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HBVResponseProjection unita_di_misura_viremia(Unita_di_misura_viremiaResponseProjection subProjection) {
        return unita_di_misura_viremia(null, subProjection);
    }

    public Markers_HBVResponseProjection unita_di_misura_viremia(String alias, Unita_di_misura_viremiaResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HBVResponseProjection Paziente_markers_HBV(PazienteResponseProjection subProjection) {
        return Paziente_markers_HBV(null, subProjection);
    }

    public Markers_HBVResponseProjection Paziente_markers_HBV(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_markers_HBV").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HBVResponseProjection typename() {
        return typename(null);
    }

    public Markers_HBVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HBVResponseProjection deepCopy$() {
        return new Markers_HBVResponseProjection(this);
    }


}
