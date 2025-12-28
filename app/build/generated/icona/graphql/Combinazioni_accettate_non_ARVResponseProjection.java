package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Combinazioni_accettate_non_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Combinazioni_accettate_non_ARVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Combinazioni_accettate_non_ARVResponseProjection() {
    }

    public Combinazioni_accettate_non_ARVResponseProjection(Combinazioni_accettate_non_ARVResponseProjection projection) {
        super(projection);
    }

    public Combinazioni_accettate_non_ARVResponseProjection(List<Combinazioni_accettate_non_ARVResponseProjection> projections) {
        super(projections);
    }

    public Combinazioni_accettate_non_ARVResponseProjection all$() {
        return all$(3);
    }

    public Combinazioni_accettate_non_ARVResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.farmaci();
        if (projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro____associables", projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro____associables", 0) + 1);
            this.farmaco_altro____associables(new Farmaco_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro_", projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro_", 0) + 1);
            this.farmaco_altro_(new Farmaco_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Combinazioni_accettate_non_ARVResponseProjection.Farmaco_altroPageResponseProjection.farmaco_altro_", 0)));
        }
        this.typename();
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Combinazioni_accettate_non_ARVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection _id() {
        return _id(null);
    }

    public Combinazioni_accettate_non_ARVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaci() {
        return farmaci(null);
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaci(String alias) {
        add$(new GraphQLResponseField("farmaci").alias(alias));
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro____associables(Farmaco_altroPageResponseProjection subProjection) {
        return farmaco_altro____associables((String)null, subProjection);
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro____associables(String alias, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_altro____associables").alias(alias).projection(subProjection));
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro____associables(Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        return farmaco_altro____associables(null, input, subProjection);
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro____associables(String alias, Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_altro____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro_(Farmaco_altroPageResponseProjection subProjection) {
        return farmaco_altro_((String)null, subProjection);
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro_(String alias, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_altro_").alias(alias).projection(subProjection));
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro_(Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        return farmaco_altro_(null, input, subProjection);
    }

    public Combinazioni_accettate_non_ARVResponseProjection farmaco_altro_(String alias, Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput input, Farmaco_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_altro_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Combinazioni_accettate_non_ARVResponseProjection typename() {
        return typename(null);
    }

    public Combinazioni_accettate_non_ARVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Combinazioni_accettate_non_ARVResponseProjection deepCopy$() {
        return new Combinazioni_accettate_non_ARVResponseProjection(this);
    }


}
