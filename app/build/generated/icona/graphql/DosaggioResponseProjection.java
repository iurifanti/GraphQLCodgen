package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for dosaggio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DosaggioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DosaggioResponseProjection() {
    }

    public DosaggioResponseProjection(DosaggioResponseProjection projection) {
        super(projection);
    }

    public DosaggioResponseProjection(List<DosaggioResponseProjection> projections) {
        super(projections);
    }

    public DosaggioResponseProjection all$() {
        return all$(3);
    }

    public DosaggioResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.farmaco_altro_id();
        this.farmaco_arv_id();
        this.nome();
        if (projectionDepthOnFields.getOrDefault("DosaggioResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV_", 0) <= maxDepth) {
            projectionDepthOnFields.put("DosaggioResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV_", projectionDepthOnFields.getOrDefault("DosaggioResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV_", 0) + 1);
            this.farmaco_ARV_(new Farmaco_ARVResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DosaggioResponseProjection.Farmaco_ARVResponseProjection.farmaco_ARV_", 0)));
        }
        this.typename();
        return this;
    }

    public DosaggioResponseProjection _clientId() {
        return _clientId(null);
    }

    public DosaggioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public DosaggioResponseProjection _id() {
        return _id(null);
    }

    public DosaggioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public DosaggioResponseProjection farmaco_altro_id() {
        return farmaco_altro_id(null);
    }

    public DosaggioResponseProjection farmaco_altro_id(String alias) {
        add$(new GraphQLResponseField("farmaco_altro_id").alias(alias));
        return this;
    }

    public DosaggioResponseProjection farmaco_arv_id() {
        return farmaco_arv_id(null);
    }

    public DosaggioResponseProjection farmaco_arv_id(String alias) {
        add$(new GraphQLResponseField("farmaco_arv_id").alias(alias));
        return this;
    }

    public DosaggioResponseProjection nome() {
        return nome(null);
    }

    public DosaggioResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public DosaggioResponseProjection farmaco_ARV_(Farmaco_ARVResponseProjection subProjection) {
        return farmaco_ARV_(null, subProjection);
    }

    public DosaggioResponseProjection farmaco_ARV_(String alias, Farmaco_ARVResponseProjection subProjection) {
        add$(new GraphQLResponseField("farmaco_ARV_").alias(alias).projection(subProjection));
        return this;
    }

    public DosaggioResponseProjection typename() {
        return typename(null);
    }

    public DosaggioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DosaggioResponseProjection deepCopy$() {
        return new DosaggioResponseProjection(this);
    }


}
