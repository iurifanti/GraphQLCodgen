package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Centro_provenienza
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Centro_provenienzaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Centro_provenienzaResponseProjection() {
    }

    public Centro_provenienzaResponseProjection(Centro_provenienzaResponseProjection projection) {
        super(projection);
    }

    public Centro_provenienzaResponseProjection(List<Centro_provenienzaResponseProjection> projections) {
        super(projections);
    }

    public Centro_provenienzaResponseProjection all$() {
        return all$(3);
    }

    public Centro_provenienzaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altro();
        this.cod();
        this.nome();
        this.visibile();
        this.typename();
        return this;
    }

    public Centro_provenienzaResponseProjection _clientId() {
        return _clientId(null);
    }

    public Centro_provenienzaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Centro_provenienzaResponseProjection _id() {
        return _id(null);
    }

    public Centro_provenienzaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Centro_provenienzaResponseProjection altro() {
        return altro(null);
    }

    public Centro_provenienzaResponseProjection altro(String alias) {
        add$(new GraphQLResponseField("altro").alias(alias));
        return this;
    }

    public Centro_provenienzaResponseProjection cod() {
        return cod(null);
    }

    public Centro_provenienzaResponseProjection cod(String alias) {
        add$(new GraphQLResponseField("cod").alias(alias));
        return this;
    }

    public Centro_provenienzaResponseProjection nome() {
        return nome(null);
    }

    public Centro_provenienzaResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Centro_provenienzaResponseProjection visibile() {
        return visibile(null);
    }

    public Centro_provenienzaResponseProjection visibile(String alias) {
        add$(new GraphQLResponseField("visibile").alias(alias));
        return this;
    }

    public Centro_provenienzaResponseProjection typename() {
        return typename(null);
    }

    public Centro_provenienzaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Centro_provenienzaResponseProjection deepCopy$() {
        return new Centro_provenienzaResponseProjection(this);
    }


}
