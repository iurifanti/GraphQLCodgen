package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Metodica_genotipoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Metodica_genotipoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Metodica_genotipoPageResponseProjection() {
    }

    public Metodica_genotipoPageResponseProjection(Metodica_genotipoPageResponseProjection projection) {
        super(projection);
    }

    public Metodica_genotipoPageResponseProjection(List<Metodica_genotipoPageResponseProjection> projections) {
        super(projections);
    }

    public Metodica_genotipoPageResponseProjection all$() {
        return all$(3);
    }

    public Metodica_genotipoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Metodica_genotipoPageResponseProjection.Metodica_genotipoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Metodica_genotipoPageResponseProjection.Metodica_genotipoResponseProjection.items", projectionDepthOnFields.getOrDefault("Metodica_genotipoPageResponseProjection.Metodica_genotipoResponseProjection.items", 0) + 1);
            this.items(new Metodica_genotipoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Metodica_genotipoPageResponseProjection.Metodica_genotipoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Metodica_genotipoPageResponseProjection items(Metodica_genotipoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Metodica_genotipoPageResponseProjection items(String alias, Metodica_genotipoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Metodica_genotipoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Metodica_genotipoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Metodica_genotipoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Metodica_genotipoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Metodica_genotipoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Metodica_genotipoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Metodica_genotipoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Metodica_genotipoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Metodica_genotipoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Metodica_genotipoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Metodica_genotipoPageResponseProjection typename() {
        return typename(null);
    }

    public Metodica_genotipoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Metodica_genotipoPageResponseProjection deepCopy$() {
        return new Metodica_genotipoPageResponseProjection(this);
    }


}
