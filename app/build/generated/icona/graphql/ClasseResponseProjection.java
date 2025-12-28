package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Classe
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ClasseResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ClasseResponseProjection() {
    }

    public ClasseResponseProjection(ClasseResponseProjection projection) {
        super(projection);
    }

    public ClasseResponseProjection(List<ClasseResponseProjection> projections) {
        super(projections);
    }

    public ClasseResponseProjection all$() {
        return all$(3);
    }

    public ClasseResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.codice();
        this.name();
        this.typename();
        return this;
    }

    public ClasseResponseProjection _clientId() {
        return _clientId(null);
    }

    public ClasseResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public ClasseResponseProjection _id() {
        return _id(null);
    }

    public ClasseResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public ClasseResponseProjection codice() {
        return codice(null);
    }

    public ClasseResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public ClasseResponseProjection name() {
        return name(null);
    }

    public ClasseResponseProjection name(String alias) {
        add$(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ClasseResponseProjection typename() {
        return typename(null);
    }

    public ClasseResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ClasseResponseProjection deepCopy$() {
        return new ClasseResponseProjection(this);
    }


}
