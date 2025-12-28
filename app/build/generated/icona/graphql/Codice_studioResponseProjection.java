package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Codice_studio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Codice_studioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Codice_studioResponseProjection() {
    }

    public Codice_studioResponseProjection(Codice_studioResponseProjection projection) {
        super(projection);
    }

    public Codice_studioResponseProjection(List<Codice_studioResponseProjection> projections) {
        super(projections);
    }

    public Codice_studioResponseProjection all$() {
        return all$(3);
    }

    public Codice_studioResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.codice();
        this.data_arruolamento();
        this.note();
        this.studio();
        this.titolo();
        if (projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.Studio_pazientePageResponseProjection.studio_paziente____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Codice_studioResponseProjection.Studio_pazientePageResponseProjection.studio_paziente____associables", projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.Studio_pazientePageResponseProjection.studio_paziente____associables", 0) + 1);
            this.studio_paziente____associables(new Studio_pazientePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.Studio_pazientePageResponseProjection.studio_paziente____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.Studio_pazienteResponseProjection.studio_paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Codice_studioResponseProjection.Studio_pazienteResponseProjection.studio_paziente_", projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.Studio_pazienteResponseProjection.studio_paziente_", 0) + 1);
            this.studio_paziente_(new Studio_pazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.Studio_pazienteResponseProjection.studio_paziente_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Codice_studioResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Codice_studioResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public Codice_studioResponseProjection _clientId() {
        return _clientId(null);
    }

    public Codice_studioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Codice_studioResponseProjection _id() {
        return _id(null);
    }

    public Codice_studioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Codice_studioResponseProjection codice() {
        return codice(null);
    }

    public Codice_studioResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public Codice_studioResponseProjection data_arruolamento() {
        return data_arruolamento(null);
    }

    public Codice_studioResponseProjection data_arruolamento(String alias) {
        add$(new GraphQLResponseField("data_arruolamento").alias(alias));
        return this;
    }

    public Codice_studioResponseProjection note() {
        return note(null);
    }

    public Codice_studioResponseProjection note(String alias) {
        add$(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public Codice_studioResponseProjection studio() {
        return studio(null);
    }

    public Codice_studioResponseProjection studio(String alias) {
        add$(new GraphQLResponseField("studio").alias(alias));
        return this;
    }

    public Codice_studioResponseProjection titolo() {
        return titolo(null);
    }

    public Codice_studioResponseProjection titolo(String alias) {
        add$(new GraphQLResponseField("titolo").alias(alias));
        return this;
    }

    public Codice_studioResponseProjection studio_paziente____associables(Studio_pazientePageResponseProjection subProjection) {
        return studio_paziente____associables((String)null, subProjection);
    }

    public Codice_studioResponseProjection studio_paziente____associables(String alias, Studio_pazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_paziente____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Codice_studioResponseProjection studio_paziente____associables(Codice_studioStudio_paziente____associablesParametrizedInput input, Studio_pazientePageResponseProjection subProjection) {
        return studio_paziente____associables(null, input, subProjection);
    }

    public Codice_studioResponseProjection studio_paziente____associables(String alias, Codice_studioStudio_paziente____associablesParametrizedInput input, Studio_pazientePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_paziente____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Codice_studioResponseProjection studio_paziente_(Studio_pazienteResponseProjection subProjection) {
        return studio_paziente_(null, subProjection);
    }

    public Codice_studioResponseProjection studio_paziente_(String alias, Studio_pazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Codice_studioResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public Codice_studioResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public Codice_studioResponseProjection typename() {
        return typename(null);
    }

    public Codice_studioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Codice_studioResponseProjection deepCopy$() {
        return new Codice_studioResponseProjection(this);
    }


}
