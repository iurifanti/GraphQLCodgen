package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Markers_HIV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HIVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Markers_HIVResponseProjection() {
    }

    public Markers_HIVResponseProjection(Markers_HIVResponseProjection projection) {
        super(projection);
    }

    public Markers_HIVResponseProjection(List<Markers_HIVResponseProjection> projections) {
        super(projections);
    }

    public Markers_HIVResponseProjection all$() {
        return all$(3);
    }

    public Markers_HIVResponseProjection all$(int maxDepth) {
        this._clientId();
        this.FPR();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.codice_centro();
        this.data();
        this.geno2pheno();
        this.hivrna();
        this.hivrna_segno();
        this.lower_limit();
        this.metodica();
        this.nr_CD4();
        this.nr_CD8();
        this.nr_linfociti();
        this.paziente();
        this.perc_CD4();
        this.perc_CD8();
        this.tropismo();
        if (projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.Metodica_HIVRNAPageResponseProjection.metodica_HIVRNA___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HIVResponseProjection.Metodica_HIVRNAPageResponseProjection.metodica_HIVRNA___associables", projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.Metodica_HIVRNAPageResponseProjection.metodica_HIVRNA___associables", 0) + 1);
            this.metodica_HIVRNA___associables(new Metodica_HIVRNAPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.Metodica_HIVRNAPageResponseProjection.metodica_HIVRNA___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.Metodica_HIVRNAResponseProjection.metodica_HIVRNA", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HIVResponseProjection.Metodica_HIVRNAResponseProjection.metodica_HIVRNA", projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.Metodica_HIVRNAResponseProjection.metodica_HIVRNA", 0) + 1);
            this.metodica_HIVRNA(new Metodica_HIVRNAResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.Metodica_HIVRNAResponseProjection.metodica_HIVRNA", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.PazienteResponseProjection.Paziente_markers_HIV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Markers_HIVResponseProjection.PazienteResponseProjection.Paziente_markers_HIV", projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.PazienteResponseProjection.Paziente_markers_HIV", 0) + 1);
            this.Paziente_markers_HIV(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Markers_HIVResponseProjection.PazienteResponseProjection.Paziente_markers_HIV", 0)));
        }
        this.typename();
        return this;
    }

    public Markers_HIVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Markers_HIVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection FPR() {
        return FPR(null);
    }

    public Markers_HIVResponseProjection FPR(String alias) {
        add$(new GraphQLResponseField("FPR").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Markers_HIVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Markers_HIVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection _id() {
        return _id(null);
    }

    public Markers_HIVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Markers_HIVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Markers_HIVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Markers_HIVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Markers_HIVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Markers_HIVResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection data() {
        return data(null);
    }

    public Markers_HIVResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection geno2pheno() {
        return geno2pheno(null);
    }

    public Markers_HIVResponseProjection geno2pheno(String alias) {
        add$(new GraphQLResponseField("geno2pheno").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection hivrna() {
        return hivrna(null);
    }

    public Markers_HIVResponseProjection hivrna(String alias) {
        add$(new GraphQLResponseField("hivrna").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection hivrna_segno() {
        return hivrna_segno(null);
    }

    public Markers_HIVResponseProjection hivrna_segno(String alias) {
        add$(new GraphQLResponseField("hivrna_segno").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection lower_limit() {
        return lower_limit(null);
    }

    public Markers_HIVResponseProjection lower_limit(String alias) {
        add$(new GraphQLResponseField("lower_limit").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection metodica() {
        return metodica(null);
    }

    public Markers_HIVResponseProjection metodica(String alias) {
        add$(new GraphQLResponseField("metodica").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection nr_CD4() {
        return nr_CD4(null);
    }

    public Markers_HIVResponseProjection nr_CD4(String alias) {
        add$(new GraphQLResponseField("nr_CD4").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection nr_CD8() {
        return nr_CD8(null);
    }

    public Markers_HIVResponseProjection nr_CD8(String alias) {
        add$(new GraphQLResponseField("nr_CD8").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection nr_linfociti() {
        return nr_linfociti(null);
    }

    public Markers_HIVResponseProjection nr_linfociti(String alias) {
        add$(new GraphQLResponseField("nr_linfociti").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection paziente() {
        return paziente(null);
    }

    public Markers_HIVResponseProjection paziente(String alias) {
        add$(new GraphQLResponseField("paziente").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection perc_CD4() {
        return perc_CD4(null);
    }

    public Markers_HIVResponseProjection perc_CD4(String alias) {
        add$(new GraphQLResponseField("perc_CD4").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection perc_CD8() {
        return perc_CD8(null);
    }

    public Markers_HIVResponseProjection perc_CD8(String alias) {
        add$(new GraphQLResponseField("perc_CD8").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection tropismo() {
        return tropismo(null);
    }

    public Markers_HIVResponseProjection tropismo(String alias) {
        add$(new GraphQLResponseField("tropismo").alias(alias));
        return this;
    }

    public Markers_HIVResponseProjection metodica_HIVRNA___associables(Metodica_HIVRNAPageResponseProjection subProjection) {
        return metodica_HIVRNA___associables((String)null, subProjection);
    }

    public Markers_HIVResponseProjection metodica_HIVRNA___associables(String alias, Metodica_HIVRNAPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_HIVRNA___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HIVResponseProjection metodica_HIVRNA___associables(Markers_HIVMetodica_HIVRNA___associablesParametrizedInput input, Metodica_HIVRNAPageResponseProjection subProjection) {
        return metodica_HIVRNA___associables(null, input, subProjection);
    }

    public Markers_HIVResponseProjection metodica_HIVRNA___associables(String alias, Markers_HIVMetodica_HIVRNA___associablesParametrizedInput input, Metodica_HIVRNAPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_HIVRNA___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Markers_HIVResponseProjection metodica_HIVRNA(Metodica_HIVRNAResponseProjection subProjection) {
        return metodica_HIVRNA(null, subProjection);
    }

    public Markers_HIVResponseProjection metodica_HIVRNA(String alias, Metodica_HIVRNAResponseProjection subProjection) {
        add$(new GraphQLResponseField("metodica_HIVRNA").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HIVResponseProjection Paziente_markers_HIV(PazienteResponseProjection subProjection) {
        return Paziente_markers_HIV(null, subProjection);
    }

    public Markers_HIVResponseProjection Paziente_markers_HIV(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_markers_HIV").alias(alias).projection(subProjection));
        return this;
    }

    public Markers_HIVResponseProjection typename() {
        return typename(null);
    }

    public Markers_HIVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Markers_HIVResponseProjection deepCopy$() {
        return new Markers_HIVResponseProjection(this);
    }


}
