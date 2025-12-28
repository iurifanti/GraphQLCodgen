package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Studio_questionario
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Studio_questionarioResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Studio_questionarioResponseProjection() {
    }

    public Studio_questionarioResponseProjection(Studio_questionarioResponseProjection projection) {
        super(projection);
    }

    public Studio_questionarioResponseProjection(List<Studio_questionarioResponseProjection> projections) {
        super(projections);
    }

    public Studio_questionarioResponseProjection all$() {
        return all$(3);
    }

    public Studio_questionarioResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.nome();
        this.typename();
        return this;
    }

    public Studio_questionarioResponseProjection _clientId() {
        return _clientId(null);
    }

    public Studio_questionarioResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Studio_questionarioResponseProjection _id() {
        return _id(null);
    }

    public Studio_questionarioResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Studio_questionarioResponseProjection nome() {
        return nome(null);
    }

    public Studio_questionarioResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Studio_questionarioResponseProjection typename() {
        return typename(null);
    }

    public Studio_questionarioResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Studio_questionarioResponseProjection deepCopy$() {
        return new Studio_questionarioResponseProjection(this);
    }


}
