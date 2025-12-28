package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Modalita_somministrazionePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Modalita_somministrazionePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Modalita_somministrazionePageResponseProjection() {
    }

    public Modalita_somministrazionePageResponseProjection(Modalita_somministrazionePageResponseProjection projection) {
        super(projection);
    }

    public Modalita_somministrazionePageResponseProjection(List<Modalita_somministrazionePageResponseProjection> projections) {
        super(projections);
    }

    public Modalita_somministrazionePageResponseProjection all$() {
        return all$(3);
    }

    public Modalita_somministrazionePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("Modalita_somministrazionePageResponseProjection.Modalita_somministrazioneResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("Modalita_somministrazionePageResponseProjection.Modalita_somministrazioneResponseProjection.items", projectionDepthOnFields.getOrDefault("Modalita_somministrazionePageResponseProjection.Modalita_somministrazioneResponseProjection.items", 0) + 1);
            this.items(new Modalita_somministrazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Modalita_somministrazionePageResponseProjection.Modalita_somministrazioneResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public Modalita_somministrazionePageResponseProjection items(Modalita_somministrazioneResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public Modalita_somministrazionePageResponseProjection items(String alias, Modalita_somministrazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public Modalita_somministrazionePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public Modalita_somministrazionePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public Modalita_somministrazionePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public Modalita_somministrazionePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public Modalita_somministrazionePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public Modalita_somministrazionePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public Modalita_somministrazionePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public Modalita_somministrazionePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public Modalita_somministrazionePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public Modalita_somministrazionePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public Modalita_somministrazionePageResponseProjection typename() {
        return typename(null);
    }

    public Modalita_somministrazionePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Modalita_somministrazionePageResponseProjection deepCopy$() {
        return new Modalita_somministrazionePageResponseProjection(this);
    }


}
