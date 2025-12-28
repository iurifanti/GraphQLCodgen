package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Codice_studioPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Codice_studioPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Codice_studioPageResponseProjection() {
    }

    public Codice_studioPageResponseProjection(Codice_studioPageResponseProjection projection) {
        super(projection);
    }

    public Codice_studioPageResponseProjection(List<Codice_studioPageResponseProjection> projections) {
        super(projections);
    }

    public Codice_studioPageResponseProjection all$() {
        return all$(3);
    }

    public Codice_studioPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Codice_studioPageResponseProjection.Codice_studioResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Codice_studioPageResponseProjection.Codice_studioResponseProjection.items", projectionDepthOnFields.getOrDefault("Codice_studioPageResponseProjection.Codice_studioResponseProjection.items", 0) + 1);
            this.items(new Codice_studioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Codice_studioPageResponseProjection.Codice_studioResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Codice_studioPageResponseProjection items(Codice_studioResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Codice_studioPageResponseProjection items(String alias, Codice_studioResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Codice_studioPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Codice_studioPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Codice_studioPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Codice_studioPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Codice_studioPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Codice_studioPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Codice_studioPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Codice_studioPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Codice_studioPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Codice_studioPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Codice_studioPageResponseProjection typename() {
        return typename(null);
    }

    public Codice_studioPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Codice_studioPageResponseProjection deepCopy$() {
        return new Codice_studioPageResponseProjection(this);
    }


}
