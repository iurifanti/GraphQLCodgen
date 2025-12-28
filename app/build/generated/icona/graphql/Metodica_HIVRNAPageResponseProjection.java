package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Metodica_HIVRNAPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Metodica_HIVRNAPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Metodica_HIVRNAPageResponseProjection() {
    }

    public Metodica_HIVRNAPageResponseProjection(Metodica_HIVRNAPageResponseProjection projection) {
        super(projection);
    }

    public Metodica_HIVRNAPageResponseProjection(List<Metodica_HIVRNAPageResponseProjection> projections) {
        super(projections);
    }

    public Metodica_HIVRNAPageResponseProjection all$() {
        return all$(3);
    }

    public Metodica_HIVRNAPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Metodica_HIVRNAPageResponseProjection.Metodica_HIVRNAResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Metodica_HIVRNAPageResponseProjection.Metodica_HIVRNAResponseProjection.items", projectionDepthOnFields.getOrDefault("Metodica_HIVRNAPageResponseProjection.Metodica_HIVRNAResponseProjection.items", 0) + 1);
            this.items(new Metodica_HIVRNAResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Metodica_HIVRNAPageResponseProjection.Metodica_HIVRNAResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Metodica_HIVRNAPageResponseProjection items(Metodica_HIVRNAResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Metodica_HIVRNAPageResponseProjection items(String alias, Metodica_HIVRNAResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Metodica_HIVRNAPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Metodica_HIVRNAPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Metodica_HIVRNAPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Metodica_HIVRNAPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Metodica_HIVRNAPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Metodica_HIVRNAPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Metodica_HIVRNAPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Metodica_HIVRNAPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Metodica_HIVRNAPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Metodica_HIVRNAPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Metodica_HIVRNAPageResponseProjection typename() {
        return typename(null);
    }

    public Metodica_HIVRNAPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Metodica_HIVRNAPageResponseProjection deepCopy$() {
        return new Metodica_HIVRNAPageResponseProjection(this);
    }


}
