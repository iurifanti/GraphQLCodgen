package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HCV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HCVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HCVResponseProjection() {
    }

    public Markers_HCVResponseProjection(Markers_HCVResponseProjection projection) {
        super(projection);
    }

    public Markers_HCVResponseProjection(List<Markers_HCVResponseProjection> projections) {
        super(projections);
    }

    public Markers_HCVResponseProjection all$() {
        return all$(3);
    }

    public Markers_HCVResponseProjection all$(int maxDepth) {
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
        this.altro_genotipo();
        this.codice_centro();
        this.data();
        this.esito();
        this.genotipo();
        this.lower_limit();
        this.metodica_genoma();
        this.paziente();
        this.tipologia_test();
        this.unita_di_misura();
        this.valore();
        if (projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Genotipo_HCVPageResponseProjection.genotipo_HCV___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVResponseProjection.Genotipo_HCVPageResponseProjection.genotipo_HCV___associables", projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Genotipo_HCVPageResponseProjection.genotipo_HCV___associables", 0) + 1);
            this.genotipo_HCV___associables(new Genotipo_HCVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Genotipo_HCVPageResponseProjection.genotipo_HCV___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Genotipo_HCVResponseProjection.genotipo_HCV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVResponseProjection.Genotipo_HCVResponseProjection.genotipo_HCV", projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Genotipo_HCVResponseProjection.genotipo_HCV", 0) + 1);
            this.genotipo_HCV(new Genotipo_HCVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Genotipo_HCVResponseProjection.genotipo_HCV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HCV___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HCV___associables", projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HCV___associables", 0) + 1);
            this.metodica_genoma_HCV___associables(new Metodica_genoma_HCV_HBVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HCV___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HCV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HCV", projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HCV", 0) + 1);
            this.metodica_genoma_HCV(new Metodica_genoma_HCV_HBVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HCV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", 0) + 1);
            this.unita_di_misura_viremia___associables(new Unita_di_misura_viremiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", 0) + 1);
            this.unita_di_misura_viremia(new Unita_di_misura_viremiaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.PazienteResponseProjection.Paziente_markers_HCV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HCVResponseProjection.PazienteResponseProjection.Paziente_markers_HCV", projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.PazienteResponseProjection.Paziente_markers_HCV", 0) + 1);
            this.Paziente_markers_HCV(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HCVResponseProjection.PazienteResponseProjection.Paziente_markers_HCV", 0)));
        }
        this.typename();
        return this;
    }

    public Markers_HCVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Markers_HCVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Markers_HCVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Markers_HCVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection _id() {
        return _id(null);
    }

    public Markers_HCVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Markers_HCVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Markers_HCVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Markers_HCVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Markers_HCVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection altra_metodica() {
        return altra_metodica(null);
    }

    public Markers_HCVResponseProjection altra_metodica(String alias) {
        add$(new GraphQLResponseField("altra_metodica").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection altra_unita_di_misura() {
        return altra_unita_di_misura(null);
    }

    public Markers_HCVResponseProjection altra_unita_di_misura(String alias) {
        add$(new GraphQLResponseField("altra_unita_di_misura").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection altro_genotipo() {
        return altro_genotipo(null);
    }

    public Markers_HCVResponseProjection altro_genotipo(String alias) {
        add$(new GraphQLResponseField("altro_genotipo").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Markers_HCVResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection data() {
        return data(null);
    }

    public Markers_HCVResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection esito() {
        return esito(null);
    }

    public Markers_HCVResponseProjection esito(String alias) {
        add$(new GraphQLResponseField("esito").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection genotipo() {
        return genotipo(null);
    }

    public Markers_HCVResponseProjection genotipo(String alias) {
        add$(new GraphQLResponseField("genotipo").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection lower_limit() {
        return lower_limit(null);
    }

    public Markers_HCVResponseProjection lower_limit(String alias) {
        add$(new GraphQLResponseField("lower_limit").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection metodica_genoma() {
        return metodica_genoma(null);
    }

    public Markers_HCVResponseProjection metodica_genoma(String alias) {
        add$(new GraphQLResponseField("metodica_genoma").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection paziente() {
        return paziente(null);
    }

    public Markers_HCVResponseProjection paziente(String alias) {
        add$(new GraphQLResponseField("paziente").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection tipologia_test() {
        return tipologia_test(null);
    }

    public Markers_HCVResponseProjection tipologia_test(String alias) {
        add$(new GraphQLResponseField("tipologia_test").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection unita_di_misura() {
        return unita_di_misura(null);
    }

    public Markers_HCVResponseProjection unita_di_misura(String alias) {
        add$(new GraphQLResponseField("unita_di_misura").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection valore() {
        return valore(null);
    }

    public Markers_HCVResponseProjection valore(String alias) {
        add$(new GraphQLResponseField("valore").alias(alias));
        return this;
    }

    public Markers_HCVResponseProjection genotipo_HCV___associables(Genotipo_HCVPageResponseProjection subProjection) {
        return genotipo_HCV___associables((String)null, subProjection);
    }

    public Markers_HCVResponseProjection genotipo_HCV___associables(String alias, Genotipo_HCVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("genotipo_HCV___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection genotipo_HCV___associables(Markers_HCVGenotipo_HCV___associablesParametrizedInput input, Genotipo_HCVPageResponseProjection subProjection) {
        return genotipo_HCV___associables(null, input, subProjection);
    }

    public Markers_HCVResponseProjection genotipo_HCV___associables(String alias, Markers_HCVGenotipo_HCV___associablesParametrizedInput input, Genotipo_HCVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("genotipo_HCV___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection genotipo_HCV(Genotipo_HCVResponseProjection subProjection) {
        return genotipo_HCV(null, subProjection);
    }

    public Markers_HCVResponseProjection genotipo_HCV(String alias, Genotipo_HCVResponseProjection subProjection) {
        add$(new GraphQLResponseField("genotipo_HCV").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection metodica_genoma_HCV___associables(Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        return metodica_genoma_HCV___associables((String)null, subProjection);
    }

    public Markers_HCVResponseProjection metodica_genoma_HCV___associables(String alias, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HCV___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection metodica_genoma_HCV___associables(Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput input, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        return metodica_genoma_HCV___associables(null, input, subProjection);
    }

    public Markers_HCVResponseProjection metodica_genoma_HCV___associables(String alias, Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput input, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HCV___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection metodica_genoma_HCV(Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        return metodica_genoma_HCV(null, subProjection);
    }

    public Markers_HCVResponseProjection metodica_genoma_HCV(String alias, Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HCV").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection unita_di_misura_viremia___associables(Unita_di_misura_viremiaPageResponseProjection subProjection) {
        return unita_di_misura_viremia___associables((String)null, subProjection);
    }

    public Markers_HCVResponseProjection unita_di_misura_viremia___associables(String alias, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection unita_di_misura_viremia___associables(Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput input, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        return unita_di_misura_viremia___associables(null, input, subProjection);
    }

    public Markers_HCVResponseProjection unita_di_misura_viremia___associables(String alias, Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput input, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection unita_di_misura_viremia(Unita_di_misura_viremiaResponseProjection subProjection) {
        return unita_di_misura_viremia(null, subProjection);
    }

    public Markers_HCVResponseProjection unita_di_misura_viremia(String alias, Unita_di_misura_viremiaResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection Paziente_markers_HCV(PazienteResponseProjection subProjection) {
        return Paziente_markers_HCV(null, subProjection);
    }

    public Markers_HCVResponseProjection Paziente_markers_HCV(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_markers_HCV").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HCVResponseProjection typename() {
        return typename(null);
    }

    public Markers_HCVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HCVResponseProjection deepCopy$() {
        return new Markers_HCVResponseProjection(this);
    }


}
