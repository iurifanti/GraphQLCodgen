package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Esame_strumentalePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Esame_strumentalePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Esame_strumentalePageResponseProjection() {
    }

    public Esame_strumentalePageResponseProjection(Esame_strumentalePageResponseProjection projection) {
        super(projection);
    }

    public Esame_strumentalePageResponseProjection(List<Esame_strumentalePageResponseProjection> projections) {
        super(projections);
    }

    public Esame_strumentalePageResponseProjection all$() {
        return all$(3);
    }

    public Esame_strumentalePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Esame_strumentalePageResponseProjection.Esame_strumentaleResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Esame_strumentalePageResponseProjection.Esame_strumentaleResponseProjection.items", projectionDepthOnFields.getOrDefault("Esame_strumentalePageResponseProjection.Esame_strumentaleResponseProjection.items", 0) + 1);
            this.items(new Esame_strumentaleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Esame_strumentalePageResponseProjection.Esame_strumentaleResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Esame_strumentalePageResponseProjection items(Esame_strumentaleResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Esame_strumentalePageResponseProjection items(String alias, Esame_strumentaleResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Esame_strumentalePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Esame_strumentalePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Esame_strumentalePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Esame_strumentalePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Esame_strumentalePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Esame_strumentalePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Esame_strumentalePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Esame_strumentalePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Esame_strumentalePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Esame_strumentalePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Esame_strumentalePageResponseProjection typename() {
        return typename(null);
    }

    public Esame_strumentalePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Esame_strumentalePageResponseProjection deepCopy$() {
        return new Esame_strumentalePageResponseProjection(this);
    }


}
