package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HDV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HDVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HDVResponseProjection() {
    }

    public Markers_HDVResponseProjection(Markers_HDVResponseProjection projection) {
        super(projection);
    }

    public Markers_HDVResponseProjection(List<Markers_HDVResponseProjection> projections) {
        super(projections);
    }

    public Markers_HDVResponseProjection all$() {
        return all$(3);
    }

    public Markers_HDVResponseProjection all$(int maxDepth) {
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
        this.data();
        this.esito();
        this.genotipo_hdv();
        this.lower_limit();
        this.sottotipo();
        this.tipologia_test();
        this.valore();
        if (projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HDV___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HDV___associables", projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HDV___associables", 0) + 1);
            this.metodica_genoma_HDV___associables(new Metodica_genoma_HCV_HBVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVPageResponseProjection.metodica_genoma_HDV___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HDV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HDV", projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HDV", 0) + 1);
            this.metodica_genoma_HDV(new Metodica_genoma_HCV_HBVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Metodica_genoma_HCV_HBVResponseProjection.metodica_genoma_HDV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HDVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia____associables", projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia____associables", 0) + 1);
            this.unita_di_misura_viremia____associables(new Unita_di_misura_viremiaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Unita_di_misura_viremiaPageResponseProjection.unita_di_misura_viremia____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HDVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia_", projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia_", 0) + 1);
            this.unita_di_misura_viremia_(new Unita_di_misura_viremiaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.Unita_di_misura_viremiaResponseProjection.unita_di_misura_viremia_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HDVResponseProjection.H_PazienteResponseProjection.h_Paziente_", projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0) + 1);
            this.h_Paziente_(new H_PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.H_PazienteResponseProjection.h_Paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HDVResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HDVResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Markers_HDVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Markers_HDVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Markers_HDVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Markers_HDVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection _id() {
        return _id(null);
    }

    public Markers_HDVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Markers_HDVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Markers_HDVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Markers_HDVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Markers_HDVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection altra_metodica() {
        return altra_metodica(null);
    }

    public Markers_HDVResponseProjection altra_metodica(String alias) {
        add$(new GraphQLResponseField("altra_metodica").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection altra_unita_di_misura() {
        return altra_unita_di_misura(null);
    }

    public Markers_HDVResponseProjection altra_unita_di_misura(String alias) {
        add$(new GraphQLResponseField("altra_unita_di_misura").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection altro_genotipo() {
        return altro_genotipo(null);
    }

    public Markers_HDVResponseProjection altro_genotipo(String alias) {
        add$(new GraphQLResponseField("altro_genotipo").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection data() {
        return data(null);
    }

    public Markers_HDVResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection esito() {
        return esito(null);
    }

    public Markers_HDVResponseProjection esito(String alias) {
        add$(new GraphQLResponseField("esito").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection genotipo_hdv() {
        return genotipo_hdv(null);
    }

    public Markers_HDVResponseProjection genotipo_hdv(String alias) {
        add$(new GraphQLResponseField("genotipo_hdv").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection lower_limit() {
        return lower_limit(null);
    }

    public Markers_HDVResponseProjection lower_limit(String alias) {
        add$(new GraphQLResponseField("lower_limit").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection sottotipo() {
        return sottotipo(null);
    }

    public Markers_HDVResponseProjection sottotipo(String alias) {
        add$(new GraphQLResponseField("sottotipo").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection tipologia_test() {
        return tipologia_test(null);
    }

    public Markers_HDVResponseProjection tipologia_test(String alias) {
        add$(new GraphQLResponseField("tipologia_test").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection valore() {
        return valore(null);
    }

    public Markers_HDVResponseProjection valore(String alias) {
        add$(new GraphQLResponseField("valore").alias(alias));
        return this;
    }

    public Markers_HDVResponseProjection metodica_genoma_HDV___associables(Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        return metodica_genoma_HDV___associables((String)null, subProjection);
    }

    public Markers_HDVResponseProjection metodica_genoma_HDV___associables(String alias, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HDV___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection metodica_genoma_HDV___associables(Markers_HDVMetodica_genoma_HDV___associablesParametrizedInput input, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        return metodica_genoma_HDV___associables(null, input, subProjection);
    }

    public Markers_HDVResponseProjection metodica_genoma_HDV___associables(String alias, Markers_HDVMetodica_genoma_HDV___associablesParametrizedInput input, Metodica_genoma_HCV_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HDV___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection metodica_genoma_HDV(Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        return metodica_genoma_HDV(null, subProjection);
    }

    public Markers_HDVResponseProjection metodica_genoma_HDV(String alias, Metodica_genoma_HCV_HBVResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_genoma_HDV").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection unita_di_misura_viremia____associables(Unita_di_misura_viremiaPageResponseProjection subProjection) {
        return unita_di_misura_viremia____associables((String)null, subProjection);
    }

    public Markers_HDVResponseProjection unita_di_misura_viremia____associables(String alias, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection unita_di_misura_viremia____associables(Markers_HDVUnita_di_misura_viremia____associablesParametrizedInput input, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        return unita_di_misura_viremia____associables(null, input, subProjection);
    }

    public Markers_HDVResponseProjection unita_di_misura_viremia____associables(String alias, Markers_HDVUnita_di_misura_viremia____associablesParametrizedInput input, Unita_di_misura_viremiaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection unita_di_misura_viremia_(Unita_di_misura_viremiaResponseProjection subProjection) {
        return unita_di_misura_viremia_(null, subProjection);
    }

    public Markers_HDVResponseProjection unita_di_misura_viremia_(String alias, Unita_di_misura_viremiaResponseProjection subProjection) {
        add$(new GraphQLResponseField("unita_di_misura_viremia_").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection h_Paziente_(H_PazienteResponseProjection subProjection) {
        return h_Paziente_(null, subProjection);
    }

    public Markers_HDVResponseProjection h_Paziente_(String alias, H_PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("h_Paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Markers_HDVResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HDVResponseProjection typename() {
        return typename(null);
    }

    public Markers_HDVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HDVResponseProjection deepCopy$() {
        return new Markers_HDVResponseProjection(this);
    }


}
