package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for NazionePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class NazionePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NazionePageResponseProjection() {
    }

    public NazionePageResponseProjection(NazionePageResponseProjection projection) {
        super(projection);
    }

    public NazionePageResponseProjection(List<NazionePageResponseProjection> projections) {
        super(projections);
    }

    public NazionePageResponseProjection all$() {
        return all$(3);
    }

    public NazionePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("NazionePageResponseProjection.NazioneResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("NazionePageResponseProjection.NazioneResponseProjection.items", projectionDepthOnFields.getOrDefault("NazionePageResponseProjection.NazioneResponseProjection.items", 0) + 1);
            this.items(new NazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NazionePageResponseProjection.NazioneResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public NazionePageResponseProjection items(NazioneResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public NazionePageResponseProjection items(String alias, NazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public NazionePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public NazionePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public NazionePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public NazionePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public NazionePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public NazionePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public NazionePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public NazionePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public NazionePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public NazionePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public NazionePageResponseProjection typename() {
        return typename(null);
    }

    public NazionePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public NazionePageResponseProjection deepCopy$() {
        return new NazionePageResponseProjection(this);
    }


}
