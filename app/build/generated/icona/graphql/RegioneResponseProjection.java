package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Regione
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RegioneResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RegioneResponseProjection() {
    }

    public RegioneResponseProjection(RegioneResponseProjection projection) {
        super(projection);
    }

    public RegioneResponseProjection(List<RegioneResponseProjection> projections) {
        super(projections);
    }

    public RegioneResponseProjection all$() {
        return all$(3);
    }

    public RegioneResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        if (projectionDepthOnFields.getOrDefault("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia____associables", projectionDepthOnFields.getOrDefault("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia____associables", 0) + 1);
            this.provincia____associables(new ProvinciaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia_", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia_", projectionDepthOnFields.getOrDefault("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia_", 0) + 1);
            this.provincia_(new ProvinciaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegioneResponseProjection.ProvinciaPageResponseProjection.provincia_", 0)));
        }
        this.typename();
        return this;
    }

    public RegioneResponseProjection _clientId() {
        return _clientId(null);
    }

    public RegioneResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public RegioneResponseProjection _id() {
        return _id(null);
    }

    public RegioneResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public RegioneResponseProjection nome() {
        return nome(null);
    }

    public RegioneResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public RegioneResponseProjection provincia____associables(ProvinciaPageResponseProjection subProjection) {
        return provincia____associables((String)null, subProjection);
    }

    public RegioneResponseProjection provincia____associables(String alias, ProvinciaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("provincia____associables").alias(alias).projection(subProjection));
        return this;
    }

    public RegioneResponseProjection provincia____associables(RegioneProvincia____associablesParametrizedInput input, ProvinciaPageResponseProjection subProjection) {
        return provincia____associables(null, input, subProjection);
    }

    public RegioneResponseProjection provincia____associables(String alias, RegioneProvincia____associablesParametrizedInput input, ProvinciaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("provincia____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegioneResponseProjection provincia_(ProvinciaPageResponseProjection subProjection) {
        return provincia_((String)null, subProjection);
    }

    public RegioneResponseProjection provincia_(String alias, ProvinciaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("provincia_").alias(alias).projection(subProjection));
        return this;
    }

    public RegioneResponseProjection provincia_(RegioneProvincia_ParametrizedInput input, ProvinciaPageResponseProjection subProjection) {
        return provincia_(null, input, subProjection);
    }

    public RegioneResponseProjection provincia_(String alias, RegioneProvincia_ParametrizedInput input, ProvinciaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("provincia_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegioneResponseProjection typename() {
        return typename(null);
    }

    public RegioneResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public RegioneResponseProjection deepCopy$() {
        return new RegioneResponseProjection(this);
    }


}
