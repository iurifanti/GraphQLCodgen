package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Luogo_test_HIV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Luogo_test_HIVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Luogo_test_HIVResponseProjection() {
    }

    public Luogo_test_HIVResponseProjection(Luogo_test_HIVResponseProjection projection) {
        super(projection);
    }

    public Luogo_test_HIVResponseProjection(List<Luogo_test_HIVResponseProjection> projections) {
        super(projections);
    }

    public Luogo_test_HIVResponseProjection all$() {
        return all$(3);
    }

    public Luogo_test_HIVResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.altro();
        this.nome();
        this.typename();
        return this;
    }

    public Luogo_test_HIVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Luogo_test_HIVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Luogo_test_HIVResponseProjection _id() {
        return _id(null);
    }

    public Luogo_test_HIVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Luogo_test_HIVResponseProjection altro() {
        return altro(null);
    }

    public Luogo_test_HIVResponseProjection altro(String alias) {
        add$(new GraphQLResponseField("altro").alias(alias));
        return this;
    }

    public Luogo_test_HIVResponseProjection nome() {
        return nome(null);
    }

    public Luogo_test_HIVResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Luogo_test_HIVResponseProjection typename() {
        return typename(null);
    }

    public Luogo_test_HIVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Luogo_test_HIVResponseProjection deepCopy$() {
        return new Luogo_test_HIVResponseProjection(this);
    }


}
