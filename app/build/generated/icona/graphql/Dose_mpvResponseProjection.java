package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Dose_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_mpvResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Dose_mpvResponseProjection() {
    }

    public Dose_mpvResponseProjection(Dose_mpvResponseProjection projection) {
        super(projection);
    }

    public Dose_mpvResponseProjection(List<Dose_mpvResponseProjection> projections) {
        super(projections);
    }

    public Dose_mpvResponseProjection all$() {
        return all$(3);
    }

    public Dose_mpvResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.ciclo();
        this.modalita_somministrazione();
        this.numero_dose();
        if (projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione____associables", projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione____associables", 0) + 1);
            this.modalita_somministrazione____associables(new Modalita_somministrazionePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Modalita_somministrazionePageResponseProjection.modalita_somministrazione____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_", projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_", 0) + 1);
            this.modalita_somministrazione_(new Modalita_somministrazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Modalita_somministrazioneResponseProjection.modalita_somministrazione_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Visita_mpvResponseProjection.visita_mpv_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Dose_mpvResponseProjection.Visita_mpvResponseProjection.visita_mpv_", projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Visita_mpvResponseProjection.visita_mpv_", 0) + 1);
            this.visita_mpv_(new Visita_mpvResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Dose_mpvResponseProjection.Visita_mpvResponseProjection.visita_mpv_", 0)));
        }
        this.typename();
        return this;
    }

    public Dose_mpvResponseProjection _clientId() {
        return _clientId(null);
    }

    public Dose_mpvResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Dose_mpvResponseProjection _id() {
        return _id(null);
    }

    public Dose_mpvResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Dose_mpvResponseProjection ciclo() {
        return ciclo(null);
    }

    public Dose_mpvResponseProjection ciclo(String alias) {
        add$(new GraphQLResponseField("ciclo").alias(alias));
        return this;
    }

    public Dose_mpvResponseProjection modalita_somministrazione() {
        return modalita_somministrazione(null);
    }

    public Dose_mpvResponseProjection modalita_somministrazione(String alias) {
        add$(new GraphQLResponseField("modalita_somministrazione").alias(alias));
        return this;
    }

    public Dose_mpvResponseProjection numero_dose() {
        return numero_dose(null);
    }

    public Dose_mpvResponseProjection numero_dose(String alias) {
        add$(new GraphQLResponseField("numero_dose").alias(alias));
        return this;
    }

    public Dose_mpvResponseProjection modalita_somministrazione____associables(Modalita_somministrazionePageResponseProjection subProjection) {
        return modalita_somministrazione____associables((String)null, subProjection);
    }

    public Dose_mpvResponseProjection modalita_somministrazione____associables(String alias, Modalita_somministrazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_mpvResponseProjection modalita_somministrazione____associables(Dose_mpvModalita_somministrazione____associablesParametrizedInput input, Modalita_somministrazionePageResponseProjection subProjection) {
        return modalita_somministrazione____associables(null, input, subProjection);
    }

    public Dose_mpvResponseProjection modalita_somministrazione____associables(String alias, Dose_mpvModalita_somministrazione____associablesParametrizedInput input, Modalita_somministrazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Dose_mpvResponseProjection modalita_somministrazione_(Modalita_somministrazioneResponseProjection subProjection) {
        return modalita_somministrazione_(null, subProjection);
    }

    public Dose_mpvResponseProjection modalita_somministrazione_(String alias, Modalita_somministrazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita_somministrazione_").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_mpvResponseProjection visita_mpv_(Visita_mpvResponseProjection subProjection) {
        return visita_mpv_(null, subProjection);
    }

    public Dose_mpvResponseProjection visita_mpv_(String alias, Visita_mpvResponseProjection subProjection) {
        add$(new GraphQLResponseField("visita_mpv_").alias(alias).projection(subProjection));
        return this;
    }

    public Dose_mpvResponseProjection typename() {
        return typename(null);
    }

    public Dose_mpvResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Dose_mpvResponseProjection deepCopy$() {
        return new Dose_mpvResponseProjection(this);
    }


}
