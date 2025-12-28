package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for ClassePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ClassePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ClassePageResponseProjection() {
    }

    public ClassePageResponseProjection(ClassePageResponseProjection projection) {
        super(projection);
    }

    public ClassePageResponseProjection(List<ClassePageResponseProjection> projections) {
        super(projections);
    }

    public ClassePageResponseProjection all$() {
        return all$(3);
    }

    public ClassePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ClassePageResponseProjection.ClasseResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClassePageResponseProjection.ClasseResponseProjection.items", projectionDepthOnFields.getOrDefault("ClassePageResponseProjection.ClasseResponseProjection.items", 0) + 1);
            this.items(new ClasseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClassePageResponseProjection.ClasseResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public ClassePageResponseProjection items(ClasseResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public ClassePageResponseProjection items(String alias, ClasseResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ClassePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public ClassePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ClassePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public ClassePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public ClassePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public ClassePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public ClassePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public ClassePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public ClassePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public ClassePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public ClassePageResponseProjection typename() {
        return typename(null);
    }

    public ClassePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ClassePageResponseProjection deepCopy$() {
        return new ClassePageResponseProjection(this);
    }


}
