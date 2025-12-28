package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for MutazionePage
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class MutazionePageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public MutazionePageResponseProjection() {
    }

    public MutazionePageResponseProjection(MutazionePageResponseProjection projection) {
        super(projection);
    }

    public MutazionePageResponseProjection(List<MutazionePageResponseProjection> projections) {
        super(projections);
    }

    public MutazionePageResponseProjection all$() {
        return all$(3);
    }

    public MutazionePageResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MutazionePageResponseProjection.MutazioneResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("MutazionePageResponseProjection.MutazioneResponseProjection.items", projectionDepthOnFields.getOrDefault("MutazionePageResponseProjection.MutazioneResponseProjection.items", 0) + 1);
            this.items(new MutazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MutazionePageResponseProjection.MutazioneResponseProjection.items", 0)));
        }
        this.totalCount();
        this.nextCursor();
        this.prevCursor();
        this.hasNext();
        this.hasPrev();
        this.typename();
        return this;
    }

    public MutazionePageResponseProjection items(MutazioneResponseProjection subProjection) {
        return items(null, subProjection);
    }

    public MutazionePageResponseProjection items(String alias, MutazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public MutazionePageResponseProjection totalCount() {
        return totalCount(null);
    }

    public MutazionePageResponseProjection totalCount(String alias) {
        add$(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public MutazionePageResponseProjection nextCursor() {
        return nextCursor(null);
    }

    public MutazionePageResponseProjection nextCursor(String alias) {
        add$(new GraphQLResponseField("nextCursor").alias(alias));
        return this;
    }

    public MutazionePageResponseProjection prevCursor() {
        return prevCursor(null);
    }

    public MutazionePageResponseProjection prevCursor(String alias) {
        add$(new GraphQLResponseField("prevCursor").alias(alias));
        return this;
    }

    public MutazionePageResponseProjection hasNext() {
        return hasNext(null);
    }

    public MutazionePageResponseProjection hasNext(String alias) {
        add$(new GraphQLResponseField("hasNext").alias(alias));
        return this;
    }

    public MutazionePageResponseProjection hasPrev() {
        return hasPrev(null);
    }

    public MutazionePageResponseProjection hasPrev(String alias) {
        add$(new GraphQLResponseField("hasPrev").alias(alias));
        return this;
    }

    public MutazionePageResponseProjection typename() {
        return typename(null);
    }

    public MutazionePageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public MutazionePageResponseProjection deepCopy$() {
        return new MutazionePageResponseProjection(this);
    }


}
