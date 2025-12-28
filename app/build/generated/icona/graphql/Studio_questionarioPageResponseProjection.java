package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Studio_questionarioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Studio_questionarioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Studio_questionarioPageResponseProjection() {
    }

    public Studio_questionarioPageResponseProjection(Studio_questionarioPageResponseProjection projection) {
        super(projection);
    }

    public Studio_questionarioPageResponseProjection(List<Studio_questionarioPageResponseProjection> projections) {
        super(projections);
    }

    public Studio_questionarioPageResponseProjection all$() {
        return all$(3);
    }

    public Studio_questionarioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Studio_questionarioPageResponseProjection.Studio_questionarioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Studio_questionarioPageResponseProjection.Studio_questionarioResponseProjection.items", projectionDepthOnFields.getOrDefault("Studio_questionarioPageResponseProjection.Studio_questionarioResponseProjection.items", 0) + 1);
            this.items(new Studio_questionarioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Studio_questionarioPageResponseProjection.Studio_questionarioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Studio_questionarioPageResponseProjection items(Studio_questionarioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Studio_questionarioPageResponseProjection items(String alias, Studio_questionarioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Studio_questionarioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Studio_questionarioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Studio_questionarioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Studio_questionarioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Studio_questionarioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Studio_questionarioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Studio_questionarioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Studio_questionarioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Studio_questionarioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Studio_questionarioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Studio_questionarioPageResponseProjection typename() {
        return typename(null);
    }

    public Studio_questionarioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Studio_questionarioPageResponseProjection deepCopy$() {
        return new Studio_questionarioPageResponseProjection(this);
    }


}
