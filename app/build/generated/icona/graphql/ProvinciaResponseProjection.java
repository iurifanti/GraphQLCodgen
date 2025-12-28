package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Provincia
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ProvinciaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProvinciaResponseProjection() {
    }

    public ProvinciaResponseProjection(ProvinciaResponseProjection projection) {
        super(projection);
    }

    public ProvinciaResponseProjection(List<ProvinciaResponseProjection> projections) {
        super(projections);
    }

    public ProvinciaResponseProjection all$() {
        return all$(3);
    }

    public ProvinciaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        if (projectionDepthOnFields.getOrDefault("ProvinciaResponseProjection.RegionePageResponseProjection.regione____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProvinciaResponseProjection.RegionePageResponseProjection.regione____associables", projectionDepthOnFields.getOrDefault("ProvinciaResponseProjection.RegionePageResponseProjection.regione____associables", 0) + 1);
            this.regione____associables(new RegionePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProvinciaResponseProjection.RegionePageResponseProjection.regione____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProvinciaResponseProjection.RegioneResponseProjection.regione_", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProvinciaResponseProjection.RegioneResponseProjection.regione_", projectionDepthOnFields.getOrDefault("ProvinciaResponseProjection.RegioneResponseProjection.regione_", 0) + 1);
            this.regione_(new RegioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProvinciaResponseProjection.RegioneResponseProjection.regione_", 0)));
        }
        this.typename();
        return this;
    }

    public ProvinciaResponseProjection _clientId() {
        return _clientId(null);
    }

    public ProvinciaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public ProvinciaResponseProjection _id() {
        return _id(null);
    }

    public ProvinciaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public ProvinciaResponseProjection nome() {
        return nome(null);
    }

    public ProvinciaResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public ProvinciaResponseProjection regione____associables(RegionePageResponseProjection subProjection) {
        return regione____associables((String)null, subProjection);
    }

    public ProvinciaResponseProjection regione____associables(String alias, RegionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("regione____associables").alias(alias).projection(subProjection));
        return this;
    }

    public ProvinciaResponseProjection regione____associables(ProvinciaRegione____associablesParametrizedInput input, RegionePageResponseProjection subProjection) {
        return regione____associables(null, input, subProjection);
    }

    public ProvinciaResponseProjection regione____associables(String alias, ProvinciaRegione____associablesParametrizedInput input, RegionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("regione____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProvinciaResponseProjection regione_(RegioneResponseProjection subProjection) {
        return regione_(null, subProjection);
    }

    public ProvinciaResponseProjection regione_(String alias, RegioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("regione_").alias(alias).projection(subProjection));
        return this;
    }

    public ProvinciaResponseProjection typename() {
        return typename(null);
    }

    public ProvinciaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ProvinciaResponseProjection deepCopy$() {
        return new ProvinciaResponseProjection(this);
    }


}
