package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Controllo_clinicoPage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Controllo_clinicoPageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Controllo_clinicoPageResponseProjection() {
    }

    public Controllo_clinicoPageResponseProjection(Controllo_clinicoPageResponseProjection projection) {
        super(projection);
    }

    public Controllo_clinicoPageResponseProjection(List<Controllo_clinicoPageResponseProjection> projections) {
        super(projections);
    }

    public Controllo_clinicoPageResponseProjection all$() {
        return all$(3);
    }

    public Controllo_clinicoPageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Controllo_clinicoPageResponseProjection.Controllo_clinicoResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Controllo_clinicoPageResponseProjection.Controllo_clinicoResponseProjection.items", projectionDepthOnFields.getOrDefault("Controllo_clinicoPageResponseProjection.Controllo_clinicoResponseProjection.items", 0) + 1);
            this.items(new Controllo_clinicoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Controllo_clinicoPageResponseProjection.Controllo_clinicoResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Controllo_clinicoPageResponseProjection items(Controllo_clinicoResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Controllo_clinicoPageResponseProjection items(String alias, Controllo_clinicoResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Controllo_clinicoPageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Controllo_clinicoPageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Controllo_clinicoPageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Controllo_clinicoPageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Controllo_clinicoPageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Controllo_clinicoPageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Controllo_clinicoPageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Controllo_clinicoPageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Controllo_clinicoPageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Controllo_clinicoPageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Controllo_clinicoPageResponseProjection typename() {
        return typename(null);
    }

    public Controllo_clinicoPageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Controllo_clinicoPageResponseProjection deepCopy$() {
        return new Controllo_clinicoPageResponseProjection(this);
    }


}
