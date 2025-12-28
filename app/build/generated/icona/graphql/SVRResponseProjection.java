package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for SVR
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class SVRResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SVRResponseProjection() {
    }

    public SVRResponseProjection(SVRResponseProjection projection) {
        super(projection);
    }

    public SVRResponseProjection(List<SVRResponseProjection> projections) {
        super(projections);
    }

    public SVRResponseProjection all$() {
        return all$(3);
    }

    public SVRResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altro_svr();
        this.clearance_spontanea();
        this.data_valutazione();
        this.svr();
        this.terapia();
        if (projectionDepthOnFields.getOrDefault("SVRResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("SVRResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("SVRResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SVRResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public SVRResponseProjection _clientId() {
        return _clientId(null);
    }

    public SVRResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public SVRResponseProjection _id() {
        return _id(null);
    }

    public SVRResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public SVRResponseProjection altro_svr() {
        return altro_svr(null);
    }

    public SVRResponseProjection altro_svr(String alias) {
        add$(new GraphQLResponseField("altro_svr").alias(alias));
        return this;
    }

    public SVRResponseProjection clearance_spontanea() {
        return clearance_spontanea(null);
    }

    public SVRResponseProjection clearance_spontanea(String alias) {
        add$(new GraphQLResponseField("clearance_spontanea").alias(alias));
        return this;
    }

    public SVRResponseProjection data_valutazione() {
        return data_valutazione(null);
    }

    public SVRResponseProjection data_valutazione(String alias) {
        add$(new GraphQLResponseField("data_valutazione").alias(alias));
        return this;
    }

    public SVRResponseProjection svr() {
        return svr(null);
    }

    public SVRResponseProjection svr(String alias) {
        add$(new GraphQLResponseField("svr").alias(alias));
        return this;
    }

    public SVRResponseProjection terapia() {
        return terapia(null);
    }

    public SVRResponseProjection terapia(String alias) {
        add$(new GraphQLResponseField("terapia").alias(alias));
        return this;
    }

    public SVRResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public SVRResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public SVRResponseProjection typename() {
        return typename(null);
    }

    public SVRResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public SVRResponseProjection deepCopy$() {
        return new SVRResponseProjection(this);
    }


}
