package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Range_BMIPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Range_BMIPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Range_BMIPageResponseProjection() {
    }

    public Range_BMIPageResponseProjection(Range_BMIPageResponseProjection projection) {
        super(projection);
    }

    public Range_BMIPageResponseProjection(List<Range_BMIPageResponseProjection> projections) {
        super(projections);
    }

    public Range_BMIPageResponseProjection all$() {
        return all$(3);
    }

    public Range_BMIPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Range_BMIPageResponseProjection.Range_BMIResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Range_BMIPageResponseProjection.Range_BMIResponseProjection.items", projectionDepthOnFields.getOrDefault("Range_BMIPageResponseProjection.Range_BMIResponseProjection.items", 0) + 1);
            this.items(new Range_BMIResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Range_BMIPageResponseProjection.Range_BMIResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Range_BMIPageResponseProjection items(Range_BMIResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Range_BMIPageResponseProjection items(String alias, Range_BMIResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Range_BMIPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Range_BMIPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Range_BMIPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Range_BMIPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Range_BMIPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Range_BMIPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Range_BMIPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Range_BMIPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Range_BMIPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Range_BMIPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Range_BMIPageResponseProjection typename() {
        return typename(null);
    }

    public Range_BMIPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Range_BMIPageResponseProjection deepCopy$() {
        return new Range_BMIPageResponseProjection(this);
    }


}
